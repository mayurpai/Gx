package com.galaxe.target.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.target.entity.Cart;
import com.galaxe.target.entity.Product;
import com.galaxe.target.entity.User;
import com.galaxe.target.exception.NoSuchItemInCartExists;
import com.galaxe.target.exception.ProductNotFound;
import com.galaxe.target.exception.UserNotFound;
import com.galaxe.target.repository.CartRepository;
import com.galaxe.target.repository.ProductRepository;
import com.galaxe.target.repository.UserRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	CartRepository cartRepository;

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Cart> listCartItems(String userEmail) throws UserNotFound {
		User user = userRepository.findByUserEmail(userEmail);
		if (user == null)
			throw new UserNotFound("No Such User Exists");
		return cartRepository.findByUser(userRepository.findByUserEmail(userEmail));
	}

	@Override
	public Integer AddProductToCart(String userEmail, Integer productId, Integer quantity) throws UserNotFound {
		Integer addedQuantity = quantity;
		Product product = productRepository.findById(productId).get();
		User user = userRepository.findByUserEmail(userEmail);
		if (user == null)
			throw new UserNotFound("No Such User Exists");
		Cart cart = cartRepository.findByUserAndProduct(user, product);
		if (cart != null) {
			addedQuantity = cart.getQuantity() + quantity;
			cart.setQuantity(addedQuantity);
		} else {
			cart = new Cart();
			cart.setQuantity(quantity);
			cart.setUser(user);
			cart.setProduct(product);
		}

		cartRepository.save(cart);
		return addedQuantity;

	}

	@Override
	public void deleteByUserEmailAndProductId(String userEmail, Integer productId)
			throws UserNotFound, ProductNotFound, NoSuchItemInCartExists {
		if (!userRepository.existsByUserEmail(userEmail)) {
			throw new UserNotFound("User Not Found");
		} else if (!productRepository.existsByProductId(productId)) {
			throw new ProductNotFound("No Such Product Exists");
		}
		Cart cart = cartRepository.findByUserAndProduct(userRepository.findByUserEmail(userEmail),
				productRepository.findById(productId).get());
		if (cart == null) {
			throw new NoSuchItemInCartExists("No Such Item In Cart Exists");
		}
		cartRepository.deleteByUserEmailAndProductId(userEmail, productId);
	}

	@Override
	public void deleteAllProductsFromCartByUserEmail(String userEmail) throws UserNotFound, NoSuchItemInCartExists {
		if (!userRepository.existsByUserEmail(userEmail))
			throw new UserNotFound("User Not Found");
		List<Cart> cart = cartRepository.findByUser(userRepository.findByUserEmail(userEmail));
		if (cart.isEmpty()) {
			throw new NoSuchItemInCartExists("No Such Item In Cart Exists");
		}
		cartRepository.deleteAllByUserEmail(userEmail);

	}

}

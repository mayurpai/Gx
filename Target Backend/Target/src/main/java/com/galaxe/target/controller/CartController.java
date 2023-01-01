package com.galaxe.target.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.target.entity.Cart;
import com.galaxe.target.entity.User;
import com.galaxe.target.exception.NoSuchItemInCartExists;
import com.galaxe.target.exception.ProductNotFound;
import com.galaxe.target.exception.UserNotFound;
import com.galaxe.target.service.CartService;
import com.galaxe.target.service.UserService;

@RestController
@RequestMapping("cart/api/v1")
@CrossOrigin("http://localhost:3000/")
public class CartController {

	@Autowired
	CartService cartService;

	@Autowired
	UserService userService;

	@GetMapping("GET/{userEmail}")
	public List<Cart> listCartItems(@PathVariable String userEmail) throws UserNotFound, Exception {
		try {
			return cartService.listCartItems(userEmail);
		} catch (UserNotFound e) {
			throw new UserNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
	}

	@PostMapping("POST/{userEmail}/{productId}/{quantity}")
	public String addProductToCart(@PathVariable("userEmail") String userEmail,
			@PathVariable("productId") Integer productId, @PathVariable("quantity") Integer quantity)
			throws UserNotFound, Exception {
		Integer addedQuantity = null;
		try {
			addedQuantity = cartService.AddProductToCart(userEmail, productId, quantity);
		} catch (UserNotFound e) {
			throw new UserNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
		return addedQuantity + " Item(s) Of This Product Were Added Into Your Shopping Cart";
	}

	@DeleteMapping("DELETE/{userEmail}/{productId}")
	public List<Cart> deleteProductFromCart(@PathVariable("userEmail") String userEmail,
			@PathVariable("productId") Integer productId)
			throws UserNotFound, ProductNotFound, NoSuchItemInCartExists, Exception {
		try {
			return cartService.deleteByUserEmailAndProductId(userEmail, productId);
		} catch (UserNotFound e) {
			throw new UserNotFound(e.getMessage());
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (NoSuchItemInCartExists e) {
			throw new NoSuchItemInCartExists(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
	}

	@DeleteMapping("DELETE/All/{userEmail}")
	public String deleteAllProductsFromCartByUserEmail(@PathVariable("userEmail") String userEmail)
			throws UserNotFound, NoSuchItemInCartExists, Exception {
		try {
			cartService.deleteAllProductsFromCartByUserEmail(userEmail);
		} catch (UserNotFound e) {
			throw new UserNotFound(e.getMessage());
		} catch (NoSuchItemInCartExists e) {
			throw new NoSuchItemInCartExists(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
		return "Deleted Successfully!";
	}

}

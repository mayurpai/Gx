package com.target.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.entity.Cart;
import com.target.entity.User;
import com.target.repository.CartRepository;
import com.target.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	CartRepository cartRepository;

	@Override
	public User loginUser(User user) throws Exception {
		try {
			Cart cart = new Cart();
			cart.setCartId(user.getUserId());
			user.setCart(cart);
			cartRepository.save(cart);
			return userRepository.save(user);
		} catch (Exception e) {
			throw new Exception();
		}
	}

}

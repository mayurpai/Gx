package com.galaxe.target.service;

import java.util.List;

import com.galaxe.target.entity.Cart;
import com.galaxe.target.entity.User;
import com.galaxe.target.exception.NoSuchItemInCartExists;
import com.galaxe.target.exception.ProductNotFound;
import com.galaxe.target.exception.UserNotFound;

public interface CartService {
	public List<Cart> listCartItems(String userEmail) throws UserNotFound;

	public Integer AddProductToCart(String userEmail, Integer productId, Integer quantity) throws UserNotFound;

	public List<Cart> deleteByUserEmailAndProductId(String userEmail, Integer productId)
			throws NoSuchItemInCartExists, UserNotFound, ProductNotFound;

	public void deleteAllProductsFromCartByUserEmail(String userEmail) throws UserNotFound, NoSuchItemInCartExists;
	
	public void deleteAllByProductId(Integer productId) throws ProductNotFound, NoSuchItemInCartExists;

}

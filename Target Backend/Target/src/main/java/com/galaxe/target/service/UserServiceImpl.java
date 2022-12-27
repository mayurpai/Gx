package com.galaxe.target.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.target.entity.User;
import com.galaxe.target.exception.UserAlreadyExists;
import com.galaxe.target.exception.UserNotFound;
import com.galaxe.target.repository.CartRepository;
import com.galaxe.target.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	CartRepository cartRepository;

	@Override
	public User registerUser(User user) throws UserAlreadyExists, Exception {
		if (userRepository.existsByUserEmail(user.getUserEmail())) {
			throw new UserAlreadyExists("User Already Exists, Please Log In");
		}
		return userRepository.save(user);

	}

	@Override
	public User findByUserEmailAndUserPassword(String userEmail, String userPassword) throws UserNotFound {
		if(userRepository.findByUserEmailAndUserPassword(userEmail, userPassword) == null)
			throw new UserNotFound("User Not Found, Kindly Sign In");
		return userRepository.findByUserEmailAndUserPassword(userEmail, userPassword);
	}
	
	@Override
	public User findByUserEmail(String userEmail) throws UserNotFound {
		if(userRepository.findByUserEmail(userEmail) == null)
			throw new UserNotFound("User Not Found, Kindly Sign In");
		return userRepository.findByUserEmail(userEmail);
	}

}

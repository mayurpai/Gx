package com.galaxe.target.service;

import com.galaxe.target.entity.User;
import com.galaxe.target.exception.UserAlreadyExists;
import com.galaxe.target.exception.UserNotFound;

public interface UserService {

	User registerUser(User user) throws UserAlreadyExists, Exception;

	User findByUserEmail(String userEmail) throws UserNotFound;

	User findByUserEmailAndUserPassword(String userEmail, String userPassword) throws UserNotFound;

}

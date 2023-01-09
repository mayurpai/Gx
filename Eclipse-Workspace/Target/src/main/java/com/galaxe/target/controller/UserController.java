package com.galaxe.target.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.target.entity.User;
import com.galaxe.target.exception.UserAlreadyExists;
import com.galaxe.target.exception.UserNotFound;
import com.galaxe.target.service.UserService;

@RestController
@RequestMapping("user/api/v1")
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("POST")
	public User registerUser(@RequestBody User user) throws UserAlreadyExists, Exception {
		try {
			return userService.registerUser(user);
		} catch (UserAlreadyExists e) {
			throw new UserAlreadyExists(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
	}

	@GetMapping("GET/{userEmail}/{userPassword}")
	public User findByUserEmailAndUserPassword(@PathVariable String userEmail, @PathVariable String userPassword)
			throws UserNotFound, Exception {
		try {
			return userService.findByUserEmailAndUserPassword(userEmail, userPassword);
		} catch (UserNotFound e) {
			throw new UserNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}

	}

	@GetMapping("GET/{userEmail}")
	public User findByUserEmail(@PathVariable String userEmail) throws UserNotFound, Exception {
		try {
			return userService.findByUserEmail(userEmail);
		} catch (UserNotFound e) {
			throw new UserNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}

	}

}

package com.target.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.target.entity.User;
import com.target.service.UserService;

@RestController
@RequestMapping("user/api/v1")
@CrossOrigin("http://localhost:3000/")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("POST")
	public User loginUser(@RequestBody User user) throws Exception {
		try {
			return userService.loginUser(user);
		} catch (Exception e) {
			throw new Exception();
		}
	}
}

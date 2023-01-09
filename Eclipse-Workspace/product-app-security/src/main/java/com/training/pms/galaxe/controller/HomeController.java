package com.training.pms.galaxe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("home") // http://localhost:9093/home
	public String home() {
		return "Welcome To My Home!";
	}
}

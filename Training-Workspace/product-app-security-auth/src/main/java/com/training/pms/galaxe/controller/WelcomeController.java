package com.training.pms.galaxe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/login", method = RequestMethod.GET) // localhost:9094/login
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");

		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login"; // VIEW // /WEB-INF/views/login.jsp
	}

	@GetMapping // http://localhost:9094
	public String hi() {
		return "index";
	}

	@GetMapping("index") // http://localhost:9094/index
	public String index() {
		return "index";
	}

	@GetMapping("viewAllProducts") // http://localhost:9094/viewAllProducts
	public String viewAllProducts() {
		return "viewAllProducts"; /// WEB-INF/views/viewAllProducts.jsp
	}

	@GetMapping("addProducts") // http://localhost:9094/addProducts
	public String addProducts() {
		return "addProducts"; /// WEB-INF/views/addProducts.jsp
	}
}

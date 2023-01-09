package com.training.pms.galaxe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // VIEWS
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET) // localhost:9094/login
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");

		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login"; // VIEW // /WEB-INF/views/login.jsp
	}

	@RequestMapping(value = "/galaxe", method = RequestMethod.GET) // localhost:9094/galaxe
	public String galaxe() {
		return "galaxe"; // /WEB-INF/views/galaxe.jsp
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET) // localhost:9094/about
	public String about() {
		return "about"; // /WEB-INF/views/about.jsp
	}

	@GetMapping // http://localhost:9094
	public String index() {
		return "index"; // /WEB-INF/views/index.jsp
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET) // localhost:9094/contact
	public String contact() {
		return "contact"; // /WEB-INF/views/contact.jsp
	}
}

// Don't Use Security Dependency For Now
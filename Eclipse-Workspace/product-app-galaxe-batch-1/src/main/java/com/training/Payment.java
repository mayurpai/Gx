package com.training;

import org.springframework.stereotype.Component;

@Component
// Spring Will Create A Bean Of This Class
public class Payment {

	public Payment() {

	}

	public String pay() {
		return "Payment Pay Method Called";

	}

}

// Stereotype Annotations For Generating Beans
// @Component
// @Service
// @RestController
// @Repository
// @Controller

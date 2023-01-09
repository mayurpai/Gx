package com.training.rws.galaxe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.rws.galaxe.client.ProductClient;
import com.training.rws.galaxe.model.Product;

@RestController
@RequestMapping("reviewsproduct")
public class ReviewsController {

	@Autowired
	ProductClient productClient;

	@GetMapping("/productData/{id}") // http://localhost:9091/reviewsproduct/productData/12
	public Product getProductDataForReviews(@PathVariable("id") int id) {
		return productClient.getProductData(id);
	}
}

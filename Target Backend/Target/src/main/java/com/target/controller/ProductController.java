package com.target.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.target.entity.Product;
import com.target.exception.ProductNotFound;
import com.target.service.ProductService;

@RestController
@RequestMapping("product/api/v1")
@CrossOrigin
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("GET")
	public List<Product> getAllProducts() throws ProductNotFound, Exception {
		List<Product> employee;
		try {
			employee = productService.getAllProducts();
		} catch (ProductNotFound e) {
			throw new ProductNotFound();
		} catch (Exception e) {
			throw new Exception();
		}
		return employee;
	}

	@PostMapping("POST")
	public Product saveProduct(@RequestBody Product product) throws Exception {
		try {
			return productService.saveProduct(product);
		} catch (Exception e) {
			throw new Exception();
		}
	}
}

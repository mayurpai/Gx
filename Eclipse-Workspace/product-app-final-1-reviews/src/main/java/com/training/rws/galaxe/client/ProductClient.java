package com.training.rws.galaxe.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.rws.galaxe.model.Product;

// Communicate With Other Services (FeignClient)
//
// Use Case: Wanting To Fetch A Product By Giving Product ID
// (Reviews Communicating With The Product)

@FeignClient(name = "product-client", url = "http://localhost:9090")
public interface ProductClient {

	@GetMapping("/product/{productId}") // To Call This, We Have To Use 9091 Port Controller
	Product getProductData(@PathVariable("productId") int productId);
}

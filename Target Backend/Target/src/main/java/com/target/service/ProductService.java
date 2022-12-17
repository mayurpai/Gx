package com.target.service;

import java.util.List;

import com.target.entity.Product;
import com.target.exception.ProductNotFound;

public interface ProductService {

	List<Product> getAllProducts() throws ProductNotFound;

	Product saveProduct(Product product) throws Exception; 

}

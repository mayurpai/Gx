package com.target.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.entity.Product;
import com.target.exception.ProductNotFound;
import com.target.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() throws ProductNotFound {
		List<Product> employee;
		if (!productRepository.findAll().isEmpty()) {
			employee = productRepository.findAll();
			return employee;
		} else
			throw new ProductNotFound("No Product Found");
	}

	@Override
	public Product saveProduct(Product product) throws Exception {
		try {
			return productRepository.save(product);
		} catch (Exception e) {
			throw new Exception();
		}
	}

}

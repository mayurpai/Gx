package com.galaxe.target.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galaxe.target.entity.Product;
import com.galaxe.target.enums.ProductType;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Boolean existsByProductId(Integer productId);
	 
	public List<Product> findByProductType(ProductType productType);

	public List<Product> findByProductNameStartsWith(String productName);

	public List<Product> findByProductBrandContaining(String productBrand);
	
	public Product findByProductId(Integer productId);
}

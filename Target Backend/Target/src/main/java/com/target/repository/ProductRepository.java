package com.target.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.target.entity.Product;
import com.target.enums.ProductType;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	public List<Product> findByProductType(ProductType productType);

	public List<Product> findByProductNameStartsWith(String productName);

	public List<Product> findByProductBrandContaining(String productBrand);
}

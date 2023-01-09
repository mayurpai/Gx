package com.galaxe.target.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.galaxe.target.entity.Product;
import com.galaxe.target.enums.ProductType;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Boolean existsByProductId(Integer productId);

	Boolean existsByProductName(String productName);

	public List<Product> findByProductType(ProductType productType);

	public List<Product> findByProductNameContaining(String productName);

	public List<Product> findByProductBrandContaining(String productBrand);

	public Product findByProductId(Integer productId);

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM Product WHERE product_id = ?1", nativeQuery = true)
	Integer deleteByProductId(Integer productId);

}

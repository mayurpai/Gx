package com.training.pms.galaxe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.training.pms.galaxe.model.Product;

// When An Interface Wants To Have Properties From Other Interface, We Use extends
// @Component Isn't Required For Interfaces
public interface ProductDAO extends CrudRepository<Product, Integer> {
    public List<Product> findByProductName(String productName);

    public List<Product> findByProductPrice(int productPrice);

    public List<Product> findByProductPriceBetween(int minPrice, int maxPrice);

    public List<Product> findByQuantityOnHandGreaterThan(int quantityOnHand);
    // SELECT * FROM PRODUCT WHERE quantityOnHand > 90;

//    Custom Method That We Created To Fetch All Products
//    @Query("FROM PRODCT")
//    public List <Product> findAllProducts(String productName);
}

// By Using Keywords, We Can Generate
// public List <Product> findByProductName(String productName);
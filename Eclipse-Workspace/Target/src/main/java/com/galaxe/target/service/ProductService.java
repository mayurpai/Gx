package com.galaxe.target.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.galaxe.target.entity.Cart;
import com.galaxe.target.entity.Product;
import com.galaxe.target.enums.ProductType;
import com.galaxe.target.exception.ProductException;
import com.galaxe.target.exception.ProductNotFound;
import com.galaxe.target.exception.ProductTypeMismatch;

public interface ProductService {

	List<Product> getAllProducts() throws ProductNotFound;

	Product saveProduct(Product product) throws Exception;

	List<Product> saveAllProducts(List<Product> product) throws Exception;

	List<Product> findByProductType(ProductType productType) throws ProductTypeMismatch, ProductNotFound;

	List<Product> findByProductBrandContaining(String productBrand) throws ProductNotFound;

	List<Product> findByProductNameContaining(String productName) throws ProductNotFound;

	public Stream<Product> sortProductByPriceAscending() throws ProductNotFound;

	public Stream<Product> sortProductByPriceDescending() throws ProductNotFound;

	public Stream<Product> getProductBelowTenDollars() throws ProductNotFound;

	public Stream<Product> getProductBelowFiftyDollars() throws ProductNotFound;

	Product saveProductToCart(Product product) throws Exception;

	Product findByProductId(Integer productId) throws ProductNotFound, Exception;

	Integer deleteProduct(Integer productId) throws ProductNotFound, Exception;

	Product updateProduct(Product product) throws ProductNotFound, Exception;

}

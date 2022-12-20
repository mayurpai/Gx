package com.target.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.target.entity.Cart;
import com.target.entity.Product;
import com.target.enums.ProductType;
import com.target.exception.ProductNotFound;
import com.target.exception.ProductTypeMismatch;

public interface ProductService {

	List<Product> getAllProducts() throws ProductNotFound;

	Product saveProduct(Product product) throws Exception;
	
	List<Product> saveAllProducts(List<Product> product) throws Exception;

	List<Product> findByProductType(ProductType productType) throws ProductTypeMismatch, ProductNotFound;

	List<Product> findByProductBrandContaining(String productBrand) throws ProductNotFound;

	List<Product> findByProductNameStartsWith(String productName) throws ProductNotFound;
	
	public Stream<Product> sortProductByPriceAscending() throws ProductNotFound;
	
	public Stream<Product> sortProductByPriceDescending() throws ProductNotFound;
	
	public Stream<Product> getProductBelowTenDollars() throws ProductNotFound;
	
	public Stream<Product> getProductBelowFiftyDollars() throws ProductNotFound;

	Product saveProductToCart(Product product) throws Exception;

//	Optional<Cart> findAllProductsInCartByCartId(int cartId) throws Exception;

}

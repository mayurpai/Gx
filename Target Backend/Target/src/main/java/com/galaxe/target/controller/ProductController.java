package com.galaxe.target.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.target.entity.Product;
import com.galaxe.target.enums.ProductType;
import com.galaxe.target.exception.ProductNotFound;
import com.galaxe.target.exception.ProductTypeMismatch;
import com.galaxe.target.service.ProductService;

@RestController
@RequestMapping("product/api/v1")
@CrossOrigin("http://localhost:3000/")
public class ProductController {

	@Autowired
	ProductService productService;

	List<Product> product;

//	Optional<Cart> cart;

	@GetMapping("GET")
	public List<Product> getAllProducts() throws ProductNotFound, Exception {
		try {
			product = productService.getAllProducts();
			return product;
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
	}

	@GetMapping("GET/{productId}")
	public Product getProductById(@PathVariable Integer productId) throws ProductNotFound, Exception {
		try {
			return productService.findByProductId(productId);
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
	}

	@PostMapping("POST")
	public Product saveProduct(@RequestBody Product product) throws Exception {
		try {
			return productService.saveProduct(product);
		} catch (Exception e) {
			throw new Exception();
		}
	}

	@GetMapping("GET/Product-Type/{productType}")
	public List<Product> getAllProductsByProductType(@PathVariable ProductType productType)
			throws ProductTypeMismatch, ProductNotFound, Exception {
		try {
			product = productService.findByProductType(productType);
		} catch (ProductTypeMismatch e) {
			throw new ProductTypeMismatch();
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
		return product;
	}

	@GetMapping("GET/Product-Brand/{productBrand}")
	public List<Product> getAllProductsByProductBrand(@PathVariable String productBrand)
			throws ProductNotFound, Exception {
		try {
			product = productService.findByProductBrandContaining(productBrand);
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
		return product;
	}

	@GetMapping("GET/Product-Name/{productName}")
	public List<Product> getAllProductsByProductName(@PathVariable String productName)
			throws ProductNotFound, Exception {
		try {
			product = productService.findByProductNameStartsWith(productName);
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
		return product;
	}

	@PostMapping("POST/All")
	public List<Product> saveAllProducts(@RequestBody List<Product> product) throws Exception {
		try {
			return productService.saveAllProducts(product);
		} catch (Exception e) {
			throw new Exception();
		}
	}

	@GetMapping("GET/Product-Sort-Ascending")
	public Stream<Product> getProductsSortedByPriceAscending() throws ProductNotFound, Exception {
		Stream<Product> product;
		try {
			product = productService.sortProductByPriceAscending();
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
		return product;
	}

	@GetMapping("GET/Product-Sort-Descending")
	public Stream<Product> getProductsSortedByPriceDescending() throws ProductNotFound, Exception {
		Stream<Product> product;
		try {
			product = productService.sortProductByPriceDescending();
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
		return product;
	}

	@GetMapping("GET/Product-Below-Ten-Dollars")
	public Stream<Product> getProductBelowTenDollars() throws ProductNotFound, Exception {
		Stream<Product> product;
		try {
			product = productService.getProductBelowTenDollars();
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
		return product;
	}

	@GetMapping("GET/Product-Below-Fifty-Dollars")
	public Stream<Product> getProductBelowFiftyDollars() throws ProductNotFound, Exception {
		Stream<Product> product;
		try {
			product = productService.getProductBelowFiftyDollars();
		} catch (ProductNotFound e) {
			throw new ProductNotFound(e.getMessage());
		} catch (Exception e) {
			throw new Exception();
		}
		return product;
	}

	@PostMapping("POST/Product-Cart")
	public Product saveProductToCart(@RequestBody Product product) throws Exception {
		try {
			return productService.saveProductToCart(product);
		} catch (Exception e) {
			throw new Exception();
		}
	}

}

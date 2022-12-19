package com.target.service;

import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.entity.Product;
import com.target.enums.ProductType;
import com.target.exception.ProductNotFound;
import com.target.exception.ProductTypeMismatch;
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

	@Override
	public List<Product> findByProductType(ProductType productType) throws ProductTypeMismatch, ProductNotFound {
		List<Product> employee;
		if (ProductType.Home.name().equals("Home") || ProductType.Electronics.name().equals("Electronics")
				|| ProductType.Toys.name().equals("Toys") || ProductType.Clothing.name().equals("Clothing")
				|| ProductType.Beauty.name().equals("Beauty")) {
			if (!productRepository.findByProductType(productType).isEmpty()) {
				employee = productRepository.findByProductType(productType);
				return employee;
			} else {
				throw new ProductNotFound("No Product Found With Type " + productType);
			}
		} else {
			throw new ProductTypeMismatch();
		}
	}

	@Override
	public List<Product> findByProductBrandContaining(String productBrand) throws ProductNotFound {
		List<Product> employee;
		if (!productRepository.findByProductBrandContaining(productBrand).isEmpty()) {
			employee = productRepository.findByProductBrandContaining(productBrand);
			return employee;
		} else
			throw new ProductNotFound("No Product Found With Brand " + productBrand);
	}

	@Override
	public List<Product> findByProductNameStartsWith(String productName) throws ProductNotFound {
		List<Product> employee;
		if (!productRepository.findByProductNameStartsWith(productName).isEmpty()) {
			employee = productRepository.findByProductNameStartsWith(productName);
			return employee;
		} else
			throw new ProductNotFound("No Product Found With Name " + productName);
	}

	@Override
	public List<Product> saveAllProducts(List<Product> product) throws Exception {
		try {
			return productRepository.saveAll(product);
		} catch (Exception e) {
			throw new Exception();
		}
	}

	@Override
	public Stream<Product> sortProductByPriceAscending() throws ProductNotFound {
		List<Product> products = getAllProducts();
		if (!products.isEmpty()) {
			Stream<Product> sortedProductListByPriceAscending = products.stream()
					.sorted(Comparator.comparingDouble(Product::getProductPrice));
			return sortedProductListByPriceAscending;
		} else {
			throw new ProductNotFound("No Product Exists!");
		}
	}

	@Override
	public Stream<Product> sortProductByPriceDescending() throws ProductNotFound {
		List<Product> products = getAllProducts();
		if (!products.isEmpty()) {
			Stream<Product> sortedProductListByPriceDescending = products.stream()
					.sorted(Comparator.comparingDouble(Product::getProductPrice).reversed());
			return sortedProductListByPriceDescending;
		} else {
			throw new ProductNotFound("No Product Exists!");
		}
	}

	@Override
	public Stream<Product> getProductBelowTenDollars() throws ProductNotFound {
		List<Product> products = getAllProducts();
		if (!products.isEmpty()) {
			Stream<Product> sortedProductListBelowTenDollars = products.stream().filter(p -> p.getProductPrice() < 10);
			if (products.stream().filter(p -> p.getProductPrice() < 10).count() != 0) {
				return sortedProductListBelowTenDollars;
			} else {
				throw new ProductNotFound("No Product Exists!");
			}
		} else {
			throw new ProductNotFound("No Product Exists In Database!");
		}

	}
	
	@Override
	public Stream<Product> getProductBelowFiftyDollars() throws ProductNotFound {
		List<Product> products = getAllProducts();
		if (!products.isEmpty()) {
			Stream<Product> sortedProductListBelowTenDollars = products.stream().filter(p -> p.getProductPrice() < 50);
			if (products.stream().filter(p -> p.getProductPrice() < 50).count() != 0) {
				return sortedProductListBelowTenDollars;
			} else {
				throw new ProductNotFound("No Product Exists!");
			}
		} else {
			throw new ProductNotFound("No Product Exists In Database!");
		}

	}

}

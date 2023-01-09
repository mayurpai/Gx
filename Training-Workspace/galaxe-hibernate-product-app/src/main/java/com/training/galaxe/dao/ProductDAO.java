package com.training.galaxe.dao;

import com.training.galaxe.model.Product;
import java.util.List;

public interface ProductDAO {
	public void saveProduct(Product product);

	public void updateProduct(Product product);

	public void deleteProduct(int productID);

	public Product getProduct(int productID);

	public boolean isProductExists(int productID);

	public List<Product> getProduct();

	public List<Product> searchByProduct(String productName);

	public List<Product> searchByProduct(
    String productName,
    int productPrice
  );

	public List<Product> searchByProduct(int min, int max);

	public List<Product> checkStockStatus(int minStock);
}

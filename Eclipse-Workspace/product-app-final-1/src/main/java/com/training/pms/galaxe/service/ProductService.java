package com.training.pms.galaxe.service;

import java.util.List;

import com.training.pms.galaxe.model.Product;

public interface ProductService {
    public String saveProduct(Product product);

    public String updateProduct(Product product);

    public String deleteProduct(int productID);

    public Product getProduct(int productID);

    public boolean isProductExists(int productID);

    public List<Product> getProduct();

    public List<Product> searchByProduct(String productName);
    
    public List<Product> searchByProduct(int productPrice);

//
//    public List<Product> searchByProduct(
//            String productName,
//            int productPrice);
//
    public List<Product> searchByProduct(int min, int max);

    public List<Product> checkStockStatus(int minStock);
}

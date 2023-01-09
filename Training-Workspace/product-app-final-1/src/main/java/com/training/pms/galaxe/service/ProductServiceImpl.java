package com.training.pms.galaxe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.pms.galaxe.model.Product;
import com.training.pms.galaxe.aop.LoggingAspects;
import com.training.pms.galaxe.dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDAO productDAO;
    
    @Autowired
    LoggingAspects loggingaspects;

    public ProductServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String saveProduct(Product product) {
        // Security Checking
        // Logging
        // Transaction
        System.out.println("Save Product Called");
//        loggingaspects.doLogging(); Don't Do This (100 Times Call)
        if (product.getProductPrice() < 0 | product.getQuantityOnHand() < 0) {
            return "Product Price Or QOH Canont Be Negative";
        } else {
            productDAO.save(product);
            return "Product Saved Successfully";
        }
    }

    @Override
    public String updateProduct(Product product) {
        System.out.println("Update Product Called");
        if (product.getProductPrice() < 0 | product.getQuantityOnHand() < 0) {
            return "Product Price Or QOH Canont Be Negative";
        } else {
            productDAO.save(product);
            return "Product Updated Successfully";
        }
    }

    @Override
    public String deleteProduct(int productId) {
        System.out.println("Delete Product By ID Called");
        productDAO.deleteById(productId);
        return "Product Deleted Successfully";
    }

    @Override
    public List<Product> getProduct() {
        System.out.println("Get Product Called");
        return (List<Product>) productDAO.findAll();
    }

    @Override
    public Product getProduct(int productId) {
        System.out.println("Get Product By ID Called");
        Optional<Product> product = productDAO.findById(productId);
        return product.get();
    }

    @Override
    public boolean isProductExists(int productId) {
        System.out.println("Is Product Exists Called");
        Optional<Product> product = productDAO.findById(productId);
        return product.isPresent();
    }

    @Override
    public List<Product> searchByProduct(String productName) {
        System.out.println("Search By Product Name Called");
        return productDAO.findByProductName(productName);
    }

    @Override
    public List<Product> searchByProduct(int min, int max) {
        System.out.println("Search By Product Using Range Called");
        return productDAO.findByProductPriceBetween(min, max);
    }

    @Override
    public List<Product> checkStockStatus(int minStock) {
        System.out.println("Check Stock Status Product Called");
        return productDAO.findByQuantityOnHandGreaterThan(minStock);
    }

    @Override
    public List<Product> searchByProduct(int productPrice) {
        System.out.println("Search By Product Price Called");
        return productDAO.findByProductPrice(productPrice);
    }

}

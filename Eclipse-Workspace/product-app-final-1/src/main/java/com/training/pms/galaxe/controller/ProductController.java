package com.training.pms.galaxe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.galaxe.dao.ProductDAO;
import com.training.pms.galaxe.model.Product;
import com.training.pms.galaxe.service.ProductService;

@RestController
@RequestMapping("/product")
//@CrossOrigin(origins = "http:///localhost:3000")
public class ProductController {

//    @Autowired
//    ProductDAO productDAO;

    @Autowired
    ProductService productService;

    @Autowired
    Product product;

    public ProductController() {

    }

    @GetMapping // localhost:9090/product/
    public ResponseEntity<List<Product>> getProduct() {
        List<Product> products = productService.getProduct();
        ResponseEntity<List<Product>> responseEntity;
        if (products.isEmpty()) {
            responseEntity = new ResponseEntity<List<Product>>(products,
                    HttpStatus.NO_CONTENT);
        } else {
            responseEntity = new ResponseEntity<List<Product>>(products, HttpStatus.OK);
        }
        return responseEntity;
//        
    }

    @GetMapping("{productId}") // localhost:9090/product/5
    public ResponseEntity<Product> getProduct(@PathVariable("productId") Integer productId) {
        ResponseEntity<Product> responseEntity;
        if (productService.isProductExists(productId)) {
            product = productService.getProduct(productId);
            responseEntity = new ResponseEntity<Product>(product, HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
        }
        return responseEntity;
    }

    @DeleteMapping("{productId}") // localhost:9090/product/5
    public ResponseEntity<String> deleteProduct(@PathVariable("productId") Integer productId) {
        ResponseEntity<String> responseEntity;
        if (productService.isProductExists(productId)) {
            String message = productService.deleteProduct(productId);
            responseEntity = new ResponseEntity<String>(message,
                    HttpStatus.OK);
        } else {
            String errorMessage = "No Such Product ID Exists";
            responseEntity = new ResponseEntity<String>(errorMessage, HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    @PostMapping() // localhost:9090/product/
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        ResponseEntity<String> responseEntity;
        int pId = product.getProductId();
        if (productService.isProductExists(pId)) {
            responseEntity = new ResponseEntity<String>("Product With Product ID: " + pId + " Already Exists",
                    HttpStatus.CONFLICT);
        } else {
            String message = productService.saveProduct(product);
            responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
        }
        return responseEntity;
    }

    @PutMapping() // localhost:9090/product/
    public ResponseEntity<String> updateProduct(@RequestBody Product product) {
        ResponseEntity<String> responseEntity;
        int pId = product.getProductId();
        if (!productService.isProductExists(pId)) {
            responseEntity = new ResponseEntity<String>("Product With Product ID: " + pId + " Doesn't Exist",
                    HttpStatus.NOT_FOUND);
        } else {
            String message = productService.updateProduct(product);
            responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
        }
        return responseEntity;
    }

    @GetMapping("searchByProductName/{productName}") // localhost:9090/product/searchByProductName/Lakme
    public ResponseEntity<List<Product>> getProductByProductName(@PathVariable("productName") String productName) {
        ResponseEntity<List<Product>> responseEntity;
        List<Product> products = productService.searchByProduct(productName);
        if (products.isEmpty()) {
            responseEntity = new ResponseEntity<List<Product>>(products, HttpStatus.NO_CONTENT);
        } else {
            responseEntity = new ResponseEntity<List<Product>>(products, HttpStatus.OK);
        }
        return responseEntity;
    }

    @GetMapping("searchByPriceRange/{min}/{max}") // localhost:9090/product/searchByPriceRange/243/678
    public ResponseEntity<List<Product>> getProductByPriceRange(@PathVariable("min") Integer min,
            @PathVariable("max") Integer max) {

        ResponseEntity<List<Product>> responseEntity;
        List<Product> products = productService.searchByProduct(min, max);
        if (products.isEmpty()) {
            responseEntity = new ResponseEntity<List<Product>>(products, HttpStatus.NO_CONTENT);
        } else {
            responseEntity = new ResponseEntity<List<Product>>(products, HttpStatus.OK);
        }
        return responseEntity;
    }

    @GetMapping("searchByQuantityOnHandGreaterThan/{quantityOnHand}") // localhost:9090/product/searchByQuantityOnHandGreaterThan/243
    public ResponseEntity<List<Product>> getProductQuantityOnHandGreaterThan(
            @PathVariable("quantityOnHand") Integer quantityOnHand) {

        ResponseEntity<List<Product>> responseEntity;
        List<Product> products = productService.checkStockStatus(quantityOnHand);
        if (products.isEmpty()) {
            responseEntity = new ResponseEntity<List<Product>>(products, HttpStatus.NO_CONTENT);
        } else {
            responseEntity = new ResponseEntity<List<Product>>(products, HttpStatus.OK);
        }
        return responseEntity;
    }

    @GetMapping("searchByProductPrice/{productPrice}") // localhost:9090/product/searchByProductPrice/243
    public ResponseEntity<List<Product>> getProductPrice(
            @PathVariable("productPrice") Integer productPrice) {

        ResponseEntity<List<Product>> responseEntity;
        List<Product> products = productService.searchByProduct(productPrice);
        if (products.isEmpty()) {
            responseEntity = new ResponseEntity<List<Product>>(products, HttpStatus.NO_CONTENT);
        } else {
            responseEntity = new ResponseEntity<List<Product>>(products, HttpStatus.OK);
        }
        return responseEntity;
    }

}

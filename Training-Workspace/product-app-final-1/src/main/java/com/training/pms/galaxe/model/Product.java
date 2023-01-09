package com.training.pms.galaxe.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Table(name = "Fresh_Products")
@Component
@Data
public class Product {

    @Id
    private int productId;
    private String productName;
    private int quantityOnHand;
    private int productPrice;

//    public int getProductId() {
//        return productId;
//    }
//
//    public Product(int productId, String productName, int quantityOnHand, int productPrice) {
//        super();
//        this.productId = productId;
//        this.productName = productName;
//        this.quantityOnHand = quantityOnHand;
//        this.productPrice = productPrice;
//    }
//
//    @Override
//    public String toString() {
//        return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
//                + ", productPrice=" + productPrice + "]";
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public int getQuantityOnHand() {
//        return quantityOnHand;
//    }
//
//    public void setQuantityOnHand(int quantityOnHand) {
//        this.quantityOnHand = quantityOnHand;
//    }
//
//    public int getProductPrice() {
//        return productPrice;
//    }
//
//    public void setProductPrice(int productPrice) {
//        this.productPrice = productPrice;
//    }
//
//    public Product() {
//    }

}

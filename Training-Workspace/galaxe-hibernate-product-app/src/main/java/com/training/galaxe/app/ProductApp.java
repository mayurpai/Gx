package com.training.galaxe.app;

import com.training.galaxe.dao.ProductDAO;
import com.training.galaxe.dao.ProductDAOImpl;
import com.training.galaxe.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductApp {

  Scanner sc = new Scanner(System.in);
  ProductDAO productDAO = new ProductDAOImpl();
  int productID, productPrice, productQuantityOnHand;
  String productName;
  Product product;
  int choice = 0;
  List<Product> products = new ArrayList<Product>();

  public ProductApp() {}

  public void startProductApp() {
    while (true) {
      System.out.println("MENU");
      System.out.println("1. Add Product");
      System.out.println("2. Update Product");
      System.out.println("3. Delete Product");
      System.out.println("4. Search Product");
      System.out.println("5. Show All Products");
	  System.out.println("6. Search Product By Name");
      System.out.println("7. Show Ranged Products");
      System.out.println("8. Exit");

      System.out.print("Enter Your Choice: ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Welcome To The Add Section");
          System.out.print("Enter Product ID: ");
          productID = sc.nextInt();
          if (productDAO.isProductExists(productID)) {
            System.out.println(
              "Product With Product ID " + productID + " Already Exists!"
            );
            break;
          }
          System.out.print("Enter Product Name: ");
          productName = sc.next();
          System.out.print("Enter Product Quantity On Hand: ");
          productQuantityOnHand = sc.nextInt();
          System.out.print("Enter Product Price: ");
          productPrice = sc.nextInt();

          product =
            new Product(
              productID,
              productName,
              productQuantityOnHand,
              productPrice
            );
          productDAO.saveProduct(product);
          System.out.println(
            "Product: " + productName + " Successfully Created!"
          );

          break;
        case 2:
          System.out.println("Welcome To The Update Section");
          System.out.print("Enter New Product ID: ");
          productID = sc.nextInt();
          if (!productDAO.isProductExists(productID)) {
            System.out.println(
              "Product With Product ID " + productID + " Does Not Exist!"
            );
            break;
          }

          System.out.print("Enter New Product Name: ");
          productName = sc.next();
          System.out.print("Enter New Product Quantity On Hand: ");
          productQuantityOnHand = sc.nextInt();
          System.out.print("Enter New Product Price: ");
          productPrice = sc.nextInt();

          product =
            new Product(
              productID,
              productName,
              productQuantityOnHand,
              productPrice
            );
          productDAO.updateProduct(product);
          System.out.println(
            "Product: " + productName + " Successfully Updated!"
          );

          break;
        case 3:
          System.out.println("Welcome To The Delete Section");
          System.out.print("Enter Product ID: ");
          productID = sc.nextInt();
          if (!productDAO.isProductExists(productID)) {
            System.out.println(
              "Product With Product ID " + productID + " Does Not Exist!"
            );
            break;
          }

          productDAO.deleteProduct(productID);
          System.out.println(
            "Product: " + productID + " Successfully Deleted!"
          );

          break;
        case 4:
          System.out.println("Welcome To The Search Section");
          System.out.print("Enter Product ID: ");
          productID = sc.nextInt();
          if (!productDAO.isProductExists(productID)) {
            System.out.println(
              "Product With Product ID " + productID + " Does Not Exist!"
            );
            break;
          }
          Product searchedProduct = productDAO.getProduct(productID);
          System.out.println("Product: " + searchedProduct);

          break;
        case 5:
          System.out.println("Welcome To The View All Product Section");

          List<Product> allProducts = productDAO.getProduct();
          System.out.println("Product: " + allProducts);

          break;
        case 6:
          System.out.println("Welcome To The Search Product Section By Name");
		  System.out.print("Enter Product Name: ");
          productName = sc.next();
          List<Product> searchedProductName = productDAO.searchByProduct(
            productName
          );
          System.out.println("Product: " + searchedProductName);

          break;
        case 7:
          System.out.println("Welcome To The Ranged Product Section");
          System.out.print("Enter Product Min: ");
          int productMin = sc.nextInt();
          System.out.print("Enter Product Max: ");
          int productMax = sc.nextInt();
          products = productDAO.searchByProduct(productMin, productMax);

          System.out.println("Product: " + products);

          break;
        case 8:
          System.out.println("Thanks For Using My Product App");
          System.exit(0);
        default:
          break;
      }
    }
  }
}
// HQL Works With Properties And POJO's And Not Table Name And Column Name
// SELECT * FROM PRODUCT
// SELECT * FROM PRODUCT WHERE

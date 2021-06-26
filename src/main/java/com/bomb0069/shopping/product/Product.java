package com.bomb0069.shopping.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product /*extends Audit<String>*/{
    @Id
    private Integer id;
    private String productName;
    private String productBrand;
    private Integer quantity = 1;
    private Double productPrice;
    private String imageUrl;

    public Product() {
    }

    public Product(Integer id, String product_Name, Double product_Price, String image_Url) {
        this.id = id;
        this.productName = product_Name;
        this.productPrice = product_Price;
        this.imageUrl = image_Url;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n"
                + "productName :" + productName + "\n"
                + "productBrand: " + productBrand + "\n"
                + "quantity: " + quantity + "\n"
                + "productPrice: " + productPrice + "\n"
                + "imageUrl: " + imageUrl + "\n";
                //+ "created: " + created + "\n"
                //+ "createdBy: " + created_By + "\n"
                //+ "modified: " + modified + "\n"
                //+ "modifiedBy: " + modified_By;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

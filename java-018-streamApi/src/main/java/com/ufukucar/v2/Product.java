package com.ufukucar.v2;

import java.util.StringJoiner;

class Product {

    private int id;

    private String productName;

    private Double price;


    public Product(int id, String productName, Double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("productName='" + productName + "'")
                .add("price=" + price)
                .toString();
    }
}

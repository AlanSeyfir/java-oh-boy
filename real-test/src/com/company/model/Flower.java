package com.company.model;

public class Flower {
    String category;
    double price;
    String name;
    int productid;

    @Override
    public String toString() {
        return "Flower{" +
                "category='" + category + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", productid=" + productid +
                '}';
    }
}

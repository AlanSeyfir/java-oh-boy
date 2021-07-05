package com.company;

import java.util.ArrayList;

public class Store {
    int id;
    String name;
    String[] location = {"First", "Second", "Third"};
    ArrayList<Object> products = new ArrayList<>();

    public Store(int id, String name, String[] location, ArrayList<Object> products) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.products = products;
    }

    //A product is identified by product id, name, type, quantity and price.
    public void MyProduct(int id, String name, char type, int quantity, double price){
        products.add(2);
    }

    public ArrayList<Object> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Object> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }
}

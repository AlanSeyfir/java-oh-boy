package com.company;

import com.company.model.ClothingItem;
import com.company.model.Product;
import com.company.model.Shirt;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ClothingItem item = new ClothingItem("Shirt", "M", 14.22);
//        displayProduct(item);

        Shirt shirt = new Shirt("M", 20.99);
        shirt.setPattern("Robust");
        displayProduct(shirt);
        System.out.println(" Pattern is: " + shirt.getPattern());

        ClothingItem reallyAShirt = new Shirt("L", 67.99);
        displayProduct(reallyAShirt);

        Shirt shirt2 = (Shirt) reallyAShirt;
        shirt2.setPattern("plaid");
        System.out.println(reallyAShirt + " Pattern is: "  + shirt2.getPattern());
    }

    //Receive an instance of the Product interface
    private static void displayProduct(Product product){
        String output = product.getClass().getSimpleName() + "{" +
                "type='" + product.getType() + '\'' +
                ", size='" + product.getSize() + '\'' +
                ", price=" + product.getPrice() +
                '}';
        System.out.println(output);
    }
}

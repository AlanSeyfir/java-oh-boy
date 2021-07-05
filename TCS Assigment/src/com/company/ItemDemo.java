package com.company;

import java.util.Arrays;

/* TODO: Create the below static method searchItemByName in the ItemDemo class.
 * TODO: This method will take array of Item objects and name as input and returns new array of Item objects for all
 *       values found with the given name else return null if not found.
 * TODO: Create an array of 5 Item objects in the main method
 * TODO: Call the above static method from the main method
 */
public class ItemDemo {
    //With Intellij I run this method although we have a main in Class Customer, I pressed the green arrow
    //inside the class
    public static void main(String[] args) {
        searchByItemName();
    }

    public static void searchByItemName(){
        Item item = new Item(1, "Dummy Text1", 21.0, 12);
        Item item2 = new Item(2, "Dummy Text2", 21.0, 12);
        Item item3 = new Item(3, "Dummy Text3", 21.0, 12);
        Item item4 = new Item(4, "Dummy Text4", 21.0, 12);
        Item item5 = new Item(4, "Dummy Text4", 21.0, 12);

        if (item.getName().contains("Dummy Text1") == true){
            //1 Method, redundant?
            System.out.println("Id: " + item.getId() + " Name: " + item.getName() + " Price: " + item.getPrice() + " Quantity: "  + item.getQuantity());
            System.out.println("Id: " + item2.getId() + " Name: " + item2.getName() + " Price: " + item2.getPrice() + " Quantity: "  + item2.getQuantity());
            System.out.println("Id: " + item3.getId() + " Name: " + item3.getName() + " Price: " + item3.getPrice() + " Quantity: "  + item3.getQuantity());
            System.out.println("Id: " + item4.getId() + " Name: " + item4.getName() + " Price: " + item4.getPrice() + " Quantity: "  + item4.getQuantity());
            System.out.println("Id: " + item5.getId() + " Name: " + item5.getName() + " Price: " + item5.getPrice() + " Quantity: "  + item5.getQuantity());

            System.out.println("-----------------------");
            //2 Method easier
            item.display();
            item2.display();
            item3.display();
            item4.display();
            item5.display();
            System.out.println("We found info!");
        }else{
            System.out.println("Is null");
        }

    }


}

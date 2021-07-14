package com.company;

import com.company.model.ClothingItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> states = new ArrayList<>();
        states.add("California");
        states.add("Texas");
        states.add("Pensylvania");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(4234);
        numbers.add(122);
        for (int number: numbers){System.out.println(number);}

        for(String state: states){System.out.println(state);}

        System.out.println();

        states.remove(1);
        for(String state: states){
            System.out.println(state);
        }

        String _2state = states.get(1);
        System.out.println("The second state is: " + _2state);

        int pos = states.indexOf("Pensylvania");
        System.out.println("Position of Texas is: " + pos);
    }

    public static void arrayExamples(){
        int[] numbers = {2,4,6,8,10};
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        String[] fruits = {"Peach", "grape", "orange"};
        for (String fruit: fruits){
            System.out.println(fruit);
        }

        //With the 3, means that create 3 new items
        ClothingItems[] items = new ClothingItems[3];
        items[0] = new ClothingItems("Shirt", "L", 21.92);
        items[1] = new ClothingItems("Pants", "38", 17.22);
        items[2] = new ClothingItems("Cap", "S", 5.99);

        for (ClothingItems item: items){
            System.out.println(item);
        }

        System.out.println("--------------------------------------\n---Copy array---");

        ClothingItems[] copied = Arrays.copyOf(items, items.length);
        for (ClothingItems item: copied){
            System.out.println(item);
        }
        System.out.println();
        items[0].setPrice(5.00);
        System.out.println(items[0]);
        System.out.println(copied[0]);
    }
}

package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int answerUser;
        Main main = new Main();

        do {
            answerUser = main.displayMenu();
            switch (answerUser){
                case 1:
                    System.out.println("\n1. Display location");
                        showStore();
                        new Store();

                    break;
                case 0:
                    System.out.println("You exit the program. Have a nice day!");
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }while(answerUser > 5);
    }

    public static void showStore(){
        Store store = new Store();

        store.getLocation();
        store.getId();
        store.getName();
        store.getProducts();
        //store.location[0];
    }

    public int displayMenu(){
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Mall Plaza Sania");
        System.out.println("1. Display Store details");
        System.out.println("0. Exit");

        System.out.print("Your option is: ");
        selection = sc.nextInt();
        return selection;
    }
}

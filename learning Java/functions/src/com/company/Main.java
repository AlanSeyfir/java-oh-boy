package com.company;

import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime(){
        System.out.println("Wait to tea time to start...");
        System.out.println("Pressed something random and enter to start tea time");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        System.out.println("Tea time started!!");
    }

    public static double calculatePriceMeal(double priceMeal, double tipRate, double taxRate){
        double tax = taxRate * priceMeal;
        double tip = tipRate * priceMeal;
        double total = tax * tip;

        return total;
        //System.out.println("Your meal cost a total of " + total);
    }

    //Use math pow
    public static void useMathPow(){
        double result = Math.pow(2,3);
        System.out.println(result);
    }

    public static void main(String[] args) {
	// write your code here
        useMathPow();
        System.out.println("----------------------------");

        double groupCostMeal = calculatePriceMeal(131,.2, .04);
        System.out.println(groupCostMeal);
        int quantityOfFriends = 5;
        double individualTotal = groupCostMeal / quantityOfFriends;

        System.out.println(individualTotal);
    }
}

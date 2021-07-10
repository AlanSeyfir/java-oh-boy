package com.company;

import java.util.Scanner;

public class Challenge {
    //Complicated way
    public static double calculateEmployeeSalary(){
        System.out.println("Calculator of employee salary\n1.- Insert how many hours the employee works per week");
        Scanner sc = new Scanner(System.in);

        int hoursPerWeek = sc.nextInt();
        System.out.println("2.- Insert the amount of money the employee makes per hour");
        double moneyPerHour = sc.nextDouble();

        double totalWeek = hoursPerWeek * moneyPerHour;
        double totalSalary = totalWeek * 52;
        System.out.println(totalSalary);
        return totalSalary;
    }

    //Simplier way and with unpaid days
    public static double salaryCalculator(double hoursPerWeek, double amountPerHour, int vacationDays){
        
        //If makes it obvious that entering a negative number isn't correct
        if (hoursPerWeek < 0){
            //Error control
            return -1;
        }
        if (amountPerHour < 0){
            //Error control
            return -1;
        }

        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays * amountPerHour * 8;
        return (weeklyPaycheck * 52) - unpaidTime;
    }

    public static void main(String[] args) {
        //calculateEmployeeSalary();
        double salary = salaryCalculator(40, 20, 8);
        System.out.println(salary);
    }
}

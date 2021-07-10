package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int studentAge = 16;
        double studentGPA = 4.0;
        boolean hasPerfectAttendance = true;
        String firstName = "Alan";
        String lastName = "Garcia";
        char studentFirstInitial = firstName.charAt(0);
        char studentSecondInitial = lastName.charAt(0);

        System.out.println("The student " + firstName + " " + lastName + " has " + studentAge + " years old");
        System.out.print("With GPA of " + studentGPA + "\nUpdate score: ");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(firstName + " " + lastName + " updated score to: " + studentGPA);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Triangle triangleA = new Triangle(10,2,3,2.3,12);
        Triangle triangleB = new Triangle(8,14,7,6.6,20);

        double triangleAArea = triangleA.getArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.getArea();
        System.out.println(triangleBArea);

        System.out.println("Number of sides of triangle: " + Triangle.numOfSides);
    }
}

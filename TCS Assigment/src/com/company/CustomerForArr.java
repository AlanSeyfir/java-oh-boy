package com.company;

public class CustomerForArr {
    private int id;
    private int age;
    private double salary;
    private String name;
    private String dob;
    private String email;

    public CustomerForArr(int id, int age, double salary, String name, String dob, String email) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    //With Intellij I run this method although we have a main in Class Customer
    public static void main(String[] args){

    }
}

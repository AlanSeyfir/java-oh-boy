package com.company;

public class CustomerDemo {
    private int id;
    private int age;
    private double salary;
    private String name;
    private String dob;
    private String email;

    public CustomerDemo(int id, int age, double salary, String name, String dob, String email) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }
    //With Intellij I run this method although we have a main in Class Customer
    public static void main(String[] args){
        CustomerDemo[] customerArr;
        customerArr = new CustomerDemo[0];
        customerArr = new CustomerDemo[1];
        customerArr = new CustomerDemo[2];
        customerArr = new CustomerDemo[3];
        customerArr = new CustomerDemo[4];
        customerArr = new CustomerDemo[5];
        searchCustomerId();

        System.out.println(customerArr.length);
    }
    public static void searchCustomerId(){
        Account account1 = new Account("Test1", 21.000, 1);

        Customer[] customerArr;
        customerArr = new Customer[0];
        if (customerArr.length >= 0){
            System.out.println("Id found");
        }else if(customerArr.length <= -1){
            System.out.println("Id not found");
        }

    }
}

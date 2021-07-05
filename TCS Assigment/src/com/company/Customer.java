package com.company;

public class Customer {
    int id;
    int age;
    double salary;
    String name;
    String dob;
    String email;

    public Customer() {
        //System.out.println("Tests");

    }

    public static void main(String[] args) {
	// write your code here
        Customer customer1 = new Customer();
        //Values in Account are dummy text
        Account account1 = new Account("Test1", 21.000, 1);
        Account account2 = new Account("Test2", 21.000, 2);
        Account account3 = new Account("Test3", 21.000, 3);
        Account account4 = new Account("Test4", 21.000, 4);
        Account account5 = new Account("Test5", 21.000, 5);
    }
}

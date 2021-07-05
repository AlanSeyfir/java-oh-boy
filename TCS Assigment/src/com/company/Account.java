package com.company;

public class Account {
    private int number;
    private String acType;
    private double balance;
    private int noOfAccounts;
    private static int numberCounter = 0;

    public Account(String acType, double balance, int noOfAccounts) {
        this.acType = acType;
        this.balance = balance;
        this.noOfAccounts = noOfAccounts;

        this.number = numberCounter;
        numberCounter++;
        System.out.println("Number counter is: " + numberCounter);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNoOfAccounts() {
        return noOfAccounts;
    }

    public void setNoOfAccounts(int noOfAccounts) {
        this.noOfAccounts = noOfAccounts;
    }

    public static int getNumberCounter() {
        return numberCounter;
    }

    public static void setNumberCounter(int numberCounter) {
        Account.numberCounter = numberCounter;
    }
}

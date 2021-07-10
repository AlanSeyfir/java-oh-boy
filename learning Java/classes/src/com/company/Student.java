package com.company;

public class Student {
    String firstName;
    String lastName;
    int yearToGraduate;
    double gpa;
    String declaredMajor;

    public Student(String firstName, String lastName, int yearToGraduate, double gpa, String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearToGraduate = yearToGraduate;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }

    public int incrementYearGraduation(){
        return (this.yearToGraduate + 1);
    }
}

package com.company;

public class Challenge {

    public static void main(String[] args) {
        Student student1 = new Student("Alan", "Nuñez", 2022, 3.4, "Software Engineering");
        Student student2 = new Student("Angie", "Torres", 2020, 4.0, "Graphic Design");
        String infoStudent1 = student1.firstName + " " + student1.lastName + " " + student1.yearToGraduate + " " +
                              student1.gpa + " " + student1.declaredMajor + " ";

        System.out.println(student1.yearToGraduate);
        System.out.println(infoStudent1 + "but due to absences he will graduate until lmao I hope not xD" + student1.incrementYearGraduation());
        System.out.println(student2.incrementYearGraduation());
    }
}

package com.company;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String question = "What's the name of discord mascot?";
        String choiceOne = "Numpus";
        String choiceTwo = "Kampus";
        String choiceThree = "Wumpus"; //Correct Answer

        String correctAnswer = choiceThree;
        boolean isIncorrect = true;
        System.out.println("Welcome to Quiz express");

        while(isIncorrect){

            System.out.println(question);
            System.out.println("1." + choiceOne + "\n2." + choiceTwo + "\n3." + choiceThree);
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();

            //It can be
            if (answer < 3){
                System.out.println("Incorrect! Try again");
            }else{
                isIncorrect = false;
            }

            //or
            /*
            if (correctAnswer.equals(sc)){
                System.out.println("You made it!!!");
            }else{
                System.out.println("Incorrect");
            }
            */
        }

        System.out.println("Yay you got it " + correctAnswer + " was the correct answer");

    }
}

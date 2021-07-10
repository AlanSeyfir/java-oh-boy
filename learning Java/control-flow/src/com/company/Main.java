package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //whileLoop();
        //decisionMaking();
    }


    public static void whileLoop(){
        System.out.println("Playing Narcisista por excelencia song...");
        boolean isOnRepeat = true;

        while (isOnRepeat){
            System.out.println("Playing same song again. If so write yes");
            Scanner sc = new Scanner(System.in);
            String answerUser = sc.nextLine();
            if (answerUser.equals("yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }

    public static void decisionMaking(){
        // Magic selection fortune teller.
        // Choose a number between 1 and 10. If number < 5 enjoy luck otherwise you will enjoy a dinner with your gf
        System.out.println("Choose a number between 1 and 10");
        Scanner sc = new Scanner(System.in);
        int guessedNumber = sc.nextInt();
        if (guessedNumber < 5){
            System.out.println("Enjoy luck that you have!");
        }else{
            System.out.println("Enjoy a delicious dinner with your gf ^^");
        }
    }
}

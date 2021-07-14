package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String welcome = "Hello!";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);

            String nothing = null;
            System.out.println(nothing.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array exception");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Any exception");
        }

        try {
            waitOneSecond();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("Code run successfully");
    }

    public static void waitOneSecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void forEach(){
        String welcome = "Hello!";
        char[] chars = welcome.toCharArray();

        for(char character: chars){
            System.out.println(character);
        }
    }
}

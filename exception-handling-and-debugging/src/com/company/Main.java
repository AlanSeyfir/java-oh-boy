package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 2;

        String welcome = "Hellow!";
        char[] chars = welcome.toCharArray();
        //Because of the zero based offset that means give me the last character in that string and
        // then I'll output the last character as part of a larger string.
        char lastchar = chars[chars.length - 1];
        System.out.println("Last char: " + lastchar);

        String nothing = null;
        //If we add .something to nothing it will give an exception
        System.out.println(nothing);
    }
}

package com.company.utilities;

import java.util.Scanner;

public class InputHelper {
    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}

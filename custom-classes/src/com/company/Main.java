package com.company;

import com.company.utilities.MathHelper;

import static com.company.utilities.MathHelper.Operation.ADD;

public class Main {

    //This are METHODS at least in Java (other languages are called functions or subroutines)
    public static void main(String[] args) {
        MathHelper helper = new MathHelper(100);

        //This will throw an error maybe bc the user can enter another value that isn't a number
        try {
            while (true){
                int input = helper.addNumber("Enter a number: ", ADD);
                int total = helper.getTotal();
                String message = String.format(
                        "Enter value: %d, Total: %d", input, total
                );
                System.out.println(message);
            }
        } catch (NumberFormatException e) {
            System.out.println("All done bc you entered a value that isn't a number");
        }
        /*InputHelper helper = new InputHelper();

        String value1 = helper.getInput("Enter value 1");
        System.out.println("Value 1 is: " + value1);

        String value2 = helper.getInput("Enter value 2");
        System.out.println("Value 1 is: " + value2);*/
    }


}

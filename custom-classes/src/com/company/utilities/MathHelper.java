package com.company.utilities;

public class MathHelper {
    //public static final String ADD = "add";
    //public static final String SUBTRACT = "subtract";

    private int total;

    public MathHelper() {
        System.out.println("Constructor called");
        //See that the constructir add 50
        //this.total = 50;
    }

    public MathHelper(int total) {
        this();
        this.total += total;
    }

    public int getTotal() {
        return total;
    }
    /*public void setTotal(int total) {
        this.total = total;
    }*/

    public enum Operation {
        ADD,SUBTRACT;
    }
    //Call this method and know inmediately find out what the user enter
    public int addNumber(String prompt, Operation option) throws NumberFormatException {
        String input = InputHelper.getInput(prompt);
        int value = Integer.parseInt(input);

        switch (option){
            case ADD:
                total += value;
                break;
            case SUBTRACT:
                total -= value;
                break;
        }
        //total += value;
        return value;
    }


}

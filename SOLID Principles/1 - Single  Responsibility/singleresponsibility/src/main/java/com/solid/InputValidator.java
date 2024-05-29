package com.solid;

public class InputValidator {

    private int minRange;
    private int maxRange;

    public InputValidator(int min, int max){
        minRange = min;
        maxRange = max;
    }

    public boolean validate(String input){
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
        
        int num = Integer.parseInt(input);
        
        if(num < minRange || num > maxRange) {
            System.out.println("Invalid range! Try again!");
            return false;
        }

        return true;
    }

}

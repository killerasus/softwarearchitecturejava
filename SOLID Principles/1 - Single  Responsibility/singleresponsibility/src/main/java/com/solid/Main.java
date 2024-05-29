package com.solid;

import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");
        
        List<Integer> nums = InputProcessor.process();

        InputSorter.sort(nums);
        
        InputIO.print(nums);
    }
}

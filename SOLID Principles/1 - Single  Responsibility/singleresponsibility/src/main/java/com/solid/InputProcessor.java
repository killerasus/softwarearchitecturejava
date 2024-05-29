package com.solid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputProcessor {

    public static final int THRESHOLD = 5;
    public static final int MIN = 0;
    public static final int MAX = 10;

    public static List<Integer> process() {
        Scanner scanner = new Scanner(System.in);
            
        List<Integer> nums = new ArrayList<>();
        
        System.out.printf("Enter %d valid integers in the range [%d, %d]%n", THRESHOLD, MIN, MAX);

        InputValidator validator = new InputValidator(MIN, MAX);
        
        while(nums.size() < THRESHOLD) {
            
            String s = scanner.nextLine();
            
            if(!validator.validate(s))
                continue;
            
            nums.add(Integer.parseInt(s));
        }
        
        scanner.close();

        return nums;
    }

}

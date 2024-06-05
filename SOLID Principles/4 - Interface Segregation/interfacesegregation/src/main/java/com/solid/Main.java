package com.solid;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Worker(), new Manager(), new CEO());

        for(Employee e : employees) {
            e.salary();
        }
    }
}

package com.solid;

public class Manager implements Employee, Management {

    @Override
    public void salary() {
        System.out.println("The salary is good.");
    }

    @Override
    public void addBonus() {
        System.out.println("Performance review time! Here's your bonus!");
    }

    public void hire() {
        System.out.println("Hiring more workers...");
    }

    public void train() {
        System.out.println("Training workers...");
    }

}

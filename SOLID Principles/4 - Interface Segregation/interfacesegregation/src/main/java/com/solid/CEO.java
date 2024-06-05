package com.solid;

public class CEO implements Employee, Management {

    @Override
    public void salary() {
        System.out.println("The best salary!");
    }

    @Override
    public void addBonus() {
        System.out.println("Feeling generous! Have some money.");
    }

    public void makeDecisions() {
        System.out.println("Overmind is thinking...");
    }	
    
    public void addStocks() {
        System.out.println("STONKS!");
    }
}

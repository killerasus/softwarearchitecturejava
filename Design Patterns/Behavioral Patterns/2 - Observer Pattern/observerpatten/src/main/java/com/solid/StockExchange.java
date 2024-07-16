package com.solid;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class StockExchange implements Observable {

    //S(0) = $100 - and we do a random walk
    private float price = 100;
    private Random random;
    private List<Observer> observers;

    public StockExchange() {
        random = new Random();
        observers = new ArrayList<>();
    }

    public void start() {
        while (true) {
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // generate the next S(t+1) random stock price
            price = price + 2 * random.nextFloat() - 1;
            notifyAllObservers();
            System.out.println(price);
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer : observers) {
            observer.update(price);
        }
    }
}

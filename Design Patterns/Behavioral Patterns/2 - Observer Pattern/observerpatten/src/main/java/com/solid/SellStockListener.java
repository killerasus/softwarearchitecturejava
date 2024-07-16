package com.solid;

public class SellStockListener implements Observer {

    @Override
    public void update(float price) {
        if(price > 105)
            System.out.println("Selling stock because the S(t) price is high...");
    }

}

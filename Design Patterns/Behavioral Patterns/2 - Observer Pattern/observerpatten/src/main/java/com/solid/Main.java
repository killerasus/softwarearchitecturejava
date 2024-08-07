package com.solid;

public class Main {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();

        stockExchange.addObserver(new BuyStockListener());
        stockExchange.addObserver(new SellStockListener());

        stockExchange.start();
    }
}
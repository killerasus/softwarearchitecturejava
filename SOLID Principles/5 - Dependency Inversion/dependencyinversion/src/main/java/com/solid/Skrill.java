package com.solid;

public class Skrill implements IPayment {

    @Override
    public void connect() {
        System.out.println("Connecting to Skrill server...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Skrill server...");
    }

    @Override
    public void sendMoney(float amount) {
        System.out.printf("Sending $%.2f to Skrill account...%n", amount);
    }

}

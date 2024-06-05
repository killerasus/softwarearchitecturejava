package com.solid;

public class Payoneer implements IPayment {

    @Override
    public void connect() {
        System.out.println("Connecting to Payoneer server...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Payoneer server...");
    }

    @Override
    public void sendMoney(float amount) {
        System.out.printf("Sending $%.2f to Payoneer account...%n", amount);
    }

}

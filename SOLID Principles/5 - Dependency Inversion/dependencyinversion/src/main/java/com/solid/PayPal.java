package com.solid;

public class PayPal implements IPayment {

    @Override
    public void connect() {
        System.out.println("Connecting to PayPal server...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting to PayPal server... bye bye!");
    }

    @Override
    public void sendMoney(float amount) {
        System.out.printf("Sending $%.2f to PayPal account...%n", amount);
    }

}

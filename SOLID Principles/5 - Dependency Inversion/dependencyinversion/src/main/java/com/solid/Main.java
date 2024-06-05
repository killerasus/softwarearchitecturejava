package com.solid;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor(new PayPal());
        processor.connect();
        processor.process(5.25f);
        processor.disconnect();

        processor = new PaymentProcessor(new Skrill());
        processor.connect();
        processor.process(10);
        processor.disconnect();

        processor = new PaymentProcessor(new Payoneer());
        processor.connect();
        processor.process(0.75f);
        processor.disconnect();
    }
}
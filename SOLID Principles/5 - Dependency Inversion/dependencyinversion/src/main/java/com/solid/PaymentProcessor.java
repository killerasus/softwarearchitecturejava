package com.solid;

public class PaymentProcessor {

    private IPayment provider;

    public PaymentProcessor(IPayment provider) 
    {
        this.provider = provider;
    }

    public void connect()
    {
        provider.connect();
    }

    public void disconnect()
    {
        provider.disconnect();
    }

    public void process(float amount)
    {
        provider.sendMoney(amount);
    }

}

package com.solid;

public interface IPayment {

    public void connect();

    public void disconnect();

    public void sendMoney(float amount);
    
}

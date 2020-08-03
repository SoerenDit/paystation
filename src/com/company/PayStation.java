package com.company;

public interface PayStation {

    public void addPayment(int coinValue) throws IllegalCoinException;

    public int readDisplay();

    public Receipt buy();

    public void cancel();

}

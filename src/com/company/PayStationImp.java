package com.company;

public class PayStationImp implements PayStation{
    int payedSoFar;

    public void addPayment(int amount) {
        payedSoFar += amount;
    }

    public int readDisplay() {
        return payedSoFar;
    }

    @Override
    public Receipt buy() {
        return null;
    }

    @Override
    public void cancel() {

    }
}

package com.company;

public class PayStationImp {
    int payedSoFar;

    public void addPayment(int amount) {
        payedSoFar += amount;
    }

    public int readDisplay() {
        return payedSoFar;
    }
}

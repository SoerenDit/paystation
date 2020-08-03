package com.company;

public class PayStation {
    int payedSoFar;

    public void addPayment(int amount) {
        payedSoFar += amount;
    }

    public int readDisplay() {
        return payedSoFar;
    }
}

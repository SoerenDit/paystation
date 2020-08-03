package com.company;

public class PayStationImp implements PayStation{
    int payedSoFar;

    public void addPayment(int coinValue) throws IllegalCoinException {
        switch (coinValue) {
            case 5:
            case 25:
                break;
            default: throw new IllegalCoinException("Invalid coin: " + coinValue);
        }
        payedSoFar += coinValue;
    }

    public int readDisplay() {
        return payedSoFar / 5 * 2;
    }

    @Override
    public Receipt buy() {
        return null;
    }

    @Override
    public void cancel() {

    }
}

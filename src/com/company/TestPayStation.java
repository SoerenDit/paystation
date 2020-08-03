package com.company;
import org.junit.*;
import static org.junit.Assert.*;


public class TestPayStation {

    @Test
    public void shouldDisplay2MinFor5Cents() throws IllegalCoinException {
        PayStationImp ps = new PayStationImp;
        ps.addPayment(5);
        assertEquals("Should display 2 min for 5 cents", 2, ps.readDisplay());
    }
}

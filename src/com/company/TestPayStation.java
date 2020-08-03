package com.company;
import org.junit.*;
import static org.junit.Assert.*;


public class TestPayStation {
    PayStationImp ps;

    @Before
    public void setUp() {
        ps = new PayStationImp();
    }

    @Test
    public void shouldDisplay2MinFor5Cents() throws IllegalCoinException {
        ps.addPayment(5);
        assertEquals("Should display 2 min for 5 cents", 2, ps.readDisplay());
    }

    @Test
    public void shouldDisplay10MinFor25Cents() throws IllegalCoinException {
        ps.addPayment(25);
        assertEquals("Should display 10 min for 25 cents", 25 / 5 * 2, ps.readDisplay());
    }

    @Test(expected = IllegalCoinException.class)
    public void shouldRejectIllegalCoin() throws IllegalCoinException {
        ps.addPayment(17);
    }


}

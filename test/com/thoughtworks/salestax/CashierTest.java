package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void shouldReturnZeroWhenNoItemIsPassed() {
        Cashier cashier = new Cashier(null);

        assertEquals(0.0, cashier.totalAmount(), 0.0);
    }
}
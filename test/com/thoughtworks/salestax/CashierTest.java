package com.thoughtworks.salestax;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void shouldReturnZeroWhenNoItemIsPassed() {
        Cashier cashier = new Cashier(null);

        assertEquals(0.0, cashier.totalAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheTotalAmountWhenAListOfAmountIsPassed() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("book", 20, false, false));
        items.add(new Item("Cd", 10, true, false));
        items.add(new Item("perfume", 20, true, true));

        Cashier cashier = new Cashier(items);

        assertEquals(53.5, cashier.totalAmount(), 0.0);
    }
}
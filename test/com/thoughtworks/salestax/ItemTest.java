package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldReturnTenWhenTheAmountOfAnItemIsTen() {
        Item item = new Item("book", 10, false, false);

        assertEquals(10, item.netAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheNetAmountAfterTaxOfFivePercentWhenAnItemWhichIsTaxableIsGiven() {
        Item item = new Item("music CD", 10, true, false);

        assertEquals(10.5, item.netAmount(), 0.0);
    }
}
package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldReturnTenWhenTheAmountOfAnItemIsTen() {
        Item item = new Item("book", 10, false, false);

        assertEquals(10, item.netAmount(), 0.0);
    }
}
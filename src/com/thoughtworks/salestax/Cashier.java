//Cashier class contains list of items and calculates the total amount
package com.thoughtworks.salestax;

import java.util.ArrayList;

public class Cashier {

    private ArrayList<Item> items;

    public Cashier(ArrayList<Item> items) {
        this.items = items;
    }

    public double totalAmount() {
        double totalAmount=0;

        for(Item item: items) {
            totalAmount += item.netAmount();
        }
        return totalAmount;
    }
}

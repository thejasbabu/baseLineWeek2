package com.thoughtworks.salestax;

public class Item {
    private String name;
    private double amount;
    private boolean isTaxable;
    private boolean isImported;

    public Item(String name, double amount, boolean isTaxable, boolean isImported) {
        this.name = name;
        this.amount = amount;
        this.isTaxable = isTaxable;
        this.isImported = isImported;
    }

    public double netAmount() {
        return 10;
    }
}

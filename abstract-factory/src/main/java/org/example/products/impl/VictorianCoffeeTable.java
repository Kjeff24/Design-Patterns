package org.example.products.impl;

import org.example.products.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a victorian coffee table...");
    }
}

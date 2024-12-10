package org.example.products.impl;

import org.example.products.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a modern coffee table...");
    }
}

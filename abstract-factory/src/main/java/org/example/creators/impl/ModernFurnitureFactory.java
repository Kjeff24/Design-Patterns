package org.example.creators.impl;

import org.example.creators.FurnitureFactory;
import org.example.products.Chair;
import org.example.products.CoffeeTable;
import org.example.products.Sofa;
import org.example.products.impl.ModernChair;
import org.example.products.impl.ModernCoffeeTable;
import org.example.products.impl.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

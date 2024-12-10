package org.example.creators.impl;

import org.example.creators.FurnitureFactory;
import org.example.products.Chair;
import org.example.products.CoffeeTable;
import org.example.products.Sofa;
import org.example.products.impl.VictorianChair;
import org.example.products.impl.VictorianCoffeeTable;
import org.example.products.impl.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

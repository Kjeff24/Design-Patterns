package org.example.creators;

import org.example.products.Chair;
import org.example.products.CoffeeTable;
import org.example.products.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();

}

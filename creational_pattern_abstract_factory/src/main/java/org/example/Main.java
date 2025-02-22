package org.example;

import org.example.creators.FurnitureFactory;
import org.example.creators.impl.ModernFurnitureFactory;
import org.example.creators.impl.VictorianFurnitureFactory;
import org.example.products.Chair;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        FurnitureFactory furnitureFactory2 = new VictorianFurnitureFactory();
        Chair chair = furnitureFactory.createChair();
        Chair chair2 = furnitureFactory2.createChair();

        chair.manufacture();
        chair2.manufacture();
    }
}
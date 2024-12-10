package org.example.products.impl;

import org.example.products.Chair;

public class VictorianChair implements Chair {

    @Override
    public void manufacture() {
        System.out.println("Manufacturing a victorian car...");
    }
}

package org.example.products.impl;

import org.example.products.Chair;

public class ModernChair implements Chair {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a modern car...");
    }
}

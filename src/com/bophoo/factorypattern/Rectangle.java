package com.bophoo.factorypattern;

public class Rectangle implements Sharp {
    @Override
    public void draw() {
        System.out.printf("draw a rectangle\n");
    }
}

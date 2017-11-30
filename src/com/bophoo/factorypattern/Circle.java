package com.bophoo.factorypattern;

public class Circle implements Sharp {
    @Override
    public void draw() {
        System.out.printf("draw a circle\n");
    }
}

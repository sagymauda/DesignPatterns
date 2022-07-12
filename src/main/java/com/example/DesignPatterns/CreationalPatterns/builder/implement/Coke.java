package com.example.DesignPatterns.CreationalPatterns.builder.implement;

import com.example.DesignPatterns.CreationalPatterns.builder.abst.ColdDrinks;

public class Coke extends ColdDrinks {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}

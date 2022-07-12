package com.example.DesignPatterns.CreationalPatterns.builder.implement;

import com.example.DesignPatterns.CreationalPatterns.builder.abst.ColdDrinks;

public class Pepsi extends ColdDrinks {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 25.5f;
    }
}

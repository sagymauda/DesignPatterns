package com.example.DesignPatterns.CreationalPatterns.builder.implement;

import com.example.DesignPatterns.CreationalPatterns.builder.abst.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}

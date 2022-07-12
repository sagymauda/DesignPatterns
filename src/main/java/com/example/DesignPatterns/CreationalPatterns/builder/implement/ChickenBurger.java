package com.example.DesignPatterns.CreationalPatterns.builder.implement;

import com.example.DesignPatterns.CreationalPatterns.builder.abst.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 3.65f;
    }
}

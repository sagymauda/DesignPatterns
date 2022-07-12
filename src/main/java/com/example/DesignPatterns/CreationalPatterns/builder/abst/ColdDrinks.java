package com.example.DesignPatterns.CreationalPatterns.builder.abst;

import com.example.DesignPatterns.CreationalPatterns.builder.implement.Bottle;
import com.example.DesignPatterns.CreationalPatterns.builder.interfaces.Item;
import com.example.DesignPatterns.CreationalPatterns.builder.interfaces.Packing;

public abstract class ColdDrinks implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}

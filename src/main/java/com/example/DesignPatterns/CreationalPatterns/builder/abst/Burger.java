package com.example.DesignPatterns.CreationalPatterns.builder.abst;

import com.example.DesignPatterns.CreationalPatterns.builder.implement.Wrapper;
import com.example.DesignPatterns.CreationalPatterns.builder.interfaces.Item;
import com.example.DesignPatterns.CreationalPatterns.builder.interfaces.Packing;

public abstract class Burger implements Item {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}

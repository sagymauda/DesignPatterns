package com.example.DesignPatterns.CreationalPatterns.builder.implement;

import com.example.DesignPatterns.CreationalPatterns.builder.interfaces.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}

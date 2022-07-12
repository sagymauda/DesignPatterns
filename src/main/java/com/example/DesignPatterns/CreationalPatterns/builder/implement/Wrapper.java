package com.example.DesignPatterns.CreationalPatterns.builder.implement;

import com.example.DesignPatterns.CreationalPatterns.builder.interfaces.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper";
    }
}

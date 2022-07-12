package com.example.DesignPatterns.CreationalPatterns.factory;

public class Circle implements Shape {
    @Override
    public void drew() {
        System.out.println("Inside Circle::draw() method.");
    }
}

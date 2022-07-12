package com.example.DesignPatterns.CreationalPatterns.factory;

public class Square implements Shape{
    @Override
    public void drew() {
        System.out.println("Inside Square::draw() method.");
    }
}

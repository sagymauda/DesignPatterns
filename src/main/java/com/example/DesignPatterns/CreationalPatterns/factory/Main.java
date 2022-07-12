package com.example.DesignPatterns.CreationalPatterns.factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        Shape shape2 = shapeFactory.getShape("Rectangle");
        Shape shape3 = shapeFactory.getShape("square");

        shape1.drew();
        shape2.drew();
        shape3.drew();
    }
}

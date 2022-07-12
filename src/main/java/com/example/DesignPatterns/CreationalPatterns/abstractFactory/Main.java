package com.example.DesignPatterns.CreationalPatterns.abstractFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);

        Shape shape1 = abstractFactory.getShape("Rectangle");
        shape1.drew();
        Shape shape2 = abstractFactory.getShape("Circle");
        shape2.drew();
        Shape shape3 = abstractFactory.getShape("Square");
        shape3.drew();


        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(true);

        Shape roundedShape1 = abstractFactory1.getShape("Rectangle");
        roundedShape1.drew();
        Shape roundedShape2 = abstractFactory1.getShape("square");
        roundedShape2.drew();
    }


}

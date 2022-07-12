package com.example.DesignPatterns.CreationalPatterns.abstractFactory;

public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        return null;

    }
}

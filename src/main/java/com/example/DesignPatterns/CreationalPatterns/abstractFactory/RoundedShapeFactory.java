package com.example.DesignPatterns.CreationalPatterns.abstractFactory;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Square")){
            return new RoundedSquare();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return  new RoundedRectangle();
        }
        return null;
    }
}

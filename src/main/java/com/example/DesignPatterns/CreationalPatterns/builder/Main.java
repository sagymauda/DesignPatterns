package com.example.DesignPatterns.CreationalPatterns.builder;

import com.example.DesignPatterns.CreationalPatterns.builder.implement.Meal;
import com.example.DesignPatterns.CreationalPatterns.builder.implement.MealBuilder;

public class Main {

    public static void main(String[] args) {

        MealBuilder builder = new MealBuilder();

        Meal veganMeal = builder.prepareVegMeal();
        System.out.println("Veg Meal");
        veganMeal.showItems();
        System.out.println("Total Cost: " + veganMeal.getCost());
        Meal nonVegan = builder.PrepareNonVeganMeal();
        System.out.println("NONe Vegan");
        nonVegan.showItems();
        System.out.println("Total Cost: " + nonVegan.getCost());
    }
}

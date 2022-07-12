package com.example.DesignPatterns.CreationalPatterns.builder.implement;

import com.example.DesignPatterns.CreationalPatterns.builder.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Price :" + item.price());
            System.out.println("Name :" + item.name());
            System.out.println("Packing : " + item.packing().pack());
        }
    }

}
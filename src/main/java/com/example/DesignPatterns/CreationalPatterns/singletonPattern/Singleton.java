package com.example.DesignPatterns.CreationalPatterns.singletonPattern;

public class Singleton {

    //create only one instance from pattern

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;

    }
}

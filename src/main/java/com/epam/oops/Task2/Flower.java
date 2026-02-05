package com.epam.oops.Task2;

public abstract class Flower {
    protected String name;
    protected double cost;

    public Flower(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}

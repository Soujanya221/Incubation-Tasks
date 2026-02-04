package com.epam.Task1;

public abstract class PizzaBase {
    protected String name;
    protected double cost;

    public PizzaBase(String name, double cost) {
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

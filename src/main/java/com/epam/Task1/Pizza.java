package com.epam.Task1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private PizzaBase base;
    private List<Topping> toppings;

    public Pizza(PizzaBase base) {
        this.base = base;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculateCost() {
        double total = base.getCost();
        for (Topping topping : toppings) {
            total += topping.getCost();
        }
        return total;
    }
}

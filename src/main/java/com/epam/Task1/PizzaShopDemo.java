package com.epam.Task1;

public class PizzaShopDemo {
    public static void main(String[] args) {
        PizzaBase base = new StandardBase();
        Pizza pizza = new Pizza(base);
        pizza.addTopping(new Topping("Tomato", 1.0));
        pizza.addTopping(new Topping("Corn", 1.5));
        pizza.addTopping(new Topping("Mushrooms", 2.0));

        System.out.println("Total pizza cost: $" + pizza.calculateCost());
    }
}


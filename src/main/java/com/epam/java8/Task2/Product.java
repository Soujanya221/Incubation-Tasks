package com.epam.java8.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}


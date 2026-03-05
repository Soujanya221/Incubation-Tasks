package com.epam.java8.Task4;

import java.util.Random;
import java.util.function.Supplier;

public class RandomProductSupplier {

    public static void main(String[] args) {

        String[] names = {"Laptop", "Mobile", "Tablet", "Camera"};
        String[] categories = {"Electronics", "Gadgets", "Accessories"};
        char[] grades = {'A', 'B', 'C'};

        Random random = new Random();

        Supplier<ProductClass> productSupplier = () -> {

            String name = names[random.nextInt(names.length)];
            double price = 10000 + random.nextInt(50000);
            String category = categories[random.nextInt(categories.length)];
            char grade = grades[random.nextInt(grades.length)];

            return new ProductClass(name, price, category, grade);
        };

        ProductClass product = productSupplier.get();
        System.out.println(product);
    }
}

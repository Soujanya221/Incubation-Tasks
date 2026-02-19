package com.epam.java8.Task4;

class Product {
    String name;
    double price;
    String category;
    char grade;

    Product(String name, double price, String category, char grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", grade=" + grade +
                '}';
    }
}
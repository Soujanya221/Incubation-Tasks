package com.epam.Task2;

public class BouquetDemo {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Rose());
        bouquet.addFlower(new Jasmine());
        bouquet.addFlower(new Lily());
        bouquet.addFlower(new Rose());

        System.out.println("Total bouquet cost: $" + bouquet.calculateCost());
    }
}

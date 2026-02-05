package com.epam.oops.Task2;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers;

    public Bouquet() {
        this.flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public double calculateCost() {
        double total = 0;
        for (Flower flower : flowers) {
            total += flower.getCost();
        }
        return total;
    }
}


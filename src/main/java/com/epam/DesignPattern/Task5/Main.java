package com.epam.DesignPattern.Task5;

public class Main {

    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle.Builder("Hero", "X200")
                .addGears()
                .addCarrier()
                .build();

        Bicycle bicycle2 = new Bicycle.Builder("Atlas", "CityRide")
                .addDoubleSeat()
                .addDoubleStand()
                .build();

        bicycle1.showSpecifications();
        System.out.println("-------------------");
        bicycle2.showSpecifications();
    }
}

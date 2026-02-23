package com.epam.DesignPattern.Task3;

public class TextShare implements ShareStrategy {

    @Override
    public void share(String photo) {
        System.out.println("Sharing " + photo + " via Text Message");
    }
}

package com.epam.DesignPattern.Task4;

public class MobilePage implements WebPage {

    @Override
    public int getRank() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Mobile Page";
    }
}

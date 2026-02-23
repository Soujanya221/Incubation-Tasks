package com.epam.DesignPattern.Task4;

public class DesktopPage implements WebPage {

    @Override
    public int getRank() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Desktop Page";
    }
}

package com.epam.DesignPattern.Task2;

public class TestClass {

    public static void main(String[] args) {

        BrowserDriver browser = DriverFactory.getBrowser("ie");
        browser.initializeDriver();

    }
}

package com.epam.DesignPattern;

public class CandyMaker {
    private boolean empty;
    private boolean boiled;

    private static final CandyMaker instance = new CandyMaker();

    private CandyMaker() {
        empty = true;
        boiled = false;
    }

    public static CandyMaker getInstance() {
        return instance;
    }

    public synchronized void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public synchronized void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public synchronized void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

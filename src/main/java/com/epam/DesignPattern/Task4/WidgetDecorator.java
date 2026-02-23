package com.epam.DesignPattern.Task4;

public abstract class WidgetDecorator implements WebPage {

    protected WebPage page;

    public WidgetDecorator(WebPage page) {
        this.page = page;
    }

    @Override
    public int getRank() {
        return page.getRank();
    }

    @Override
    public String getDescription() {
        return page.getDescription();
    }
}

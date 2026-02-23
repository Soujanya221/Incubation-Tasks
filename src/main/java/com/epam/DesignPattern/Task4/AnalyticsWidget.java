package com.epam.DesignPattern.Task4;

public class AnalyticsWidget extends WidgetDecorator {

    public AnalyticsWidget(WebPage page) {
        super(page);
    }

    @Override
    public int getRank() {
        return super.getRank() + 15;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Analytics Widget";
    }
}

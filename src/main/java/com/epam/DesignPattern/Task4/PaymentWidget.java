package com.epam.DesignPattern.Task4;

public class PaymentWidget extends WidgetDecorator {

    public PaymentWidget(WebPage page) {
        super(page);
    }

    @Override
    public int getRank() {
        return super.getRank() + 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Payment Widget";
    }
}

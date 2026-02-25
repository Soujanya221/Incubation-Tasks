package com.epam.hooks;

import com.epam.context.TestContext;
import io.cucumber.java.After;

public class Hooks {

    private TestContext context;

    public Hooks(TestContext context) {
        this.context = context;
    }

    @After
    public void tearDown() {
        context.getDriver().quit();
    }
}

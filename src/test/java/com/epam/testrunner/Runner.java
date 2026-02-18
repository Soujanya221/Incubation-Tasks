package com.epam.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
            features = "src/test/resources/features/task1Login.feature",
            glue = "com.epam.StepDefinitions",
            plugin = {"pretty", "html:target/cucumber-reports.html",
            }
    )
    public class Runner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}



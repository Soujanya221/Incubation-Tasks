package com.epam.StepDefinitions;

import com.epam.Pages.BDDLoginPage;
import com.epam.context.TestContext;
import io.cucumber.java.en.*;

public class LoginSteps {

    private TestContext context;
    private BDDLoginPage loginPage;

    public LoginSteps(TestContext context) {
        this.context = context;
        loginPage = new BDDLoginPage(context.getDriver());
    }

    @When("User enters valid email and password")
    public void enter_credentials() {
        loginPage.enterLoginCredentials("test@test.com", "123456");
    }

    @When("User clicks login")
    public void click_login() {
        loginPage.clickLogin();
    }
}

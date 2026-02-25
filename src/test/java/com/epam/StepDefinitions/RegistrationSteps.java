package com.epam.StepDefinitions;

import com.epam.Pages.BDDHomePage;
import com.epam.context.TestContext;
import io.cucumber.java.en.*;

public class RegistrationSteps {

    private TestContext context;
    private BDDHomePage homePage;

    public RegistrationSteps(TestContext context) {
        this.context = context;
        homePage = new BDDHomePage(context.getDriver());
    }

    @Given("User is on home page")
    public void user_is_on_home_page() {
        homePage.openHomePage();
    }

    @When("User clicks on sign in")
    public void user_clicks_sign_in() {
        homePage.clickSignIn();
    }
}

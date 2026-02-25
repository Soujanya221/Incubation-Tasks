package com.epam.selenium;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

        driver.findElement(By.id("password"))
                .sendKeys("SuperSecretPassword!");

        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        String successMsg = driver.findElement(By.id("flash")).getText();

        Assert.assertTrue(successMsg.contains("You logged into a secure area!"),
                "Login failed!");
    }
}

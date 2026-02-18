package com.epam.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task2Assertions extends Base {

    @BeforeClass
    public void setUp(){
        super.setUp();
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @Test(priority = 1)
    public void test1Assert(){
        String expectedTitle ="The Internet";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test(priority = 2)
    public void loginTest(){
        WebElement userName = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        userName.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        submitButton.click();

        WebElement succesFlash = driver.findElement(By.xpath("//div[@class='flash success']"));
        String actualSuccesmessage=succesFlash.getText();
        String expectedSuccesMessage = "You logged into a secure area!";
        Assert.assertTrue(actualSuccesmessage.contains(expectedSuccesMessage));
    }
    @AfterClass
    public void tearDown(){
        super.tearDown();
    }

}

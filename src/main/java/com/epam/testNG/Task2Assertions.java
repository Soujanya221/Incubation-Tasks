package com.epam.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2Assertions {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
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

    @AfterMethod
    public void tearDown(){
        if (driver!= null){
            driver.quit();
        }
    }

}

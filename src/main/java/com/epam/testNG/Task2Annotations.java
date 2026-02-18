package com.epam.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task2Annotations {
    WebDriver driver;
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
    @BeforeMethod
    public void setUp(){
        EdgeOptions options = new EdgeOptions();

        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver=new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }

    @Test
    public void testMethod1(){
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void testMethod2(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String readyState =js.executeScript("return document.readyState").toString();
        Assert.assertEquals(readyState, "complete");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}

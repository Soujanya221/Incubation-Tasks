package com.epam.testNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver=new ChromeDriver(options);
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

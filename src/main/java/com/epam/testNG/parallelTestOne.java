package com.epam.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class parallelTestOne {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/menu#");
    }

    @Test
    public void readSubMenuItem1(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);

        js.executeScript(
                "var iframes = document.getElementsByTagName('iframe');" +
                        "for(var i=0; i<iframes.length; i++) { iframes[i].style.display='none'; }"
        );

        WebElement mainItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        js.executeScript("arguments[0].scrollIntoView(true);", mainItem2);
        actions.moveToElement(mainItem2).perform();

        WebElement subSubList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
        js.executeScript("arguments[0].scrollIntoView(true);", subSubList);
        actions.moveToElement(subSubList).perform();

        WebElement subSubItem1 = driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
        js.executeScript("arguments[0].scrollIntoView(true);", subSubItem1);

        System.out.println(
                " | Thread ID: " + Thread.currentThread().getId() +
                " | SubMenuItem1Test: " + subSubItem1.getText());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

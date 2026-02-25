package com.epam.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ShadowDOMExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://books-pwakit.appspot.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Step 1: book-app
        WebElement bookApp = wait.until(d ->
                d.findElement(By.cssSelector("book-app")));

        SearchContext shadow1 = bookApp.getShadowRoot();

        // Step 2: app-header
        WebElement appHeader = shadow1.findElement(By.cssSelector("app-header"));
        SearchContext shadow2 = appHeader.getShadowRoot();

        // Step 3: WAIT for toolbar-bottom properly
        WebElement toolbar = wait.until(d -> {
            try {
                return shadow2.findElement(
                        By.cssSelector("app-toolbar.toolbar-bottom"));
            } catch (Exception e) {
                return null;
            }
        });

        SearchContext shadow3 = toolbar.getShadowRoot();

        // Step 4: book-input-decorator
        WebElement decorator =
                shadow3.findElement(By.cssSelector("book-input-decorator"));

        SearchContext shadow4 = decorator.getShadowRoot();

        // Step 5: input
        WebElement inputBox =
                shadow4.findElement(By.cssSelector("input#input"));

        inputBox.sendKeys("Selenium");
        inputBox.sendKeys(Keys.ENTER);

        System.out.println("Search executed successfully!");

        driver.quit();
    }
}
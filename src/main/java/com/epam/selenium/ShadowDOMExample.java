package com.epam.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowDOMExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://books-pwakit.appspot.com/");

        // 1️⃣ book-app shadow root
        WebElement bookApp = driver.findElement(By.cssSelector("book-app"));
        SearchContext shadow1 = bookApp.getShadowRoot();

        // 2️⃣ app-toolbar (normal element inside shadow1)
        WebElement toolbar =
                shadow1.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));

        // 3️⃣ book-input-decorator (normal child of toolbar)
        WebElement decorator =
                toolbar.findElement(By.cssSelector("book-input-decorator"));

        // 4️⃣ decorator shadow root
        SearchContext shadow2 = decorator.getShadowRoot();

        // 5️⃣ input field
        WebElement input =
                shadow2.findElement(By.cssSelector("input"));

        input.sendKeys("Selenium");
        input.sendKeys(Keys.ENTER);

        System.out.println("Search Successful");

        driver.quit();
    }
}
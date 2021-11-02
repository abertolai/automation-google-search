package br.com.google.automation.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
    public static WebDriver driver;

    public static void setDriver(String browserName) {
        driver = Browsers.setDriver(browserName);
    }

    public static void visitUrl(String url) {
        driver.get(url);
    }

    public static WebElement getElement() {
        return driver.findElement(By.name("q"));
    }
}

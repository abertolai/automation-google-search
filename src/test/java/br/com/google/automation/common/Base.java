package br.com.google.automation.common;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public static WebDriver driver;

    public static void setDriver(String browserName) {
        driver = Browsers.setDriver(browserName);
    }

    public static void visitUrl(String url) {
        driver.get(url);
    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static void clickOn(By locator) {
        isClickable(locator);
        getElement(locator).click();
    }

    public static void clickSubmit(By locator) {
        getElement(locator).submit();
    }

    public static void fillInput(By locator, String data) {
        waitElement(locator);
        getElement(locator);
        clickOn(locator);
        getElement(locator).sendKeys(data);
    }

    public static WebElement waitElement(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static boolean isClickable(By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(getElement(locator)));
        return getElement(locator).isDisplayed() && getElement(locator).isEnabled();
    }

    public static List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

}

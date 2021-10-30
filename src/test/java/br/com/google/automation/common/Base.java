package br.com.google.automation.common;

import org.openqa.selenium.WebDriver;

public class Base {
    public static WebDriver driver;

    public static void setDriver(String browserName) {
        driver = Browsers.setDriver(browserName);
    }
}

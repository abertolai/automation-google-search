package br.com.google.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

    public static WebDriver driver;
    private static ChromeOptions option;

    public static WebDriver setDriver(String browser) {

        if ("chromeHeadless".equals(browser)) {
            option = new ChromeOptions();
            option.addArguments("headless", "disable-gpu", "disable-popup-blocking", "no-sandbox",
                    "start-maximized", "window-size=1680,1050", "disable-dev-shm-usage", "--ignore-certificate-errors");
            driver = new ChromeDriver(option);
        } else if ("firefox".equals(browser)) {
            driver = new FirefoxDriver();
        } else if ("chrome".equals(browser)) {
            option = new ChromeOptions();
            option.addArguments("start-maximized", "window-size=1680,1050", "no-sandbox");
            driver = new ChromeDriver(option);
        } else {
            option = new ChromeOptions();
            option.addArguments("--start-maximized");
            driver = new ChromeDriver(option);
        }
        return driver;
    }
}

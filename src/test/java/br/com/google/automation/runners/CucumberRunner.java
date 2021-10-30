package br.com.google.automation.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import br.com.google.automation.common.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/cucumber.json"},
        monochrome = true,
        features = "src/test/resources/features"
        ,glue= {"br.com.google.automation"}
)

public class CucumberRunner {

    @BeforeClass
    public static void setup() {
        String browserName = System.getProperty("browser");
        Base.setDriver(browserName);
    }
}

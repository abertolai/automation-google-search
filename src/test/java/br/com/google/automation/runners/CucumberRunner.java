package br.com.google.automation.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.google.automation.common.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"br.com.google.automation"},
        plugin = { "pretty", "json:target/cucumber-reports.json",
                "html:target/cucumber-reports.html"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE
)

public class CucumberRunner {

    @BeforeClass
    public static void setup() {
        String browserName = System.getProperty("browser");
        Base.setDriver(browserName);
    }

    @AfterClass
    public static void closeBrowser() {
        Base.driver.close();
    }
}

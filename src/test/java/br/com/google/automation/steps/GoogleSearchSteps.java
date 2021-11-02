package br.com.google.automation.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.google.automation.common.Base;
import br.com.google.automation.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

    @Given("I access the google page")
    public void i_access_the_google_page() {

        Base.visitUrl("http://www.google.com.br");
    }

    @Given("I perform a search with a specific text")
    public void i_perform_a_search_with_a_specific_text() {

        WebElement teste = Base.getElement();
    }

    @When("I click the button Search")
    public void i_click_the_button_search() {

    }

}

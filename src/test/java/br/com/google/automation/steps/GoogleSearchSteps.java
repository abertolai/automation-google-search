package br.com.google.automation.steps;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import br.com.google.automation.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

    @Given("I access the google page")
    public void i_access_the_google_page() {

        SearchPage.visitUrlGoogle();
    }

    @When("I perform a search with the text {string}")
    public void i_perform_a_search_with_the_text(String text) {

        SearchPage.searchSomething(text);
    }

    @Then("Should be return a lot of results with {string}")
    public void should_be_return_a_lot_of_results_with(String text) {

        MatcherAssert.assertThat(SearchPage.getTextOfAList(), (CoreMatchers.hasItems(CoreMatchers.containsString(text))));
    }

    @Then("Should be return the message {string}")
    public void should_be_return_the_message(String message) {

        MatcherAssert.assertThat(SearchPage.getTextMessageNotFind(), (CoreMatchers.equalTo(message)));
    }
}

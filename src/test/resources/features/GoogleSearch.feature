Feature: Perform a google search

    Scenario: Perform a google search successfully
        Given I access the google page
        And I perform a search with a specific text
        When I click the button Search
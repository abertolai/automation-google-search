Feature: Perform a google search

    Scenario: Perform a google search successfully
        Given I access the google page
        When I perform a search with the text "Selenium WebDriver"
        Then Should be return a lot of results with "WebDriver"

    Scenario: Perform a google search unsuccessfully
        Given I access the google page
        When I perform a search with the text "UASsajlfjasosahfuhdsauhIHSAUASHUHDUSAHFUASHUFHASUHFJAEWHFHASUIHIFUEASHUIHFEIUASHFIEUHASFE"
        Then Should be return the message "Sua pesquisa não encontrou nenhum documento correspondente"
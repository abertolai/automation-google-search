package br.com.google.automation.pages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.google.automation.common.Base;

public class SearchPage extends Base {

    private static final By INPUT_SEARCH = By.name("q");
    private static final By BUTTON_SEARCH = By.name("btnK");
    private static String URL_GOOGLE = "http://google.com.br";
    private static By listOfElements = By.cssSelector(".lEBKkf");
    private static By messageNotFind = By.className("v3jTId");

    public static void searchSomething(String text) {
        fillInput(INPUT_SEARCH, text);
        clickSubmit(BUTTON_SEARCH);
    }

    public static void visitUrlGoogle() {
        visitUrl(URL_GOOGLE);
    }

    public static List<WebElement> findElementsContainsText() {
        return getElements(listOfElements);
    }

    public static List<String> getTextOfAList() {
        List<String> listElementsText = new ArrayList<>();

        for (int i=0; findElementsContainsText().size() > i; i++){
            listElementsText.add(findElementsContainsText().get(i).getText());
        }

        return listElementsText;
    }

    public static String getTextMessageNotFind() {
        return getElement(messageNotFind).getText();
    }
}

package pages.googleSearchPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchPage {
    private SelenideElement searchBox = $("input[name='q']");
    private ElementsCollection searchResults = $$("#search .g");

    public void searchFor(String query) {
        searchBox.setValue(query).pressEnter();
    }

    public boolean hasSearchResult(String text) {
        return searchResults.texts().contains(text);
    }
}

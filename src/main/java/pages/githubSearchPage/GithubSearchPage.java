package pages.githubSearchPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GithubSearchPage {

    private SelenideElement searchBox = $(".header-search-input");
    private ElementsCollection repoList = $("ul.repo-list").$$("li");

    public void searchFor(String query) {
        searchBox.setValue(query).pressEnter();
    }

    public boolean hasRepo(String repoName) {
        return repoList.texts().contains(repoName);
    }
}

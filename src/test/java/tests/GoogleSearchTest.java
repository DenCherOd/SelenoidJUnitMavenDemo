package tests;

import common.CommonTest;
import org.junit.jupiter.api.Test;
import pages.Pages;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSearchTest extends CommonTest {

    @Test
    void googleSearchTest() {
        open("https://www.google.com");
        Pages.googleSearchPage.searchFor("Selenide");
        assertTrue(Pages.googleSearchPage.hasSearchResult("selenide.org"));
    }
}

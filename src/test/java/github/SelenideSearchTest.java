package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearchTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
        void findSelenideRepoPage(){
        open("https://github.com");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $(".repo-list").$(byText("selenide/")).click();
        $("#wiki-tab").$(byText("Wiki")).click();
        $("#wiki-body").$(byText("Soft assertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
        $("#wiki-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})"));

    }
}

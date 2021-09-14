package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideSearch {
    @Test
    void findSelenideRepoPage(){
        open("https://github.com");

    }
}

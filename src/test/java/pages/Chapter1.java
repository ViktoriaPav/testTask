package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Chapter1 {
    private By textOnPage = byXpath("//*[@class = 'leftdiv']");
    private By homePageButton = byXpath("//*[@href = '/']");

    public By getTextOnPage() {
        return textOnPage;
    }

    public By getHomePageButton() {
        return homePageButton;
    }

    public String getText1() {
        return $(getTextOnPage()).getText();
    }

    public void clickHomPageButton() {
        $(getHomePageButton()).click();
    }
}

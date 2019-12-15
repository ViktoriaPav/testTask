package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Home {
    private By chapter1 = byXpath("//a[@href ='/chapter1']");

    public By getChapter1() {
        return chapter1;
    }

    public void openPage() {
        open("/");
    }

    public void navigateToChapter1() {
        $(getChapter1()).click();
    }
}

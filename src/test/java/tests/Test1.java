package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Chapter1;
import pages.Home;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Test1 {

        public Home homePage = new Home();
        public Chapter1 chapter1Page = new Chapter1();

        @BeforeClass
        public static void openInbox() {
            timeout = 10000;
            baseUrl = "http://book.theautomatedtester.co.uk";
            startMaximized = false;
            browser = "chrome";
        }

        @Test
        public void test1() {
            homePage.openPage();
            homePage.navigateToChapter1();
            chapter1Page.getText1().equals("Assert that this text is on the page");
            chapter1Page.clickHomPageButton();
            Selenide.screenshot("1");
        }

        @AfterClass
        public static void closeBrowser() {
            closeWebDriver();
        }
    }



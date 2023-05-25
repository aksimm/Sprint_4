package ru.praktikum.selenium;

import org.junit.Test;
import ru.praktikum.selenium.pageobject.MainPage;

public class DropDownListTest extends BaseTest {
    @Test
    public void checkDropDownList() {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkFirstAnswer();
        mainPage.checkSecondAnswer();
        mainPage.checkThirdAnswer();
        mainPage.checkFourthAnswer();
        mainPage.checkFifthAnswer();
        mainPage.checkSixthAnswer();
        mainPage.checkSeventhAnswer();
        mainPage.checkEighthAnswer();
    }
}

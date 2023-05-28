package ru.praktikum.selenium;

import org.junit.Assert;
import org.junit.Test;
import ru.praktikum.selenium.pageobject.MainPage;


public class DropDownListTest extends BaseTest{
    public final String firstAnswerText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public final String secondAnswerText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public final String thirdAnswerText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public final String fourthAnswerText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public final String fifthAnswerText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public final String sixthAnswerText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public final String seventhAnswerText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public final String eighthAnswerText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    @Test
    public void checkDropDownList() {
        MainPage mainPage = new MainPage(driver);
        mainPage.checkFirstAnswer(firstAnswerText);
        mainPage.checkSecondAnswer(secondAnswerText);
        mainPage.checkThirdAnswer(thirdAnswerText);
        mainPage.checkFourthAnswer(fourthAnswerText);
        mainPage.checkFifthAnswer(fifthAnswerText);
        mainPage.checkSixthAnswer(sixthAnswerText);
        mainPage.checkSeventhAnswer(seventhAnswerText);
        mainPage.checkEighthAnswer(eighthAnswerText);
    }
}

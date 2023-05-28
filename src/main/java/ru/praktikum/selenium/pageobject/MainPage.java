package ru.praktikum.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;
import static ru.praktikum.selenium.config.Config.APP_URL;

public class MainPage {
    WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.get(APP_URL);
    }
       private By orderButton = By.xpath(".//button[@class='Button_Button__ra12g']");
       private By middleOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
       private By firstQuestion = By.xpath(".//div[@class='accordion__button' and text()='Сколько это стоит? И как оплатить?']");
       private By secondQuestion = By.xpath(".//div[@class='accordion__button' and text()='Хочу сразу несколько самокатов! Так можно?']");
       private By thirdQuestion = By.xpath(".//div[@class='accordion__button' and text()='Как рассчитывается время аренды?']");
       private By fourthQuestion = By.xpath(".//div[@class='accordion__button' and text()='Можно ли заказать самокат прямо на сегодня?']");
       private By fifthQuestion = By.xpath(".//div[@class='accordion__button' and text()='Можно ли продлить заказ или вернуть самокат раньше?']");
       private By sixthQuestion = By.xpath(".//div[@class='accordion__button' and text()='Вы привозите зарядку вместе с самокатом?']");
       private By seventhQuestion = By.xpath(".//div[@class='accordion__button' and text()='Можно ли отменить заказ?']");
       private By eighthQuestion = By.xpath(".//div[@class='accordion__button' and text()='Я жизу за МКАДом, привезёте?']");
       private By firstAnswer = By.xpath(".//div[@id='accordion__panel-0']/p");
       private By secondAnswer = By.xpath(".//div[@id='accordion__panel-1']/p");
       private By thirdAnswer = By.xpath(".//div[@id='accordion__panel-2']/p");
       private By fourthAnswer = By.xpath(".//div[@id='accordion__panel-3']/p");
       private By fifthAnswer = By.xpath(".//div[@id='accordion__panel-4']/p");
       private By sixthAnswer = By.xpath(".//div[@id='accordion__panel-5']/p");
       private By seventhAnswer = By.xpath(".//div[@id='accordion__panel-6']/p");
       private By eighthAnswer = By.xpath(".//div[@id='accordion__panel-7']/p");


        public void clickButton(By button) {
        WebElement element = driver.findElement(button);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(button).click();
       }
        public void checkVisibilityAnswer(By answer) {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(answer));
       }
        public String getActualText(By answer) {
        return driver.findElement(answer).getText();
       }


       public void clickOrderButton() {
           driver.findElement(orderButton).click();
       }
       public void clickMiddleOrderButton() {
           clickButton(middleOrderButton);
       }
       public void checkFirstAnswer(String firstAnswerText) {
           clickButton(firstQuestion);
           checkVisibilityAnswer(firstAnswer);
           assertEquals(firstAnswerText, getActualText(firstAnswer));
        }
    public void checkSecondAnswer(String secondAnswerText) {
        clickButton(secondQuestion);
        checkVisibilityAnswer(secondAnswer);
        assertEquals(secondAnswerText, getActualText(secondAnswer));
    }
    public void checkThirdAnswer(String thirdAnswerText) {
        clickButton(thirdQuestion);
        checkVisibilityAnswer(thirdAnswer);
        assertEquals(thirdAnswerText, getActualText(thirdAnswer));
    }
    public void checkFourthAnswer(String fourthAnswerText) {
        clickButton(fourthQuestion);
        checkVisibilityAnswer(fourthAnswer);
        assertEquals(fourthAnswerText, getActualText(fourthAnswer));
    }
    public void checkFifthAnswer(String fifthAnswerText) {
        clickButton(fifthQuestion);
        checkVisibilityAnswer(fifthAnswer);
        assertEquals(fifthAnswerText, getActualText(fifthAnswer));
    }
    public void checkSixthAnswer(String sixthAnswerText) {
        clickButton(sixthQuestion);
        checkVisibilityAnswer(sixthAnswer);
        assertEquals(sixthAnswerText, getActualText(sixthAnswer));
    }
    public void checkSeventhAnswer(String seventhAnswerText) {
        clickButton(seventhQuestion);
        checkVisibilityAnswer(seventhAnswer);
        assertEquals(seventhAnswerText, getActualText(seventhAnswer));
    }
    public void checkEighthAnswer(String eighthAnswerText) {
        clickButton(eighthQuestion);
        checkVisibilityAnswer(eighthQuestion);
        assertEquals(eighthAnswerText, getActualText(eighthAnswer));
    }
}


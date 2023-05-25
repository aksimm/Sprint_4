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

       public void clickOrderButton() {
           driver.findElement(orderButton).click();
       }
       public void clickMiddleOrderButton() {
           WebElement element = driver.findElement(middleOrderButton);
           ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
           driver.findElement(middleOrderButton).click();
       }
       public void checkFirstAnswer() {
           WebElement element = driver.findElement(firstQuestion);
           ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
           driver.findElement(firstQuestion).click();
           new WebDriverWait(driver, 5)
                   .until(ExpectedConditions.visibilityOfElementLocated(firstAnswer));
           String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
           String actual = driver.findElement(firstAnswer).getText();
           assertEquals(expected, actual);
       }
    public void checkSecondAnswer() {
        WebElement element = driver.findElement(secondQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(secondQuestion).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(secondAnswer));
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = driver.findElement(secondAnswer).getText();
        assertEquals(expected, actual);
    }
    public void checkThirdAnswer() {
        WebElement element = driver.findElement(thirdQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(thirdQuestion).click();
        new WebDriverWait(driver, 5)
                                                 .until(ExpectedConditions.visibilityOfElementLocated(thirdAnswer));
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = driver.findElement(thirdAnswer).getText();
        assertEquals(expected, actual);
    }
    public void checkFourthAnswer() {
        WebElement element = driver.findElement(fourthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(fourthQuestion).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(fourthAnswer));
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = driver.findElement(fourthAnswer).getText();
        assertEquals(expected, actual);
    }
    public void checkFifthAnswer() {
        WebElement element = driver.findElement(fifthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(fifthQuestion).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(fifthAnswer));
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = driver.findElement(fifthAnswer).getText();
        assertEquals(expected, actual);
    }
    public void checkSixthAnswer() {
        WebElement element = driver.findElement(sixthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(sixthQuestion).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(sixthAnswer));
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = driver.findElement(sixthAnswer).getText();
        assertEquals(expected, actual);
    }
    public void checkSeventhAnswer() {
        WebElement element = driver.findElement(seventhQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(seventhQuestion).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(seventhAnswer));
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = driver.findElement(seventhAnswer).getText();
        assertEquals(expected, actual);
    }
    public void checkEighthAnswer() {
        WebElement element = driver.findElement(eighthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(eighthQuestion).click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(eighthAnswer));
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = driver.findElement(eighthAnswer).getText();
        assertEquals(expected, actual);
    }
}


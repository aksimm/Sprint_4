package ru.praktikum.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class MakeAnOrderPage {
    WebDriver driver;

    public MakeAnOrderPage(WebDriver driver) {
        this.driver = driver;

    }

    private By nameField = By.xpath(".//input[@placeholder='* Имя']");
    private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");
    private By dropDownMetroStationButton = By.xpath(".//li[@data-index='3']");
    private By phoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");
    private By calendarField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By dateButton = By.xpath(".//div[@class='react-datepicker__week']");
    private By timeOfOrderField = By.xpath(".//div[@class='Dropdown-placeholder']");
    private By timeOfOrderButton = By.xpath(".//div[@class='Dropdown-option' and text()='сутки']");
    private By blackColourOFScooterCheckBox = By.xpath(".//input[@id='black']");
    private By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private By makeAnOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By yesButton = By.xpath(".//button[text()='Да']");
    private By successfulOrderWindow = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

    public void fillNameField(String name){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(nameField));
        driver.findElement(nameField).sendKeys(name);
    }
    public void fillSurnameField(String surname){
        driver.findElement(surnameField).sendKeys(surname);
    }
    public void fillAddressField(String address){
        driver.findElement(addressField).sendKeys(address);
    }
    public void clickMetroStationField(){
        driver.findElement(metroStationField).click();
    }
    public void clickDropDownMetroStationButton(){
        driver.findElement(dropDownMetroStationButton).click();
    }
    public void fillPhoneNumberField(String phoneNumber){
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }
    public void clickNextButton(){
        driver.findElement(nextButton).click();
    }
    public void clickCalendarField(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(calendarField));
        driver.findElement(calendarField).click();
    }
    public void clickDateButton(){
        driver.findElement(dateButton).click();
    }
    public void clickTimeOfOrderField(){
        driver.findElement(timeOfOrderField).click();
    }
    public void clickTimeOfOrderButton(){
        driver.findElement(timeOfOrderButton).click();
    }
    public void clickBlackColourOFScooterCheckBox(){
        driver.findElement(blackColourOFScooterCheckBox).click();
    }
    public void fillCommentField(String comment){
        driver.findElement(commentField).sendKeys(comment);
    }
    public void clickMakeAnOrderButton(){
        driver.findElement(makeAnOrderButton).click();
    }
    public void clickYesButton(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(yesButton));
        driver.findElement(yesButton).click();
    }
    public void checkSuccessfulOrderWindow(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(successfulOrderWindow));
        boolean isDisplayed = driver.findElement(successfulOrderWindow).isDisplayed();
        assertTrue(isDisplayed);
    }



}

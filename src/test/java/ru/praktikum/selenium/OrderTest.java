package ru.praktikum.selenium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.praktikum.selenium.pageobject.MainPage;
import ru.praktikum.selenium.pageobject.MakeAnOrderPage;
@RunWith(Parameterized.class)
public class OrderTest extends BaseTest {
    private final String name;
    private final String surname;
    private final String address;
    private final String phoneNumber;
    private final String comment;

    public OrderTest(String name, String surname, String address, String phoneNumber, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderInfo() {
        return new Object[][]{
                {"Иван", "Петров", "ул. Мира, 1", "+7912346789", "Не звонить в домофон"},
                {"Павел", "Иванов", "ул. Мира, 1-1", "+79123467888", "Оставить у двери"},
        };
    }

    @Test
    public void checkSuccessfulOrder() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOrderButton();

        MakeAnOrderPage makeAnOrderPage = new MakeAnOrderPage(driver);
        makeAnOrderPage.fillNameField(name);
        makeAnOrderPage.fillSurnameField(surname);
        makeAnOrderPage.fillAddressField(address);
        makeAnOrderPage.clickMetroStationField();
        makeAnOrderPage.clickDropDownMetroStationButton();
        makeAnOrderPage.fillPhoneNumberField(phoneNumber);
        makeAnOrderPage.clickNextButton();
        makeAnOrderPage.clickCalendarField();
        makeAnOrderPage.clickDateButton();
        makeAnOrderPage.clickTimeOfOrderField();
        makeAnOrderPage.clickTimeOfOrderButton();
        makeAnOrderPage.clickBlackColourOFScooterCheckBox();
        makeAnOrderPage.fillCommentField(comment);
        makeAnOrderPage.clickMakeAnOrderButton();
        makeAnOrderPage.clickYesButton();
        makeAnOrderPage.checkSuccessfulOrderWindow();
    }

    @Test
    public void checkSuccessfulOrderMiddleButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickMiddleOrderButton();

        MakeAnOrderPage makeAnOrderPage = new MakeAnOrderPage(driver);
        makeAnOrderPage.fillNameField(name);
        makeAnOrderPage.fillSurnameField(surname);
        makeAnOrderPage.fillAddressField(address);
        makeAnOrderPage.clickMetroStationField();
        makeAnOrderPage.clickDropDownMetroStationButton();
        makeAnOrderPage.fillPhoneNumberField(phoneNumber);
        makeAnOrderPage.clickNextButton();
        makeAnOrderPage.clickCalendarField();
        makeAnOrderPage.clickDateButton();
        makeAnOrderPage.clickTimeOfOrderField();
        makeAnOrderPage.clickTimeOfOrderButton();
        makeAnOrderPage.clickBlackColourOFScooterCheckBox();
        makeAnOrderPage.fillCommentField(comment);
        makeAnOrderPage.clickMakeAnOrderButton();
        makeAnOrderPage.clickYesButton();
        makeAnOrderPage.checkSuccessfulOrderWindow();
    }
}

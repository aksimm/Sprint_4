package ru.praktikum.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
    WebDriver driver;
    @Before

    public void startUp() {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        driver = new FirefoxDriver();
    }

    @After
    public void endUp() {
        driver.quit();
    }
}

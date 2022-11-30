package by.itacademy.taf_pizza.page;


import by.itacademy.taf_pizza.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static by.itacademy.taf_pizza.constants.Constant.WAIT_FOR_ELEMENT;

public class BasePage {
    protected WebDriver driver;
    protected Actions builder;
    private static final String URL = "https://dodopizza.by/";

    public BasePage() {
        this.driver = Driver.getDriver();
    }

    public void open() {
        driver.navigate().to(URL);
    }

    protected WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_FOR_ELEMENT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    protected void clickOnElement(By locator) {
        driver.findElement(locator).click();
    }

    protected void printTextToTheForm(By locator, String input) {
        builder = new Actions(driver);
        WebElement element = driver.findElement(locator);
        builder.sendKeys(element, input).perform();
    }
}

package by.itacademy.taf_pizza.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DodoPizzaPage extends BasePage {
    private final By PIZZAS_MENU_LOCATOR = By.xpath("//*[@id='react-app']/nav/div/ul/li[1]/a");
    private final By PIZZA_FOUR_SEASONS_LOCATOR = By.xpath("//article[@data-testid='menu__meta-product_000D3A262427A94911E8A4BF330E7060']/footer/button");
    private final By DODO_PIZZA_PAGE_CLOSE_COOKIE_LOCATOR = By.className("cookie-policy__button");
    private final By PIZZA_FOUR_SEASONS_BIG_SIZE_LOCATOR = By.xpath("//label[3]");
    private final By ADD_SELECTED_PIZZA_TO_BUCKET_LOCATOR = By.xpath("//div[2]/div[2]/button");
    private final By PICK_UP_PIZZA_FROM_PIZZERIA_RADIO_BUTTON_LOCATOR = By.xpath("//button[contains(text(), 'Забрать из')]");
    private final By SUBMIT_GOMEL_1_LOCATOR = By.xpath("//button[@class='sc-1rmt3mq-0 cpUbDl submit-button']");
    private final By BUCKET_LOCATOR = By.xpath("//button[@class='sc-1rmt3mq-0 cpUbDl xlo7eb-10 ieYvah']");
    private final By FOUR_SEASON_NAME = By.xpath("//h3[@class='qt41kr-5 cGnUch']");

    public DodoPizzaPage(WebDriver driver) {
        super(driver);
    }

    public DodoPizzaPage clickOnPizzaMenu() {
        WebElement pizzaMenuLocatorElement = driver.findElement(PIZZAS_MENU_LOCATOR);
        waitElementIsVisible(pizzaMenuLocatorElement).click();
        return this;
    }

    public void clickToCloseCookie() {
        WebElement clickToCloseCookieElement = driver.findElement(DODO_PIZZA_PAGE_CLOSE_COOKIE_LOCATOR);
        waitElementIsVisible(clickToCloseCookieElement).click();
    }

    public DodoPizzaPage clickButtonToChooseFourSeasonPizza() {
        WebElement clickButtonToChooseFourSeasonPizzaElement = driver.findElement(PIZZA_FOUR_SEASONS_LOCATOR);
        waitElementIsVisible(clickButtonToChooseFourSeasonPizzaElement).click();
        return this;
    }


    public DodoPizzaPage clickFourSeasonPizzaBigSize() {
        WebElement clickFourSeasonPizzaBigSizeElement = driver.findElement(PIZZA_FOUR_SEASONS_BIG_SIZE_LOCATOR);
        waitElementIsVisible(clickFourSeasonPizzaBigSizeElement).click();
        return this;
    }

    public DodoPizzaPage clickOnButtonAddToBucket() {
        WebElement clickOnButtonAddToBucketElement = driver.findElement(ADD_SELECTED_PIZZA_TO_BUCKET_LOCATOR);
        waitElementIsVisible(clickOnButtonAddToBucketElement).click();
        return this;
    }

    public DodoPizzaPage clickOnRadioButtonToPickUpPizzaFromPizzeria() {
        WebElement clickOnRadioButtonToPickUpPizzaFromPizzeriaElement = driver.findElement(PICK_UP_PIZZA_FROM_PIZZERIA_RADIO_BUTTON_LOCATOR);
        waitElementIsVisible(clickOnRadioButtonToPickUpPizzaFromPizzeriaElement).click();
        return this;
    }

    public DodoPizzaPage clickSubmitAfterSelectingLocation() {
        WebElement clickSubmitAfterSelectingLocationElement = driver.findElement(SUBMIT_GOMEL_1_LOCATOR);
        waitElementIsVisible(clickSubmitAfterSelectingLocationElement).click();
        return this;
    }

    public void clickOnBucket() {
        WebElement clickOnBucketElement = driver.findElement(BUCKET_LOCATOR);
        waitElementIsVisible(clickOnBucketElement).click();
    }

    public String getNameFourSeasonPizza() {
        WebElement getNameFourSeasonPizzaElement = driver.findElement(FOUR_SEASON_NAME);
        return waitElementIsVisible(getNameFourSeasonPizzaElement).getText();
    }
}

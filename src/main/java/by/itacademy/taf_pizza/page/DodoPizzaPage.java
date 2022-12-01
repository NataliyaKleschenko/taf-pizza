package by.itacademy.taf_pizza.page;

import by.itacademy.taf_pizza.util.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DodoPizzaPage extends BasePage {
    private final By GOMEL_LOCATOR = By.xpath("//a[@href='/gomel']");
    private final By PIZZAS_MENU_LOCATOR = By.xpath("//*[@id='react-app']/nav/div/ul/li[1]/a");
    private final By PIZZA_FOUR_SEASONS_LOCATOR = By.xpath("//article[@data-testid='menu__meta-product_000D3A262427A94911E8A4BF330E7060']/footer/button");
    private final By DODO_PIZZA_PAGE_CLOSE_COOKIE_LOCATOR = By.className("cookie-policy__button");
    private final By PIZZA_FOUR_SEASONS_BIG_SIZE_LOCATOR = By.xpath("//label[3]");
    private final By ADD_SELECTED_PIZZA_TO_BUCKET_LOCATOR = By.xpath("//div[2]/div[2]/button");
    private final By PICK_UP_PIZZA_FROM_PIZZERIA_RADIO_BUTTON_LOCATOR = By.xpath("//button[contains(text(), 'Забрать из')]");
    private final By SPECIFY_THE_DELIVERY_ADDRESS_LOCATOR = By.xpath("//button[contains(text(), 'Указать адрес')]");
    private final By STREET_INPUT_LOCATOR = By.xpath("//div[@class='sc-1qbfx43-0 bimGIS']//input");
    private final By ENTRANCE_INPUT_LOCATOR = By.xpath("//div[@class='sc-1qbfx43-0 bimGIS control-medium']//input[@id='animated-input-2']");
    private final By FLOOR_INPUT_LOCATOR = By.xpath("//div[@class='sc-1qbfx43-0 bimGIS control-medium']//input[@id='animated-input-3']");
    private final By APARTMENT_INPUT_LOCATOR = By.xpath("//div[@class='sc-1qbfx43-0 bimGIS control-medium']//input[@id='animated-input-4']");
    private final By CODE_INPUT_LOCATOR = By.xpath("//div[@class='sc-1qbfx43-0 bimGIS control-medium']//input[@id='animated-input-5']");
    private final By SUBMIT_DELIVERY_ADDRESS_LOCATOR = By.xpath("//button[@class='sc-1rmt3mq-0 cpUbDl submit-button']");
    private final By SUBMIT_GOMEL_1_LOCATOR = By.xpath("//button[@class='sc-1rmt3mq-0 cpUbDl submit-button']");
    private final By BUCKET_LOCATOR = By.xpath("//button[@class='sc-1rmt3mq-0 cpUbDl xlo7eb-10 ieYvah']");
    private final By FOUR_SEASON_NAME = By.xpath("//h3[@class='qt41kr-5 cGnUch']");
    public static final String FOUR_SEASON = "Четыре сезона";

    public DodoPizzaPage() {
        super();
    }

    public DodoPizzaPage clickOnPizzaMenu() {
        clickOnElement(PIZZAS_MENU_LOCATOR);
        return this;
    }

    public void clickToSelectCity() {
        clickOnElement(GOMEL_LOCATOR);
    }

    public void clickToCloseCookie() {
        clickOnElement(DODO_PIZZA_PAGE_CLOSE_COOKIE_LOCATOR);
    }

    public DodoPizzaPage clickButtonToChooseFourSeasonPizza() {
        WebElement fourSeasonPizza = driver.findElement(PIZZA_FOUR_SEASONS_LOCATOR);
        waitElementIsVisible(fourSeasonPizza).click();
        return this;
    }

    public DodoPizzaPage clickFourSeasonPizzaBigSize() {
        clickOnElement(PIZZA_FOUR_SEASONS_BIG_SIZE_LOCATOR);
        return this;
    }

    public DodoPizzaPage clickOnButtonAddToBucket() {
        clickOnElement(ADD_SELECTED_PIZZA_TO_BUCKET_LOCATOR);
        return this;
    }

    public DodoPizzaPage clickOnRadioButtonToPickUpPizzaFromPizzeria() {
        clickOnElement(PICK_UP_PIZZA_FROM_PIZZERIA_RADIO_BUTTON_LOCATOR);
        return this;
    }

    public DodoPizzaPage clickSubmitAfterSelectingLocation() {
        clickOnElement(SUBMIT_GOMEL_1_LOCATOR);
        return this;
    }

    public DodoPizzaPage clickToSpecifyTheDeliveryAddress() {
        clickOnElement(SPECIFY_THE_DELIVERY_ADDRESS_LOCATOR);
        return this;
    }

    public void clickOnBucket() {
        driver.findElement(BUCKET_LOCATOR).click();
    }

    public void typeNameOfStreet() {
        printTextToTheForm(STREET_INPUT_LOCATOR, RandomString.generateRandomString());
    }

    public void typeEntranceNumber() {
        printTextToTheForm(ENTRANCE_INPUT_LOCATOR, RandomString.generateRandomString());
    }

    public void typeFloorNumber() {
        printTextToTheForm(FLOOR_INPUT_LOCATOR, RandomString.generateRandomString());
    }

    public void typeApartmentNumber() {
        printTextToTheForm(APARTMENT_INPUT_LOCATOR, RandomString.generateRandomString());
    }

    public void typeCodeNumber() {
        printTextToTheForm(CODE_INPUT_LOCATOR, RandomString.generateRandomString());
    }

    public void clickOnSubmitDeliveryAddress() {
        driver.findElement(SUBMIT_DELIVERY_ADDRESS_LOCATOR).click();
    }


    public String getNameFourSeasonPizza() {
        WebElement getNameFourSeasonPizzaElement = driver.findElement(FOUR_SEASON_NAME);
        return waitElementIsVisible(getNameFourSeasonPizzaElement).getText();
    }
}

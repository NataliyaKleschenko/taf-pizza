package by.itacademy.taf_pizza;

import by.itacademy.taf_pizza.driver.Driver;
import by.itacademy.taf_pizza.page.BasePage;
import by.itacademy.taf_pizza.page.DodoPizzaPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
public class BaseTest {
    protected WebDriver driver = Driver.getDriver();
    protected BasePage basePage = new BasePage(driver);
    protected DodoPizzaPage dodoPizzaPage = new DodoPizzaPage(driver);
    private static final String URL = "https://dodopizza.by/";

    @BeforeEach
    void setUp() {
        basePage.open(URL);
        dodoPizzaPage.clickToCloseCookie();
    }

    @AfterEach
    void tearDown() {
        Driver.closeDriver();
    }
}

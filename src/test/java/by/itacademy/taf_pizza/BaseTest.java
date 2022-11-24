package by.itacademy.taf_pizza;

import by.itacademy.taf_pizza.driver.Driver;
import by.itacademy.taf_pizza.page.BasePage;
import by.itacademy.taf_pizza.page.DodoPizzaPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected BasePage basePage = new BasePage();
    protected DodoPizzaPage dodoPizzaPage = new DodoPizzaPage();


    @BeforeEach
    void setUp() {
        basePage.open();
        dodoPizzaPage.clickToCloseCookie();
    }

    @AfterEach
    void tearDown() {
        Driver.closeDriver();
    }
}

package by.itacademy.taf_pizza;

import by.itacademy.taf_pizza.driver.Driver;
import by.itacademy.taf_pizza.page.DodoPizzaPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
      @BeforeEach
    void setUp() {
        DodoPizzaPage dodoPizzaPage = new DodoPizzaPage();
        dodoPizzaPage.open();

    }

    @AfterEach
    void tearDown() {
        Driver.closeDriver();
    }
}

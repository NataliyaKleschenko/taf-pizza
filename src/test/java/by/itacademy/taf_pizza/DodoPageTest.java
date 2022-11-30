package by.itacademy.taf_pizza;

import by.itacademy.taf_pizza.page.DodoPizzaPage;
import by.itacademy.taf_pizza.step.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.ElementClickInterceptedException;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DodoPageTest extends BaseTest {
    DodoPizzaPage dodoPizzaPage = new DodoPizzaPage();

    @Test
    void testAddPizzaFourSeasonToBucketAndCheck() {
        Steps steps = new Steps();
        steps.addPizzaFourSeasonToBucketWithoutDelivery();

        Assertions.assertEquals(DodoPizzaPage.FOUR_SEASON, dodoPizzaPage.getNameFourSeasonPizza());
    }

    @Test
    void testFillFormWithIncorrectData() {
        assertThrows(ElementClickInterceptedException.class, () -> {
            Steps steps = new Steps();
            steps.addPizzaFourSeasonToBucketWithDelivery();
        });
    }
}


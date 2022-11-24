package by.itacademy.taf_pizza;

import by.itacademy.taf_pizza.page.DodoPizzaPage;
import by.itacademy.taf_pizza.step.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.ElementClickInterceptedException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DodoPageTest extends BaseTest {
    private static Steps steps;

    @Test
    void testAddPizzaFourSeasonToBucketAndCheck() {
        steps = new Steps();
        steps.addPizzaFourSeasonToBucketWithoutDelivery();
        String actual = dodoPizzaPage.getNameFourSeasonPizza();
        String expected = DodoPizzaPage.FOUR_SEASON;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFillFormWithIncorrectData() {
        assertThrows(ElementClickInterceptedException.class, () -> {
            steps = new Steps();
            steps.addPizzaFourSeasonToBucketWithDelivery();
        });
    }
}


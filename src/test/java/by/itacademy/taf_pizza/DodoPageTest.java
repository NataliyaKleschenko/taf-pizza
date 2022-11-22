package by.itacademy.taf_pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DodoPageTest extends BaseTest {

    @Test
    void testAddPizzaFourSeasonToBucketAndCheck() {
        dodoPizzaPage.clickOnPizzaMenu()
                .clickButtonToChooseFourSeasonPizza()
                .clickFourSeasonPizzaBigSize()
                .clickOnButtonAddToBucket()
                .clickOnRadioButtonToPickUpPizzaFromPizzeria()
                .clickSubmitAfterSelectingLocation()
                .clickOnBucket();
        String actual = dodoPizzaPage.getNameFourSeasonPizza();

        Assertions.assertEquals("Четыре сезона", actual);
    }
}

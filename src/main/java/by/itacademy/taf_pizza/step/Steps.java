package by.itacademy.taf_pizza.step;

import by.itacademy.taf_pizza.page.DodoPizzaPage;

public class Steps extends DodoPizzaPage{
    private static DodoPizzaPage dodoPizzaPage;

    public Steps addPizzaFourSeasonToBucket() {
       dodoPizzaPage = new DodoPizzaPage();
        dodoPizzaPage.clickOnPizzaMenu()
                .clickButtonToChooseFourSeasonPizza()
                .clickFourSeasonPizzaBigSize()
                .clickOnButtonAddToBucket();
        return this;
    }

    public Steps addPizzaFourSeasonToBucketWithoutDelivery() {
        dodoPizzaPage = new DodoPizzaPage();
        dodoPizzaPage.clickToSelectCity();
        dodoPizzaPage.clickToCloseCookie();
        addPizzaFourSeasonToBucket();
        dodoPizzaPage.clickOnRadioButtonToPickUpPizzaFromPizzeria()
                .clickSubmitAfterSelectingLocation()
                .clickOnBucket();
        return this;
    }

    public Steps addPizzaFourSeasonToBucketWithDelivery() {
        dodoPizzaPage = new DodoPizzaPage();
        dodoPizzaPage.clickToSelectCity();
        addPizzaFourSeasonToBucket();
        dodoPizzaPage.clickToSpecifyTheDeliveryAddress();
        fillFormWithIncorrectData();
        return this;
    }

    public void fillFormWithIncorrectData() {
       dodoPizzaPage = new DodoPizzaPage();
        dodoPizzaPage.typeNameOfStreet();
        dodoPizzaPage.typeEntranceNumber();
        dodoPizzaPage.typeFloorNumber();
        dodoPizzaPage.typeApartmentNumber();
        dodoPizzaPage.typeCodeNumber();
        dodoPizzaPage.clickOnSubmitDeliveryAddress();
        dodoPizzaPage.clickOnBucket();
    }
}

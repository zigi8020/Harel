package Utilities;

import Pages.*;

import static org.openqa.selenium.support.PageFactory.initElements;

public class PageFactoryUtilities extends Setup {

    public static void buildPageFactory() {
        homePage = initElements(driver, HomePage.class);
        continentsPage = initElements(driver, ContinentsPage.class);
        datesPage = initElements(driver, DatesPage.class);
        passengersPage = initElements(driver, PassengersPage.class);
    }
}
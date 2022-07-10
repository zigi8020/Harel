package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightPurchaseTest extends BaseTest{

    @Test
    void firstTimePurchase() {
        homePage.clickOnPurchaseForNewCustomer();
        continentsPage.clickOnAustralia();
        //datesPage.chooseDates();
        datesPage.clickOnContinueBtn();
        Assert.assertEquals(passengersPage.getScreenTitle(), "נשמח להכיר את הנוסעים שנבטח הפעם");
    }
}

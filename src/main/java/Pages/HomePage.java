package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@datahrlbo = 'purchase-for-new-customer']")
    WebElement purchaseForNewCustomer;

    public void clickOnPurchaseForNewCustomer() {
        click(purchaseForNewCustomer);
    }

    @FindBy(xpath = "//button[@datahrlbo = 'purchase-for-returning-customer']")
    WebElement purchaseForReturningCustomer;

    public void clickOnPurchaseForReturningCustomer() {
        click(purchaseForReturningCustomer);
    }
}

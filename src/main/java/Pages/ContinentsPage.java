package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContinentsPage extends BasePage {

    @FindBy (xpath = "//div[@data-hrl-bo = 'USA']")
    WebElement usa;

    public void clickOnUsa() { click(usa); }

    @FindBy (xpath = "//div[@data-hrl-bo = 'canada']")
    WebElement canada;

    public void clickOnCanada() {
        click(canada);
    }

    @FindBy (xpath = "//div[@data-hrl-bo = 'africa']")
    WebElement africa;

    public void clickOnAfrica() {
        click(africa);
    }

    @FindBy (xpath = "//div[@data-hrl-bo = 'europe']")
    WebElement europe;

    public void clickOnEurope() {
        click(europe);
    }

    @FindBy (xpath = "//div[@data-hrl-bo = 'asia']")
    WebElement asia;

    public void clickOnAsia() {
        click(asia);
    }

    @FindBy (xpath = "//div[@data-hrl-bo = 'centerSouthAmerica']")
    WebElement centerSouthAmerica;

    public void clickOnCenterSouthAmerica() {
        click(centerSouthAmerica);
    }

    @FindBy (xpath = "//div[@data-hrl-bo = 'australia']")
    WebElement australia;

    public void clickOnAustralia() {
        click(australia);
    }

    @FindBy (xpath = "//div[@data-hrl-bo = 'wizard-next-button']")
    WebElement continueBtn;

    public void clickOnContinueBtn() {
        click(continueBtn);
    }

}

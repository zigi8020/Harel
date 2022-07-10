package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassengersPage extends BasePage {

    @FindBy(xpath = "//h2[@data-hrl-bo = 'screen_title']")
    WebElement screenTitle;

    public String getScreenTitle() {
       return getText(screenTitle);
    }
}

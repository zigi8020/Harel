    package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static Utilities.AllureReports.screenShot;

    public class DatesPage extends BasePage {

    @FindBy(id = "travel_start_date")
    WebElement travelStartDate;

    public String getTravelStartDate() {
        return getText(travelStartDate);
    }

    @FindBy(id = "travel_end_date")
    WebElement travelEndDate;

    public String getTravelEndDate() {
        return getText(travelEndDate);
    }
    
    @FindBy(xpath = "(//button[@class = 'MuiButtonBase-root MuiIconButton-root jss238 jss223'])[7]")
    WebElement startDateBtn;

    public void clickOnStartDateBtn() {
        click(startDateBtn);
    }

    @FindBy(xpath = "(//button[@class = 'MuiButtonBase-root MuiIconButton-root jss238 jss223'])[35]")
    WebElement endDateBtn;

    public void clickOnEndDateBtn() {
        click(endDateBtn);
    }

    @FindBy(xpath = "//span[@data-hrl-bo = 'total-days']")
    WebElement totalDays;

    public String getTotalDays() {
        screenShot("totalDays");
        return getText(totalDays);
    }

    @FindBy(id = "backButton")
    WebElement backButton;

    public void clickOnBackButton() {
        click(backButton);
    }

    @FindBy (xpath = "//button[@data-hrl-bo = 'wizard-next-button']")
    WebElement continueBtn;

    public void clickOnContinueBtn() {
        click(continueBtn);
    }
}

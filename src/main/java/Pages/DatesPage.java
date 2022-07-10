package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

    //I could not make it work
    
//    String startDate, endDate;
//    @FindBy(xpath = "//button[@data-hrl-bo = '"+startDate+"']")
//    WebElement startDateBtn;
//
//    public void clickOnStartDateBtn() {
//        click(startDateBtn);
//    }
//
//    @FindBy(xpath = "//button[@data-hrl-bo = "+endDate+"']")
//    WebElement endDateBtn;
//
//    public void clickOnEndDateBtn() {
//        click(endDateBtn);
//    }
//
//    public void chooseDates() {
//        String currentDate = String.valueOf(java.time.LocalDate.now());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Calendar cal = Calendar.getInstance();
//
//        try {
//            cal.setTime(sdf.parse(currentDate));
//        } catch (ParseException e) {
//            e.printStackTrace();
//
//        }
//
//        cal.add(Calendar.DAY_OF_MONTH, 7);
//        startDate = sdf.format(cal.getTime());
//        clickOnStartDateBtn();
//
//        cal.add(Calendar.DAY_OF_MONTH, 30);
//        endDate = sdf.format(cal.getTime());
//        clickOnEndDateBtn();
//    }

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

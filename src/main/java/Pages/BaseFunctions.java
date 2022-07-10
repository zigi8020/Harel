package Pages;

import Utilities.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BaseFunctions extends Setup {

    public WebElement waitForElementVisibility(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementInVisibility(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public WebElement waitForElementClickAbility(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void type(WebElement element, String text){
        waitForElementVisibility(element).clear();
        element.sendKeys(text);
    }

    public void click(WebElement element) {
        waitForElementClickAbility(element).click();
    }

    public String getText(WebElement element) {
        waitForElementVisibility(element);

        return element.getText();
    }

    public String getValue(WebElement element) {
        waitForElementVisibility(element);

        return element.getAttribute("value");
    }

    public void waitNumberOfElementMoreThen(By by, int moreThen) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by, moreThen));
    }

    public void waitNumberOfElementLessThen(By by, int lessThen) {
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(by, lessThen));
    }

    public void waitNumberOfElementToBe(By by, int toBe) {
        wait.until(ExpectedConditions.numberOfElementsToBe(by, toBe));
    }

//    public void moveOnElement(WebElement element) {
//        actions.moveToElement(element).perform();
//    }

    public void selectByIndex(WebElement element, int value){
        Select select = new Select(element);
        select.selectByIndex(value);
    }

    public void selectByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }
}
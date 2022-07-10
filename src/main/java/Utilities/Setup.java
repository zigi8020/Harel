package Utilities;

import Pages.ContinentsPage;
import Pages.DatesPage;
import Pages.HomePage;
import Pages.PassengersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class Setup {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Action actions;

    //Pages
    public static HomePage homePage;
    public static ContinentsPage continentsPage;
    public static DatesPage datesPage;
    public static PassengersPage passengersPage;
}

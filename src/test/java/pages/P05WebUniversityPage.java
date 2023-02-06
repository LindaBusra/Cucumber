package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P05WebUniversityPage {

    public P05WebUniversityPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[.='LOGIN PORTAL']")
    public WebElement loginPortal;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement loginButton;
}

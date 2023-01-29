package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalHomePage {

    public BlueRentalHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Login")          //    @FindBy(xpath = "//span[contains(text(), 'Login')]")
    public WebElement homePageLoginButton;


    @FindBy(id = "dropdown-basic-button")
    public WebElement userIcon;

    @FindBy(id = "formBasicEmail")
    public WebElement email;

    @FindBy(id = "formBasicPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

}
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class P06JqueryScriptPage {

    public P06JqueryScriptPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")
    public WebElement ikinciEmoji;

    @FindBy(xpath = "//div[@id='nature']")
    public List<WebElement> emojiler;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement text;
}
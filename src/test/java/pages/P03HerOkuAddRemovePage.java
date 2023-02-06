package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class P03HerOkuAddRemovePage {

    public  P03HerOkuAddRemovePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Add Element']")
    public WebElement addButton;

    @FindBy(xpath = "//button[.='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='added-manually']")
    public List<WebElement> deleteList;

}

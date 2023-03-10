package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.util.List;

public class DemoqaPage {


    public DemoqaPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//div[@class='card mt-4 top-card']")
    public WebElement elementsBolumu;

    @FindBy(xpath = "//span[.='Dynamic Properties']")
    public WebElement dynamicPropertiesButton;

    @FindBy(xpath = "//button[@id='enableAfter']")
    public WebElement willEnable5SecondsButton;

    @FindBy(xpath = "//button[@id='visibleAfter']")
    public WebElement visibleAfter5SecondsButton;

    @FindBy(xpath = "//h5[.='Alerts, Frame & Windows']")   //xpath = "(//div[@class='card mt-4 top-card'])[3]"
    public WebElement alertsFrameWindowsBolumu;

    @FindBy(xpath = "//span[.='Alerts']")
    public WebElement alertsButton;

    @FindBy(xpath = "//button[@id='timerAlertButton']")
    public WebElement alertWillAppearAfterFiveSecondsButton;





    @FindBy(xpath = "//div[@class='element-group']")
    public WebElement elementsMenusu;

    @FindBy(xpath = "//*[text()='Web Tables']")
    public WebElement webTablesButton;


    @FindBy(xpath = "//div[@class='container playgound-body']")
    public WebElement webTableSayfasi;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement tableBody;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> tableCellList;

    @FindBy(xpath = "//div[@role='columnheader']")
    public List<WebElement> tableHeaderList;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> tableRowList;


    @FindBy(xpath = "(//span[@class='group-header'])[3]//div[1]//div[1]")
    public WebElement alertsFrameWindowsMenusu;

    @FindBy(xpath = "(//*[@id=\"item-1\"]/span)[2]")
    public WebElement alertsWindowsMenusu;

    @FindBy(xpath = "(//span[@class='text'])[11]")
    public WebElement browserWindowsMenusu;
}
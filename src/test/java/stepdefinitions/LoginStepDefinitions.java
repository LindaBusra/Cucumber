package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @Given("user enters customer_email and customer_password")
    public void user_enters_customer_email_and_customer_password(DataTable credentials) {

        //1. way : Get Data as list of String

//        List<String> customerData = credentials.row(1); //row index start at 0.  row(1) is 2nd row, first is header
////        System.out.println(customerData.get(0));  //jack@gmail.com
////        System.out.println(customerData.get(1));  //12345
////        System.out.println(credentials.row(1).get(0));  //2nd row 1st column
////        System.out.println(credentials.row(1).get(1));  //2nd row 2nd column
//
//        loginPage.username.sendKeys(customerData.get(0));
//        loginPage.password.sendKeys(customerData.get(1));
//        loginPage.loginButton.click();


        //2. way : Get Data as list of Map of String  List<Map<String,String>>
        List<Map<String,String>> customerData = credentials.asMaps(String.class, String.class);
//        System.out.println(customerData);

        for(Map<String, String> each : customerData) {
            loginPage.username.sendKeys(each.get("username"));
            loginPage.password.sendKeys(each.get("password"));
            loginPage.loginButton.click();
        }
    }

    @Then("verify the application login is successful")
    public void verify_the_application_login_is_successful() {
        Assert.assertTrue(homePage.userID.isDisplayed());

    }

    @Then("verify the next page url contains login keyword")
    public void verify_the_next_page_url_contains_login_keyword() {


        ReusableMethods.waitFor(5);
        //Below Assertion fails
        //Assert.assertTrue(false);  //for make result false.  or like below:
        Assert.assertTrue((Driver.getDriver().getCurrentUrl().contains("login")));  //hooks take reports and take screenshot just the case is fail.
    }
}


//for report-->under xml-report-->default-cucumber-reports-html-->rigt click-->open in browser-->chrome-->at the bottom there is failed_scenario, click on it, there is a screenshot
/*
    How do you use collections in your framework?

    What is collections in JAVA? -> list, set, queue
    How did you use collections in your framework? -> I use collections when especially I need to store multiple test data . I use Collections
    when I try to get data form Excel, or DataTables. For example, I store the multiple login credentials in my excel sheet, and I use ExcelUtil
    class to get the data as a List. I actually have ExcelUtil class that has Java Codes to get the data from an excel sheet. And in that
    ExcelUtil we use collection, I can get the list of each column name, or I can get the list of data in different form.

    I also use collections when I expect multiple elements. For example findElements() method returns a List of WebElementList<WebElement>

    getWindowHandles returns set of string- Set<String>

    When I use Data Table in my cucumber framework, I use collections
        I can store the data that comes from DataTables as List<Map<String,String>>
        I can also store the data that comes from DataTables as List<List<String>> or Just List<String>

    I have Utils classes. In the util classes I used collection a lot. For example, I have Excel Util class
        When I get the column names of an excel sheet, I store column names in List<String>
        When I the data list from excel, I put data list in List<Map<String, String>>


 */
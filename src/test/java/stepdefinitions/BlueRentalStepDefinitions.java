package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

import pages.BlueRentalHomePage;
import utilities.Driver;

public class BlueRentalStepDefinitions {

    BlueRentalHomePage blueRentalHomePage = new BlueRentalHomePage();
    @Given("user is on the home page : {string}")
    public void user_is_on_the_home_page(String string) {
        Driver.getDriver().get(string);
    }
    @When("user navigates to login page")
    public void user_navigates_to_login_page() {
        blueRentalHomePage.homePageLoginButton.click();
    }
    @And("enters username : {string}")
    public void enters_username(String string) {
        blueRentalHomePage.email.sendKeys(string);
    }
    @And("enters password : {string}")
    public void enters_password(String string) {
        blueRentalHomePage.password.sendKeys(string);
    }
    @And("click on login button")
    public void click_on_login_button() {
        blueRentalHomePage.loginButton.click();
    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
        Assert.assertTrue(blueRentalHomePage.userIcon.isDisplayed());
    }
    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }


}
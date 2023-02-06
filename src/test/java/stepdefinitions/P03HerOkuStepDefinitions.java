package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.P03HerOkuAddRemovePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class P03HerOkuStepDefinitions {

    P03HerOkuAddRemovePage herOkuAddRemovePage = new P03HerOkuAddRemovePage();

    @Given("user is on the home page of : {string}")
    public void user_is_on_the_home_page_of(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("herokuappUrl"));
    }

    @Given("click the add element button")
    public void click_the_add_element_button() {

        herOkuAddRemovePage.addButton.click();

    }
    @Given("user waits {int} seconds")
    public void user_waits_seconds(Integer time) {
        ReusableMethods.waitFor(time);

    }
    @Then("waits until the Delete button is visible")
    public void waits_until_the_delete_button_is_visible() {
        ReusableMethods.waitForVisibility(herOkuAddRemovePage.deleteButton, 5);

    }
    @Then("verify Delete button is visible")
    public void verify_delete_button_is_visible() {
        Assert.assertTrue(herOkuAddRemovePage.deleteButton.isDisplayed());

//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(herOkuAddRemovePage.deleteButton));


    }
    @Then("click the Delete button")
    public void click_the_delete_button() {
        herOkuAddRemovePage.deleteButton.click();
    }
    @Then("verify Delete button is not visible")
    public void verify_delete_button_is_not_visible() {
        Assert.assertTrue(herOkuAddRemovePage.deleteList.isEmpty());
    }
    @Then("user close the page")
    public void user_close_the_page() {
        Driver.getDriver().close();
    }

}

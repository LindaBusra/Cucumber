package stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaHomePage;
import pages.MedunnaRomePage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MedunnaRoomStepDefinitions {

    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaRomePage medunnaRomePage = new MedunnaRomePage();
    @When("click on Items&Titles")
    public void clickOnItemsTitles() {
        ReusableMethods.waitFor(1);
        medunnaHomePage.itemsAndTitles.click();

    }

    @When("click on Room option")
    public void click_on_room_option() {
        ReusableMethods.waitFor(1);
        medunnaHomePage.roomOption.click();
    }
    @When("click on Create a new room button")
    public void click_on_create_a_new_room_button() {
        ReusableMethods.waitFor(1);
        medunnaRomePage.createANewRoomButton.click();

    }
    @When("enter {string} in Room Number input")
    public void enter_in_room_number_input(String roomNumber) {
        ReusableMethods.waitFor(1);
        medunnaRomePage.roomNumberInput.sendKeys(roomNumber);
    }
    @When("select Suit option from Room Type dropdown")
    public void select_suit_option_from_room_type_dropdown() {
        ReusableMethods.waitFor(1);
        new Select(medunnaRomePage.roomTypeDropdown).selectByIndex(3);          //suite is in index 3 in webside

    }
    @When("click on status checkbox")
    public void click_on_status_checkbox() {
        ReusableMethods.waitFor(1);
        medunnaRomePage.statusCheckbox.click();

    }
    @When("enter {string} in Price input")
    public void enter_in_price_input(String price) {
        ReusableMethods.waitFor(1);
        medunnaRomePage.priceInput.sendKeys(price);


    }
    @When("enter {string} in Description input")
    public void enter_in_description_input(String description) {
        ReusableMethods.waitFor(1);
        medunnaRomePage.decriptionInput.sendKeys(description);

    }
    @When("click on Save button")
    public void click_on_save_button() {
        ReusableMethods.waitFor(1);
        medunnaRomePage.saveButton.click();

    }
    @When("click on Created Date")
    public void click_on_created_date() {
        ReusableMethods.waitFor(1);
        medunnaRomePage.createdDate.click();

    }
    @Then("assert that room is created via {string}")
    public void assert_that_room_is_created_via(String roomNumber) {
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(medunnaRomePage.firstRoomNumber,5);
        assertEquals(roomNumber, medunnaRomePage.firstRoomNumber.getText());
    }



}

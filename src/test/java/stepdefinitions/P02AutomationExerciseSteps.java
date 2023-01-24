package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.P02AutoExerciseHomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class P02AutomationExerciseSteps {

    P02AutoExerciseHomePage autoExerciseHomePage = new P02AutoExerciseHomePage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    String fakerName = faker.name().fullName();
    String fakerEmail = faker.internet().emailAddress();
    String fakerPassword = faker.internet().password();




    @Given("Launch browser and Navigate to url {string}")
    public void launch_browser_and_navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("autoExUrl"));
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String expectedUrl = ConfigReader.getProperty("autoExUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Given("Click on Signup Login button")
    public void click_on_signup_login_button() {
        autoExerciseHomePage.signupLoginButton.click();

    }

    @Given("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(autoExerciseHomePage.newUserSignupText.isDisplayed());
    }

    @Given("Enter name and email address")
    public void enter_name_and_email_address() {
        actions.click(autoExerciseHomePage.nameInput).sendKeys(fakerName)
                .sendKeys(Keys.TAB)
                .sendKeys(fakerEmail).perform();

    }


    @Given("Click Signup button")
    public void click_signup_button() {
        autoExerciseHomePage.signupButton.click();
    }


    @Given("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {

        String expectedText = "ENTER ACCOUNT INFORMATION";
        String actualText = autoExerciseHomePage.enterAccountInformationText.getText();
        Assert.assertTrue(actualText.contains(expectedText));

    }


    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {

        actions.click(autoExerciseHomePage.titleMrRadioButton)
                .sendKeys(Keys.TAB)
                .sendKeys(fakerName)
                .sendKeys(Keys.TAB)
                .sendKeys(fakerPassword)
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("April")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB).perform();
    }


    @Given("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        autoExerciseHomePage.newsletterCheckBox.click();
//        actions.click(autoExerciseHomePage.newsletterCheckBox).sendKeys(Keys.TAB).perform();
    }

    @Given("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        autoExerciseHomePage.receiveSpecialOffers.click();
//        actions.click(autoExerciseHomePage.receiveSpecialOffers).sendKeys(Keys.TAB).perform();
    }


    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        actions.click(autoExerciseHomePage.firstNameInput).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB).sendKeys(faker.company().name())
                .sendKeys(Keys.TAB).sendKeys(faker.address().streetAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys("Australia")
                .sendKeys(Keys.TAB).sendKeys(faker.address().state())
                .sendKeys(Keys.TAB).sendKeys(faker.address().city())
                .sendKeys(Keys.TAB).sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .build().perform();

    }
    @Given("Click Create Account button")
    public void click_create_account_button() {

//        autoExerciseHomePage.createAccountButton.click();
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Given("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        Assert.assertTrue(autoExerciseHomePage.accountCreatedText.isDisplayed());
    }

    @Given("Click Continue button")
    public void click_continue_button() {
        autoExerciseHomePage.continueButton.click();
    }
    @Given("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(autoExerciseHomePage.loggenInAsText.isDisplayed());
    }
    @Given("Click Delete Account button")
    public void click_delete_account_button() {
        autoExerciseHomePage.deleteAccountButton.click();
    }
    @Given("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        autoExerciseHomePage.accountDeletedText.isDisplayed();
    }
    @Given("Close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        Driver.closeDriver();
    }


    @Given("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(autoExerciseHomePage.loginToYourAccountText.isDisplayed());
    }

    @Given("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        autoExerciseHomePage.loginEmail.sendKeys(ConfigReader.getProperty("autoExValidEmail"));
        autoExerciseHomePage.loginPassword.sendKeys(ConfigReader.getProperty("autoExValidPassword"));

    }
    @Given("Click login button")
    public void click_login_button() {
        autoExerciseHomePage.loginButton.click();
    }
    @Given("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        Assert.assertTrue(autoExerciseHomePage.deleteAccountText.isDisplayed());

    }


    @Given("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        autoExerciseHomePage.loginEmail.sendKeys(faker.internet().emailAddress());
        autoExerciseHomePage.loginPassword.sendKeys(faker.internet().password());
    }

    @Given("Verify error Your email or password is incorrect! is visible")
    public void verify_error_your_email_or_password_is_incorrect_is_visible() {

        Assert.assertTrue(autoExerciseHomePage.emailOrPassswordIncorrectText.isDisplayed());
    }

    @Given("Click Logout button")
    public void click_logout_button() {
        autoExerciseHomePage.logoutButton.click();
    }

    @Given("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        Assert.assertTrue(autoExerciseHomePage.signupLoginButton.isDisplayed());
    }


    @Given("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address() {
        autoExerciseHomePage.nameInput.sendKeys(ConfigReader.getProperty("autoExValidFullName"));
        autoExerciseHomePage.emailInput.sendKeys(ConfigReader.getProperty("autoExValidEmail"));
    }

    @Given("Verify error Email Address already exist! is visible")
    public void verify_error_email_address_already_exist_is_visible() {
        autoExerciseHomePage.signupButton.click();
        Assert.assertTrue(autoExerciseHomePage.emailAddressAlreadyExistText.isDisplayed());

    }

    @Given("Click on Contact Us button")
    public void click_on_contact_us_button() {
        autoExerciseHomePage.contactUsButton.click();
    }
    @Given("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
       Assert.assertTrue( autoExerciseHomePage.getInTouchText.isDisplayed());
    }
    @Given("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        actions.click(autoExerciseHomePage.contactUsNameInput).sendKeys(fakerName)
                .sendKeys(Keys.TAB)
                .sendKeys(fakerEmail)
                .sendKeys(Keys.TAB)
                .sendKeys("Anything")
                .sendKeys(Keys.TAB)
                .sendKeys("My message is so important")
                .perform();
    }
    @Given("Upload file")
    public void upload_file() {
        String filePath = System.getProperty("user.home") + "C:\\Users\\busra\\Documents\\AutoEx.docx";
        autoExerciseHomePage.uploadFileButton.sendKeys(filePath);
    }
    @Given("Click Submit button")
    public void click_submit_button() {
        autoExerciseHomePage.contactUsSubmitButton.click();
    }
    @Given("Click OK button")
    public void click_ok_button() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Given("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        Assert.assertTrue(autoExerciseHomePage.contactUsSuccessMessage.isDisplayed());
    }
    @Given("Click Home button and verify that landed to home page successfully")
    public void click_home_button_and_verify_that_landed_to_home_page_successfully() {
        autoExerciseHomePage.contactUsHomeButton.click();
        String expectedUrl = ConfigReader.getProperty("autoExUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }


    @Given("Click on Test Cases button")
    public void click_on_test_cases_button() {
        autoExerciseHomePage.testCasesButton.click();
    }

    @Given("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(autoExerciseHomePage.testCasesText.isDisplayed());
    }


    @Given("Click on Products button")
    public void click_on_products_button() {
        autoExerciseHomePage.productsButton.click();
    }

    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(autoExerciseHomePage.allProductsText.isDisplayed());
    }

    @Given("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertTrue(autoExerciseHomePage.productListElements.size() != 0);

    }

    @Given("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        autoExerciseHomePage.viewProductFirstElement.click();
    }

    @Given("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        String expectedUrl = ConfigReader.getProperty("autoExUrlFirstProduct");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Given("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(autoExerciseHomePage.productDetails.getText().contains("Category"));
        Assert.assertTrue(autoExerciseHomePage.productDetails.getText().contains("Availability"));
        Assert.assertTrue(autoExerciseHomePage.productDetails.getText().contains("Condition"));
        Assert.assertTrue(autoExerciseHomePage.productDetails.getText().contains("Brand"));
        Assert.assertTrue(autoExerciseHomePage.priceOfProduct.isDisplayed());
//        Assert.assertTrue(autoExerciseHomePage.productName.isDisplayed());   //It does not accept the web element !!

    }

        @Given("Enter product name in search input and click search button")
        public void enter_product_name_in_search_input_and_click_search_button() {
            autoExerciseHomePage.searchProductTextBox.sendKeys(ConfigReader.getProperty("autoExProductName"));
            //burdayimmmmm
        }

        @Given("Verify SEARCHED PRODUCTS is visible")
        public void verify_searched_products_is_visible() {

        }

        @Given("Verify all the products related to search are visible")
        public void verify_all_the_products_related_to_search_are_visible() {

        }


    }


//https://github.com/gokhanagar/Selenium/blob/master/Cucumber/src/test/resources/features/US001_autoExercise.feature
//https://github.com/gokhanagar/Selenium/blob/master/Cucumber/src/test/java/stepDefinitions/AutoExStepDefinitions.java
//https://github.com/gokhanagar/Selenium/blob/master/Cucumber/src/test/java/pages/AutoExPage.java
//https://github.com/gokhanagar/Selenium/blob/master/Cucumber/configuration.properties
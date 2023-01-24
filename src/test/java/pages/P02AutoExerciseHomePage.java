package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class P02AutoExerciseHomePage {

    public P02AutoExerciseHomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//*[.='New User Signup!']")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "//*[.='Enter Account Information']")
    public WebElement enterAccountInformationText;

    @FindBy(id = "id_gender1")
    public WebElement titleMrRadioButton;

    @FindBy(id = "newsletter")
    public WebElement newsletterCheckBox;

    @FindBy(id = "optin")
    public WebElement receiveSpecialOffers;

    @FindBy(id = "first_name")
    public WebElement firstNameInput;

//    @FindBy(xpath = "//button[data-qa='create-account']")
//    public WebElement createAccountButton;

    @FindBy(xpath = "//*[.='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[.=' Logged in as ']")
    public WebElement loggenInAsText;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//*[.='Account Deleted!']")
    public WebElement accountDeletedText;

    @FindBy(xpath = "//*[.='Login to your account']")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//input[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountText;

    @FindBy(xpath = "//*[.='Your email or password is incorrect!']")
    public WebElement emailOrPassswordIncorrectText;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement singUpLoginButton;

    @FindBy(xpath = "//*[.='Email Address already exist!']")
    public WebElement emailAddressAlreadyExistText;

    @FindBy(xpath = "//a[@href='/contact_us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//*[.='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactUsNameInput;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//input[@data-qa='submit-button']")
    public WebElement contactUsSubmitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement contactUsSuccessMessage;

    @FindBy(xpath = "//span[.=' Home']")
    public WebElement contactUsHomeButton;

    @FindBy(xpath = "//button[.='Test Cases']")
    public WebElement testCasesButton;

    @FindBy(xpath = "//b[.='Test Cases']")
    public WebElement testCasesText;

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;

    @FindBy(xpath = "//h2[.='All Products']")
    public WebElement allProductsText;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public List<WebElement> productListElements;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProductFirstElement;

    @FindBy(xpath = "//div[@class='product-details']")
    public WebElement productDetails;

    @FindBy(xpath = "//span[contains(text(), 'Rs')]")
    public WebElement priceOfProduct;

    @FindBy(xpath = "//h2[.='Blue Top']")
    public WebElement productName;

    @FindBy(id = "search_product")
    public WebElement searchProductTextBox;






}

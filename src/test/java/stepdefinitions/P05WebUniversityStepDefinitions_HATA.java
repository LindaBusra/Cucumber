package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.P05WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

public class P05WebUniversityStepDefinitions_HATA {

    //http://webdriveruniversity.com/

    P05WebUniversityPage webUniversityPage = new P05WebUniversityPage();

    @Then("{string} kadar asagi iner")
    public void kadar_asagi_iner(String string) throws AWTException {

//        Actions actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.ARROW_DOWN)
//                .sendKeys(Keys.ARROW_DOWN)
//                .sendKeys(Keys.ARROW_DOWN)
//                .sendKeys(Keys.ARROW_DOWN)
//                .sendKeys(Keys.ARROW_DOWN)
//                .sendKeys(Keys.ARROW_DOWN).build().perform();

        Robot robot = new Robot();
        robot.mouseWheel(5);

    }
    @Then("login portala tiklar")
    public void login_portala_tiklar() {
        webUniversityPage.loginPortal.click();
    }
    @Then("diger windowa gecer")
    public void diger_windowa_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }
    @Then("username {string} yazar")
    public void username_yazar(String username) {
        webUniversityPage.username.sendKeys(username);
    }
    @Then("password {string} yazar")
    public void password_yazar(String password) {
        webUniversityPage.password.sendKeys(password);
    }
    @Then("Login butonuna tiklar")
    public void login_butonuna_tiklar() {
        webUniversityPage.loginButton.click();
    }
    @Then("popup yazisinin {string} oldugunu test eder")
    public void popup_yazisinin_oldugunu_test_eder(String expectedText) {
        String actualText = Driver.getDriver().switchTo().alert().getText();
        ReusableMethods.waitFor(20);
        Assert.assertEquals(expectedText, actualText);
    }


    @Then("popupi ok ile kapatir")
    public void popupi_ok_ile_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("ilk sayfaya doner")
    public void ilk_sayfaya_doner() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }
    @Then("ilk sayfaya dondugunu test eder")
    public void ilk_sayfaya_dondugunu_test_eder() {
        Assert.assertTrue(webUniversityPage.loginPortal.isDisplayed());
    }


}

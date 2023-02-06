package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.security.Key;
import java.time.Duration;

public class DemoqaStepDefinitions {



    DemoqaPage demoqaPage = new DemoqaPage();
    Actions action = new Actions(Driver.getDriver());


    @Given("Elements butonuna tiklar")
    public void elements_butonuna_tiklar() {
        demoqaPage.elementsBolumu.click();
    }


    @Given("kullanici {int} sn bekler")
    public void kullanici_sn_bekler(Integer saniye) {
        ReusableMethods.waitFor(saniye);
    }

    @Then("Dynamic Properties'e tiklar")
    public void dynamic_properties_e_tiklar() throws AWTException {

//        Robot robot = new Robot();
//        robot.mouseWheel(5);

        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        demoqaPage.dynamicPropertiesButton.click();
    }



    @Then("Will enable five seconds butonuna tiklar")
    public void will_enable_five_sceonds_butonuna_tiklar() {
        demoqaPage.willEnable5SecondsButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(demoqaPage.visibleAfter5SecondsButton));
    }

    @Then("Will enable five seconds butonunun enable oldugunu test eder")
    public void will_enable_five_seconds_butonunun_enable_oldugunu_test_eder() {

        Assert.assertTrue(demoqaPage.willEnable5SecondsButton.isEnabled());
    }

    @Given("Alerts,Frame,Windows butonuna tiklar")
    public void alerts_frame_windows_butonuna_tiklar() {
        demoqaPage.alertsFrameWindowsBolumu.click();
    }

    @Given("Alerts'e tiklar")
    public void alerts_e_tiklar() {

        demoqaPage.alertsButton.click();
    }

    @Given("On button click, alert will appear after five seconds karsisindaki click me butonuna basar")
    public void on_button_click_alert_will_appear_after_five_seconds_karsisindaki_click_me_butonuna_basar() {
        demoqaPage.alertWillAppearAfterFiveSecondsButton.click();
    }

    @Given("Allert'in gorunur olmasini bekleyin")
    public void allert_in_gorunur_olmasini_bekleyin() {
       ReusableMethods.waitFor(6);

    }


    //---------------------------------HATA----------------------------------------------
    @Then("Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test edin")
    public void allert_uzerindeki_yazinin_this_alert_appeared_after_five_seconds_oldugunu_test_edin() {
        String actualText = Driver.getDriver().switchTo().alert().getText();    // we can use trim();
        System.out.println(actualText);
        String expectedText = "This alert appeared after 5 seconds";
        Assert.assertEquals(expectedText,actualText);
        

    }

    @Then("Ok yazisina tiklayarak alerti kapatin")
    public void ok_yazisina_tiklayarak_alerti_kapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }


}

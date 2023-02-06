package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.P06JqueryScriptPage;
import utilities.Driver;

public class P06JqueryScriptStepDefinitions {

    P06JqueryScriptPage jqueryScriptPage = new P06JqueryScriptPage();


    @Then("tum ikinci emoji ogelerini tikla")
    public void tum_ikinci_emoji_ogelerini_tikla() {
        WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@id='emoojis']"));
        Driver.getDriver().switchTo().frame(iframe);

        jqueryScriptPage.ikinciEmoji.click();

        for(int i=0; i<jqueryScriptPage.emojiler.size(); i++) {

            jqueryScriptPage.emojiler.get(i).click();
        }



    }

    @Then("ana iframe'e geri don")
    public void ana_iframe_e_geri_don() {
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("formu doldur ve uygula butonuna tikla")
    public void formu_doldur_ve_ugula_butonuna_tikla() {

        Actions actions = new Actions(Driver.getDriver());

        actions.click(jqueryScriptPage.text).sendKeys("Hello")
                .sendKeys(Keys.TAB).sendKeys("Smile")
                .sendKeys(Keys.TAB).sendKeys("Symbols")
                .sendKeys(Keys.TAB).sendKeys("Any")
                .sendKeys(Keys.TAB).sendKeys("Volleyball")
                .sendKeys(Keys.TAB).sendKeys("Ball")
                .sendKeys(Keys.TAB).sendKeys("Child")
                .sendKeys(Keys.TAB).sendKeys("NG")
                .sendKeys(Keys.TAB)
                .sendKeys(":)")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .build().perform();



    }
}

package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.P01AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P01AmazonSearchSteps {

    P01AmazonPage amazonPage = new P01AmazonPage();

    @Given("kullanici amazon anasayfasina")
    public void kullanici_amazon_anasayfasina() {

        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

    }

    @Then("kullanici iphone icin arama yapar")
    public void kullanici_iphone_icin_arama_yapar() {
        amazonPage.searchTextBox.sendKeys("iphone", Keys.ENTER);
    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarin_iphone_icerdigini_test_eder() {
       String expectedText = "iphone";
       String actualText =  amazonPage.searchResult.getText();
       Assert.assertTrue(actualText.contains(expectedText));

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici tea pot icin arama yapar")
    public void kullanici_tea_pot_icin_arama_yapar() {
        amazonPage.searchTextBox.sendKeys("tea pot", Keys.ENTER);
    }

    @Then("sonuclarin tea pot iceridigini test eder")
    public void sonuclarin_tea_pot_iceridigini_test_eder() {
        String expectedText = "tea pot";
        String actualText =  amazonPage.searchResult.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @Then("kullanici flower icin arama yapar")
    public void kullanici_flower_icin_arama_yapar() {
        amazonPage.searchTextBox.sendKeys("flower", Keys.ENTER);
    }

    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {
        String expectedText = "flower";
        String actualText =  amazonPage.searchResult.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    //------------------------------------------------------------

//    @Then("kullanici {string} icin arama yapar")
//    public void kullaniciIcinAramaYapar(String istenenKelime) {
//
//        amazonPage.searchTextBox.sendKeys(istenenKelime + Keys.ENTER);
//    }
//
//    @And("sonuclarin {string} icerdigini test eder")
//    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
//
//        String actualText = amazonPage.searchResult.getText();
//        String expectedText = istenenKelime;
//        Assert.assertTrue(actualText.contains(expectedText));
//    }
//
//    @Given("kullanici {string} anasayfasina")
//    public void kullaniciAnasayfasina(String istenenUrl) {
//
//        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
//    }
//
//    @Then("kullanici {int} saniye bekler")
//    public void kullaniciSaniyeBekler(int istenenSaniye) {
//
//        try {
//            Thread.sleep(istenenSaniye * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @And("url'in {string} icerdigini test eder")
//    public void urlInIcerdiginiTestEder(String istenenKelime) {
//        String actualUrl = Driver.getDriver().getCurrentUrl();
//        Assert.assertTrue(actualUrl.contains(istenenKelime));
//
//    }
//

}





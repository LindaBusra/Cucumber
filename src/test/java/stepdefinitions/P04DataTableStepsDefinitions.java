package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.P04DataTables;
import utilities.ConfigReader;
import utilities.Driver;

public class P04DataTableStepsDefinitions {

    P04DataTables dataTables = new P04DataTables();
    Actions actions = new Actions(Driver.getDriver());

//https://editor.datatables.net/

    @When("kullanici {string} anasayfasina")
    public void kullanici_anasayfasina(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTables.newButton.click();

    }

    @Then("tum bilgileri {string},{string},{string},{string},{string},{string},{string} girer")
    public void tum_bilgileri_girer(String firstName, String lastName, String position, String office, String extension, String startDate, String salary) {

        dataTables.firstName.sendKeys(firstName);
        dataTables.lastname.sendKeys(lastName);
        dataTables.position.sendKeys(position);
        dataTables.office.sendKeys(office);
        dataTables.extension.sendKeys(extension);
        dataTables.startDate.sendKeys(startDate);
        dataTables.salary.sendKeys(salary);

    }

    @Then("Create butonuna basar")
    public void create_butonuna_basar() {
        dataTables.createButton.click();

    }

    @When("kullanici ilk isim ile arama yapar {string}")
    public void kullanici_ilk_isim_ile_arama_yapar(String firstName) {
        dataTables.search.sendKeys(firstName + Keys.ENTER);
    }

    @Then("isim bolumunde isminin oldugunu dogrular {string}")
    public void isim_bolumunde_isminin_oldugunu_dogrular(String firstName) {
        Assert.assertTrue(dataTables.searchResult.getText().contains(firstName));

    }


    }


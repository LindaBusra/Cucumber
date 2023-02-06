package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome=false,   //true: on console text is black-white
        features = "./src/test/resources/features/seleniumgrid",    //it will work just for seleniumgrid
        glue = {"stepdefinitions"},
        dryRun = false,
        tags = "@grid_feature"

)
public class GridRunner {
}

//https://github.com/mozilla/geckodriver/releases/tag/v0.31.0

//features = "./src/test/resources/features"   -->it works for all of feature folders
//features = "./src/test/resources/features/seleniumgrid"  -->just for seleniumgrid
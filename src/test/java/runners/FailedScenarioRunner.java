package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//to run feil scenarious

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome=false,
        features = "@target/failedRerun.txt",
        glue = {"stepdefinitions", "hooks"},
        dryRun = false


)

public class FailedScenarioRunner {

}

//we should do create a runner that runs only the files that we will run again
//Everything is same with Runner class except :features = "./src/test/resources/features",     -->it wa iin main runner
/*
This runner class is used to run only failedRerun.txt file
That file only has failed scenarious if an scenario fails.
That file will be empty if no file scenario fails.
We do not use tag or path of the features folder

failedRerun.txt file-->it is empty when we run something. I store just the last scenario.
it will not keep history, it will first clear itself.

 */
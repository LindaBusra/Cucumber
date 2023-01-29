package utilities;

public class nots {

    /*
    What is cucumber?
    Cucumber is a testing framework. It is a BDD(Behaviour Driven Development) framework.
    BDD means we describe the behavior(functionality) in the feature file first, then write the code

    What is feature file?
    It is used to write test cases in Gherkin language. It has keywords like given, when , then,…This is plane English.

    What is Background?
    It is used for repeated PRE CONDITIONS. This runs before each Scenario keyword.

    What is Scenario:
    It is used to create test cases in feature files. I can use more than 1 scenario keyword in a future file.

    What is Feature:
    This is used to create a feature file. Each feature file must begin with a Feature keyword. They cannot be more than 1 Feature keyword in a feature file

    How do you run specific test cases in cucumber?
    We use runner class to run the test cases. We can run specific test scenarios or feature files using tags.

    What is dryRun in cucumber?
    To generate missing/unimplemented step definitions, we use dryRun=true. When I want to run test cases, I do dryRun=false.

    What is step definition in cucumber?
    Technical codes goes to step definition classes. We write the java code in these classes.

    How do you parametrize the feature files?How do you get the data from the feature file? How do you make the test cases more reusable in cucumber.What is your strategy?
    String “” makes the data dynamic. We can use Scenario Outline, data tables as well

    Feature file is not technical, but Step Definitions is technical


    Scenario Outline:
    What is it?
        It is used to run the same scenario with different data multiple times
        It must be followed by an Examples keyword. Examples keyword is used to pass data
        Scenario Outline is used for parametrizating of the feature files
        It is used to pass test data dynamically
        This is very common and use ful in cucumber
    Cucumber reports plugins

        We can easily generate cucumber reports using report plugins in the runner
        We can generate different reports such as HTML, json, and xml; but the most common one is the HTML report
DATA TABLES IN CUCUMBER
DataTables are user to pass test data
We especially use DataTables for passing multiple data
DataTables are similar to Scenario Outline
    Difference between DataTables and Scenario Outline?
            In DataTables No Examples keyword
            DataTables can be use in ANY STEP to provide data, but Examples keyword can ONLY be used at the end of the
            scenario to provide data
            In DataTables, use Scenario:
            In Scenario Outline: use Scenario Outline and Examples
            DataTables returns DataTables object in the method, so we have to use Collections to use them in the step
            definitions
            Scenario Outline returns a string in the method, so it is easier to get and use.
            DataTables are not as popular as Scenario Outline.

     */

     /*
     1. Datatables using a List<String>  list of string
     2. Datatables as List<List<String>>  List of list
     3. Datatables as List<Map<String,String>>  list of map


    Summary:
        Scenario Outline : Used for DDT. Very useful.Please LEARN and USE .
        Example keyword must be used
        Data Tables : Used for DDT. Not as common as Scenario Outline.
        We get data from any step from the feature file
        Use | | pipes in feature file steps to use data tables
        We can get data in different forms such as List<String, List<Map<String,List<List<String,…
     */

    //for create test reports, especially spark reports
    //https://www.extentreports.com/docs/versions/4/java/spark-reporter.html
}


@failed_tests
Feature: hooks_test

  Scenario: TC_01_test
    Given user is on "https://www.bluerentalcars.com/login" page
    And user enters customer_email and customer_password
      | username       | password |
      | jack@gmail.com | 12345    |
    Then verify the next page url contains login keyword


  Scenario: TC_02_test
    Given user is on "https://www.bluerentalcars.com/login" page
    And user enters customer_email and customer_password
      | username       | password |
      | jack@gmail.com | 12345    |
    Then verify the next page url contains login keyword


   #run this test. │ View your Cucumber Report at:                                            │
   #│ https://reports.cucumber.io/reports/b65f2d50-d6a5-45d2-bcc5-90eeef3929ad  clcik on that, there is a picture below
  #Login GitHub
  #Create collection
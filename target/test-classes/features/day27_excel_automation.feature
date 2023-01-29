@excel_customer_login
Feature:excel_login_feature

  Scenario: TC_customer_credentials_test

    Given user tries to login as "customer_info"
    Then verify the application login is successful
    Then capture the screenshot
    Then close the application

  @admin_excel
  Scenario: TC_admin_credentials_test

    Given user tries to login as "admin_info"
    Then verify the application login is successful
    Then capture the screenshot
    Then close the application



#    User Story:Test login functionality of the blue rental car app with 3 credentials
#    We stored all of the test data in excel
#    1-Then created feature file
#    2-Generated the step definitions and wrote the java code in the step definitions
# Given user tries to login as "customer" -->press CTRL and go over this...It takes you the step definitions.


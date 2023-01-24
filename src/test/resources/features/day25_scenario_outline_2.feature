@data_tables
Feature: data_tables

  Scenario Outline: TC_Create _And verify the test data creation

#    Crating a reusable step that accept url and goes to that url
    Given user is on "https://editor.datatables.net/" page
    And user clicks on the new button
    And user enters the first name "<firstname>"
    And user enters the last name "<lastname>"
    And user enters the position "<position>"
    And user enters office "<office>"
    And user enters extension "<extension>"
    And user enters start date "<start_date>"
    And user enters the salary "<salary>"
    And click on create button
    And search for the first name "<firstname>"
    Then verify the name field contains the first name "<firstname>"
    Then close the application

    Examples: test_data
      | firstname | lastname  | position    | office  | extension | start_date | salary   |
      | john      | smith     | tester      | NYC     | 2134      | 2023-01-23 | 80000    |
      | sam       | walton    | businessman | LA      | 5262      | 2023-01-24 | 2000000  |
      | nancy     | brown     | developer   | Dallas  | 2346      | 2023-01-25 | 85000    |
      | george    | bush      | politician  | Dallas  | 9931      | 2023-01-26 | 985000   |


# https://cucumber.io/docs/gherkin/reference/#scenario-outline    read this side

#STORY NAME: user should be able to create data
#AC: Given user is on the application
#And enter all fields
#Then user should be able to find the data with first name
#LINK: https://editor.datatables.net/


#When user go to
#https://editor.datatables.net/
#Click on the new button
#When user enters all fields
#When clicks create button
#And search for the first name
#Then verify the name fields contains first name
#NOTE: Try getting the test data in different forms:
# 1. Scenario outline
# 2. Data tables
# 3. Excel


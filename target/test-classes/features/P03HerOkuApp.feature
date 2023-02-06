@HerOkuApp_Test
Feature: US1010 HerOkuApp Delete Test

  Scenario: TC15_Delete button from herokuapp should work
    Given user is on the home page of : "herokuappUrl"
    And click the add element button
    And user waits 3 seconds
    Then waits until the Delete button is visible
    And verify Delete button is visible
    Then click the Delete button
    And verify Delete button is not visible
    And user close the page




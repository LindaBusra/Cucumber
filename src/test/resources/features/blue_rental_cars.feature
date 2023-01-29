@blue_rental_car
Feature: Blue_rental_car_homework1

  Scenario Outline: US167854_manager_login_test
    Given user is on the home page : "https://www.bluerentalcars.com/"
    When user navigates to login page
    And enters username : "<username>"
    And enters password : "<password>"
    And click on login button
    Then verify the login is successful
    Then user closes the browser



    Examples: test_datas
      | username                    | password |
      |sam.walker@bluerentalcars.com| c!fas_art|
      |kate.brown@bluerentalcars.com| tad1$Fas|
      |raj.khan@bluerentalcars.com| v7Hg_va^|
      |pam.raymond@bluerentalcars.com| Nga^g6!|



@MedunnaRoom
Feature: Medunna Room Creation

  Background: Sign in Medunna
    Given user is on "https://medunna.com" page
    When click on user icon
    And click on Sign In option
    And enter "john_doe" in username input
    And enter "John.123" in password input
    And click on Remember Me checkbox
    And click on Sign In submit button

  Scenario Outline:Create Room
  When click on Items&Titles
  And click on Room option
  And click on Create a new room button
  And enter "<room number>" in Room Number input
  And select Suit option from Room Type dropdown
  And click on status checkbox
  And enter "<prise>" in Price input
  And enter "<description>" in Description input
  And click on Save button
  And click on Created Date
  Then assert that room is created via "<room number>"
  Then close the application
    Examples:
      | room number | prise | description |
      | 9000020 | 500 | Room 1            |
      | 9000021 | 512 | My Resting Room   |
      | 9000022 | 550 | Good viewed       |
      | 9000023 | 560 | Need extra service |



#Background is precondition which runs before all scenarious
#just hover on items which are yellow, and click Create step definiton, and select your definiton class for it can be added. Select java!!!
#And enter "username" in username input -->we create definiton, after that we enter a username-->#And enter "john_doe" in username input -->
#And enter username in username input -->or I can send the value(john_doe) in i step definiton

  #"John.123"  --> normal parameterization
  # "<room number>"  parameterization for using senario outline (I will get values from Senario Outline"
  #Hover over "Scenario Outline" when it is red, select Create Examples section







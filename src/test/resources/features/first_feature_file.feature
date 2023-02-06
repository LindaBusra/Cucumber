
@google_search
Feature: first feature file

  Background: user_goes_to_google_page
    Given user is on the google home page

  @iphone_search
  Scenario: TC_01_iphone_search
  When user search for iPhone
  Then verify page title contains iPhone
  Then close the application

  @teapot_search
  Scenario: TC_02_teapot_search
    When user search for Teapot
    Then verify page title contains Teapot
    Then close the application



#  All feature files must begin with "Feature:" keyword
#  Feature : To declare the file as a cucumber feature file. Mandatory. There can be ONLY one Feature: keyword
#  Scenario : To create test case. In a feature file there may be more than one Scenario:
#  Runner : To run the feature files.
# Background: Used to run before each scenario. This is used for repeated pre-condition. Background is just for precondition-->which step is keep repeating before each scenario.
#  CUCUMBER STEPS:
#  1. create feature file and test scenarios
#  2. run the feature file and generate step definitions. dryRun=true
#  3. use the step definitions to complete the java code
#  4. dryRun=false to execute test cases
# It runs from top the bottom from feature
#Given-->i start, precondition,  When if it is action, Then at the end,

# @smoke and @fast -->Scenarious tagged with both @smoke and @fast
# @smoke or @fast -->Scenarious tagged with either @smoke or @fast
# @wip and not @slow -->Scenarious tagged with @wip that aren't also tagged with @slow
# @fast --> Scenarious tagged with @fast

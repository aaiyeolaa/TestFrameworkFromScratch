Feature: Test 1
  As a user of the site
  I want to confirm i can do certain things

  @test
  Scenario: //Check Output window
    Given a user navigate to https://dotnetfiddle.net/
    And a user click on run button
    Then the text Hello World is displayed in the Output Window

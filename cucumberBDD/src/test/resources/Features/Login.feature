Feature: login functionality Test

  Scenario: Check login with valid credentials
    Given User is login page
    When user enters valid username and password
    And clicks on login button
    Then user navigated to homepage

  Scenario: Check login with valid credentials
    Given User is login page
    When user enters invalid username and password
    And clicks on login button
    Then Error message displayed - invalid credentials

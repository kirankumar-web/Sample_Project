Feature: check with login fuctionality

  Scenario: validating login
    Given user is on login page
    When enter valid username and Password
    And press enter option
    Then user navigate to his account



Feature: Check login Functionality

  Scenario: vaidating login functinality
    Given user is login page
    When user enter valid login credentials
    And clicks on login
    Then user is on homepage

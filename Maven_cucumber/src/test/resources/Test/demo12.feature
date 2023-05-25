Feature: feature to test login functionality

  Scenario: Check login sucessfully with valid credentials
    Given user navigates to home page
    When user click on user details
    And clicks on save option
    Then user navigates to home page with created user

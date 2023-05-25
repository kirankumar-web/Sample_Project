Feature: verify login functionality
  
  Scenario: login sucessfull with valid credentials
    Given launch browser
    And User is on login page
    When user enter login credentials
    And press login button
    Then navigated to homescreen

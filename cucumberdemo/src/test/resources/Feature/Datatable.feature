Feature: login functionality of application

  Scenario: to validate login functionality
    Given user navigate to the Login URL
    When user enter login credential
      | username | password    |
      | student  | Password123 |
    And click on login button
    Then user navigates to homepage

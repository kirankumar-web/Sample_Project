Feature: login functionality of application

  Background: login to the application
    Given navigates to url
    When enter login credentials
      | username | password |
      | Admin    | admin123 |
    And click login button
    Then navigates home page

  Scenario: update the contact number
    When click on my info feature
    When enters the contact number
      | contactnumber |
      |      12345678 |
    And click on save button
    Then sucessfull message displayed

  Scenario: logout of the application
    When click-on my profile
    And click-on logout button
    Then navigate login application

Feature: Check google search functionality

  Scenario: Validate google search
    Given browser is open
    And user in on google search page
    When user enters a text in google search
    And clickon enter
    Then user navigated to search result page

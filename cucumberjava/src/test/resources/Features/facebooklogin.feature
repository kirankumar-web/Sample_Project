Feature: check login functonality

  Scenario: checking user account
    Given open the browser
    And navigate to login page
    When user enter username and password
    And clickon login button
    Then user acess to his account

Feature: validating login feature

  Scenario Outline: check login with multiple user credentials
    Given launch the browser
    And Navigate to login page
    When enter the valid <username> and <password>
    And click on login button
    Then Navigate to user homepage

    Examples: 
      | username | password |
      | kiran    |    12345 |
      | vicky    |    12345 |
      | mani     |    12345 |
      | madhu    |    12345 |

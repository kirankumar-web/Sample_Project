Feature: validate login page

  Scenario Outline: login with mutliple login credentials
    Given open the required browser
    And enter login page url
    When enter <username> and <password>
    And press the login button
    Then homepage is displayed

    Examples: 
      | username | password |
      | kiran    |    12345 |
      | kumar    |    12345 |
      | vicky    |    12345 |


# Page factory Feature page
Feature: login to swag application

  Scenario Outline: mutliple user to login
    Given lauch the browser
    And enter swag application url
    When enter valid <username> and <password>
    And press login button
    Then navigate to user account page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | standard_user | secret_sauce |
      | standard_user | secret_sauce |

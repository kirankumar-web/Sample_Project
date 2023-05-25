Feature: Feature to test feedback Functionality
  @smoketest
  Scenario: verification of feedback functionality
    Given the user navigates to javatpoint.com
    When the user clicks on feedback, it navigates to feedback page
    And the user Submit feedbaack message
    Then feedbback should received on the admin page
    And admin can reply to the user

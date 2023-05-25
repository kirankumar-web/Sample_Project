
Feature: Check HomePage Functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And Clicks on login button
    Then User navigated to homepage

  Scenario: Check logout link
    When user is on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    When User clickon dasboard link
    Then Quick launch toolbar is displayed



Feature: Login scenario with valid credentials

  Background:
    Given user should be in main web table login page

  Scenario: login scenario with valid credentials as a tester
    #Given user should be in main web table login page
    When user enters tester username
    And user enters tester password
    Then user should see url ending with orders


  Scenario: Login scenario with 2 params
    When user enters username "Test" Password "Tester" and logins
    Then user should see url contains order



  Scenario: login scenario using maps alternative practice
    When user enters below credentials
      | username | Test   |
      | Password | Tester |
    Then user should see url contains order
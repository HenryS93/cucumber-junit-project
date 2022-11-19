
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: For the scenarios in the feature file, user is expected to be on login page.
    # It is very similar to @BeforeMethod in TestNG
    # It runs before each Scenario in that specific feature file
    # The step we pass under the Background: Will execute only once before each step
#    Background: Will be applying to every step in the feature file
    Given user is on the library login page




  Scenario: Login as a librarian
#    Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard


    Scenario: Login as a student
#      Given user is on the library login page
      When user enters student username
      And user enters student password
      Then user should see dashboard

  Scenario: Login as a admin
#    Given user is on the library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard
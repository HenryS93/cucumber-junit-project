


Feature: Wikipedia Search Functionality and Verification
  User Story:
  As a user i should be able to search for Steve Jobs in Wikipedia and see information about Steve Jobs


  Background:
    Given user should be in the Wikipedia home page

  Scenario: Wikipedia Search Functionality Title Verification
    #Given user should be in the Wikipedia home page
    When user types Steve Jobs in the wiki search box
    And user clicks wiki search button
    Then user sees Steve Jobs is in wiki title

@smoke
  Scenario: Wikipedia Search Functionality Title Verification
    #Given user should be in the Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" is in wiki title


  Scenario Outline:
    #Given user should be in the Wikipedia home page
    When user types "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then user sees "<expectedTitle>" is in wiki title

    Examples:
      | searchValue       | expectedTitle     |
      | Steve Jobs        | Steve Jobs        |
      | Mia Khalifa       | Mia Khalifa       |
      | Nicole Anniston   | Nicole Anniston   |
      | Lena Paul         | Lena Paul         |
      | Sophie Dee        | Sophie Dee        |
      | Karma Rx          | Karma Rx          |
      | Ginna Michaels    | Ginna Michaels    |
      | Kendra Sunderland | Kendra Sunderland |



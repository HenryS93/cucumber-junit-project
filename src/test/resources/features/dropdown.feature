
Feature: Practice page dropdown options

  @smoke
  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

# To beutify the pipes above:
  # Mac: commmand _ options + L
  # Windows: control + alt + L

  # Whatever data we are looking for/Testing must be in pipes
  # Otherwise it will NOT work!
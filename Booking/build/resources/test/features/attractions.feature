#author: SaraPadilla
Feature: Search tourist attractions
  As a user, I need to know from which point to park a tourist attraction

  @SuccessfulSearchAttraction
  Scenario Outline: Find where the exit to the Disney attraction in Paris starts
    Given the user is in the attractions page
    When Search for attractions on the page
      | <destiny> |
      | destiny   |
    Then You should see the starting place
    Examples:
      | destiny |
      | Paris   |
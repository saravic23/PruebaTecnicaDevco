#author: saraPadilla
Feature: User register
  As a user, I need to login on the Booking page

  @Successfullogin
  Scenario Outline: Login succesful
    Given the user is in the login page
    When he enter the data
      | email   | password   |
      | <email> | <password> |
    Then he should see his <Pruebas QA>

    Examples:
      | email               | password   |
      | pruebasq6@gmail.com | P1999*sara |

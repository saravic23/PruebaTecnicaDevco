#author: saraPadilla
Feature: User actions
  As a user, I need to login and register on the Booking page

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


    @SuccessfullRegister
  Scenario Outline: Create new user succesful
    Given the user is in the login page
    When he enter the data for the register
      | email   | new_password   | confirm_password   |
      | <email> | <new_password> | <confirm_password> |
    Then he should see in his account a message <Tu cuenta>

    Examples:
      | email                    | new_password | confirm_password |
      | pruebaYopmail@gmail.com  | Pruebas*1892 | Pruebas*1892     |

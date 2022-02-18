#author: saraPadilla
Feature: User upload data
  As a user, I need to upload my personal information succesfull


  Background:
    Given the user is logged in the page and is in manage my account
      | email               | password   |
      | pruebasq6@gmail.com | P1999*sara |

  @Successpdate
  Scenario: upload personal information succesfull

    When he upload his information
      | name | phone       | gender | date       |
      | QA     | 31116754889 | F      | 27-11-1986 |


    Then he should see the succefull message


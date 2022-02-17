#author: Sara Padilla
Feature: search accommodation
  As a user, I need to search a accomodation close to the city center successfully

  Background:
    Given The user is on the reservation website and enters the accommodation search parameters
      | destiny | checkin    | checkout   |
      | Cali    | 09/08/2022 | 09/10/2022 |
  @SuccesfullAcommodation
  Scenario Outline: Find accommodation that is close to the city center successfully
    When he enters filter <filter>
    Then you will see an accommodation that the first option is less than one km from the city center
    Examples:
       | filter                                 |
       | Distancia desde el centro de la ciudad |

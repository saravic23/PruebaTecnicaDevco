#author: Sara Padilla
Feature: Book accomodation
  As a user, I need to book a accomodation in booking

  Background:
    Given The user is on the reservation website and enters the accommodation search parameters
      | destiny      | checkin    | checkout   | adults | kids
      | Eje Cafetero | 2022-03-09 | 2022-03-14 | 1      | 0


  Scenario: book accomodation succesfull
    When The diligence all the fields to reserve the accommodation
      | name            | lastname         | email                | phone      | typeCard | cardNumber       |
      | Felipe Cardenas | Rodrigrz Cardona | pruebasQa6@gmail.com | 3163378765 | visa     | 4148510107979729 |
    Then You should see the Complete Reservation button
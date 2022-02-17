#author: Sara Padilla
Feature: Book accomodation
  As a user, I need to book a accomodation in booking

  Background:
    Given The user is on the reservation website and enters the accommodation search parameters
      | destiny      |
      | Eje Cafetero |

  Scenario: book accomodation succesfull
    When The diligence all the fields to reserve the accommodation
      | destiny      | adults | kids | name            | lastname         | email                | phone      | typeCard | cardNumber       |
      | Eje Cafetero | 1      | 0    | Felipe Cardenas | Rodrigrz Cardona | pruebasQa6@gmail.com | 3163378765 | visa     | 4148510107979729 |
    Then You should see the Complete Reservation button
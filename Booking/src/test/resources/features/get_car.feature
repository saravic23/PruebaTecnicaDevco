Feature: A


  Background:
    Given The user is on the rental page  and enters the pickup location
      | pickup                 |
      | Eje Cafetero, Colombia |


  Scenario:Consult of medium car with space for three suitcases  succesfully
    When the user enter the filters
      | car              |
      | Vehículo pequeño |

    Then He should see the Chevrolet Spark car
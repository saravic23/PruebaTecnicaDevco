Feature: Search Article
  As a user, I need to search article to food

  Background:
    Given The user is on the Articles website

  Scenario:
    When  Search an article about the category
      | category |
      | comida   |
    Then he should see the articles of food

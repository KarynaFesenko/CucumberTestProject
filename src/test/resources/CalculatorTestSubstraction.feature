@subtraction_tests
Feature: calculator subtraction tests
  Background:
    Given Calculator is started work

  Scenario: user tries to get result of two numbers subtraction
    When FirstNumber equals 24
    And SecondNumber equals 6
    Then the resultSubtraction should be equal 18

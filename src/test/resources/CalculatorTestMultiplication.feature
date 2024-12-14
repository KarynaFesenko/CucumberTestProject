@multiplication_tests
Feature: calculator multiplication tests

  Background:
    Given Calculator is started working

  Scenario: user tries to get result of two numbers multiplication
    When firstNumber Multiplication equals 6
    And secondNumber Multiplication equals 7
    Then the resultMultiplication should be equal 42



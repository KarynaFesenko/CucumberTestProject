@division_test
Feature: calculator division tests
  Background:
    Given : calculator is started working

  Scenario Outline: user tries to get result of two numbers division
    When firstNumber equals <firstNum>
    And secondNumber equals <secondNum>
    Then the resultDivision should be equal <expectedResult>
    Examples:
      | firstNum | secondNum | expectedResult  |
      | 55       | 5         | 11              |
      | 18       | 2         | 9               |
      | 72       | 9         | 8               |
      | 44       | 44        | 1              |

  Scenario: user tries to get result of two numbers division
    When firstNumber equals 24
    And secondNumber equals 6
    Then the resultDivision should be equal 4

  Scenario: user tries to get result of two big numbers division
    When firstNumber equals 500
    And secondNumber equals 10
    Then the resultDivision should be equal 50




@addition_tests
Feature: calculator addition tests
  Background:
    Given Calculator app is up and running
  Scenario Outline: user tries to get result of two numbers addition

    When first number equals <firstNum>
    And second number equals <secondNum>
    Then the result should be equal <expectedResult>
    Examples:
      | firstNum | secondNum | expectedResult |
      | 3        | 2         | 5              |
      | 500      | 400       | 900            |
      | 0        | 400       | 400            |
      | -400     | 500       | 100            |

  Scenario: user tries to get result of two big numbers addition
    When first number equals 400
    And second number equals 500
    Then the result should be equal 900


  Scenario: user tries to get result of two negative numbers addition
    When first number equals -400
    And second number equals 500
    Then the result should be equal 100

  Scenario: user tries to get result of 0 numbers addition
    When first number equals 0
    And second number equals 500
    Then the result should be equal 500


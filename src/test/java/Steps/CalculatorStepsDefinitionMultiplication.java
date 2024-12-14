package Steps;

import App.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorStepsDefinitionMultiplication {
    private Calculator calculator;
    int firstNum;
    int secondNum;

    @Given("Calculator is started working")
    public void calculatorIsStartedWorking() {
        calculator = new Calculator();
        System.out.println("Calculator is started working");
    }


    @When("firstNumber Multiplication equals {int}")
    public void firstnumberMultiplicationEquals(int num) {
        firstNum = num;
        System.out.println("The first num is received " + num);
    }

    @And("secondNumber Multiplication equals {int}")
    public void secondnumberMultiplicationEquals(int num) {
        secondNum = num;
        System.out.println("The first num is received " + num);
    }

    @Then("the resultMultiplication should be equal {int}")
    public void theResultMultiplicationShouldBeEqual(int expectedResult) {
        int actualResult=calculator.multiplication(firstNum,secondNum);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}



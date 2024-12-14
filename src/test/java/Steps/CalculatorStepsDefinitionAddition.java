package Steps;

import App.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorStepsDefinitionAddition {
    private Calculator calculator;
    int firstNum;
    int secondNum;

    @Given("Calculator app is up and running")
    public void calculatorAppIsUpAndRunning() {
        calculator = new Calculator();
        System.out.println("App.Calculator was turn on");
    }

    @When("first number equals {int}")
    public void firstNumberEquals(int num) {
        firstNum = num;
        System.out.println("The first num is received" + num);
    }

    @And("second number equals {int}")
    public void secondNumberEquals(int num) {
        secondNum = num;
        System.out.println("The second num is received" + num);
    }

    @Then("the result should be equal {int}")
    public void theResultShouldBeEqual(int expectedResult) {
        int actualResult=calculator.addTwoNumbers(firstNum,secondNum);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}

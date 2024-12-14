package Steps;

import App.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorStepsDefinitionDivision {
    private Calculator calculator;
    int firstNum;
    int secondNum;

    @Given(": calculator is started working")
    public void calculatorIsStartedWorking() {
        calculator = new Calculator();
        System.out.println("Calculator is started working");
    }

    @When("firstNumber equals {int}")
    public void firstnumberEquals(int num) {
        firstNum = num;
        System.out.println("The first num is received" + num);
    }

    @And("secondNumber equals {int}")
    public void secondnumberEquals(int num) {
        secondNum = num;
        System.out.println("The second num is received" + num);
    }

    @Then("the resultDivision should be equal {int}")
    public void theResultDivisionShouldBeEqual(int expectedResult) {
        int actualResult = calculator.division(firstNum, secondNum);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}

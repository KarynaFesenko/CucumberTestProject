package Steps;

import App.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorStepsDefinitionSubtraction {
    private Calculator calculator;
    int firstNum;
    int secondNum;


    @Given("Calculator is started work")
    public void calculatorIsStartedWork() {
        calculator = new Calculator();
        System.out.println("App.Calculator was turn on");
    }

    @When("FirstNumber equals {int}")
    public void firstnumberEquals(int num) {
        firstNum = num;
        System.out.println("The second num received is" + num);

    }

    @And("SecondNumber equals {int}")
    public void secondnumberEquals(int num) {
        secondNum = num;
        System.out.println("The second num received is " + num);

    }

    @Then("the resultSubtraction should be equal {int}")
    public void theResultSubtractionShouldBeEqual(int expectedResult) {
        int actualResult=calculator.subtraction(firstNum,secondNum);
        Assertions.assertEquals(expectedResult, actualResult);

    }
}

package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before ("@addition_tests")
    public void beforeHook(){
        System.out.println("This hook will run before the scenario");
    }

    @After ("@addition_tests")
    public void afterHook(){
        System.out.println("This hook will run after the scenario");
    }

    @Before ("@subtraction_tests")
    public void beforeSubtractionHook(){
        System.out.println("This hook will run before the scenario");
    }

    @After ("@subtraction_tests")
    public void afterSubtractionHook(){
        System.out.println("This hook will run after the scenario");
    }
}

package Steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/kirankumaryadav/eclipse/selenium/democucumber/democucumber/src/test/resources/Feature/HookLogin.feature", 
glue= {"/Users/kirankumaryadav/eclipse/selenium/democucumber/democucumber/src/test/java/StepsforHooks"})


public class HookTestRunner {

}

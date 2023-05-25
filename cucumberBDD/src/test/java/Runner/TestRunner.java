package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//run with no.of features, classes
@CucumberOptions(features="src/test/resources/Features/Login.feature",
glue= "Steps"
		)
public class TestRunner 
{

}

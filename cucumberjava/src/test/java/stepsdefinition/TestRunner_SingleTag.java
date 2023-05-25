package stepsdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//run with no.of features, classes
@CucumberOptions(features="src/test/resources/FeaturewithTags",glue= "stepsdefinition",
     monochrome = true,
     tags="@Smoke or @Regression or @integression"
		)

public class TestRunner_SingleTag {

}

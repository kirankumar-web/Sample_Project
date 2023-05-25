

package stepsdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//create runner class //
@RunWith(Cucumber.class)
//run with no.of features, classes
@CucumberOptions(features="/Users/kirankumaryadav/eclipse/selenium/cucumberjava/src/test/resources/FeaturewithTags/Backgroundsample.feature",
   glue= {"StepsforBackground"}
  )
      
public class TestRunnerforBackgroundSample
{

}

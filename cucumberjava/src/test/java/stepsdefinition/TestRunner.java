package stepsdefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//create runner class //
@RunWith(Cucumber.class)
// run with no.of features, classes
@CucumberOptions(features="src/test/resources/Features",glue= {"stepsdefinition"},
        monochrome = true,
        //create reports in Junit, html, json
        plugin = {"pretty","junit:target/JUNITreports/reports.xml"}
       //,*plugin = {"pretty","html:target/HTMLReports/reports.html"}
       //* plugin = {"pretty","json:target/JSONreport/report.json"}
        //* use tag to execute feature based on the confition
        //tags="@smoketest"
		)

public class TestRunner 
{
  
}

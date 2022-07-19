package StepDefinations2;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/parameterization.feature",glue= {"StepDefinations2"},
monochrome=true,
plugin= {"pretty", "html:reports/htmlReports/html",
"json:reports/JsonReports/Cucumber.json",
"junit:reports/junitReports/report.xml"})
public class TestRunnerParameter {

}

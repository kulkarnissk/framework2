package stepsForBackground;
import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//stepsForBackground

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/backGroundDemo.feature",glue= {"abcd"},
monochrome=true,
plugin= {"pretty", "html:reports/htmlReports/html",
"json:reports/JsonReports/Cucumber.json",
"junit:reports/junitReports/report.xml"})

public class testRunnerForBackground {

}

package demotest.cukes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "test/resources/Feature/Employee_Portal_Sprint_1.feature",
        glue = {"demotest.stepdefinition", "demotest.util"},
        format = {"json:cucumber-html-reports/cucumber.json",
                "html:cucumber-html-reports/MySample"},tags = {"@EVS-551,@EVS-552,@EVS-703,@EVS-704"},monochrome = true
)

public class SmokeModuleCukesTest {

}

package demotest.cukes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "test/resources/Feature/Employee_Portal_Sprint_1.feature",
        glue = {"demotest.stepdefinition", "demotest.util"},tags = {"@EVS-825,@EVS-826,@EVS-562,@EVS-714,@EVS-829,@EVS-834,@EVS-557,@EVS-701"},
        format = {"json:cucumber-html-reports/cucumber.json",
                "html:cucumber-html-reports/MySample"},monochrome = true
)
//tags = {"@EVS-825,@EVS-826,@EVS-562,@EVS-714,@EVS-829,@EVS-834,@EVS-557,@EVS-701"},
public class SmokeModuleCukesTest {

}
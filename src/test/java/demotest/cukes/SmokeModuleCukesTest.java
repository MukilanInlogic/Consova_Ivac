package demotest.cukes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "test/resources/Feature/Smoke_Module.feature",
        glue = {"demotest.stepdefinition","demotest.util"},
        format = {"json:cucumber-html-reports/cucumber.json",
                "html:cucumber-html-reports/MySample"},tags = {"@MT-83052"},monochrome = true
)

public class SmokeModuleCukesTest
{

}


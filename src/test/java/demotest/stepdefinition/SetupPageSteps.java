package demotest.stepdefinition;

import commonpage.toolbox.Browser;
import commonpage.toolbox.Sync;
import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.Repository.SetupPageUI;
import demotest.util.ActionContainer;
import org.junit.Test;
import org.openqa.selenium.Alert;

import static org.junit.Assert.assertTrue;

public class SetupPageSteps {

    private ActionContainer actionContainer;

    public SetupPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

}

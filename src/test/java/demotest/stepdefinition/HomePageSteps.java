package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;

import static org.junit.Assert.assertTrue;

public class HomePageSteps {
    private ActionContainer actionContainer;
    public HomePageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }



    @Then("^I should see home page of Managemyhealth$")
    public void iShouldSeeHomePageOfManagemyhealth() throws Throwable {
        assertTrue(actionContainer.homePageActions.verifyHomePage());
    }

    @And("^I click Logout button$")
    public void iClickLogoutButton() throws Throwable {
        assertTrue(actionContainer.homePageActions.clickLogoutBtn());
    }


    @Then("^I should see SetUpmenu$")
    public void iShouldSeeSetUpmenu() throws Throwable {
        assertTrue(actionContainer.homePageActions.verifySetupMenu());
    }

    @Then("^I sholuld see (.*) Header in left pane$")
    public void iSholuldSeeHeaderHeaderInLeftPane(String strHeader) throws Throwable {
        assertTrue(actionContainer.homePageActions.verifyHeaderInLeftPane(Testdata.getValue(strHeader)));
    }

    @Then("^I sholuld see Inbox widget defaultly available$")
    public void iSholuldSeeInboxWidgetDefaultlyAvailable() throws Throwable {
        assertTrue(actionContainer.homePageActions.verifyInboxwidget());
    }

    @When("^I Click My Account Main Menu$")
    public void iClickMyAccountMainMenu()throws Throwable {
        assertTrue(actionContainer.homePageActions.clickMyAccountMenu());
    }

}

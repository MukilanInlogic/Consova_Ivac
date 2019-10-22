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
    public void iShouldSeeHomePageOfManagemyhealth(){
        assertTrue(actionContainer.homePageActions.verifyHomePage());
    }

    @And("^I click Logout button$")
    public void iClickLogoutButton(){
        assertTrue(actionContainer.homePageActions.clickLogoutBtn());
    }


    @Then("^I should see SetUpmenu$")
    public void iShouldSeeSetUpmenu(){
        assertTrue(actionContainer.homePageActions.verifySetupMenu());
    }

    @Then("^I should see (.*) Header in left pane$")
    public void iShouldSeeHeaderHeaderInLeftPane(String strHeader){
        assertTrue(actionContainer.homePageActions.verifyHeaderInLeftPane(Testdata.getValue(strHeader)));
    }

    @Then("^I should see Inbox widget defaultly available$")
    public void iShouldSeeInboxWidgetDefaultlyAvailable(){
        assertTrue(actionContainer.homePageActions.verifyInboxwidget());
    }

    @When("^I Click My Account Main Menu$")
    public void iClickMyAccountMainMenu(){
        assertTrue(actionContainer.homePageActions.clickMyAccountMenu());
    }

    @And("^I click Provider Inbox link$")
    public void iClickProviderInboxLink(){
        assertTrue(actionContainer.homePageActions.clickProviderInboxMenu());
    }
}

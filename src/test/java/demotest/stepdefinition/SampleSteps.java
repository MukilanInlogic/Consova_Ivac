package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class SampleSteps {

    private ActionContainer actionContainer;

    public static String strSystemCodesSaveButtonColorValue;
    public static String strSystemCodesCancelButtonColorValue;

    public SampleSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }


    @Given("^I am on manage my health home page$")
    public void iAmOnManageMyHealthHomePage() throws Throwable {
        assertTrue(actionContainer.SampleActions.clickSecureLoginBtn());
    }


    @And("^I Enter (.*) in User name textbox$")
    public void iEnterUserNameInUserNameTextbox(String strUserName) throws Throwable {
        assertTrue(actionContainer.SampleActions.enterUserNameInMMH(Testdata.getValue(strUserName)));
    }

    @And("^I Enter (.*) in password textbox$")
    public void iEnterPasswordInPasswordTextbox(String strPassword) throws Throwable {
        assertTrue(actionContainer.SampleActions.enterPasswordInMMH(Testdata.getValue(strPassword)));

    }


    @When("^I click Login button$")
    public void iClickLoginButton() throws Throwable {
        assertTrue(actionContainer.SampleActions.clickLoginBtn());

    }

    @Then("^I should see home page of Managemyhealth$")
    public void iShouldSeeHomePageOfManagemyhealth() throws Throwable {
        assertTrue(actionContainer.SampleActions.verifyHomePage());
    }

    @And("^I click Logout button$")
    public void iClickLogoutButton() throws Throwable {
        assertTrue(actionContainer.SampleActions.clickLogoutBtn());
    }


    @Then("^I should see SetUpmenu$")
    public void iShouldSeeSetUpmenu() throws Throwable {
        assertTrue(actionContainer.SampleActions.verifySetupMenu());
    }

    @Then("^I sholuld see (.*) Header in left pane$")
    public void iSholuldSeeHeaderHeaderInLeftPane(String strHeader) throws Throwable {
        assertTrue(actionContainer.SampleActions.verifyHeaderInLeftPane(Testdata.getValue(strHeader)));
    }

    @And("^I Enter (.*), (.*) valid credentials in Manage my health page$")
    public void iEnterUserNamePasswordValidCredentialsInManageMyHealthPage(String strUserName, String strPassword) throws Throwable {
        assertTrue(actionContainer.SampleActions.enterUserNameInMMH(Testdata.getValue(strUserName)));
        assertTrue(actionContainer.SampleActions.enterPasswordInMMH(Testdata.getValue(strPassword)));
    }


    @Then("^I sholuld see Inbox widget defaultly available$")
    public void iSholuldSeeInboxWidgetDefaultlyAvailable() throws Throwable {
        assertTrue(actionContainer.SampleActions.verifyInboxwidget());
    }

    @When("^I Click My Account Main Menu$")
    public void iClickMyAccountMainMenu()throws Throwable {
        assertTrue(actionContainer.SampleActions.clickMyAccountMenu());
    }

    @Then("^I sholuld see My Account page$")
    public void iSholuldSeeMyAccountPage()throws Throwable {
        assertTrue(actionContainer.SampleActions.verifyMyAccountPage());
    }
}

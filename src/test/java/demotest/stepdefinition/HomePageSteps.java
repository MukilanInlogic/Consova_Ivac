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
    public void iShouldSeeHomePageOfManagemyhealth() {
        assertTrue(actionContainer.homePageActions.verifyHomePage());
    }

    @And("^I click Logout button$")
    public void iClickLogoutButton() {
        assertTrue(actionContainer.homePageActions.clickLogoutBtn());
    }


    @Then("^I should see SetUpmenu$")
    public void iShouldSeeSetUpmenu() {
        assertTrue(actionContainer.homePageActions.verifySetupMenu());
    }

    @Then("^I should see (.*) Header in left pane$")
    public void iShouldSeeHeaderHeaderInLeftPane(String strHeader) {
        assertTrue(actionContainer.homePageActions.verifyHeaderInLeftPane(Testdata.getValue(strHeader)));
    }

    @Then("^I should see Inbox widget defaultly available$")
    public void iShouldSeeInboxWidgetDefaultlyAvailable() {
        assertTrue(actionContainer.homePageActions.verifyInboxwidget());
    }

    @When("^I Click My Account Main Menu$")
    public void iClickMyAccountMainMenu() {
        assertTrue(actionContainer.homePageActions.clickMyAccountMenu());
    }

    @And("^I click Provider Inbox link$")
    public void iClickProviderInboxLink() {
        assertTrue(actionContainer.homePageActions.clickProviderInboxMenu());
    }

    @And("^I click Patient Inbox link$")
    public void iClickPatientInboxLink() {
        assertTrue(actionContainer.homePageActions.clickPatientInboxMenu());
    }

    @And("^I click Calender link$")
    public void iClickCalenderLink() {
        assertTrue(actionContainer.homePageActions.clickCalenderMenu());
    }

    @When("^I click Journal link$")
    public void iClickJournalLink() {
        assertTrue(actionContainer.homePageActions.clickJournalMenu());
    }

    @And("^I click Practice link$")
    public void iClickPracticeLink() {
        assertTrue(actionContainer.homePageActions.clickPracticeMenu());
    }

    @And("^I Click Clinical Menu$")
    public void iClickClinicalMenu() {
        assertTrue(actionContainer.homePageActions.clickClinicalMenu());
    }

    @When("^I click Appointment inbox Menu$")
    public void iClickAppointmentInboxMenu() {
        assertTrue(actionContainer.homePageActions.clickAppointmentinbox());
    }

    @And("^I click Downloads Menu$")
    public void iClickDownloadsMenu() {
        assertTrue(actionContainer.homePageActions.clickDownloadsMenu());
    }

    @And("^I click Setup Menu$")
    public void iClickSetupMenu() {
        assertTrue(actionContainer.homePageActions.clickSetupMenu());
    }

    @When("^I click Setup E-services Menu$")
    public void iClickSetupEServicesMenu() throws Throwable {
        assertTrue(actionContainer.homePageActions.clickSetupEservices());

    }

    @And("^I click Group Mail Menu$")
    public void iClickGroupMailMenu() {
        assertTrue(actionContainer.homePageActions.clickGroupMail());
    }

    @When("^I click MyPractice Menu$")
    public void iClickMyPracticeMenu() {
        assertTrue(actionContainer.homePageActions.clickMyPractice());
    }

    @Then("^User logout the application$")
    public void userLogoutTheApplication() {
        assertTrue(actionContainer.loginPageActions.verifyLogoutSuccess());
    }
}

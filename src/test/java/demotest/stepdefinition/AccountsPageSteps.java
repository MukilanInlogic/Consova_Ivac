package demotest.stepdefinition;

import commonpage.toolbox.Alert;
import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class AccountsPageSteps {
    private ActionContainer actionContainer;

    public AccountsPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }


    @Then("^I should see My Account page$")
    public void iShouldSeeMyAccountPage() throws Throwable {
        assertTrue(actionContainer.accountsPageActions.verifyMyAccountPage());
    }

    @When("^I Click My Health Center tab in the My Account Page$")
    public void iClickMyHealthCenterTabInTheMyAccountPage() throws Throwable {
        assertTrue(actionContainer.accountsPageActions.clickMyHealthCentresTab());
    }

    @Then("^Administrative Staff is present in the My Health Center Tab$")
    public void administrativeStaffIsPresentInTheMyHealthCenterTab() throws Throwable {
        assertTrue(actionContainer.accountsPageActions.verifyClinicalStaffPresentasRole());
    }

    @When("^I click Access Information Tab$")
    public void iClickAccessInformationTab() throws Throwable {
        assertTrue(actionContainer.accountsPageActions.clickAccessInformationTab());
    }

    @Then("^Access Information tab opened$")
    public void accessInformationTabOpened() throws Throwable {
        assertTrue(actionContainer.accountsPageActions.verifyAccessInformationPage());
    }

    @When("^I click Emergency Contacts Tab$")
    public void iClickEmergencyContactsTab() throws Throwable {
        assertTrue(actionContainer.accountsPageActions.clickEmergencyContactsTab());
    }

    @Then("^Emergeny Contacts tab opened$")
    public void emergenyContactsTabOpened() throws Throwable {
        assertTrue(actionContainer.accountsPageActions.verifyEmergencyContactsPage());
    }

    @And("^click Add icon the Emergency contact Tab$")
    public void clickAddIconTheEmergencyContactTab() throws Throwable {
        assertTrue(actionContainer.accountsPageActions.clickAddEmergencyContacts());
    }


    @And("^Enter the required details in the Emergency contacts tab: (.*), (.*), (.*), (.*)$")
    public void enterTheRequiredDetailsInTheEmergencyContactsTabFirstNameMobilePhoneRelationshipLastName(String strFirstName, String strMobilePhone, String strRelationship, String strLastName) throws Throwable {
        assertTrue(actionContainer.accountsPageActions.enterFirstNameInAddEmergencyContacts(Testdata.getValue(strFirstName)));
        assertTrue(actionContainer.accountsPageActions.enterMobilePhoneInAddEmergencyContacts(Testdata.getValue(strMobilePhone)));
        assertTrue(actionContainer.accountsPageActions.enterRelationshipInAddEmergencyContacts(Testdata.getValue(strRelationship)));
        assertTrue(actionContainer.accountsPageActions.enterLastNameInAddEmergencyContacts(Testdata.getValue(strLastName)));
        assertTrue(actionContainer.accountsPageActions.clickSaveEmergencyContacts());
    }

    @Then("^I should see added emergency contacts in the Emergency Contacts tab$")
    public void iShouldSeeAddedEmergencyContactsInTheEmergencyContactsTab() throws Throwable {
        assertTrue(actionContainer.accountsPageActions.verifyEmergencyContactsAdded());
    }

    @And("^Delete the Emergency Contacts$")
    public void deleteTheEmergencyContacts() throws Throwable{
        assertTrue(actionContainer.accountsPageActions.clickDeleteEmergencyContacts());
        assertTrue(actionContainer.accountsPageActions.AcceptAlert());
    }

    @And("^I click Update Profile$")
    public void iClickUpdateProfile() throws Throwable{
        assertTrue(actionContainer.accountsPageActions.clickUpdateProfile());

    }

    @Then("^I see Update Profile page$")
    public void iSeeUpdateProfilePage() throws Throwable {
        assertTrue(actionContainer.accountsPageActions.verifyUpdateProfilePage());

    }
}

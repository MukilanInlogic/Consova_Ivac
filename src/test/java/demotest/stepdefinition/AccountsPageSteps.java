package demotest.stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;

import static org.junit.Assert.assertTrue;

public class AccountsPageSteps {
    private ActionContainer actionContainer;
    public AccountsPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }



    @Then("^I sholuld see My Account page$")
    public void iSholuldSeeMyAccountPage()throws Throwable {
        assertTrue(actionContainer.accountsPageActions.verifyMyAccountPage());
    }

    @When("^I Click My Health Center tab in the My Account Page$")
    public void iClickMyHealthCenterTabInTheMyAccountPage()throws Throwable {
        assertTrue(actionContainer.accountsPageActions.clickMyHealthCentresTab());
    }

    @Then("^Administrative Staff is present in the My Health Center Tab$")
    public void administrativeStaffIsPresentInTheMyHealthCenterTab()throws Throwable {
        assertTrue(actionContainer.accountsPageActions.verifyClinicalStaffPresentasRole());
    }

    @When("^I click Access Information Tab$")
    public void iClickAccessInformationTab()throws Throwable {
        assertTrue(actionContainer.accountsPageActions.clickAccessInformationTab());
    }

    @Then("^Access Information tab opened$")
    public void accessInformationTabOpened()throws Throwable {
        assertTrue(actionContainer.accountsPageActions.verifyAccessInformationPage());
    }
}

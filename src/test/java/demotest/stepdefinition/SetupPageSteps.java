package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;


import static org.junit.Assert.assertTrue;

public class SetupPageSteps {

    private ActionContainer actionContainer;

    public SetupPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @Then("^I should see E-services Page$")
    public void iShouldSeeEServicesPage() {
        assertTrue(actionContainer.setupPageActions.verifySetupEservicesPage());
    }

    @And("^I click Add E-services Button$")
    public void iClickAddEServicesButton() throws Throwable {
        assertTrue(actionContainer.setupPageActions.clickSetupEserviceIcon());
    }


    @And("^I Enter Mandatory fields in the Add e-servicePage (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void iEnterMandatoryFieldsInTheAddEServicePageHealthCenterServiceCategoryServiceNameServiceCodeRecipientRoleRecipientDescriptionTerms(String strHealthCentre, String strServiceCategory, String strServiceName, String strServiceCode, String strRecipientRole, String strRecipient, String strDescripton, String strTerms) {
        assertTrue(actionContainer.setupPageActions.selectValuefromHealthCentre(Testdata.getValue(strHealthCentre)));
        assertTrue(actionContainer.setupPageActions.selectValuefromServiceCategory(Testdata.getValue(strServiceCategory)));
        assertTrue(actionContainer.setupPageActions.enterServiceName(strServiceName));
        assertTrue(actionContainer.setupPageActions.enterServiceCode(strServiceCode));
        assertTrue(actionContainer.setupPageActions.selectValuefromRecipientRole(Testdata.getValue(strRecipientRole)));
        assertTrue(actionContainer.setupPageActions.selectValuefromRecipient(Testdata.getValue(strRecipient)));
        assertTrue(actionContainer.setupPageActions.clickPatientCheckBox());
        assertTrue(actionContainer.setupPageActions.enterDescription(strDescripton));
        assertTrue(actionContainer.setupPageActions.enterTerms(strTerms));
    }

    @When("^I click Save Button$")
    public void iClickSaveButton() {
        assertTrue(actionContainer.setupPageActions.clickSaveEService());

    }


    @Then("^I see Practice details opened$")
    public void iSeePracticeDetailsOpened() {
        assertTrue(actionContainer.setupPageActions.verifyPracticeDetails());
    }
}

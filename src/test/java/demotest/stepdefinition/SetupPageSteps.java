package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;
import org.junit.Test;


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
        assertTrue(actionContainer.setupPageActions.enterServiceName(Testdata.getValue(strServiceName)));
        assertTrue(actionContainer.setupPageActions.enterServiceCode(Testdata.getValue(strServiceCode)));
        assertTrue(actionContainer.setupPageActions.selectValuefromRecipientRole(Testdata.getValue(strRecipientRole)));
        assertTrue(actionContainer.setupPageActions.selectValuefromRecipient(Testdata.getValue(strRecipient)));
        assertTrue(actionContainer.setupPageActions.clickPatientCheckBox());
        assertTrue(actionContainer.setupPageActions.enterDescription(Testdata.getValue(strDescripton)));
        assertTrue(actionContainer.setupPageActions.enterTerms(Testdata.getValue(strTerms)));
    }

    @When("^I click Save Button$")
    public void iClickSaveButton() {
        assertTrue(actionContainer.setupPageActions.clickSaveEService());

    }


    @Then("^I see Practice details opened$")
    public void iSeePracticeDetailsOpened() {
        assertTrue(actionContainer.setupPageActions.verifyPracticeDetails());
    }

    @Then("^I Should See The Created Setup Records (.*) Displays In All The Fields$")
    public void iShouldSeeTheCreatedSetupRecordsDisplaysInAllTheFields(String strHeader) {
        assertTrue(actionContainer.setupPageActions.VerifyTheCreatedSetupDiplays(Testdata.getValue(strHeader)));
    }

    @Then("^I Click Cancel Button E-Services Menu$")
    public void iClickCancelButtonEServicesMenu() {
        assertTrue(actionContainer.setupPageActions.ClickCancelButtonEServiceMenu());
    }

    @And("^I Should See the pare redirected to setup E-Service$")
    public void iShouldSeeThePareRedirectedToSetupEService() {
        assertTrue(actionContainer.setupPageActions.VerifyThePageRedirectedToSetupESerice());
    }

    @And("^Click The Edit Button For Created Record (.*)$")
    public void clickTheEditButtonForCreatedRecordToEdit(String StrEditvalue) {
        assertTrue(actionContainer.setupPageActions.ClickEditBtnForCreatedSetup(Testdata.getValue(StrEditvalue)));
    }

    @And("^I Enter Edited Text in The Name text box (.*)$")
    public void iEnterEditedTextInTheNameTextBoxEditedName(String StrEditedValue) {
        assertTrue(actionContainer.setupPageActions.ClearTheNameTxtBox());
        assertTrue(actionContainer.setupPageActions.EnterEditedValueInNameTxtBox(Testdata.getValue(StrEditedValue)));
    }

    @Then("^I click Edit Save Button$")
    public void iClickEditSaveButton() {
        assertTrue(actionContainer.setupPageActions.ClickEditSaveBtn());
    }

    @And("^I See Success Message Display And Click return Button$")
    public void iSeeSuccessMessageDisplayAndClickReturnButton() {
        assertTrue(actionContainer.setupPageActions.VerifyTheSucessMessageDisplays());
        assertTrue(actionContainer.setupPageActions.ClickReturnBtnEService());
    }

    @And("^I Click The Status Button (.*)$")
    public void iClickTheStatusButtonClickStatus(String StrClickStatus) {
        assertTrue(actionContainer.setupPageActions.ClickStatusBtnEService(Testdata.getValue(StrClickStatus)));
    }

    @Then("^I Should See The Saved Record Status (.*)$")
    public void iShouldSeeTheSavedRecordStatusCreatedStatus(String StrCreatedStatus) {
        assertTrue(actionContainer.setupPageActions.VerifyTheServiceStatusWindowDisplays());
        assertTrue(actionContainer.setupPageActions.VerifytheSrviceNameDisplays(Testdata.getValue(StrCreatedStatus)));
    }

    @And("^I Click Setting Tab My Practice$")
    public void iClickSettingTabMyPractice() {
        assertTrue(actionContainer.setupPageActions.ClickSettingTabMyParactice());
    }

    @And("^I Click Edit Button My Practice$")
    public void iClickEditButtonMyPractice() {
        assertTrue(actionContainer.setupPageActions.ClickEditBtnMyPractice());
    }

    @Then("^I Clear And Click The Update Button Practice Settings$")
    public void iClearAndClickTheUpdateButtonPracticeSettings() {
        assertTrue(actionContainer.setupPageActions.CLickUpdateBtnPracticeSettings());
    }

    @And("^I Should See The Warning Displays Practice Settings Page$")
    public void iShouldSeeTheWarningDisplaysPracticeSettingsPage() {
        assertTrue(actionContainer.setupPageActions.VerifyTheRequiredWarningDisplaysPracticeSettings());
    }

    @And("^I Should See The Page Redirected to practice settings menu page$")
    public void iShouldSeeThePageRedirectedToPracticeSettingsMenuPage() {
        assertTrue(actionContainer.setupPageActions.VerifyThePageRedirectedToPracticeSettingsMenu());
    }

    @Then("^I Should See All The Elements Displays in E Service$")
    public void iShouldSeeAllTheElementsDisplaysInEService() {
        assertTrue(actionContainer.setupPageActions.VerifyAllTheElementsInEservice());
    }

    @Then("^I Should See Success Message In Group Mail$")
    public void iShouldSeeSuccessMessageInGroupMail() {
        assertTrue(actionContainer.setupPageActions.VerifySuccessMessageGroupMail());
    }

    @And("^I click Sent Tab Group Mail$")
    public void iClickSentTabGroupMail() {
        assertTrue(actionContainer.setupPageActions.ClickSentTabGroupMail());
    }

    @Then("^I Click Subject And Verify Elements Displays In Group Message$")
    public void iClickSubjectAndVerifyElementsDisplaysInGroupMessage() {
        assertTrue(actionContainer.setupPageActions.ClickSubjectAndVerifyElementsGroupMail());
    }

    @And("^I Should See All The Elements Displays My Practice$")
    public void iShouldSeeAllTheElementsDisplaysMyPractice() {
        assertTrue(actionContainer.setupPageActions.VerifyAllTheElementsDisplaysInMyPracticePage());
    }
}

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

    @And("^I Click Save Button Journal$")
    public void iClickSaveButtonJournal() {
        assertTrue(actionContainer.homePageActions.ClickSaveEntryJournal());
    }

    @Then("^I Should See Warning Message Displays In Journal Window$")
    public void iShouldSeeWarningMessageDisplaysInJournalWindow() {
        assertTrue(actionContainer.homePageActions.VerifyTheRequiredErrorDisplaysJournalWindow());
    }

    @And("^I Click Edit Button View Journal$")
    public void iClickEditButtonViewJournal() {
        assertTrue(actionContainer.homePageActions.ClickEditBtnViewJournal());
    }

    @Then("^I Should See Warning Message Displays In Journal Window After Clear$")
    public void iShouldSeeWarningMessageDisplaysInJournalWindowAfterClear() {
        assertTrue(actionContainer.homePageActions.VerifyTheWarningDisplaysAfterClearInJournal());
    }

    @And("^I Click Staff Tab In Practice Page$")
    public void iClickStaffTabInPracticePage() {
        assertTrue(actionContainer.homePageActions.ClickStaffTabPracticePage());
    }

    @And("^I Enter Invalid Staff Name In The (.*) Text box And Click Search$")
    public void iEnterInvalidStaffNameInTheTextBoxAndClickSearch(String StrStaffTxt) {
        assertTrue(actionContainer.homePageActions.EnterInValidStaffinTheTxtBox(Testdata.getValue(StrStaffTxt)));
        assertTrue(actionContainer.homePageActions.ClickSearchButtonStaffTabPracticePage());
    }

    @Then("^I Should See no record available message in staff tab practice page$")
    public void iShouldSeeNoRecordAvailableMessageInStaffTabPracticePage() {
        assertTrue(actionContainer.homePageActions.VerifyTheNoRecordAvailablemessageinStaffTabPracticePage());
    }

    @And("^I Click Map Location And Role Link$")
    public void iClickMapLocationAndRoleLink() {
        assertTrue(actionContainer.homePageActions.ClickMaplocationrolelinkpracticepage());
    }

    @Then("^I Should See map location window and click update and verify the alert displays$")
    public void iShouldSeeMapLocationWindowAndClickUpdateAndVerifyTheAlertDisplays() {
        assertTrue(actionContainer.homePageActions.ClickUpateBtnMapLocation());
        assertTrue(actionContainer.inboxPageActions.AcceptAlert());

    }

    @And("^I Click Cancel Map Location$")
    public void iClickCancelMapLocation() {
        assertTrue(actionContainer.homePageActions.ClickCancelMapLocation());
    }

    @When("^I click Search user link$")
    public void iClickSearchUserLink() {
        assertTrue(actionContainer.homePageActions.ClickSearchUserLick());
    }

    @And("^I Enter InValid Text (.*) in name text box search patient page$")
    public void iEnterInValidTextInNameTextBoxSearchPatientPage(String StrSearchPatientr) {
        assertTrue(actionContainer.homePageActions.EnterInvalidPatientInTheNameTxtBox(StrSearchPatientr));
    }

    @And("^I Click Search Button Search Patient$")
    public void iClickSearchButtonSearchPatient() {
        assertTrue(actionContainer.homePageActions.ClickSearchBtnSearchPatient());
    }

    @Then("^I Should See The Warning Message no Patient Found Displays$")
    public void iShouldSeeTheWarningMessageNoPatientFoundDisplays() {
        assertTrue(actionContainer.homePageActions.VerifyTheNopatientfoundisplays());
    }

    @And("^I Click First Name radio Button$")
    public void iClickFirstNameRadioButton() {
        assertTrue(actionContainer.homePageActions.ClickFirstNameRadioBtnSearchAptient());
    }

    @And("^I Click Last Name radio Button$")
    public void iClickLastNameRadioButton() {
        assertTrue(actionContainer.homePageActions.ClickLastNameRadioBtnSearchAptient());
    }

    @Then("^I Should See The Value Enter in To The text box$")
    public void iShouldSeeTheValueEnterInToTheTextBox() {
        assertTrue(actionContainer.homePageActions.VerifyTheTextDisplaysinPAtientSearchtxtBox());
    }

    @And("^I Click Clear Button Search patient$")
    public void iClickClearButtonSearchPatient() {
        assertTrue(actionContainer.homePageActions.ClickClearButtonSearchPatient());
    }

    @Then("^I Should see the text cleared from the text box$")
    public void iShouldSeeTheTextClearedFromTheTextBox() {
        assertTrue(actionContainer.homePageActions.VerifyTheTextGotClearedFromTheSearchPatientTxtBox());
    }

    @And("^I Click AutoAuggest Button$")
    public void iClickAutoAuggestButton() {
        assertTrue(actionContainer.homePageActions.ClickAutoSuggestButtonSearchpatient());
    }

    @Then("^I Should See The Auto Suggest List Not Displays$")
    public void iShouldSeeTheAutoSuggestListNotDisplays() {
        assertTrue(actionContainer.homePageActions.VerifyTheSuggesstionListNotDisplays());
    }

    @When("^I click Inbox link$")
    public void iClickInboxLink() {
        assertTrue(actionContainer.homePageActions.ClickInboxPatientMenu());
    }

    @When("^I click Health Indicator$")
    public void iClickHealthIndicator() {
        assertTrue(actionContainer.homePageActions.ClickHealthIndicator());
    }

    @And("^I Click Add Button Healthindicator$")
    public void iClickAddButtonHealthindicator() {
        assertTrue(actionContainer.homePageActions.ClickAddBtnHealthIndicator());
    }

    @And("^I Click Save Button Add Health Indicator$")
    public void iClickSaveButtonAddHealthIndicator() {
        assertTrue(actionContainer.homePageActions.ClickSaveAddHealthIndicator());
    }

    @Then("^I Should See Alert Displays In Health Indicator$")
    public void iShouldSeeAlertDisplaysInHealthIndicator() {
        assertTrue(actionContainer.homePageActions.AcceptAlertHealthIndicator());
    }

    @And("^I Click Close Button Health Indicator$")
    public void iClickCloseButtonHealthIndicator() {
        assertTrue(actionContainer.homePageActions.ClickCloseBtnhealthindicator());
    }

    @And("^I Enter valid inputs health indicator$")
    public void iEnterValidInputsHealthIndicator() {
        assertTrue(actionContainer.homePageActions.EnterValidTxtHealthIndicator());
    }

    @Then("^I should see Main SetUp And Clinical Menus Items$")
    public void iShouldSeeMainSetUpAndClinicalMenusItems() {
        assertTrue(actionContainer.homePageActions.verifyTheMenuItemsDisplays());
    }
}

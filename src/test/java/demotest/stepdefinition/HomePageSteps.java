package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;

import java.util.List;

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

    @Then("^I Should See All Elements Displays In Search Patient$")
    public void iShouldSeeAllElementsDisplaysInSearchPatient() throws InterruptedException {
        assertTrue(actionContainer.homePageActions.VerifyElementInSearchPaient());
    }

    @And("^I Check Whether The Auto Suggest Checked Or not$")
    public void iCheckWhetherTheAutoSuggestCheckedOrNot() {
        assertTrue(actionContainer.homePageActions.VerifyStateOfAutoSuggestCheckBox());
    }

    @Then("^I Should See Patient Search details$")
    public void iShouldSeePatientSearchDetails() {
        assertTrue(actionContainer.homePageActions.VerifyPatientSearchDelails());
    }

    @And("^Click Advanced Button$")
    public void clickAdvancedButton() throws InterruptedException {
        assertTrue(actionContainer.homePageActions.ClickAdvancedButtonSearchPatient());
    }

    @Then("^I Should See ELements And Details Displays After Clicking Search Button$")
    public void iShouldSeeELementsAndDetailsDisplaysAfterClickingSearchButton() throws InterruptedException {
        assertTrue(actionContainer.homePageActions.VerifyelementsAndDetailsAfterClickingSearchBtn());
    }

    @And("^Click DashBoard Link$")
    public void clickDashBoardLink() {
        assertTrue(actionContainer.homePageActions.ClickDashBoardLink());
    }

    @Then("^I Should See Elements In DashBoard$")
    public void iShouldSeeElementsInDashBoard(){
        assertTrue(actionContainer.homePageActions.VerifyElementsDashBoard());
    }

    @And("^I Click patient Link Patient Search$")
    public void iClickPatientLinkPatientSearch(){
        assertTrue(actionContainer.homePageActions.ClickPatientLink());
    }

    @And("^I Should See All The Elements Displays View Patient Search$")
    public void iShouldSeeAllTheElementsDisplaysViewPatientSearch(){
        assertTrue(actionContainer.homePageActions.VerifyVIewPatientElementsDisplays());
    }

    @And("^I Click Search Button Search Patient Adv$")
    public void iClickSearchButtonSearchPatientAdv() {
        assertTrue(actionContainer.homePageActions.ClickBtnSearchPatient());
    }

    @And("^I Click Update Button View Patient$")
    public void iClickUpdateButtonViewPatient() {
        assertTrue(actionContainer.homePageActions.ClickUpdateBtn());
    }

    @And("^Update New Values In View Patient$")
    public void updateNewValuesInViewPatient() {
        assertTrue(actionContainer.homePageActions.EnterNewValuesUpdateViewProfile());
    }

    @Then("^I Should See The updated Profile Details Displays$")
    public void iShouldSeeTheUpdatedProfileDetailsDisplays() {
        assertTrue(actionContainer.homePageActions.VerifyUpdatedProfile());
    }

    @And("^Update Old Values In View Patient$")
    public void updateOldValuesInViewPatient() {
        assertTrue(actionContainer.homePageActions.EnterOldTitle());
    }

    @And("^I Click Cancel Button Update View Patient$")
    public void iClickCancelButtonUpdateViewPatient() {
        assertTrue(actionContainer.homePageActions.ClickCancelViewPatientUpdate());
    }

    @Then("^I Verify The Page Return Back to view Profile$")
    public void iVerifyThePageReturnBackToViewProfile() {
        assertTrue(actionContainer.homePageActions.VerifyPageReturnBackToViewProfile());
    }

    @And("^Click Emergency Contact Tab View Profile$")
    public void clickEmergencyContactTabViewProfile() {
        assertTrue(actionContainer.homePageActions.ClickEmergencyTabViewProfile());
    }

    @And("^I Click Additional Info Tab$")
    public void iClickAdditionalInfoTab() {
        assertTrue(actionContainer.homePageActions.ClickAdditionalInfoTab());
    }

    @Then("^I Should See All Elements In Add Info tab View Profile$")
    public void iShouldSeeAllElementsInAddInfoTabViewProfile() {
        assertTrue(actionContainer.homePageActions.VerifyElementsAddInfoViewPatient());
    }

    @And("^Click Additional info Edit Button$")
    public void clickAdditionalInfoEditButton() {
        assertTrue(actionContainer.homePageActions.ClickEditAddInfoBtn());
    }

    @And("^Enter Valid Edit Value In Add Info Page$")
    public void enterValidEditValueInAddInfoPage() {
        assertTrue(actionContainer.homePageActions.EnterValidValueAddInfo());
    }

    @Then("^I Verify The Profile Updated$")
    public void iVerifyTheProfileUpdated() {
        assertTrue(actionContainer.homePageActions.VerifyUpdatedprofileView());
    }

    @And("^Click Cancel Button Add Info$")
    public void clickCancelButtonAddInfo() {
        assertTrue(actionContainer.homePageActions.ClickCancelBtnAddInfoEdit());
    }

    @Then("^I Verify Add Info Page Return Back From Edit Page$")
    public void iVerifyAddInfoPageReturnBackFromEditPage() {
        assertTrue(actionContainer.homePageActions.VerifyPagereturnbackAddInfo());
    }

    @And("^I Click Device Info Tab$")
    public void iClickDeviceInfoTab() {
        assertTrue(actionContainer.homePageActions.ClickDeviceInfoTab());
    }

    @Then("^I Verify All elements Displays In Device Info Tab$")
    public void iVerifyAllElementsDisplaysInDeviceInfoTab() {
        assertTrue(actionContainer.homePageActions.VerifyElementsDisplaysDeviceInfoTab());
    }

    @And("^I Click Add Button Device Info$")
    public void iClickAddButtonDeviceInfo() {
        assertTrue(actionContainer.homePageActions.ClickAddBtnDeviceInfo());
    }

    @And("^Enter Valid Info In device$")
    public void enterValidInfoInDevice() {
        assertTrue(actionContainer.homePageActions.EnterInfoInDevice());
    }

    @Then("^I Verify Saved value Displays$")
    public void iVerifySavedValueDisplays() {
        assertTrue(actionContainer.homePageActions.VerifySavedDeviceInfo());
    }

    @And("^Click Clinical Notes Link$")
    public void clickClinicalNotesLink() {
        assertTrue(actionContainer.homePageActions.ClickClinicalNotes());
    }

    @And("^Click Add Button Clinical Notes$")
    public void clickAddButtonClinicalNotes() {
        assertTrue(actionContainer.homePageActions.ClickAddClinicalNotesbtn());
    }

    @Then("^I Verify All Elements Displays In Clinical Notes$")
    public void iVerifyAllElementsDisplaysInClinicalNotes() {
        assertTrue(actionContainer.homePageActions.VerifyClincalNotesUI());
    }

    @And("^I Click Cancel Clinical Notes$")
    public void iClickCancelClinicalNotes() {
        assertTrue(actionContainer.homePageActions.ClickCancelClinicalNotes());
    }

    @And("^Click Prescription Tab$")
    public void clickPrescriptionTab() {
        assertTrue(actionContainer.homePageActions.ClickPrescriptionTab());
    }

    @When("^I Click View Clinical Notes$")
    public void iClickViewClinicalNotes() {
        assertTrue(actionContainer.homePageActions.ClickViewClinicalNotes());
    }

    @Then("^I See Elements Displays In Prescription Tab$")
    public void iSeeElementsDisplaysInPrescriptionTab() {
        assertTrue(actionContainer.homePageActions.VerifyPrescriptionTabElements());
    }

    @Then("^I Should See Ui Dsiplays In Clinical Notes Grid And Click Back$")
    public void iShouldSeeUiDsiplaysInClinicalNotesGridAndClickBack() {
        assertTrue(actionContainer.homePageActions.VerifyUIDisplaysClinicalNotes());
    }

    @And("^I Click Edit Clinical Notes$")
    public void iClickEditClinicalNotes() {
        assertTrue(actionContainer.homePageActions.ClickEditBtnClinicalNotes());
    }

    @Then("^i Edit And Verify The New Changes in Clinical Notes$")
    public void iEditAndVerifyTheNewChangesInClinicalNotes() {
        assertTrue(actionContainer.homePageActions.EditAndVerifyClinicalNotes());
    }


    @And("^I Click ReEdit Clinical Notes$")
    public void iClickReEditClinicalNotes() {
        assertTrue(actionContainer.homePageActions.ClickReEditBtnClinicalNotes());
    }

    @Then("^I Edit The Clinical Notes Again$")
    public void iEditTheClinicalNotesAgain() {
        assertTrue(actionContainer.homePageActions.ReEditTheClinicalNotesAgain());
    }

    @And("^I Click Audit Tab Clinical Notes$")
    public void iClickAuditTabClinicalNotes() {
        assertTrue(actionContainer.homePageActions.ClickAuditTabClinicalNotes());
    }

    @Then("^I Verify Audit Tab UI Clinical Notes$")
    public void iVerifyAuditTabUIClinicalNotes() {
        assertTrue(actionContainer.homePageActions.VerifyAuditTabUIClinicalNotes());
    }

    @And("^Click Add Medication Button$")
    public void clickAddMedicationButton() {
        assertTrue(actionContainer.homePageActions.ClickAddMedication());
    }

    @When("^I Click Health Summary menu$")
    public void iClickHealthSummaryMenu() {
        assertTrue(actionContainer.homePageActions.ClickHealthSummaryMenu());
    }

    @And("^Click Entries From Clinical Staff radio$")
    public void clickEntriesFromClinicalStaffRadio() {
        assertTrue(actionContainer.homePageActions.CLickEntriesFromClinicalStaffRadio());
    }

    @Then("^I Verify Health Summary UI (.*)$")
    public void iVerifyHealthSummaryUI(List<String> StrHealthSummary) {
        assertTrue(actionContainer.homePageActions.VerifyHealthSummaryUI(StrHealthSummary));
    }

    @And("^I Click More Info button$")
    public void iClickMoreInfoButton() {
        assertTrue(actionContainer.homePageActions.ClickMoreInfohealthIndicator());
    }

    @Then("^I Verify More Info Window Details$")
    public void iVerifyMoreInfoWindowDetails() {
        assertTrue(actionContainer.homePageActions.VerifyMoreInfoHealthIndicator());
    }

    @And("^I Click health Indicator Link Patient View$")
    public void iClickHealthIndicatorLinkPatientView() {
        assertTrue(actionContainer.homePageActions.ClickHealthIndicatorLink());
    }

    @And("^I Click Health Summary patient View$")
    public void iClickHealthSummaryPatientView() {
        assertTrue(actionContainer.homePageActions.ClickHealthSummaryPatientView());
    }

    @And("^I Click Medication Button Prescription tab$")
    public void iClickMedicationButtonPrescriptionTab() {
        assertTrue(actionContainer.homePageActions.ClickMedicationButtonPrescriptiontab());
    }

    @When("^I Enter Valid Medication in Prescription Tab$")
    public void iEnterValidMedicationInPrescriptionTab() {
        assertTrue(actionContainer.homePageActions.EnterMedicationPrescriptionTab());
    }
}

package demotest.stepdefinition;

import commonpage.toolbox.Browser;
import commonpage.toolbox.Sync;
import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.Repository.InboxPageUI;
import demotest.util.ActionContainer;
import org.junit.Test;
import org.openqa.selenium.Alert;

import static org.junit.Assert.assertTrue;

public class InboxPageSteps {

    private ActionContainer actionContainer;

    public InboxPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @And("^I click compose Tab$")
    public void iClickComposeTab() {
        System.out.println("Pass");
        assertTrue(actionContainer.inboxPageActions.clickComposeTab());
    }

    @And("^I select healthcenter(.*) and Location(.*)$")
    public void iSelectHealthcenterHealthCentreAndLocationLocation(String strHealthCentre, String strLocation) {
        assertTrue(actionContainer.inboxPageActions.selectValuefromHealthcentre(Testdata.getValue(strHealthCentre)));
        assertTrue(actionContainer.inboxPageActions.selectValuefromLocation(Testdata.getValue(strLocation)));
    }

    @And("^I select the Services in the dropdown(.*)$")
    public void iSelectTheServicesInTheDropdownServiceName(String strServiceName) {
        assertTrue(actionContainer.inboxPageActions.selectValuefromServiceName(Testdata.getValue(strServiceName)));
    }

    @And("^I select To as Clinical Provider(.*)$")
    public void iSelectToAsClinicalProviderTo(String strTo) {
        assertTrue(actionContainer.inboxPageActions.selectValuefromTo(Testdata.getValue(strTo)));
    }

    @And("^I select UserName(.*)$")
    public void iSelectUserNameUserName(String strUserName) {
        assertTrue(actionContainer.inboxPageActions.selectValuefromUserName(Testdata.getValue(strUserName)));
    }

    @And("^I Enter manadory fields(.*)$")
    public void iEnterManadoryFieldsMessage(String strMessage) {
        assertTrue(actionContainer.inboxPageActions.swithToProviderInboxFrame());
        assertTrue(actionContainer.inboxPageActions.enterMessage(Testdata.getValue(strMessage)));
        assertTrue(actionContainer.inboxPageActions.swithToProviderdefault());
    }

    @When("^I click Send Message Button$")
    public void iClickSendMessageButton() {
        assertTrue(actionContainer.inboxPageActions.clickSendMessage());
    }

    @And("^I click Reuturn to Inbox Button$")
    public void iClickReuturnToInboxButton() {
        assertTrue(actionContainer.inboxPageActions.clickReturnToInbox());
    }

    @And("^I click sent Tab$")
    public void iClickSentTab() {
        assertTrue(actionContainer.inboxPageActions.clickSentTab());
    }

    @And("^I click delete Button$")
    public void iClickDeleteButton() {
        assertTrue(actionContainer.inboxPageActions.clickTrashButton());
        assertTrue(actionContainer.inboxPageActions.AcceptAlert());
    }

    @Then("^I should see Send successfully$")
    public void iShouldSeeSendSuccessfully() {
        assertTrue(actionContainer.inboxPageActions.verifySendSuccess());
    }

    @Then("^I should see Provider Inbox$")
    public void iShouldSeeProviderInbox() {
        assertTrue(actionContainer.inboxPageActions.verifyProviderInboxPage());
    }

    @And("^I enter Patient Name(.*)$")
    public void iEnterPatientNamePatientName(String strPatientName) {
        assertTrue(actionContainer.inboxPageActions.enterPatientName(Testdata.getValue(strPatientName)));
    }

    @Then("^I should see Patient Inbox$")
    public void iShouldSeePatientInbox() {
        assertTrue(actionContainer.inboxPageActions.verifyPatientInboxPage());
    }

    @Then("^I should see Calender Page$")
    public void iShouldSeeCalenderPage() {
        assertTrue(actionContainer.inboxPageActions.verifyCalenderPage());
    }

    @And("^I click the calender to open the Add event popup$")
    public void iClickTheCalenderToOpenTheAddEventPopup() {
        assertTrue(actionContainer.inboxPageActions.clickCalender());
    }


    @And("^I Enter the required details(.*), (.*)$")
    public void iEnterTheRequiredDetailsTitleDescription(String strEventTitle, String strEventDecription) {
        assertTrue(actionContainer.inboxPageActions.enterEventTitle(Testdata.getValue(strEventTitle)));
        assertTrue(actionContainer.inboxPageActions.enterEventDescription(Testdata.getValue(strEventDecription)));
        assertTrue(actionContainer.inboxPageActions.clickEventSave());
    }

    @And("^I click Event$")
    public void iClickEvent() {
        assertTrue(actionContainer.inboxPageActions.clickEvent());
    }

    @Then("^I should see added Event is displayed in the claender Page$")
    public void iShouldSeeAddedEventIsDisplayedInTheClaenderPage() {
        assertTrue(actionContainer.inboxPageActions.verifyAddedEvent());
    }

    @And("^I click the Delete Event Button$")
    public void iClickTheDeleteEventButton() {
        assertTrue(actionContainer.inboxPageActions.clickDeleteEvent());
        Sync.waitForSeconds(2);
    }

    @Then("^I should see Journal Page$")
    public void iShouldSeeJournalPage() {
        assertTrue(actionContainer.inboxPageActions.verifyJournalPage());
    }

    @And("^I click New Add Journal Button$")
    public void iClickNewAddJournalButton() {
        assertTrue(actionContainer.inboxPageActions.clickAddJournal());
    }

    @And("^I Enter the required Details(.*) ,(.*) ,(.*)$")
    public void iEnterTheRequiredDetailsSubjectCategoryNotes(String strSubjectJournal, String strCategory, String strNoteJournal) {
        assertTrue(actionContainer.inboxPageActions.enterSubjectJournal(Testdata.getValue(strSubjectJournal)));
        assertTrue(actionContainer.inboxPageActions.selectValuefromCategory(Testdata.getValue(strCategory)));
        assertTrue(actionContainer.inboxPageActions.enterNoteJournal(Testdata.getValue(strNoteJournal)));
    }

    @When("^I click the Save Entry Button$")
    public void iClickTheSaveEntryButton() {
        assertTrue(actionContainer.inboxPageActions.clickSaveEntry());
    }

    @Then("^I should see updated journal$")
    public void iShouldSeeUpdatedJournal() {
        assertTrue(actionContainer.inboxPageActions.verifyJournallist());
    }


    @And("^I click Delete Journal Button$")
    public void iClickDeleteJournalButton() {
        assertTrue(actionContainer.inboxPageActions.clickDeleteJournal());
        assertTrue(actionContainer.inboxPageActions.AcceptAlert());
    }


    @Then("^I should see Practice Page$")
    public void iShouldSeePracticePage() {
        assertTrue(actionContainer.inboxPageActions.verifyPracticePage());
    }

    @Then("^I should see Health Center Name Available in the Practice$")
    public void iShouldSeeHealthCenterNameAvailableInThePractice() {
        assertTrue(actionContainer.inboxPageActions.verifyHealthCenter());
    }

    @Then("^I should see Downloads Page$")
    public void iShouldSeeDownloadsPage() {
        assertTrue(actionContainer.inboxPageActions.verifyDownloadsPage());
    }


    @Then("^I should see Group Message Page$")
    public void iShouldSeeGroupMessagePage() {
        assertTrue(actionContainer.inboxPageActions.verifyGroupMessagePage());
    }

    @And("^I Enter required fields(.*), (.*), (.*), (.*)$")
    public void iEnterRequiredFieldsFromToSubjectMessage(String strFromGroupMessage,String strToGroupMessage,String strGroupMessageSubject,String strGroupMessage) {
        assertTrue(actionContainer.inboxPageActions.selectValuefromGroupMessage(Testdata.getValue(strFromGroupMessage)));
        assertTrue(actionContainer.inboxPageActions.selectValueToGroupMessage(Testdata.getValue(strToGroupMessage)));
        assertTrue(actionContainer.inboxPageActions.enterGroupMessageSubject(Testdata.getValue(strGroupMessageSubject)));
        assertTrue(actionContainer.inboxPageActions.swithToGroupMessageFrame());
        assertTrue(actionContainer.inboxPageActions.enterGroupMessage(Testdata.getValue(strGroupMessage)));
        assertTrue(actionContainer.inboxPageActions.swithToProviderdefault());
    }


    @When("^I click Send Message Button in Group Message$")
    public void iClickSendMessageButtonInGroupMessage() {
        assertTrue(actionContainer.inboxPageActions.clickSendMessageGroupMessage());
    }

    @And("^I Click Setting Tab$")
    public void iClickSettingTab() {
        assertTrue(actionContainer.inboxPageActions.SelectSettingTab());
    }

    @Then("^I Click Yes Button in Alert settings$")
    public void iClickYesButtonInAlertSettings() {
        assertTrue(actionContainer.inboxPageActions.SelectYesRadioBtn());
    }

    @And("^I Click Save Settings Button$")
    public void iClickSaveSettingsButton() {
        assertTrue(actionContainer.inboxPageActions.ClickSaveBtn());
    }

    @And("^I Verify The Success Message in Provider Inbox$")
    public void iVerifyTheSuccessMessageInProviderInbox() {
        assertTrue(actionContainer.inboxPageActions.VerifyTheSuccessMessDisplaysInProviderInbox());
    }

    @And("^I Click Automatic replies Tab$")
    public void iClickAutomaticRepliesTab() {
        assertTrue(actionContainer.inboxPageActions.SelectAutomaticRepliesTab());
    }


    @Then("^I Enter (.*) The Valid Text In to The Automatic Replies Text box$")
    public void iEnterAutoRepliesTextTheValidTextInToTheAutomaticRepliesTextBox(String StrAutoTxt) {
        assertTrue(actionContainer.inboxPageActions.EnterValidMessageInAutomaticRepliesTxtBox(StrAutoTxt));
    }

    @And("^I Click The Enable Check Box$")
    public void iClickTheEnableCheckBox() {
        assertTrue(actionContainer.inboxPageActions.ClickEnableButtonAutoReplies());
    }

    @Then("^I Should See the page moves to compose tab$")
    public void iShouldSeeThePageMovesToComposeTab() {
        assertTrue(actionContainer.inboxPageActions.Verifythepagemovestocompoetab());
    }

    @And("^I Click cancel button In compose message tab$")
    public void iClickCancelButtonInComposeMessageTab() {
        assertTrue(actionContainer.inboxPageActions.ClickCancelComposeTab());
    }

    @And("^I Verify The Page Redirected To Inbox Tab$")
    public void iVerifyThePageRedirectedToInboxTab() {
        assertTrue(actionContainer.inboxPageActions.Verifythepageredirectedtoinboxtab());
    }

    @And("^I Click Signature Settings Tab$")
    public void iClickSignatureSettingsTab() {
        assertTrue(actionContainer.inboxPageActions.SelectSignatureSettingsTab());
    }

    @Then("^I Enter (.*) The Valid Text In to The Signature Settings Text box$")
    public void iEnterSignatureSettingsTheValidTextInToTheSignatureSettingsTextBox(String StrSigTxt) {
        assertTrue(actionContainer.inboxPageActions.EnterValueInSignatureSettingTxtBox(StrSigTxt));
    }

    @Then("^I Verify The Alert Displays$")
    public void iVerifyTheAlertDisplays() {
        assertTrue(actionContainer.inboxPageActions.AcceptAlert());
    }

    @And("^I Click Inbox Tab$")
    public void iClickInboxTab() {
        assertTrue(actionContainer.inboxPageActions.ClickInboxTab());
    }

    @Then("^I Should See no record available message in inbox table$")
    public void iShouldSeeNoRecordAvailableMessageInInboxTable() {
        assertTrue(actionContainer.inboxPageActions.VerifyNoRecordAvailable());
    }

    @Then("^I should see Event Page Displays$")
    public void iShouldSeeEventPageDisplays() {
        assertTrue(actionContainer.inboxPageActions.VerifyTheEventPageDisplaysInCalender());
    }

    @And("^i Click Cancel in Calender$")
    public void iClickCancelInCalender() {
        assertTrue(actionContainer.inboxPageActions.ClickcancelEventCalender());
    }

    @And("^I should see the event window closed$")
    public void iShouldSeeTheEventWindowClosed() {
        assertTrue(actionContainer.inboxPageActions.Verifytheeventwindowclosed());
    }

    @And("^I Should See the save button is in disabled state$")
    public void iShouldSeeTheSaveButtonIsInDisabledState() {
        assertTrue(actionContainer.inboxPageActions.Verifythesavebtnisdisabledincalender());
    }

    @And("^i Clear All The Maditory Fields From Saved Journal Record$")
    public void iClearAllTheMaditoryFieldsFromSavedJournalRecord() {
        assertTrue(actionContainer.inboxPageActions.ClearTheSubjectFields());
    }

    @And("^Click Cancel View Journal$")
    public void clickCancelViewJournal() {
        assertTrue(actionContainer.inboxPageActions.ClickCancelJournal());
    }

    @And("^I click the Update Button View Journal$")
    public void iClickTheUpdateButtonViewJournal() {
        assertTrue(actionContainer.inboxPageActions.ClickUpdateButtonJournal());
    }

    @Then("^I Should See The Warning Displays In Group Message Page$")
    public void iShouldSeeTheWarningDisplaysInGroupMessagePage() {
        assertTrue(actionContainer.inboxPageActions.VerifyTheRequiredWarningDisplaysInGroupMessage());
    }
}

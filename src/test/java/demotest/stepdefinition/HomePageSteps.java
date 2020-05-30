package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.*;
import demotest.util.ActionContainer;
import commonpage.util.TestdataConstants;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class HomePageSteps {
    private ActionContainer actionContainer;
    TestdataConstants testdataConstants = new TestdataConstants();

    public HomePageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @Given("^I should verify login screen$")
    public void iShouldVerifyLoginScreen() {
        assertTrue(actionContainer.homePageActions.verifyLoginPage());
        System.out.println("iShouldVerifyLoginScreen");
    }

    @When("^I should Login to application with (.*) , (.*) and (.*)$")
    public void iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String lastName,String consovaID,String sSN) {
        assertTrue(actionContainer.homePageActions.lastNameText(Testdata.getValue(lastName)));
        assertTrue(actionContainer.homePageActions.consovaIdText(Testdata.getValue(consovaID)));
        assertTrue(actionContainer.homePageActions.ssnText(Testdata.getValue(sSN)));
        System.out.println("iShouldLoginToApplicationWithLastNameConsovaIdAndSSN");
    }

    @And("^I should verify login button$")
    public void iShouldVerifyLoginButton() {
        assertTrue(actionContainer.homePageActions.verifyLoginButton());
        System.out.println("iShouldVerifyLoginButton");
    }

    @And("^I should click on Login button from Login screen$")
    public void iShouldClickOnLoginButtonFromLoginScreen() {
        assertTrue(actionContainer.homePageActions.loginButton());
        System.out.println("iShouldClickOnLoginButtonFromLoginScreen");
    }

    @Then("^I should verify homepage screen$")
    public void iShouldVerifyHomepageScreen() {
        assertTrue(actionContainer.homePageActions.verifyHomePage());
        System.out.println("iShouldVerifyHomepageScreen");
    }

    @And("^I should see a warning/error message$")
    public void iShouldSeeAWarningErrorMessage() {
        assertTrue(actionContainer.homePageActions.verifyWarning());
        System.out.println("iShouldSeeAWarningErrorMessage");
    }

    @And("^I should click on warning message$")
    public void iShouldClickOnWarningMessage() {
        assertTrue(actionContainer.homePageActions.warningButton());
        System.out.println("iShouldClickOnWarningMessage");
    }

    @And("^I should close the browser$")
    public void iShouldCloseTheBrowser() {
        assertTrue(actionContainer.homePageActions.closeDriver());
        System.out.println("iShouldCloseTheBrowser");
    }

    @Given("^I should enter login url (.*)$")
    public void iShouldEnterLoginUrlURL(String url) {
        assertTrue(actionContainer.homePageActions.enterURL(Testdata.getValue(url)));
        System.out.println("iShouldEnterLoginUrlURL");
    }

    @And("^I should logoff from home screen$")
    public void iShouldLogoffFromLoginScreen() {
        assertTrue(actionContainer.homePageActions.logoffButton());
        System.out.println("iShouldLogoffFromLoginScreen");
    }

    @And("^I should accept disclaimer Notice if displayed$")
    public void iShouldAcceptGDPRNoticeIfDisplayed() {
        assertTrue(actionContainer.homePageActions.disclaimerAcceptButton());
        System.out.println("iShouldAcceptGDPRNoticeIfDisplayed");
    }

    @And("^I should decline disclaimer Notice if displayed$")
    public void iShouldDeclineDisclaimerNoticeIfDisplayed() {
        assertTrue(actionContainer.homePageActions.disclaimerDeclineButton());
        System.out.println("iShouldDeclineDisclaimerNoticeIfDisplayed");
    }

    @And("^I should verify list of all dependents loaded under the employee$")
    public void iShouldVerifyListOfAllDependentsLoadedUnderTheEmployee() {
        assertTrue(actionContainer.homePageActions.verificationDetails());
        System.out.println("iShouldVerifyListOfAllDependentsLoadedUnderTheEmployee");
    }

    //Wizard page Step definitions

    @And("^I should click on wizard start icon$")
    public void iShouldClickOnWizardStartIcon() {
        assertTrue(actionContainer.homePageActions.wizardButton());
        System.out.println("iShouldClickOnWizardStartIcon");
    }

    @Then("^I should verify the first Introduction slide$")
    public void iShouldVerifyTheFirstIntroductionSlide() {
        assertTrue(actionContainer.homePageActions.firstSlideInWizardVerify());
        System.out.println("iShouldVerifyTheFirstIntroductionSlide");
    }

    @And("^I should click on Begin button in first slide$")
    public void iShouldClickOnBeginButtonInFirstSlide() {
        assertTrue(actionContainer.homePageActions.firstSlideInWizard());
        System.out.println("iShouldClickOnBeginButtonInFirstSlide");
    }

    @And("^I should verify the second wizard slide$")
    public void iShouldVerifyTheSecondWizardSlide() {
        assertTrue(actionContainer.homePageActions.secondSlideInWizardVerify());
        System.out.println("iShouldVerifyTheSecondWizardSlide");
    }

    @Then("^I should click Save and Finish Later in Wizard$")
    public void iShouldClickSaveAndFinishLaterInWizard() {
        assertTrue(actionContainer.homePageActions.saveAndFinishLaterInWizard());
        System.out.println("iShouldClickSaveAndFinishLaterInWizard");
    }

    @And("^I should click on OK button in popup$")
    public void iShouldClickOnOKButtonInPopup() {
        assertTrue(actionContainer.homePageActions.clickOKInPopup());
        System.out.println("iShouldClickOnOKButtonInPopup");
    }

    @And("^I should verify DOB of dependents sorted descending by age (.*) and (.*)$")
    public void iShouldVerifyDOBOfDependentsSortedDescendingByAge(String dataType,String dateFormat) {
        assertTrue(actionContainer.homePageActions.dOBAscendingCheck(Testdata.getValue(dataType),Testdata.getValue(dateFormat)));
        System.out.println("iShouldVerifyDOBOfDependentsSortedDescendingByAge");
    }

    @And("^I should verify Dependent's full name present in Dependent information$")
    public void iShouldVerifyDependentSFullNamePresentInDependentInformation() {
        assertTrue(actionContainer.homePageActions.fullNameVerify());
        System.out.println("iShouldVerifyDependentSFullNamePresentInDependentInformation");
    }

    @And("^I should verify Dependent's relationship present in Dependent information$")
    public void iShouldVerifyDependentSRelationshipPresentInDependentInformation() {
        assertTrue(actionContainer.homePageActions.relationshipVerify());
        System.out.println("iShouldVerifyDependentSRelationshipPresentInDependentInformation");
    }

    @And("^I should verify Dependent's DOB present in Dependent information$")
    public void iShouldVerifyDependentSDOBPresentInDependentInformation() {
        assertTrue(actionContainer.homePageActions.dOBVerify());
        System.out.println("iShouldVerifyDependentSDOBPresentInDependentInformation");
    }

    @And("^I should verify Dependent's Gender present in Dependent information$")
    public void iShouldVerifyDependentSGenderPresentInDependentInformation() {
        assertTrue(actionContainer.homePageActions.genderVerify());
        System.out.println("iShouldVerifyDependentSGenderPresentInDependentInformation");
    }

    @And("^I should click on Back button in Wizard dependent slide$")
    public void iShouldClickOnBackButtonInWizardDependentSlide() {
        assertTrue(actionContainer.homePageActions.backButtonInWizard());
        System.out.println("iShouldClickOnBackButtonInWizardDependentSlide");
    }

    @And("^I should verify individual dependent slide$")
    public void iShouldVerifyIndividualDependentSlide() {
       assertTrue(actionContainer.homePageActions.individualDependentSlideVerifyInWizard());
       System.out.println("iShouldVerifyIndividualDependentSlide");
    }


    @And("^I should check the drop down list for Sub relationships Child and Spouse$")
    public void iShouldCheckTheDropDownListForSubRelationshipsChildAndSpouse() {
        assertTrue(actionContainer.homePageActions.dropdownInWizardCheck());
        System.out.println("iShouldCheckTheDropDownListForSubRelationshipsChildAndSpouse");
    }

    @And("^I should verify DOB in individual Dependent's page$")
    public void iShouldVerifyDOBInIndividualDependentSPage() {
        assertTrue(actionContainer.homePageActions.dOBIndividualDependentSlideVerifyInWizard());
        System.out.println("iShouldVerifyDOBInIndividualDependentSPage");
    }

    @And("^I should verify Relationship in individual Dependent's page$")
    public void iShouldVerifyRelationshipInIndividualDependentSPage() {
        assertTrue(actionContainer.homePageActions.relationshipIndividualDependentSlideVerifyInWizard());
        System.out.println("iShouldVerifyRelationshipInIndividualDependentSPage");
    }

    @And("^I should verify text for dependent eligible$")
    public void iShouldVerifyTextForDependentEligible() {
        assertTrue(actionContainer.homePageActions.individualDependentTextVerifyInWizard());
        System.out.println("iShouldVerifyTextForDependentEligible");
    }

    @And("^I should verify Yes or No radio options for dependent eligible$")
    public void iShouldVerifyYesOrNoRadioOptionsForDependentEligible() {
        assertTrue(actionContainer.homePageActions.relationshipIndividualDependentSlideRadioBtnInWizard());
        System.out.println("iShouldVerifyYesOrNoRadioOptionsForDependentEligible");
    }

    @And("^I should select No from radio button$")
    public void iShouldSelectNoFromRadioButton() {
        assertTrue(actionContainer.homePageActions.selectNoOptionButton());
        System.out.println("iShouldSelectNoFromRadioButton");
    }

    @And("^I should select Yes from radio button$")
    public void iShouldSelectYesFromRadioButton() {
        assertTrue(actionContainer.homePageActions.selectYesOptionButton());
        System.out.println("iShouldSelectNoFromRadioButton");
    }

    @And("^I should check the document desciptions that needs to be uploaded$")
    public void iShouldCheckTheDocumentDesciptionsThatNeedsToBeUploaded() {
        assertTrue(actionContainer.homePageActions.uploadDescription());
        System.out.println("iShouldCheckTheDocumentDesciptionsThatNeedsToBeUploaded");
    }

    @And("^I should check the document upload icon$")
    public void iShouldCheckTheDocumentUploadIcon() {
        assertTrue(actionContainer.homePageActions.uploadDescriptionIcon());
        System.out.println("iShouldCheckTheDocumentUploadIcon");
    }

    @And("^I should verify Next Dependent Slide or click Finish button$")
    public void iShouldVerifyNextDependentSlideOrClickFinishButton() {
        assertTrue(actionContainer.homePageActions.nextEligibleCheckAndClickFinishButton());
        System.out.println("iShouldVerifyNextDependentSlideOrClickFinishButton");
    }

    @And("^I should click Finish button$")
    public void iShouldClickFinishButton() {
        assertTrue(actionContainer.homePageActions.finishButton());
        System.out.println("iShouldClickFinishButton");
    }

    @And("^I should verify DOB present in Dependent information$")
    public void iShouldVerifyDOBPresentInDependentInformation() {
        assertTrue(actionContainer.homePageActions.dOBInDashboard());
        System.out.println("iShouldVerifyDOBPresentInDependentInformation");
    }

    @And("^I should verify deadline and status of dependents$")
    public void iShouldVerifyDeadlineAndStatusOfDependents() {
        assertTrue(actionContainer.homePageActions.deadLineAndStatus());
        System.out.println("iShouldVerifyDeadlineAndStatusOfDependents");
    }

    @And("^I should verify Relationship in Dashboard$")
    public void iShouldVerifyRelationshipInDashboard() {
        assertTrue(actionContainer.homePageActions.relationshipInDashboard());
        System.out.println("iShouldVerifyRelationshipInDashboard");
    }

    @And("^I should click on upload document icon$")
    public void iShouldClickOnUploadDocumentIcon() {
        assertTrue(actionContainer.homePageActions.uploadDocumentIcon());
        System.out.println("iShouldClickOnUploadDocumentIcon");
    }

    @And("^I should select desired document by Browse icon$")
    public void iShouldSelectDesiredDocumentByBrowseIcon() {
        assertTrue(actionContainer.homePageActions.browsePath());
        System.out.println("iShouldSelectDesiredDocumentByBrowseIcon");
    }

    @And("^I should upload the document$")
    public void iShouldUploadTheDocument() {
        assertTrue(actionContainer.homePageActions.uploadIcon());
        System.out.println("iShouldUploadTheDocument");
    }

    @And("^I should check the uploaded document$")
    public void iShouldCheckTheUploadedDocument() {
        assertTrue(actionContainer.homePageActions.uploadDocumentVerify());
        System.out.println("iShouldCheckTheUploadedDocument");
    }

    @And("^I should select ineligiility reason from dropdown$")
    public void iShouldSelectIneligiilityReasonFromDropdown() {
        assertTrue(actionContainer.homePageActions.ineligibleDropDown());
        System.out.println("iShouldSelectIneligiilityReasonFromDropdown");
    }

    @And("^I should check wizard start icon should not be displayed$")
    public void iShouldCheckWizardStartIconShouldNotBeDisplayed() {
        assertTrue(actionContainer.homePageActions.wizardButtonCheck());
        System.out.println("iShouldCheckWizardStartIconShouldNotBeDisplayed");
    }

    @And("^I should check the received document type$")
    public void iShouldCheckTheReceivedDocumentType() {
        assertTrue(actionContainer.homePageActions.uploadDocumentTypeVerify());
        System.out.println("iShouldCheckTheReceivedDocumentType");
    }

    @And("^I should click the uploaded document for viewing in modal$")
    public void iShouldClickTheUploadedDocumentForViewingInModal() {
        assertTrue(actionContainer.homePageActions.uploadDocumentOpen());
        System.out.println("iShouldClickTheUploadedDocumentForViewingInModal");
    }

    @And("^I should close the modal$")
    public void iShouldCloseTheModal() {
        assertTrue(actionContainer.homePageActions.closeModal());
        System.out.println("iShouldCloseTheModal");
    }

    //Contacts Page Step definitins

    @And("^I should go to Cotacts page by clicking Contacts icon$")
    public void iShouldGoToCotactsPageByClickingContactsIcon() {
        assertTrue(actionContainer.homePageActions.contactsPageIcon());
        System.out.println("iShouldGoToCotactsPageByClickingContactsIcon");
    }

    @And("^I shold check whether the Submit button is not enabled/disabled$")
    public void iSholdCheckWhetherTheSubmitButtonIsNotEnabledDisabled() {
        assertTrue(actionContainer.homePageActions.submitButtonNotEnabled());
        System.out.println("iSholdCheckWhetherTheSubmitButtonIsNotEnabledDisabled");
    }

    @And("^I should enter the comments in comments box (.*)$")
    public void iShouldEnterTheCommentsInCommentsBox(String comments) {
        assertTrue(actionContainer.homePageActions.enterCommentsInContactPage(Testdata.getValue(comments)));
        System.out.println("iShouldEnterTheCommentsInCommentsBox");
    }

    @And("^I shold check whether the Submit button is enabled$")
    public void iSholdCheckWhetherTheSubmitButtonIsEnabled() {
        assertTrue(actionContainer.homePageActions.submitButtonEnabled());
        System.out.println("iSholdCheckWhetherTheSubmitButtonIsEnabled");
    }

    @And("^I should click on Submit button in Contacts page$")
    public void iShouldClickOnSubmitButtonInContactsPage() {
        assertTrue(actionContainer.homePageActions.clickSubmitButtonInContactPage());
        System.out.println("iShouldClickOnSubmitButtonInContactsPage");
    }

    @And("^I should check whether the checkbox is enabled$")
    public void iShouldCheckWhetherTheCheckboxIsEnabled() {
        assertTrue(actionContainer.homePageActions.callbackCheckboxDisplayed());
        System.out.println("iShouldCheckWhetherTheCheckboxIsEnabled");
    }

    @And("^I should check the callback number textbox$")
    public void iShouldCheckTheCallbackNumberTextbox() {
        assertTrue(actionContainer.homePageActions.callbackCheckbox());
        System.out.println("iShouldCheckTheCallbackNumberTextbox");
    }

    @And("^I should enter the callback number in callback textbox (.*)$")
    public void iShouldEnterTheCallbackNumberInCallbackTextbox(String callbackNumber) {
        assertTrue(actionContainer.homePageActions.enterCallbackNumberInContactPage(Testdata.getValue(callbackNumber)));
        System.out.println("iShouldEnterTheCallbackNumberInCallbackTextbox");
    }

    @And("^I should verify Verification Assistance Center$")
    public void iShouldVerifyVerificationAssistanceCenter() {
        assertTrue(actionContainer.homePageActions.callForAssistance());
        System.out.println("iShouldVerifyVerificationAssistanceCenter");
    }

    @And("^I should verify FAX in contacts page$")
    public void iShouldVerifyFAXInContactsPage() {
        assertTrue(actionContainer.homePageActions.faxInContactsPage());
        System.out.println("iShouldVerifyFAXInContactsPage");
    }

    @And("^I should verify mail in contacts page$")
    public void iShouldVerifyMailInContactsPage() {
        assertTrue(actionContainer.homePageActions.mailInContactsPage());
        System.out.println("iShouldVerifyMailInContactsPage");
    }

    @And("^I should verify upload icon in contacts page$")
    public void iShouldVerifyUploadIconInContactsPage() {
        assertTrue(actionContainer.homePageActions.uploadIconInContactsPage());
        System.out.println("iShouldVerifyUploadIconInContactsPage");
    }

    @And("^I should click upload icon in contacts page$")
    public void iShouldClickUploadIconInContactsPage() {
        assertTrue(actionContainer.homePageActions.clickUploadIconInContactsPage());
        System.out.println("iShouldClickUploadIconInContactsPage");
    }

    //Profile page

    @And("^I should click on profile photo icon$")
    public void iShouldClickOnProfilePhotoIcon() {
        assertTrue(actionContainer.homePageActions.profilePhotoIcon());
        System.out.println("iShouldClickOnProfilePhotoIcon");
    }

    @And("^I should click on profile from popup$")
    public void iShouldClickOnProfileFromPopup() {
        assertTrue(actionContainer.homePageActions.profileButtonInPopup());
        System.out.println("iShouldClickOnProfileFromPopup");
    }

    @And("^I should see the address table with address, city, state and pincode$")
    public void iShouldSeeTheAddressTableWithAddAddCityStateAndPincode() {
        assertTrue(actionContainer.homePageActions.addressInProfilePage());
        System.out.println("iShouldSeeTheAddressTableWithAddAddCityStateAndPincode");
    }

    @And("^I should see the phone numbers table$")
    public void iShouldSeeThePhoneNumbersTable() {
        assertTrue(actionContainer.homePageActions.contactNumberDetailsInProfilePage());
        System.out.println("iShouldSeeThePhoneNumbersTable");
    }

    @And("^I should verify the both preferred email and confirm preferred email$")
    public void iShouldVerifyTheBothPreferredEmailAndConfirmPreferredEmail() {
        assertTrue(actionContainer.homePageActions.emailListInProfilePage());
        System.out.println("iShouldVerifyTheBothPreferredEmailAndConfirmPreferredEmail");
    }

    @And("^I should click edit button in profile page$")
    public void iShouldClickEditButtonInProfilePage() {
        assertTrue(actionContainer.homePageActions.editButtonInProfilePage());
        System.out.println("iShouldClickEditButtonInProfilePage");
    }

    @And("^I should enter details in popup dialog box$")
    public void iShouldEnterDetailsInPopupDialogBox() {
        assertTrue(actionContainer.homePageActions.enterDetainsInPopupDialog());
        System.out.println("iShouldEnterDetailsInPopupDialogBox");
    }

    @And("^I should click on Cancel button in popup dialog box$")
    public void iShouldClickOnCancelButtonInPopupDialogBox() {
        assertTrue(actionContainer.homePageActions.cancelButtonInProfilePopup());
        System.out.println("iShouldClickOnCancelButtonInPopupDialogBox");
    }

    @And("^I should click on Save button in popup dialog box$")
    public void iShouldClickOnSaveButtonInPopupDialogBox() {
        assertTrue(actionContainer.homePageActions.saveButtonInProfilePopup());
        System.out.println("iShouldClickOnSaveButtonInPopupDialogBox");
    }

    @And("^I should check the Authorized Caller table$")
    public void iShouldCheckTheAuthorizedCallerTable() {
        assertTrue(actionContainer.homePageActions.authorizedCaller());
        System.out.println("iShouldCheckTheAuthorizedCallerTable");
    }

    @And("^I should check the grid with caller name, relationship, Authorized Date and Expiration date$")
    public void iShouldCheckTheGridWithCallerNameRelationshipAuthorizedDateAndExpirationDate() {
        assertTrue(actionContainer.homePageActions.gridTitlesInAuthorizedCaller());
        System.out.println("iShouldCheckTheGridWithCallerNameRelationshipAuthorizedDateAndExpirationDate");
    }

    @And("^I should click on Add caller button displayed$")
    public void iShouldClickOnAddCallerButtonDisplayed() {
        assertTrue(actionContainer.homePageActions.addCallerButton());
        System.out.println("iShouldClickOnAddCallerButtonDisplayed");
    }

    @And("^I should enter the caller name and select relationship in dropdown in popup dialog box (.*)$")
    public void iShouldEnterTheCallerNameAndSelectRelationshipInPopupDialogBox(String callerName) {
        assertTrue(actionContainer.homePageActions.addCallerName(Testdata.getValue(callerName)));
        System.out.println("iShouldEnterTheCallerNameAndSelectRelationshipInPopupDialogBox");
    }

    @And("^I should check and click the renew button in respective caller$")
    public void iShouldCheckAndClickTheRenewButtonInRespectiveCaller() {
        assertTrue(actionContainer.homePageActions.renewButton());
        System.out.println("iShouldCheckAndClickTheRenewButtonInRespectiveCaller");
    }

    @And("^I should check the remove button in respective caller$")
    public void iShouldCheckTheRemoveButtonInRespectiveCaller() {
        assertTrue(actionContainer.homePageActions.removeButtonVerify());
        System.out.println("iShouldCheckTheRemoveButtonInRespectiveCaller");
    }

    @And("^I should click on confirm button in popup window$")
    public void iShoulClinkOnConfirmButtonInPopupWindow() {
        assertTrue(actionContainer.homePageActions.confirmButton());
        System.out.println("iShouldClickOnConfirmButtonInPopupWindow");
    }

    @And("^I should check the Go Green section is displayed$")
    public void iShouldCheckTheGoGreenSectionIsDisplayed() {
        assertTrue(actionContainer.homePageActions.goGreenVerify());
        System.out.println("iShouldCheckTheGoGreenSectionIsDisplayed");
    }

    @And("^I should enter the email in preferred email and confirm preferred email textboxes (.*)$")
    public void iShouldEnterTheEmailInPreferredEmailAndConfirmPreferredEmailTextboxes(String email) {
        assertTrue(actionContainer.homePageActions.emailInGoGreen(Testdata.getValue(email)));
        System.out.println("iShouldEnterTheEmailInPreferredEmailAndConfirmPreferredEmailTextboxes");
    }

    @And("^I should click on activate button$")
    public void iShouldClickOnActivateButton() {
        assertTrue(actionContainer.homePageActions.actiaveButton());
        System.out.println("iShouldClickOnActivateButton");
    }

    @And("^I should verify activate email sent dialog box$")
    public void iShouldVerifyActivateEmailSentDialogBox() {
        assertTrue(actionContainer.homePageActions.activateEmailSentVerify());
        System.out.println("iShouldVerifyActivateEmailSentDialogBox");
    }

    //Menu page

    @And("^I should click on language selection button in menubar$")
    public void iShouldClickOnLanguageSelectionButtonInMenubar() {
        assertTrue(actionContainer.homePageActions.languageSelection());
        System.out.println("iShouldClickOnLanguageSelectionButtonInMenubar");
    }

    @And("^I should select Spanish language from dropdown$")
    public void iShouldSelectSpanishLanguageFromDropdown() {
        assertTrue(actionContainer.homePageActions.spanishLanguage());
        System.out.println("iShouldSelectSpanishLanguageFromDropdown");
    }

    @And("^I should verify Spanish language in current window$")
    public void iShouldVerifySpanishLanguageInCurrentWindow() {
        assertTrue(actionContainer.homePageActions.verifySpanishLanguageInHomePage());
        System.out.println("iShouldVerifySpanishLanguageInCurrentWindow");
    }

    @And("^I should verify Spanish language in menubar")
    public void iShouldVerifySpanishLanguageInMenubar() {
        assertTrue(actionContainer.homePageActions.verifySpanishLanguageInMenuBar());
        System.out.println("iShouldVerifySpanishLanguageInMenubar");
    }

    @And("^I should select English language from dropdown$")
    public void iShouldSelectEnglishLanguageFromDropdown() {
        assertTrue(actionContainer.homePageActions.englishLanguage());
        System.out.println("iShouldSelectEnglishLanguageFromDropdown");
    }

    @And("^I should click on Upload documents icon in menubar$")
    public void iShouldClickOnUploadDocumentsIconInMenubar() {
        assertTrue(actionContainer.homePageActions.uploadDocumentInMenubar());
        System.out.println("iShouldClickOnUploadDocumentsIconInMenubar");
    }

    @And("^I should click on remove document from pop dialog box$")
    public void iShouldClickOnRemoveDocumentFromPopDialogBox() {
        assertTrue(actionContainer.homePageActions.removeUploadedDocumentInGrid());
        System.out.println("iShouldClickOnRemoveDocumentFromPopDialogBox");
    }

    @And("^I should check the uploaded document in grid$")
    public void iShouldCheckTheUploadedDocumentInGrid() {
        assertTrue(actionContainer.homePageActions.verifyUploadedDocumntInGrid());
        System.out.println("iShouldCheckTheUploadedDocumentInGrid");
    }

    @And("^I should check upload icon is disabled till document upload$")
    public void iShouldCheckUploadIconIsDisabledTillDocumentUpload() {
        assertTrue(actionContainer.homePageActions.uploadIconDisableVerify());
        System.out.println("iShouldCheckUploadIconIsDisabledTillDocumentUpload");
    }

    @And("^I should check the icons in menubar$")
    public void iShouldCheckTheIconsInMenubar() {
        assertTrue(actionContainer.homePageActions.menuIconsInMenubar());
        System.out.println("iShouldCheckTheIconsInMenubar");
    }

    @And("^I should click the sidebar collapse icon$")
    public void iShouldClickTheSidebarCollapseIcon() {
        assertTrue(actionContainer.homePageActions.sidebarCollapse());
        System.out.println("iShouldClickTheSidebarCollapseIcon");
    }


    @And("^I should click on verification details from menubar$")
    public void iShouldClickOnVerificationDetailsFromMenubar() {
        assertTrue(actionContainer.homePageActions.verificationDetailsInMenubar());
        System.out.println("iShouldClickOnVerificationDetailsFromMenubar");
    }

    @And("^I should check the benefits verified$")
    public void iShouldCheckTheBenefitsVerified() {
        assertTrue(actionContainer.homePageActions.benefitsVerified());
        System.out.println("iShouldCheckTheBenefitsVerified");
    }

    @And("^I should click the remove button in respective caller$")
    public void iShouldClickTheRemoveButtonInRespectiveCaller() {
        assertTrue(actionContainer.homePageActions.removeButtonClick());
        System.out.println("iShouldClickTheRemoveButtonInRespectiveCaller");
    }

    @And("^I should click on cancel button in popup window$")
    public void iShouldClickOnCancelButtonInPopupWindow() {
        assertTrue(actionContainer.homePageActions.cancelButton());
        System.out.println("iShouldClickOnCancelButtonInPopupWindow");
    }

    @And("^I should check the callername saved for authorized caller$")
    public void iShouldCheckTheCallernameSavedForAuthorizedCaller() {
        assertTrue(actionContainer.homePageActions.authorizedNameVerify());
        System.out.println("iShouldCheckTheCallernameSavedForAuthorizedCaller");
    }

    @And("^I should check the callername is removed from authorized caller$")
    public void iShouldCheckTheCallernameIsRemovedFromAuthorizedCaller() {
        assertTrue(actionContainer.homePageActions.authorizedNameNotVerify());
        System.out.println("iShouldCheckTheCallernameIsRemovedFromAuthorizedCaller");
    }

    @Then("^I should click Save and Continue in Wizard$")
    public void iShouldClickSaveAndContinueInWizard() {
        assertTrue(actionContainer.homePageActions.saveAndContinueInWizard());
        System.out.println("iShouldClickSaveAndContinueInWizard");
    }

    @When("^I should Login to core application with (.*) and (.*)$")
    public void iShouldLoginToCoreApplicationWithUserNameAndPassword(String userName,String password) {
        assertTrue(actionContainer.homePageActions.userNameInCore(Testdata.getValue(userName)));
        assertTrue(actionContainer.homePageActions.passwordInCore(Testdata.getValue(password)));
        System.out.println("iShouldLoginToCoreApplicationWithUserNameAndPassword");
    }

    @And("^I should click on My Inventory in tab menu$")
    public void iShouldClickOnMyInventoryInTabMenu() {
        assertTrue(actionContainer.homePageActions.myInventoryTab());
        System.out.println("iShouldClickOnMyInventoryInTabMenu");
    }

    @And("^I should search customer by entring (.*) in search header$")
    public void iShouldSearchCustomerByEntringConsovaIdInSearchHeader(String consovaID) {
        assertTrue(actionContainer.homePageActions.enterConsovaID(Testdata.getValue(consovaID)));
        System.out.println("iShouldSearchCustomerByEntringConsovaIdInSearchHeader");
    }

    @And("^I should click open audit screen by clicking respective icon$")
    public void iShouldClickOpenAuditScreenByClickingRespectiveIcon() {
        assertTrue(actionContainer.homePageActions.openAuditInMyInventory());
        System.out.println("iShouldClickOpenAuditScreenByClickingRespectiveIcon");
    }

    @And("^I should click open account screen by clicking respective icon$")
    public void iShouldClickOpenAccountScreenByClickingRespectiveIcon() {
        assertTrue(actionContainer.homePageActions.openAccountInMyInventory());
        System.out.println("iShouldClickOpenAccountScreenByClickingRespectiveIcon");
    }

    @And("^I should navigate to newly opened window$")
    public void iShouldNavigateToNewlyOpenedWindow() {
        assertTrue(actionContainer.homePageActions.navigateToNewTab());
        System.out.println("iShouldNavigateToNewlyOpenedWindow");
    }

    @And("^I should change the status in list$")
    public void iShouldChangeTheStatusInList() {
        assertTrue(actionContainer.homePageActions.completeAllDocInList());
        System.out.println("iShouldChangeTheStatusInList");
    }

    @And("^I should add documents and mark the staus as missing$")
    public void iShouldAddDocumentsAndMarkTheStausAsMissing() {
        assertTrue(actionContainer.homePageActions.missingDocInCore());
        System.out.println("iShouldAddDocumentsAndMarkTheStausAsMissing");
    }

    @And("^I should add documents and mark the staus as not applicable$")
    public void iShouldAddDocumentsAndMarkTheStausAsNotApplicable() {
        assertTrue(actionContainer.homePageActions.notApplicableDocInCore());
        System.out.println("iShouldAddDocumentsAndMarkTheStausAsNotApplicable");
    }

    @And("^I should click on first dependent tab$")
    public void iShouldClickOnFirstDependentTab() {
        assertTrue(actionContainer.homePageActions.firstDependentTab());
        System.out.println("iShouldClickOnFirstDependentTab");
    }

    @And("^I should click on second dependent tab$")
    public void iShouldClickOnSecondDependentTab() {
        assertTrue(actionContainer.homePageActions.secondDependentTab());
        System.out.println("iShouldClickOnSecondDependentTab");
    }

    @And("^I should click on third dependent tab$")
    public void iShouldClickOnThirdDependentTab() {
        assertTrue(actionContainer.homePageActions.thirdDependentTab());
        System.out.println("iShouldClickOnThirdDependentTab");
    }

    @And("^I should click on fourth dependent tab$")
    public void iShouldClickOnFourthDependentTab() {
        assertTrue(actionContainer.homePageActions.fourthDependentTab());
        System.out.println("iShouldClickOnFourthDependentTab");
    }

    @And("^I should click on ineligible codes button$")
    public void iShouldClickOnIneligibleCodesButton() {
        assertTrue(actionContainer.homePageActions.inEligibleCodesButton());
        System.out.println("iShouldClickOnIneligibleCodesButton");
    }

    @And("^I should click select first ineligible code$")
    public void iShouldClickSelectFirstIneligibleCode() {
        assertTrue(actionContainer.homePageActions.inEligibleReasonCodes());
        System.out.println("iShouldClickSelectFirstIneligibleCode");
    }

    @And("^I should save by clicking close button$")
    public void iShouldSaveByClickingCloseButton() {
        assertTrue(actionContainer.homePageActions.saveAndClose());
        System.out.println("iShouldSaveByClickingCloseButton");
    }

    @And("^I should click on BC icon for biological child$")
    public void iShouldClickOnBCIconForBiologicalChild() {
        assertTrue(actionContainer.homePageActions.bcConfirmationIconClick());
        System.out.println("iShouldClickOnBCIconForBiologicalChild");
    }

    @And("^I should verify BC icon for biological child$")
    public void iShouldVerifyBCIconForBiologicalChild() {
        assertTrue(actionContainer.homePageActions.bcConfirmationIconVerify());
        System.out.println("iShouldVerifyBCIconForBiologicalChild");
    }

    @And("^I should click on SC icon for step child$")
    public void iShouldClickOnSCIconForStepChild() {
        assertTrue(actionContainer.homePageActions.scConfirmationIconClick());
        System.out.println("iShouldClickOnSCIconForStepChild");
    }

    @And("^I should verify SC icon for step child$")
    public void iShouldVerifySCIconForStepChild() {
        assertTrue(actionContainer.homePageActions.scConfirmationIconVerify());
        System.out.println("iShouldVerifySCIconForStepChild");
    }

    @And("^I should click on Yes to confirm from popup$")
    public void iShouldClickOnYesToConfirmFromPopup() {
        assertTrue(actionContainer.homePageActions.yesButtonInPopup());
        System.out.println("iShouldClickOnYesToConfirmFromPopup");
    }

    @And("^I should get the ineligible icon for ineligible dependent$")
    public void iShouldGetTheIneligibleIconForIneligibleDependent() {
        assertTrue(actionContainer.homePageActions.ineligibleVerify());
        System.out.println("iShouldGetTheIneligibleIconForIneligibleDependent");
    }

    @And("^I should get the count for completed and not applicable for second dependent$")
    public void iShouldGetTheCountForCompletedAndNotApplicableForSecondDependent() {
        assertTrue(actionContainer.homePageActions.countForSecondDependent());
        System.out.println("iShouldGetTheCountForCompletedAndNotApplicableForSecondDependent");
    }

    @And("^I should get the count for completed and not applicable for third dependent$")
    public void iShouldGetTheCountForCompletedAndNotApplicableForThirdDependent() {
        assertTrue(actionContainer.homePageActions.countForThirdDependent());
        System.out.println("iShouldGetTheCountForCompletedAndNotApplicableForThirdDependent");
    }

    @And("^I should get the count for completed and not applicable for fourth dependent$")
    public void iShouldGetTheCountForCompletedAndNotApplicableForFourthDependent() {
        assertTrue(actionContainer.homePageActions.countForFourthDependent());
        System.out.println("iShouldGetTheCountForCompletedAndNotApplicableForFourthDependent");
    }

    @And("^I should click on second dependent tab in verification details$")
    public void iShouldClickOnSecondDependentTabInVerificationDetails() {
        assertTrue(actionContainer.homePageActions.secondHeaderInIvac());
        System.out.println("iShouldClickOnSecondDependentTabInVerificationDetails");
    }

    @And("^I should compare the status between core and ivac for second dependent$")
    public void iShouldCompareTheStatusBetweenCoreAndIvacForSecondDependent() {
        assertTrue(actionContainer.homePageActions.compareStatusForSecondDependent());
        System.out.println("iShouldCompareTheStatusBetweenCoreAndIvacForSecondDependent");
    }

    @And("^I should click on third dependent tab in verification details$")
    public void iShouldClickOnThirdDependentTabInVerificationDetails() {
        assertTrue(actionContainer.homePageActions.thirdHeaderInIvac());
        System.out.println("iShouldClickOnThirdDependentTabInVerificationDetails");
    }

    @And("^I should compare the status between core and ivac for third dependent$")
    public void iShouldCompareTheStatusBetweenCoreAndIvacForThirdDependent() {
        assertTrue(actionContainer.homePageActions.compareStatusForThirdDependent());
        System.out.println("iShouldCompareTheStatusBetweenCoreAndIvacForThirdDependent");
    }

    @And("^I should click on fourth dependent tab in verification details$")
    public void iShouldClickOnFourthDependentTabInVerificationDetails() {
        assertTrue(actionContainer.homePageActions.fourthHeaderInIvac());
        System.out.println("iShouldClickOnFourthDependentTabInVerificationDetails");
    }

    @And("^I should compare the status between core and ivac for fourth dependent$")
    public void iShouldCompareTheStatusBetweenCoreAndIvacForFourthDependent() {
        assertTrue(actionContainer.homePageActions.compareStatusForFourthDependent());
        System.out.println("iShouldCompareTheStatusBetweenCoreAndIvacForFourthDependent");
    }

    @And("^I should click on profile icon in core$")
    public void iShouldClickOnProfileIconInCore() {
        assertTrue(actionContainer.homePageActions.profileIconInCore());
        System.out.println("iShouldClickOnProfileIconInCore");
    }

    @And("^I should logoff from core login$")
    public void iShouldLogoffFromCoreLogin() {
        assertTrue(actionContainer.homePageActions.logoffButtonInCore());
        System.out.println("iShouldLogoffFromCoreLogin");
    }


    @Given("^I should navigate to web outlook$")
    public void iShouldNavigateToWebOutlook() {
        assertTrue(actionContainer.homePageActions.outlookNavigation());
        System.out.println("iShouldNavigateToWebOutlook");
    }



    @And("^I should login to outlook by clicking login button$")
    public void iShouldLoginToOutlookByClickingLoginButton() {
        assertTrue(actionContainer.homePageActions.loginButtonInOutlook());
        System.out.println("iShouldLoginToOutlookByClickingLoginButton");
    }

    @And("^I should click on activation email$")
    public void iShouldClickOnActivationEmail() {
        assertTrue(actionContainer.homePageActions.clickActivationEmail());
        System.out.println("iShouldClickOnActivationEmail");
    }

    @And("^I should click on activation link$")
    public void iShouldClickOnActivationLink() {
        assertTrue(actionContainer.homePageActions.clickActivationLink());
        System.out.println("iShouldClickOnActivationLink");
    }

    @And("^I should verify new package created in account screen$")
    public void iShouldVerifyNewPackageCreatedInAccountScreen() {
        assertTrue(actionContainer.homePageActions.verifyNewPackage());
        System.out.println("iShouldVerifyNewPackageCreatedInAccountScreen");
    }

    @And("^I should click on Next button$")
    public void iShouldClickOnNextButton() {
        assertTrue(actionContainer.homePageActions.nextButtonInOutlook());
        System.out.println("iShouldClickOnNextButton");
    }

    @And("^I should enter username as (.*)$")
    public void iShouldEnterUsernameAsEmail(String email) {
        assertTrue(actionContainer.homePageActions.office365username(Testdata.getValue(email)));
        System.out.println("iShouldEnterUsenameAsEmail");
    }

    @And("^I should give password as (.*)$")
    public void iShouldGivePasswordAsPassword(String password) {
        assertTrue(actionContainer.homePageActions.office365password(Testdata.getValue(password)));
        System.out.println("iShouldEnterUsenameAsPassword");
    }

    @And("^I should click on outlook icon from menubar$")
    public void iShouldClickOnOutlookIconFromMenubar() {
        assertTrue(actionContainer.homePageActions.outlookIcon());
        System.out.println("iShouldClickOnOutlookIconFromMenubar");
    }

    @And("^I should verify disclaimer page$")
    public void iShouldVerifyDisclaimerPage() {
        assertTrue(actionContainer.homePageActions.disclaimerPageVerify());
        System.out.println("iShouldVerifyDisclaimerPage");
    }

    @And("^I should verify error message$")
    public void iShouldVerifyErrorMessage() {
        assertTrue(actionContainer.homePageActions.errorMessageVerify());
        System.out.println("iShouldVerifyErrorMessage");
    }

    @And("^I should be verifying last summary slide$")
    public void iShouldBeVerifyingLastSummarySlide() {
        assertTrue(actionContainer.homePageActions.statusInSummarySlide());
        System.out.println("iShouldBeVerifyingLastSummarySlide");
    }

    @And("^I should verify the prompt message in message box$")
    public void iShouldVerifyThePromptMessageInMessageBox() {
        assertTrue(actionContainer.homePageActions.promptMessageInContactsPage());
        System.out.println("iShouldVerifyThePromptMessageInMessageBox");
    }


    @And("^I should select the more than five MB file for upload$")
    public void iShouldSelectTheMoreThanFiveMBFileForUpload() {
        assertTrue(actionContainer.homePageActions.morethan5MBFile());
        System.out.println("iShouldSelectTheMoreThanFiveMBFileForUpload");
    }

    @And("^I should verify the warning message for file size$")
    public void iShouldVerifyTheWarningMessageForFileSize() {
        assertTrue(actionContainer.homePageActions.uploadErrorMessageVerify());
        System.out.println("iShouldVerifyTheWarningMessageForFileSize");
    }

    @And("^I should complete all the packages in the queue$")
    public void iShouldCompleteAllThePackagesInTheQueue() {
        assertTrue(actionContainer.homePageActions.completeAllPackages());
        System.out.println("iShouldCompleteAllThePackagesInTheQueue");
    }
}
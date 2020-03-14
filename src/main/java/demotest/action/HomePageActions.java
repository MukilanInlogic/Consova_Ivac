package demotest.action;

import com.google.gson.internal.$Gson$Preconditions;
import commonpage.toolbox.*;
import commonpage.util.Testdata;
import commonpage.util.TestdataConstants;
import demotest.Repository.HomePageUI;
import jdk.nashorn.internal.ir.IfNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collections;

public class HomePageActions extends HomePageUI {
    public HomePageActions(WebDriver driver) {
        super(driver);
    }


    public boolean verifyHomePage() {
        Boolean isVerified = false;
        if (lblHomePage.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifySetupMenu() {
        Boolean isVerified = false;
        if (lblSetUpMenu.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyHeaderInLeftPane(String strValue) {
        System.out.println("pass");
        Boolean isVerified = false;
        System.out.println("pass");
        WebElement ele = driver.findElement(By.xpath(strLeftPaneHeaderLocator.replace("<<REPLACE>>", strValue)));
        if (ele.isDisplayed()) {
            System.out.println("actual value" + ele);
            isVerified = true;
        }
        return isVerified;
    }

    /**
     * Created by Ganesh babu
     *
     * @return
     */
    public boolean clickLogoutBtn() {
        Boolean isClicked = false;
        if (iconLogout.isDisplayed()) {
            isClicked = Element.click(driver, iconLogout);
        }
        return isClicked;


    }

    public boolean verifyInboxwidget() {
        Boolean isVerified = false;
        if (lblInbox.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickMyAccountMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleMyAccount);
        return isClicked;
    }

    public boolean clickProviderInboxMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleProviderInbox);
        return isClicked;
    }

    public boolean clickPatientInboxMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, elePatientInbox);
        return isClicked;
    }

    public boolean clickCalenderMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleCalender);
        return isClicked;
    }

    public boolean clickJournalMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleJournal);
        return isClicked;
    }

    public boolean clickPracticeMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, elePractice);
        return isClicked;
    }

    public boolean clickDownloadsMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleDownloads);
        return isClicked;
    }

    public boolean clickClinicalMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleClinicalMenu);
        return isClicked;
    }

    public boolean clickSetupMenu() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleSetupMenu);
        return isClicked;
    }

    public boolean clickAppointmentinbox() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleAppointmentinbox);
        return isClicked;
    }

    public boolean clickSetupEservices() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleSetupeService);
        return isClicked;
    }

    public boolean clickGroupMail() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleGroupMail);
        return isClicked;
    }

    public boolean clickSetupEserviceIcon() {
        Boolean isClicked = false;
        System.out.println("Methos entry");
        System.out.println("LOCATOR" + btnAddEsevices.isDisplayed());
        isClicked = Element.click(driver, btnAddEsevices);
        return isClicked;
    }

    public boolean clickMyPractice() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleMyPractice);
        return isClicked;
    }

    public boolean ClickSaveEntryJournal() {
        boolean isClicked = false;
        if (BtnSaveEntryJaurnal.isDisplayed()) {
            isClicked = Element.click(driver, BtnSaveEntryJaurnal);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheRequiredErrorDisplaysJournalWindow() {
        boolean isVerify = false;
        if (lblRequiredErrorSubjectTxtBox.isDisplayed()) {
            isVerify = true;
        } else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickEditBtnViewJournal() {
        boolean isClicked = false;
        if (BtnEditViewJournal.isDisplayed()) {
            isClicked = Element.click(driver, BtnEditViewJournal);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheWarningDisplaysAfterClearInJournal() {
        boolean isVerify = false;
        if (lblRequiredErrorEditSubjectTxtBox.isDisplayed()) {
            isVerify = true;
        } else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickStaffTabPracticePage() {
        boolean isClicked = false;
        if (BtnStaffTabPracticePage.isDisplayed()) {
            isClicked = Element.click(driver, BtnStaffTabPracticePage);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean EnterInValidStaffinTheTxtBox(String StrStaffTxt) {
        boolean isEntered = false;
        if (txtBoxUserNameStafftabPracticePage.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtBoxUserNameStafftabPracticePage, StrStaffTxt);
            isEntered = true;
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean ClickSearchButtonStaffTabPracticePage() {
        boolean isClicked = false;
        if (BtnSearchStaffTabPracticePage.isDisplayed()) {
            isClicked = Element.click(driver, BtnSearchStaffTabPracticePage);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheNoRecordAvailablemessageinStaffTabPracticePage() {
        boolean isVerify = false;
        if (CaptionNoRecordAvailableStafftabPracticepage.isDisplayed()) {
            isVerify = true;
        } else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickMaplocationrolelinkpracticepage() {
        boolean isClicked = false;
        if (BtnMapLocationRolePracticePage.isDisplayed()) {
            isClicked = Element.click(driver, BtnMapLocationRolePracticePage);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickUpateBtnMapLocation() {
        boolean isClicked = false;
        if (BtnUpdateMapLocationRole.isDisplayed()) {
            isClicked = Element.click(driver, BtnUpdateMapLocationRole);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickCancelMapLocation() {
        boolean isClicked = false;
        if (BtnCancelMapLocation.isDisplayed()) {
            isClicked = Element.click(driver, BtnCancelMapLocation);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickSearchUserLick() {
        boolean isClicked = false;
        if (BtnSearchUserMainMenu.isDisplayed()) {
            isClicked = Element.click(driver, BtnSearchUserMainMenu);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean EnterInvalidPatientInTheNameTxtBox(String StrStaffTxt) {
        boolean isEntered = false;
        if (TxtBoxNameSearchPatient.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, TxtBoxNameSearchPatient, StrStaffTxt);
            isEntered = true;
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean ClickSearchBtnSearchPatient() {
        boolean isClicked = false;
        if (BtnSearchPatientPage.isDisplayed()) {
            isClicked = Element.click(driver, BtnSearchPatientPage);
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheNopatientfoundisplays() {
        boolean isVerify = false;
        if (WarningnoPatientFoundSearchPatient.isDisplayed()) {
            isVerify = true;
        } else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickFirstNameRadioBtnSearchAptient() {
        boolean isClicked = false;
        if (BtnfirstnamelastnameSearchpatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnfirstnamelastnameSearchpatient);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickLastNameRadioBtnSearchAptient() {
        boolean isClicked = false;
        if (BtnlastnamefirstnameSearchpatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnlastnamefirstnameSearchpatient);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheTextDisplaysinPAtientSearchtxtBox() {
        boolean isVerify = false;
        System.out.println("before GetText");
        String StrPatientName = TxtBoxNameSearchPatient.getText();
        System.out.println("Show Value" + StrPatientName);
        if (StrPatientName.equals(TestdataConstants.SEARCHPATIENT)) {
            isVerify = true;
        } else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickClearButtonSearchPatient() {
        boolean isClicked = false;
        if (BtnClearSearchPatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnClearSearchPatient);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheTextGotClearedFromTheSearchPatientTxtBox() {
        boolean isVerify = false;
        String StrPatientName = TxtBoxNameSearchPatient.getText();
        if (StrPatientName.isEmpty()) {
            isVerify = true;
        } else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickAutoSuggestButtonSearchpatient() {
        boolean isClicked = false;
        if (BtnAutoSuggestSearchPatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnAutoSuggestSearchPatient);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheSuggesstionListNotDisplays() {
        boolean isVerify = false;
        if (TxtBoxNameSearchPatient.isEnabled()) {
            isVerify = true;
        } else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickInboxPatientMenu() {
        boolean isClicked = false;
        if (eleInboxForPatient.isDisplayed()) {
            isClicked = Element.click(driver, eleInboxForPatient);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;

    }

    public boolean ClickHealthIndicator() {
        boolean isClicked = false;
        if (BtnHealthIndicatorMainMenu.isDisplayed()) {
            isClicked = Element.click(driver, BtnHealthIndicatorMainMenu);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickAddBtnHealthIndicator() {
        boolean isClicked = false;
        if (BtnAddHealthIndicatorMainMenu.isDisplayed()) {
            isClicked = Element.click(driver, BtnAddHealthIndicatorMainMenu);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickSaveAddHealthIndicator() {
        boolean isClicked = false;
        if (BtnSaveAddHealthIndicator.isDisplayed()) {
            isClicked = Element.click(driver, BtnSaveAddHealthIndicator);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean AcceptAlertHealthIndicator() {
        boolean isAccepted = false;
        isAccepted = Alert.acceptAlert(driver);
        return isAccepted;
    }

    public boolean ClickCloseBtnhealthindicator() {
        boolean isClicked = false;
        if (BtnCloseAddHealthIndicator.isDisplayed()) {
            isClicked = Element.click(driver, BtnCloseAddHealthIndicator);
            isClicked = true;
        } else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean EnterValidTxtHealthIndicator() {
        boolean isEntered = false;

        if (TxtBoxHeightBMIHealthIndicator.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, TxtBoxHeightBMIHealthIndicator, TestdataConstants.HEIGHTBMI);
            isEntered = Textbox.enterValue(driver, TxtBoxWeightBMIHealthIndicator, TestdataConstants.HEIGHTBMI);
            isEntered = true;
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean verifyTheMenuItemsDisplays() {
        boolean isverify = false;

        if (lblHomePage.isDisplayed()) {
            BtnHomeMainMenu.isDisplayed();
            eleMyAccount.isDisplayed();
            eleProviderInbox.isDisplayed();
            elePatientInbox.isDisplayed();
            eleJournal.isDisplayed();
            eleCalender.isDisplayed();
            elePractice.isDisplayed();
            eleDownloads.isDisplayed();
            BtnSearchUserMainMenu.isDisplayed();
            isverify = Element.click(driver, eleSetupMenu);
            eleSetupeService.isDisplayed();
            eleGroupMail.isDisplayed();
            eleMyPractice.isDisplayed();
            eleStaffListSetupMenu.isDisplayed();
            elePracticeHelpdeskSetupMenu.isDisplayed();
            isverify = Element.click(driver, eleClinicalMenu);
            eleERequestClinicalMenu.isDisplayed();
            eleDashboardClinicalMenu.isDisplayed();
            eleAppointmentinbox.isDisplayed();
            isverify = true;

        } else {
            isverify = false;
        }
        return isverify;
    }

    public boolean VerifyElementInSearchPaient() throws InterruptedException {
        boolean isVerify = false;
        if (lblSearchPatient.isDisplayed()) {
            DropDnSearchInSearchPatient.isDisplayed();
            BtnSearchPatientPage.isDisplayed();
            BtnlastnamefirstnameSearchpatient.isDisplayed();
            BtnfirstnamelastnameSearchpatient.isDisplayed();
            BtnClearSearchPatient.isDisplayed();
            BtnAutoSuggestSearchPatient.isDisplayed();
            lblAdvancedSearchPatient.isDisplayed();
            isVerify = Element.click(driver, BtnAdvancedSearchPatient);
            Thread.sleep(5000);
            lblAgeSearchPatient.isDisplayed();
            lblDOBSearchPatient.isDisplayed();
            lblToSearchPatient.isDisplayed();
            lblGenderSearchPatient.isDisplayed();
            lblEmailSearchPatient.isDisplayed();
            isVerify = true;
        }
        return isVerify;
    }

    public boolean VerifyStateOfAutoSuggestCheckBox() {
        boolean isVerify = false;
        if (BtnAutoSuggestSearchPatient.isSelected()) {
            isVerify = Element.click(driver, BtnAutoSuggestSearchPatient);
            isVerify = true;
            if (BtnAutoSuggestSearchPatient.isSelected()) {
                isVerify = false;
            } else {
                isVerify = true;
            }
        } else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean VerifyPatientSearchDelails() {
        boolean isVerify = false;
        if (lblDisplayPatientSearchPatient.isDisplayed()) {
            BtnVideoIconSearchPatient.isDisplayed();
            BtnSendAMessageSearchPatient.isDisplayed();
            BtnViewDashBoardSearchPatient.isDisplayed();
            BtnViewGoalsSearchPatient.isDisplayed();
            BtnClinicalNotesSearchPatient.isDisplayed();
            BtnViewHealthIndicatorSearchPatient.isDisplayed();
            BtnViewHealthSummarySearchPatient.isDisplayed();
            BtnViewJournalSearchPatient.isDisplayed();
            BtnViewProfileSearchPatient.isDisplayed();
            BtnBacktoSearchPatient.isDisplayed();
            isVerify = Element.click(driver, BtnBacktoSearchPatient);
            lblDisplayPatientSearchPatient.isDisplayed();
        }

        return isVerify;
    }

    public boolean ClickAdvancedButtonSearchPatient() throws InterruptedException {
        boolean isClicked = false;
        if (BtnAdvancedSearchPatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnAdvancedSearchPatient);
            Thread.sleep(5000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean VerifyelementsAndDetailsAfterClickingSearchBtn() throws InterruptedException {
        boolean isVerify = false;
        if (eleAnyAgeSearchPatient.isDisplayed()) {
//            isVerify = Combobox.selectValue(driver, eleAgeDropDownSearchPatient, TestdataConstants.AGEVALUE);
//            Thread.sleep(5000);
//            isVerify = Element.click(driver, TxtBoxToDropDownSearchPatient);
//            Combobox.getSelectedOption(driver, TxtBoxToDropDownSearchPatient);
//            isVerify = Element.click(driver, BtnClearSearchPatient);
//            Thread.sleep(5000);
            isVerify = Textbox.enterValue(driver, TxtBoxDOBSearchPatient, TestdataConstants.DOBSEARCHPATIENT);
            Thread.sleep(5000);
            isVerify = Element.click(driver, btnSearchPatient);
            lblpatientSearchPatient.isDisplayed();
            isVerify = Element.click(driver, btnClearSearchPatient);
            isVerify = Textbox.enterValue(driver, txtBoxEmailSearchPatient, TestdataConstants.EMAILPATIENT);
            Thread.sleep(5000);
            isVerify = Element.click(driver, btnSearchPatient);
            lblpatientSearchPatient.isDisplayed();
            isVerify = Element.click(driver, btnClearSearchPatient);
            Thread.sleep(5000);
        }

        return isVerify;
    }

    public boolean ClickDashBoardLink() {
        boolean isClicked = false;
        if (BtnViewDashBoardSearchPatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnViewDashBoardSearchPatient);
            Sync.Delay(4000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean VerifyElementsDashBoard() {
        boolean isVerify = false;
        Sync.Delay(4000);
        System.out.println("Moved To Verify State");
        if (lblPatientDashBoard.isDisplayed()) {
            System.out.println("Moved in To If Condition");
            btnGoalsDashBoard.isDisplayed();
            btnHealthSummaryDashBoard.isDisplayed();
            btnJournalDashBoard.isDisplayed();
            btnHealthIndicatorDashBoard.isDisplayed();
            btnViewProfileDashBoard.isDisplayed();
            btnSendAMessageDashBoard.isDisplayed();
            btnClinicalNotesDashBoard.isDisplayed();
            btnDashBoard.isDisplayed();
            lblHistoryTabDashBoard.isDisplayed();
            lblTrendsTabDashBoard.isDisplayed();
            lblmanagePatientTabDashBoard.isDisplayed();
            isVerify = true;
        } else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickPatientLink() {
        boolean isClicked = false;
        Sync.Delay(4000);
        if (BtnPatientDashBoard.isDisplayed()) {
            isClicked = Element.click(driver, BtnPatientDashBoard);
        }
        System.out.println("CLICK status" + isClicked);
        return isClicked;
    }

    public boolean VerifyVIewPatientElementsDisplays() {
        boolean isVerify = false;
        Sync.Delay(4000);
        if (lblViewPatient.isDisplayed()) {
            lblPatientCurrentConditionViewPatient.isDisplayed();
            lblPersonalDetailsViewPatient.isDisplayed();
            lblLoginDetailsViewPatient.isDisplayed();
            lblContactDetailsViewPatient.isDisplayed();
            lblInsuranceDetailsViewPatient.isDisplayed();
            lblAdditionalInfoViewPatient.isDisplayed();
            isVerify = true;
        } else {
            isVerify = false;
            System.out.println("Elements Not Displays");
        }
        return isVerify;
    }

    public boolean ClickBtnSearchPatient() {
        boolean isClicked = false;
        if (btnSearchPatient.isDisplayed()) {
            isClicked = Element.click(driver, btnSearchPatient);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ClickUpdateBtn() {
        boolean isClicked = false;
        if (BtnUpdateViewPatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnUpdateViewPatient);
            Sync.Delay(3000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean EnterNewValuesUpdateViewProfile() {
        boolean isEntred = false;
        if (BtnTitleViewPatient.isDisplayed()) {
            Element.click(driver, BtnTitleViewPatient);
            Element.click(driver, OptionMrsTitleViewPatient);
            Element.click(driver, BtnUpdateProfileViewPatient);
            isEntred = true;
        } else {
            System.out.println("Value Not Displays");
        }
        return isEntred;
    }

    public boolean VerifyUpdatedProfile() {
        boolean isVerify = false;
        if (lblFullNameViewPatient.isDisplayed()) {
            isVerify = true;
        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }


    public boolean EnterOldTitle() {
        boolean isEntred = false;
        if (BtnTitleViewPatient.isDisplayed()) {
            Element.click(driver, BtnTitleViewPatient);
            Element.click(driver, OptionMrTitleViewPatient);
            Element.click(driver, BtnUpdateProfileViewPatient);
            isEntred = true;
        } else {
            System.out.println("Value Not Displays");
        }
        return isEntred;
    }


    public boolean ClickCancelViewPatientUpdate() {
        boolean isClicked = false;
        if (BtnCancelUpdateViewPatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnCancelUpdateViewPatient);
            Sync.Delay(3000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean VerifyPageReturnBackToViewProfile() {
        boolean isVerify = false;
        if (lblFullNameUpdatedViewPatient.isDisplayed()) {
            isVerify = true;
        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }

    public boolean ClickEmergencyTabViewProfile() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (lblEmergencyContactsTabViewPatient.isDisplayed()) {
            isClicked = Element.click(driver, lblEmergencyContactsTabViewPatient);
            Sync.Delay(3000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ClickAdditionalInfoTab() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (lblAdditionalInfoTabViewPatient.isDisplayed()) {
            isClicked = Element.click(driver, lblAdditionalInfoTabViewPatient);
            Sync.Delay(3000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean VerifyElementsAddInfoViewPatient() {
        boolean isVerify = false;
        if (lblProviderViewPatient.isDisplayed()) {
            lblManagingProviderViewPatient.isDisplayed();
            lblClinicalDetailsViewPatient.isDisplayed();
            lblProposedStartDateViewPatient.isDisplayed();
            lblEndDateViewPatient.isDisplayed();
            lblTrialGroupViewPatient.isDisplayed();
            lblTrialStatusViewPatient.isDisplayed();
            lblExternalSysIntegViewPatient.isDisplayed();
            lblPatientIdViewPatient.isDisplayed();
            lblInterpreterServiceViewPatient.isDisplayed();
            lblInterpreterServiceViewPatient.isDisplayed();
            lblInterpretereViewPatient.isDisplayed();
            lblRegularGPViewPatient.isDisplayed();
            lblHospitalNameViewPatient.isDisplayed();
            lblURNViewPatient.isDisplayed();

            isVerify = true;
        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }

    public boolean ClickEditAddInfoBtn() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (BtnEditAddInfoViewPatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnEditAddInfoViewPatient);
            Sync.Delay(3000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean EnterValidValueAddInfo() {
        boolean isClicked = false;
        if (TxtBoxManagingProviderViewPatient.isDisplayed()) {
            Element.click(driver, TxtBoxManagingProviderViewPatient);
            Element.click(driver, TxtBoxManagingProviderValueViewPatient);
            Element.click(driver, TxtBoxClicinViewPatient);
            Element.click(driver, TxtBoxclinicValueViewPatient);
            Textbox.enterValue(driver, TxtBoxProviderFirstNameViewPatient, TestdataConstants.FIRSTNAMEEDITADDINFO);
            Textbox.enterValue(driver, TxtBoxProviderLastNameViewPatient, TestdataConstants.LASTNAMEEDITADDINFO);
            Element.click(driver, BtnUpdateProfileEditViewPatient);
            Sync.Delay(3000);
            isClicked = true;
        } else {
            System.out.println("Not Displays");
        }
        return isClicked;
    }

    public boolean VerifyUpdatedprofileView() {
        boolean isVerify = false;
        if (TxtBoxProviderFirstNameValueViewPatient.isDisplayed()) {
            isVerify = true;
        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }

    public boolean ClickCancelBtnAddInfoEdit() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (BtnCancelEditViewPatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnCancelEditViewPatient);
            Sync.Delay(3000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean VerifyPagereturnbackAddInfo() {
        boolean isVerify = false;
        if (BtnEditAddInfoViewPatient.isDisplayed()) {
            isVerify = true;
        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }

    public boolean ClickDeviceInfoTab() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (lblDeviceInfoTabViewPatient.isDisplayed()) {
            isClicked = Element.click(driver, lblDeviceInfoTabViewPatient);
            Sync.Delay(3000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean VerifyElementsDisplaysDeviceInfoTab() {
        boolean isVerify = false;
        if (lblDeviceNameViewPatient.isDisplayed()) {
            lblSerialNoViewPatient.isDisplayed();
            lblMACAddressViewPatient.isDisplayed();
            lblIMEINoViewPatient.isDisplayed();
            isVerify = true;
        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }

    public boolean ClickAddBtnDeviceInfo() {
        boolean isClicked = false;
        if (BtnAddViewPatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnAddViewPatient);

            Sync.Delay(3000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean EnterInfoInDevice() {
        boolean isEntred = false;
        if (lblAddDeviceInfoViewPatient.isDisplayed()) {
            lblDeviceViewPatient.isDisplayed();
            Element.click(driver, TxtBoxDeviceDeviceInfoViewPatient);
            WebElement ele = driver.findElement(By.xpath(TxtBoxValueDeviceInfoViewPatient.replace("<<REPLACE>>", TestdataConstants.DEVICVALUE)));
            Element.click(driver, ele);
            Textbox.enterValue(driver, TxtBoxMacaddDeviceInfoViewPatient, "12");
            Textbox.enterValue(driver, TxtBoxMacadd1DeviceInfoViewPatient, "12");
            Textbox.enterValue(driver, TxtBoxMacadd2DeviceInfoViewPatient, "12");
            Textbox.enterValue(driver, TxtBoxMacadd3DeviceInfoViewPatient, "12");
            Textbox.enterValue(driver, TxtBoxMacadd4DeviceInfoViewPatient, "12");
            Textbox.enterValue(driver, TxtBoxMacadd5DeviceInfoViewPatient, "12");
            Textbox.enterValue(driver, txtboxSerialNumberViewPatient, TestdataConstants.SERIALNUMADDINFO);
            Textbox.enterValue(driver, txtboxIMEINumberViewPatient, TestdataConstants.SERIALNUMADDINFO);
            Sync.Delay(3000);
            System.out.println("Going To Click");
            Element.click(driver, BtnSaveDeviceinfoViewPatient);
            Sync.Delay(10000);
        } else {
            System.out.println("Not Displays");
        }
        return isEntred;
    }

    public boolean VerifySavedDeviceInfo() {
        boolean isVerify = false;
        if (BtnAddViewPatient.isDisplayed()) {
            WebElement ele = driver.findElement(By.xpath(CreatedValueDeviceInfoViewPatient.replace("<<REPLACE>>", TestdataConstants.SERIALNUMADDINFO)));
            ele.isDisplayed();
            Element.click(driver, BtnAddViewPatient);
            lblDeviceViewPatient.isDisplayed();
            Element.click(driver, BtnSaveDeviceinfoViewPatient);
            WarningIMEIDeviceInfoViewPatient.isDisplayed();
            Element.click(driver, BtnCloseDeviceinfoViewPatient);
            isVerify = true;
        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }

    public boolean ClickClinicalNotes() {
        boolean isClicked = false;
        if (BtnClinicalNotesSearchPatient.isDisplayed()) {
            isClicked = Element.click(driver, BtnClinicalNotesSearchPatient);

            Sync.Delay(5000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ClickAddClinicalNotesbtn() {
        boolean isClicked = false;
        if (BtnAddClinicalNotes.isDisplayed()) {
            isClicked = Element.click(driver, BtnAddClinicalNotes);
            Sync.Delay(3000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean VerifyClincalNotesUI() {
        boolean isVerify = false;
        Sync.Delay(6000);
        if (BtnAddClinicalNotes.isDisplayed()) {
            Element.verifyElement(lblPatientNameClinicalNotes);
            Element.verifyElement(lblHealthIndicatorClinicalNotes);
            Element.verifyElement(lblContactDetailsClinicalNotes);
            Element.verifyElement(lblNotesClinicalNotes);
            Element.verifyElement(TxtBoxMedicalWarningClinicalNotes);
            Combobox.selectText(driver, TxtBoxHealthCentreClinicalNotes, TestdataConstants.HEALTHCENTRE);
            Textbox.enterValue(driver, TxtBoxReaseonForVisitClinicalNotes, TestdataConstants.EDITEDFIRSTNAME);
            Textbox.enterValue(driver, TxtBoxSubjectiveClinicalNotes, TestdataConstants.SEARCHPATIENT);
            Textbox.enterValue(driver, TxtBoxObjectiveClinicalNotes, TestdataConstants.SEARCHPATIENT);
            Textbox.enterValue(driver, TxtBoxDiagnosisClinicalNotes, TestdataConstants.SEARCHPATIENT);
            Element.click(driver, BtnSaveClinicalNotes);
            Sync.Delay(6000);
            Element.VerifyText(driver, CreatedClinicalNotes, TestdataConstants.EDITEDFIRSTNAME);
            System.out.println("Displays");
            isVerify = true;

        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }

    public boolean ClickCancelClinicalNotes() {
        boolean isClicked = false;
        if (BtnCancelClinicalNotes.isDisplayed()) {
            isClicked = Element.click(driver, BtnCancelClinicalNotes);
            Sync.Delay(5000);
            Element.verifyElement(lblClinicalNotes);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ClickPrescriptionTab() {
        boolean isClicked = false;
        if (BtnPrescriptionTabClinicalNotes.isDisplayed()) {
            isClicked = Element.click(driver, BtnPrescriptionTabClinicalNotes);
            Sync.Delay(5000);
            Alert.acceptAlert(driver);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ClickViewClinicalNotes() {
        boolean isClicked = false;
        if (BtnAddClinicalNotes.isDisplayed()) {
            Element.ClickText(driver, ViewClinicalNotes, TestdataConstants.EDITEDFIRSTNAME);
            Sync.Delay(5000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean VerifyPrescriptionTabElements() {
        boolean isVerify = false;
        Sync.Delay(6000);
        if (BtnPrescriptionTabClinicalNotes.isDisplayed()) {
            Element.verifyElement(lblStartDatePrescriptionTab);
            Element.verifyElement(lblDrugNamePrescriptionTab);
            Element.verifyElement(lblDosagePrescriptionTab);
            Element.verifyElement(lblStrengthPrescriptionTab);
            Element.verifyElement(lblFrequencyPrescriptionTab);
            Element.verifyElement(lblPeriodPrescriptionTab);
            Element.verifyElement(lblStatusPrescriptionTab);
            Element.verifyElement(lblMoreInfoPrescriptionTab);
            Element.verifyElement(lblStatePrescriptionTab);
            isVerify = true;

        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }

    public boolean VerifyUIDisplaysClinicalNotes() {
        boolean isVerify = false;
        Sync.Delay(6000);
        if (BtnAddClinicalNotes.isDisplayed()) {
            Element.verifyElement(lblReasonForVisitClinicalNotes);
            Element.verifyElement(lblDateClinicalNotes);
            Element.verifyElement(lblProviderNameClinicalNotes);
            Element.verifyElement(lblPracticeNameClinicalNotes);
            Element.click(driver, BtnBackToPatientClinicalNotes);
            Sync.Delay(5000);
            Element.verifyElement(lblDashBoard);
            isVerify = true;

        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }

    public boolean ClickEditBtnClinicalNotes() {
        boolean isClicked = false;
        if (BtnAddClinicalNotes.isDisplayed()) {
            Element.ClickText(driver, EditClinicalNotes, TestdataConstants.EDITEDFIRSTNAME);
            Sync.Delay(5000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean EditAndVerifyClinicalNotes() {
        boolean isEntered = false;
        if (lblTabClinicalNotes.isDisplayed()){
            TxtBoxReaseonForVisitClinicalNotes.clear();
            Textbox.enterValue(driver,TxtBoxReaseonForVisitClinicalNotes, TestdataConstants.FIRSTNAMEEDITADDINFO);
            Element.click(driver, BtnSaveClinicalNotes);
            Sync.Delay(6000);
            Element.VerifyText(driver, CreatedClinicalNotes, TestdataConstants.FIRSTNAMEEDITADDINFO);
            isEntered = true;
        }else {
            System.out.println("Not Displays");
        }
        return isEntered;
    }

    public boolean ClickReEditBtnClinicalNotes() {
        boolean isClicked = false;
        if (BtnAddClinicalNotes.isDisplayed()) {
            Element.ClickText(driver, EditClinicalNotes, TestdataConstants.FIRSTNAMEEDITADDINFO);
            Sync.Delay(5000);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ReEditTheClinicalNotesAgain() {
        boolean isEntered = false;
        if (lblTabClinicalNotes.isDisplayed()){
            TxtBoxReaseonForVisitClinicalNotes.clear();
            Textbox.enterValue(driver,TxtBoxReaseonForVisitClinicalNotes, TestdataConstants.EDITEDFIRSTNAME);
            Element.click(driver, BtnSaveClinicalNotes);
            Sync.Delay(6000);
            Element.VerifyText(driver, CreatedClinicalNotes, TestdataConstants.EDITEDFIRSTNAME);
            isEntered = true;
        }else {
            System.out.println("Not Displays");
        }
        return isEntered;
    }

    public boolean ClickAuditTabClinicalNotes() {
        boolean isClicked = false;
        if (BtnAuditTabClinicalNotes.isDisplayed()) {
            isClicked = Element.click(driver, BtnAuditTabClinicalNotes);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean VerifyAuditTabUIClinicalNotes() {
        boolean isVerify = false;
        Sync.Delay(6000);
        if (lblmodifieddateClinicalNotes.isDisplayed()) {
            Element.click(driver, BtnAuditLogClinicalNotes);
            Element.verifyElement(AuditWindowClinicalNotes);
            Element.verifyElement(lblDateTimeAuditWinClinicalNotes);
            Element.click(driver, BtnCloseAuditWinClinicalNotes);
            isVerify = true;

        } else {
            System.out.println("Not Displays");
        }
        return isVerify;
    }

    public boolean ClickAddMedication() {
        boolean isClicked = false;
        if (BtnAddMedicationPrescriptionClinicalNotes.isDisplayed()) {
            isClicked = Element.click(driver, BtnAddMedicationPrescriptionClinicalNotes);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean EnterValuesInAddMedication() {
        boolean isEntered = false;
        if (WindowAddMedicationPrescriptionClinicalNotes.isDisplayed()){

        }
        return  isEntered;
    }
}

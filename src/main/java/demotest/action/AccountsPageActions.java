package demotest.action;

import commonpage.toolbox.Alert;
import commonpage.toolbox.Element;
import commonpage.toolbox.Sync;
import commonpage.toolbox.Textbox;
import commonpage.util.Testdata;
import commonpage.util.TestdataConstants;
import demotest.Repository.AccountsPageUI;
import org.openqa.selenium.WebDriver;


import java.util.List;

public class AccountsPageActions extends AccountsPageUI {

    /**
     * @param driver
     */

    public AccountsPageActions(WebDriver driver) {
        super(driver);
    }


    public boolean verifyMyAccountPage() {
        Boolean isVerified = false;
        if (lblMyAccount.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickMyHealthCentresTab() {
        Boolean isClicked = false;
        if (eleMYHEALTHCENTRES.isDisplayed()) {
            isClicked = Element.click(driver, eleMYHEALTHCENTRES);
        }
        return isClicked;
    }

    public boolean verifyClinicalStaffPresentasRole() {
        Boolean isVerified = false;
        if (eleRoleClinicalStaff.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickAccessInformationTab() {
        Boolean isClicked = false;
        if (eleACCESSINFORMATION.isDisplayed()) {
            isClicked = Element.click(driver, eleACCESSINFORMATION);
        }
        return isClicked;
    }

    public boolean verifyAccessInformationPage() {
        Boolean isVerified = false;
        if (lblAccessInformation.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }


    public boolean clickEmergencyContactsTab() {
        Boolean isClicked = false;
        if (eleEMERGENCYCONTACTS.isDisplayed()) {
            isClicked = Element.click(driver, eleEMERGENCYCONTACTS);
        }
        return isClicked;
    }

    public boolean verifyEmergencyContactsPage() {
        Boolean isVerified = false;
        if (lblEmergencyContacts.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickAddEmergencyContacts() {
        Boolean isClicked = false;
        if (btnAddEmergencyContacts.isDisplayed()) {
            isClicked = Element.click(driver, btnAddEmergencyContacts);
        }
        return isClicked;
    }

    public boolean enterFirstNameInAddEmergencyContacts(String strFirstName) throws InterruptedException {
        Boolean isEntered = false;
        if (txtFirstName.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtFirstName, strFirstName);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean enterMobilePhoneInAddEmergencyContacts(String strMobilePhone) throws InterruptedException {
        Boolean isEntered = false;
        if (txtMobilePhone.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtMobilePhone, strMobilePhone);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean enterRelationshipInAddEmergencyContacts(String strRelationship) throws InterruptedException {
        Boolean isEntered = false;
        if (txtRelationship.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtRelationship, strRelationship);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean enterLastNameInAddEmergencyContacts(String strLastName) throws InterruptedException {
        Boolean isEntered = false;
        if (txtLastName.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtLastName, strLastName);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean clickSaveEmergencyContacts() {
        Boolean isClicked = false;
        if (btnSave.isDisplayed()) {
            isClicked = Element.click(driver, btnSave);
        }
        return isClicked;
    }

    public boolean clickDeleteEmergencyContacts() {
        Boolean isClicked = false;
        if (btnDelete.isDisplayed()) {
            isClicked = Element.click(driver, btnDelete);
        }
        return isClicked;
    }

    public boolean verifyEmergencyContactsAdded() {
        Boolean isVerified = false;
        if (lblEmergenyContactsAdded.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean AcceptAlert() {
        boolean isAccept = false;
        isAccept = Alert.acceptAlert(driver);
        return isAccept;
    }

    public boolean clickUpdateProfile() {
        Boolean isClicked = false;
        if (lblUpdateProfile.isDisplayed()) {
            isClicked = Element.click(driver, lblUpdateProfile);
        }
        return isClicked;
    }

    public boolean clickUpdateProfileButton() {
        Boolean isClicked = false;
        if (btnUpdateProfile.isDisplayed()) {
            isClicked = Element.click(driver, btnUpdateProfile);
        }
        return isClicked;
    }

    public boolean verifyUpdateProfilePage() {
        Boolean isVerified = false;
        if (lblEditProfileDetails.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean enterMobilePhoneNumberInEditProfileDetails(String strMobilePhoneEditProfileDetails){
        Boolean isEntered = false;
        if (txtMobilePhoneEditProfileDetails.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtMobilePhoneEditProfileDetails, strMobilePhoneEditProfileDetails);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean verifyUpdatedProfileDetails(){
        Boolean isVerified = false;
        if(lblUpdatedMobilePhone.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clearMobilePhoneNumberInEditProfileDetails(){
        Boolean isEntered = false;
        if (txtMobilePhoneEditProfileDetails.isDisplayed()) {
            isEntered = Textbox.clearValue(driver, txtMobilePhoneEditProfileDetails);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean ClickChangePassword() {
        Boolean isClicked = false;
        if (lblUpdateProfile.isDisplayed()) {
            isClicked = Element.click(driver, BtnChangePassword);
        }
        return isClicked;
    }

    public boolean entercurrentpassword(String StrCurrentpassword) {

        Boolean isEntered = false;
        if (txtBoxCurrentPassword.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtBoxCurrentPassword, StrCurrentpassword);
        } else {
            isEntered = false;
        }
        return isEntered;

    }
    public boolean enternewpassword(String StrNewpassword) {

        Boolean isEntered = false;
        if (txtBoxNewPassword.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtBoxNewPassword, StrNewpassword);
        } else {
            isEntered = false;
        }
        return isEntered;

    }
    public boolean enterconfirmnewpassword(String StrConfirmNewpassword) {

        Boolean isEntered = false;
        if (txtBoxConfirmNewPassword.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtBoxConfirmNewPassword, StrConfirmNewpassword);
        } else {
            isEntered = false;
        }
        return isEntered;

    }

    public boolean ClickBtnChangePassword() {
        Boolean isClicked = false;
        if (BtnChangepasswordGreenBtn.isDisplayed()) {
            isClicked = Element.click(driver, BtnChangepasswordGreenBtn);
        }
        return isClicked;

    }

    public  Boolean Verifytheerrortextdisplays() {
        Boolean isVerify = false;
        String strActualTxt=ErrorTextInChangePassword.getText();
        if(strActualTxt.equals(TestdataConstants.INCORRECTPASSWORDWARNINGTEXT))
        {
            isVerify=true;
        }
        else
        {
            isVerify=false;
        }
        return isVerify;

    }

    public boolean verifyrequiredformatdisplays() {
        Boolean isVerify = false;
        String strActualTxt=ErrorTextMatchTherequest.getText();
        if(strActualTxt.equals(TestdataConstants.REQUIREDFORMATEOOROTEXT))
        {
            isVerify=true;
        }
        else
        {
            isVerify=false;
        }
        return isVerify;

    }

    public boolean VerifyConfirmAndNewPasswordMissmatch() {
        Boolean isVerify = false;
        String strActualTxt=ErrorTextMissMatchConfirmNewPassword.getText();
        if(strActualTxt.equals(TestdataConstants.CONFIRMPASSWORDMISSMATCH))
        {
            isVerify=true;
        }
        else
        {
            isVerify=false;
        }
        return isVerify;
    }

    public boolean ClickChangePhotoBtn() {
        Boolean isClicked = false;
        if (BtnChangePhotoMyACC.isDisplayed()) {
            isClicked = Element.click(driver, BtnChangePhotoMyACC);
        }
        return isClicked;


    }

    public boolean ClickChooseBtn() {
        Boolean isClicked = false;
        if (BtnChooseFile.isDisplayed()) {
            isClicked = Element.click(driver, BtnChooseFile);
        }
        return isClicked;
    }

    public boolean ClickverifyBtn() {
        Boolean isClicked = false;
        if (BtnVerifyMyAcc.isDisplayed()) {
            isClicked = Element.click(driver, BtnVerifyMyAcc);
        }
        return isClicked;

    }

    public boolean VerifyTheWarningDisplays() {
        Boolean isVerify = false;

        if(WarningimageNotMatched.isDisplayed())
        {
            isVerify=true;
        }
        else
        {
            isVerify=false;
        }
        return isVerify;

    }

    public boolean ClickCancelMyAccountMHC() {
        Boolean isClicked = false;
        if (BtnCancelMyACC.isDisplayed()) {
            isClicked = Element.click(driver, BtnCancelMyACC);
        }
        return isClicked;

    }

    public boolean VerifyThePageRedirectToProfileTab() {
        Boolean isVerify = false;

        if(CaptionProfilePhoto.isDisplayed())
        {
            isVerify=true;
        }
        else
        {
            isVerify=false;
        }
        return isVerify;

    }

    public boolean ClickEditButton() {

        Boolean isClicked = false;
        if (btnEditEmergenceContact.isDisplayed()) {
            isClicked = Element.click(driver, btnEditEmergenceContact);
        }
        return isClicked;
    }

    public boolean VerifyTheEditedTextGotSaved() {
        Boolean isVerify = false;
        String strActualTxt=lblEmergenyContactsAdded.getText();
        if(strActualTxt.equals(TestdataConstants.EDITEDFIRSTNAME))
        {
            isVerify=true;
        }
        else
        {
            isVerify=false;
        }
        return isVerify;
    }
    public boolean enterFirstNameEditedEmergencyContacts(String strFirstName) throws InterruptedException {
        Boolean isEntered = false;
        if (txtFirstNameEdit.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtFirstNameEdit, strFirstName);
        } else {
            isEntered = false;
        }
        return isEntered;
    }
    public boolean clickSaveEditEmergencyContacts() {
        Boolean isClicked = false;
        if (BtnSaveEdit.isDisplayed()) {
            isClicked = Element.click(driver, BtnSaveEdit);
        }
        return isClicked;
    }


    public boolean ClickCancelEmergencyContacts() {
        Boolean isClicked = false;
        if (BtnCancelEmergencyContacts.isDisplayed()) {
            isClicked = Element.click(driver, BtnCancelEmergencyContacts);
        }
        return isClicked;

    }

    public boolean VerifyThePageRedirectToEmergencyContacts() {
        boolean isVerify = false;

        if (CaptionEmergencyContacts.isDisplayed()){
            isVerify = true;
        }
        else {
            isVerify= false;
        }
        return isVerify;

    }

    public boolean VerifyTheProfileDetailsUIDisplays() {
        boolean isVerify = false;
        if (CaptionProfilePhoto.isDisplayed()){
            lblUpdateProfile.isDisplayed();
            lblFullNamePD.isDisplayed();
            lblPreferedNamePD.isDisplayed();
            lblGenderPD.isDisplayed();
            lblDOBPD.isDisplayed();
            lblOccupationPD.isDisplayed();
            lblUsernameEmailPD.isDisplayed();
            lblPasswordPD.isDisplayed();
            lblStreetPD.isDisplayed();
            lblCityProvinceCountyPD.isDisplayed();
            lblPostCodePD.isDisplayed();
            lblHomePhonePD.isDisplayed();
            lblMobilePhonePD.isDisplayed();
            lblWorkPhonePD.isDisplayed();
            lblInsuranceCarrierPD.isDisplayed();
            lblCompanyNamePD.isDisplayed();
            lblCoveragePD.isDisplayed();
            lblGroupNamePD.isDisplayed();
            lblGroupNumberPD.isDisplayed();
            lblIDNumberPD.isDisplayed();
            lblAppointmentConfirmationModePD.isDisplayed();
            lblResidencyStatusPD.isDisplayed();
            isVerify = true;

        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean VerifyTheMyAccountTabsDisplays() {
        boolean isVerify = false;
        if (lblMyAccount.isDisplayed()){
            eleProfileTab.isDisplayed();
            eleMYHEALTHCENTRES.isDisplayed();
            eleACCESSINFORMATION.isDisplayed();
            eleEMERGENCYCONTACTS.isDisplayed();
            isVerify = true;

        }
        else {
            isVerify = false;
        }
        return isVerify;
    }
}



//
//
//    public boolean enterValiedDataInEmergencyContactsPane(String lstValues) {
//        Boolean isEntered = false;
//        for (int i = 0; i <= lstValues.size(); i++) {
//            switch (i) {
//                case 0:
//                    if (Element.verifyElement(txtFirstName)) {
//                        isEntered = Textbox.enterValue(driver, txtFirstName, Testdata.getValue(lstValues.get(i)));
//                        break;
//                    }
//                case 1:
//                    if (Element.verifyElement(txtMobilePhone)) {
//                        isEntered = Textbox.enterValue(driver, txtMobilePhone, Testdata.getValue(lstValues.get(i)));
//                        break;
//                    }
//                case 2:
//                    if (Element.verifyElement(txtRelationship)) {
//                        isEntered = Textbox.enterValue(driver, txtRelationship, Testdata.getValue(lstValues.get(i)));
//                        break;
//                    }
//                case 3:
//                    if (Element.verifyElement(txtLastName)) {
//                        isEntered = Textbox.enterValue(driver, txtLastName, Testdata.getValue(lstValues.get(i)));
//                        break;
//                    }
//            }
//
//        }
//        return isEntered;
//    }

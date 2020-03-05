package demotest.action;

import commonpage.toolbox.Combobox;
import commonpage.toolbox.Element;
import commonpage.toolbox.Textbox;
import demotest.Repository.SetupPageUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SetupPageActions extends SetupPageUI {
    public SetupPageActions(WebDriver driver) {
        super(driver);
    }



    public boolean verifySetupEservicesPage(){
        Boolean isVerified = false;
        if(lblSetupEservices.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }


    public boolean clickSetupEserviceIcon()
    {
        Boolean isClicked=false;
        isClicked = Element.click(driver, btnAddEsevices);
        return isClicked;
    }


    public boolean clickAddNewEService() throws InterruptedException {
        Boolean isClicked = false;
        System.out.println("Methos entry");
        Thread.sleep(4000);
        //Sync.waitForElementToBeClickable(driver, btnAddEsevices);
        System.out.println("LOCATOR" + btnAddEsevices.isDisplayed());
        isClicked = Element.click(driver, btnAddEsevices);
        return isClicked;
    }

    public boolean selectValuefromHealthCentre(String strHealthCentre){
        Boolean isSelcted = false;
        if(ddbHealthCentre.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbHealthCentre, strHealthCentre);
        }
        return isSelcted;
    }

    public boolean selectValuefromServiceCategory(String strServiceCategory){
        Boolean isSelcted = false;
        if(ddbServiceCategory.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbServiceCategory, strServiceCategory);
        }
        return isSelcted;
    }

    public boolean enterServiceName(String strServiceName) {
        Boolean isEntered = false;
        if (txtServiceName.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtServiceName, strServiceName);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean enterServiceCode(String strServiceCode) {
        Boolean isEntered = false;
        if (txtServiceCode.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtServiceCode, strServiceCode);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean clickPatientCheckBox(){
        Boolean isClicked = false;
        isClicked = Element.click(driver, chkBoxPatient);
        return isClicked;
    }

    public boolean selectValuefromRecipientRole(String strRecipientRole){
        Boolean isSelcted = false;
        if(ddbRecipientRole.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbRecipientRole, strRecipientRole);
        }
        return isSelcted;
    }

    public boolean selectValuefromRecipient(String strRecipient){
        Boolean isSelcted = false;
        if(ddbRecipient.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbRecipient, strRecipient);
        }
        return isSelcted;
    }

    public boolean enterDescription(String strDescription) {
        Boolean isEntered = false;
        if (txtDescription.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtDescription, strDescription);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean enterTerms(String strTerms) {
        Boolean isEntered = false;
        if (txtTerms.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtTerms, strTerms);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean clickSaveEService(){
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnSaveEService);
        return isClicked;
    }

    public boolean verifyPracticeDetails(){
        Boolean isVerified = false;
        if(lblPracticeDetails.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean VerifyTheCreatedSetupDiplays(String strValue) {
        System.out.println("pass");
        Boolean isVerified = false;
        System.out.println("pass");
        WebElement ele = driver.findElement(By.xpath(StrSetupCreatedRecordEService.replace("<<REPLACE>>", strValue)));
        if (ele.isDisplayed()) {
            System.out.println("actual value" + ele);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean ClickCancelButtonEServiceMenu() {
        boolean isClicked = false;
        if (BtnCancelEServiceMenu.isDisplayed()){
            isClicked = Element.click(driver, BtnCancelEServiceMenu);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyThePageRedirectedToSetupESerice() {
        Boolean isVerified = false;
        if(lblShowActiveEService.isDisplayed()){
            isVerified = true;
        }
        else {
            isVerified = false;
        }
        return isVerified;
    }

    public boolean ClickEditBtnForCreatedSetup(String StrEditvalue) {
        boolean isClicked = false;
        System.out.println("pass");
        WebElement Edit = driver.findElement(By.xpath(BtnEditESerivice.replace("<<REPLACE>>", StrEditvalue)));
        if (Edit.isDisplayed()){
            isClicked = Element.click(driver, Edit);
            System.out.println("actual value" + Edit);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClearTheNameTxtBox() {
        boolean isCleared = false;
        if (txtServiceNameEdit.isDisplayed()){
            isCleared = Textbox.clearValue(driver, txtServiceNameEdit);
            isCleared = true;
        }
        else {
            isCleared = false;
        }
        return isCleared;
    }

    public boolean EnterEditedValueInNameTxtBox(String StrEditedTxt) {
        boolean isEntered = false;
        if (txtServiceNameEdit.isDisplayed()){
            isEntered = Textbox.enterValue(driver, txtServiceNameEdit, StrEditedTxt);
            isEntered= true;
        }else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean ClickEditSaveBtn() {
        boolean isClicked =false;
        if (btnEditSaveEService.isDisplayed()){
            isClicked = Element.click(driver, btnEditSaveEService);
            isClicked= true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheSucessMessageDisplays() {
        boolean isVerify = false;
        if (lblSuccessMessageEService.isDisplayed()){
            isVerify =true;
        }
        else {
            isVerify = true;
        }
        return isVerify;
    }

    public boolean ClickReturnBtnEService() {
        boolean isClicked =false;
        if (BtnReturnEService.isDisplayed()){
            isClicked = Element.click(driver, BtnReturnEService);
            isClicked= true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickStatusBtnEService(String StrClickStatus) {
        boolean isClicked = false;
        System.out.println("pass");
        WebElement Status = driver.findElement(By.xpath(BtnStatusEService.replace("<<REPLACE>>", StrClickStatus)));
        if (Status.isDisplayed()){
            isClicked = Element.click(driver, Status);
            System.out.println("actual value" + Status);
            isClicked = true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheServiceStatusWindowDisplays() {
        boolean isVerify = false;
        if (lblServiceTypeStatusSettings.isDisplayed()){
            isVerify =true;
        }
        else {
            isVerify = true;
        }
        return isVerify;
    }

    public boolean VerifytheSrviceNameDisplays(String strCreatedStatus) {
        boolean isVerify =false;
        System.out.println("Enters into If Condition");
        WebElement ServiceName = driver.findElement(By.xpath(lblSelectedService.replace("<<REPLACE>>", strCreatedStatus)));
        if (ServiceName.isDisplayed()){
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;

    }

    public boolean ClickSettingTabMyParactice() {
        boolean isClicked =false;
        if (BtnSettingsMyPractice.isDisplayed()){
            isClicked = Element.click(driver, BtnSettingsMyPractice);
            isClicked= true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean ClickEditBtnMyPractice() {
        boolean isClicked =false;
        if (BtnEditMyPractice.isDisplayed()){
            isClicked = Element.click(driver, BtnEditMyPractice);
            isClicked= true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean CLickUpdateBtnPracticeSettings() {
        boolean isClicked =false;
        if (BtnUpdatePracticeSettings.isDisplayed()){
            isClicked = Textbox.clearValue(driver, TxtBoxDaysPracticeSettings);
            isClicked = Element.click(driver, BtnUpdatePracticeSettings);
            isClicked= true;
        }
        else {
            isClicked = false;
        }
        return isClicked;
    }

    public boolean VerifyTheRequiredWarningDisplaysPracticeSettings() {
        boolean isVerify =false;
        if (lblRequiredWarningPracticeSettings.isDisplayed()){
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean VerifyThePageRedirectedToPracticeSettingsMenu() {
        boolean isVerify =false;
        if (BtnEditMyPractice.isDisplayed()){
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean VerifyAllTheElementsInEservice() {
        boolean isVerify =false;
        if (lblSetupEservices.isDisplayed()){
            lblHealthCentreEservices.isDisplayed();
            lblServiceCategoryEservices.isDisplayed();
            lblServiceNameEservices.isDisplayed();
            lblServiceCodeEservices.isDisplayed();
            lblRecipientEservices.isDisplayed();
            lblAppliesToEservices.isDisplayed();
            lblDescriptionEservices.isDisplayed();
            lblPaymentOptionEservices.isDisplayed();
            lblTermsEservices.isDisplayed();
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean VerifySuccessMessageGroupMail() {
        boolean isVerify =false;
        if (lblSuccessMessageEservices.isDisplayed()){
            isVerify = true;
        }
        else {
            isVerify = false;
        }
        return isVerify;
    }

    public boolean ClickSentTabGroupMail() {
        boolean isClicked = false;
        if (btnSentTabEservices.isDisplayed()){
            isClicked = Element.click(driver, btnSentTabEservices);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ClickSubjectAndVerifyElementsGroupMail() {
        boolean isVerify = false;
        if (BtnCreatedSubjectGroupMessage.isDisplayed()){
            isVerify = Element.click(driver, BtnCreatedSubjectGroupMessage);
            lblFromGroupMessage.isDisplayed();
            lblDateGroupMessage.isDisplayed();
            lblMessageGroupMessage.isDisplayed();
            lblToGroupMessage.isDisplayed();
            lblSubjectGroupMessage.isDisplayed();
            BtnComposeGroupMessage.isDisplayed();
            BtnNextGroupMessage.isDisplayed();
            BtnBackGroupMessage.isDisplayed();
            isVerify = Element.click(driver,BtnBackGroupMessage);
            BtnCreatedSubjectGroupMessage.isDisplayed();
        }
        return isVerify;
    }

    public boolean VerifyAllTheElementsDisplaysInMyPracticePage() {
        boolean isVerify = false;
        if (lblPracticeDetails.isDisplayed()){
            lblLocation1MyPractice.isDisplayed();
            lblLocation2MyPractice.isDisplayed();
            lblMessageGroupMessage.isDisplayed();
            lblToGroupMessage.isDisplayed();
            lblSubjectGroupMessage.isDisplayed();
            BtnComposeGroupMessage.isDisplayed();
            BtnNextGroupMessage.isDisplayed();
            BtnBackGroupMessage.isDisplayed();
            isVerify = Element.click(driver,BtnBackGroupMessage);
            BtnCreatedSubjectGroupMessage.isDisplayed();
        }
        return isVerify;
    }
}
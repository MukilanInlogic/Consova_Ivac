package demotest.action;

import com.sun.jna.platform.win32.Wdm;
import com.thoughtworks.selenium.webdriven.commands.Check;
import commonpage.toolbox.*;
import commonpage.util.DateUtil;
import commonpage.util.TestdataConstants;
import demotest.Repository.HomePageUI;
import gherkin.lexer.El;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class HomePageActions extends HomePageUI {
    public HomePageActions(WebDriver driver) {
        super(driver);
    }

    public ArrayList<String> tabs_windows;

    public boolean verifyLoginPage() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,2000);
        if (imgLoginPage.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean lastNameText(String lastName) {
        boolean isEntered = false;
        Sync.ImplicityDelay(driver,2000);
        if (LastNameTxt.isDisplayed()) {
            Textbox.enterValue(driver,LastNameTxt,lastName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean consovaIdText(String consovaID) {
        boolean isEntered = false;
        Sync.ImplicityDelay(driver,3000);
        if (consovaIDTxt.isDisplayed()) {
            Textbox.enterValue(driver,consovaIDTxt,consovaID);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean ssnText(String sSN) {
        boolean isEntered = false;
        Sync.ImplicityDelay(driver,3000);
        if (sSNTxt.isDisplayed()) {
            Textbox.enterValue(driver,sSNTxt,sSN);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyLoginButton() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,2000);
        if (loginButton.isEnabled()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean errorMessageVerify() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,2000);
        if (errorMessage.isEnabled()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean loginButton() {
        boolean isClicked = false;
        Sync.ImplicityDelay(driver,2000);
        if (loginButton.isDisplayed()){
            Element.click(driver,loginButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean disclaimerPageVerify() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,2000);
        if (disclaimer1.isEnabled()) {
            if (disclaimer2.isEnabled()) {
                if (disclaimer3.isEnabled()) {
                    if (disclaimer4.isEnabled()) {
                        if (disclaimer5.isEnabled()) {
                            if (disclaimer6.isEnabled()) {
                                if (disclaimer7.isEnabled()) {
                                    if (disclaimer8.isEnabled()) {
                                        isVerified = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean verifyHomePage() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,20000);
        if (dashboardTitle.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyWarning() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (warningButton.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean warningButton() {
        boolean isClicked = false;
        Sync.ImplicityDelay(driver,20000);
        if (warningButton.isDisplayed()){
            Element.click(driver,warningButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean enterURL(String url) {
        boolean isEntered = false;
        Sync.ImplicityDelay(driver,5000);
        if (driver!=null){
            driver.get(url);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean logoffButton() {
        boolean isClicked = false;
        Sync.Delay(7000);
        Sync.ImplicityDelay(driver,7000);
        if (logOffButton.isDisplayed()){
            Element.click(driver,logOffButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean disclaimerAcceptButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (acceptButton.isDisplayed()){
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();",acceptButton);
            //Element.click(driver,acceptButton);
            isClicked = true;
        }else{
            System.out.println("No disclaimer notice");
        }
        return isClicked;
    }

    public boolean disclaimerDeclineButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (declineButton.isDisplayed()){
            Element.click(driver,declineButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verificationDetails() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,5000);
        if (verificationDetails.size()!=0){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean dOBInDashboard(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(dOBInDashboard.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean deadLineAndStatus(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(deadLineAndStatus.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean relationshipInDashboard(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(relationShipInDashboard.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean uploadIcon() {
        boolean isClicked = false;
        if (uploadIcon.isDisplayed()){
            Element.click(driver,uploadIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean browsePath() {
        boolean isEntered = false;
        Sync.Delay(7000);
        browsePath.sendKeys("C:\\Users\\amukilan\\Desktop\\Consova-Project_IVAC\\resources\\UploadFilesAndImages\\"+filename);
        isEntered = true;
        return isEntered;
    }

    public boolean morethan5MBFile() {
        boolean isEntered = false;
        Sync.Delay(7000);
        browsePath.sendKeys("C:\\Users\\amukilan\\Desktop\\Consova-Project_IVAC\\resources\\UploadFilesAndImages\\"+Highmbfilename);
        isEntered = true;
        return isEntered;
    }

    public boolean uploadErrorMessageVerify(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(uploadErrorMessageVerify.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean uploadDocumentIcon() {
        boolean isClicked = false;
        if (uploadDocumentIcon.isDisplayed()){
            Element.click(driver,uploadDocumentIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean uploadDocumentVerify(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(uploadDocumentVerify.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean uploadDocumentTypeVerify(){
        boolean isVerified=false;
        Sync.Delay(5000);
        String uploadedDocType="Uploaded Document";
        if(uploadDocumentVerify.get(0).getText().equals(uploadedDocType)){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean uploadDocumentOpen() {
        boolean isClicked = false;
        if (uploadDocumentOpenIcon.size()!=0){
            Element.click(driver,uploadDocumentOpenIcon.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean closeModal() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (closeModal.isDisplayed()){
            Element.click(driver,closeModal);
            isClicked = true;
        }
        return isClicked;
    }

    //Wizard Page Actions

    public boolean wizardButton() {
        boolean isClicked = false;
        if (wizardStratButton.isDisplayed()){
            Element.click(driver,wizardStratButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean wizardButtonCheck() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if(dashboardTitle.isDisplayed()) {
            Element.notVerifyElement(driver, wizardStratButton);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean firstSlideInWizard() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (firstSlideWizardBtn.isDisplayed()){
            Element.click(driver,firstSlideWizardBtn);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean firstSlideInWizardVerify() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (firstSlideWizardBtn.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean secondSlideInWizardVerify() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (secondSlideWizardVerify.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean saveAndFinishLaterInWizard() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (saveAndFinishLaterBtn.isDisplayed()){
            Element.click(driver,saveAndFinishLaterBtn);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickOKInPopup(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(popupWindowCloseBtn.isDisplayed()){
            Element.click(driver,popupWindowCloseBtn);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean dOBAscendingCheck(String dataType,String dateFormat){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(dOBInWizard!=null){
            Element.verifyDescendingOrder(dOBInWizard,dataType,dateFormat);
            isVerified=true;
        }
        return isVerified;
    }

    public boolean dOBVerify(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(dOBInWizard.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean fullNameVerify(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(fullNameInWizard.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean genderVerify(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(genderInWizard.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean relationshipVerify(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(relationshipInWizard.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean backButtonInWizard() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (BackWizardIcon.isDisplayed()){
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();",BackWizardIcon);
            //Element.click(driver,BackWizardIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean individualDependentSlideVerifyInWizard() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (individualDependentSlideVerify.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean dOBIndividualDependentSlideVerifyInWizard() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (dOBIndividualWizard.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean relationshipIndividualDependentSlideVerifyInWizard() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (relationshipIndividualWizard.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean individualDependentTextVerifyInWizard() {
        boolean isVerified = false;
        Sync.Delay(5000);
        String str="is this dependent eligible";
        if (individualDependentSlideVerify.getText().contains(str)) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean relationshipIndividualDependentSlideRadioBtnInWizard() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,5000);
        if (eligibleRadioBtns.size()!=0) {
                isVerified = true;
        }
        return isVerified;
    }

    public boolean selectNoOptionButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (eligibleRadioBtns.size()!=0){
            Element.click(driver,eligibleRadioBtns.get(1));
            //eligibleRadioBtns.get(1).click();
            isClicked = true;
        }
        return isClicked;
    }

    public boolean selectYesOptionButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (eligibleRadioBtns.get(0).isDisplayed()){
            Element.click(driver,eligibleRadioBtns.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ineligibleDropDown() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,5000);
        if (eligibleDropDownBtns.isDisplayed()) {
            Element.click(driver,eligibleDropDownBtns);
            Element.click(driver,eligibleDropDownBtnSelection.get(0));
            isVerified = true;
        }
        return isVerified;
    }

    public boolean saveAndContinueInWizard(){
        boolean isClicked=false;
        Sync.Delay(5000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",saveAndContinue);
        isClicked=true;
        return isClicked;
    }

    public boolean nextEligibleCheckAndClickFinishButton(){
        boolean isClicked = false;
        Sync.Delay(5000);
        int i=1;
        do{
        if(eligibleRadioBtns.size()!=0){
            selectYesOptionButton();
            saveAndContinueInWizard();
            isClicked = true;
            i++;
        }else{
            isClicked=false;
        }
        }while(i<dOBInDashboard.size());
        Sync.Delay(3000);
        //finishButton();
        return isClicked;
    }

    public boolean uploadDescription(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(uploadDescription.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean uploadDescriptionIcon(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(uploadDescriptionIcon.size()!=0){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean finishButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (finishButton.isDisplayed()){
            Element.click(driver,finishButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean statusInSummarySlide(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(statusInSummarySlide.size()!=0){
            if(statusInSummarySlide.get(0).getText().contains("No")){
                int i=1;
                do{
                    if(statusInSummarySlide.get(i).getText().contains("Yes")){
                        isVerified=true;
                    }
                }while(i<statusInSummarySlide.size());
            }
            finishButton();
            isVerified=true;

        }
        return isVerified;
    }

    public boolean dropdownInWizardCheck() {
        boolean isVerified = false;
        Sync.Delay(5000);
        String[] child = {"Biological Child", "Step Child"};
        String[] spouse = {"Common Law", "Legally Married"};
        for(int n=0;n<clickDropdownListInWizard.size();n++) {
            clickDropdownListInWizard.get(n).click();
            Sync.Delay(5000);
            for (int i = 0; i < dropdownListInWizard.size(); i++) {
                if (dropdownListInWizard.get(i).getText().equals(spouse[0])) {
                    isVerified = true;
                } else if (dropdownListInWizard.get(i).getText().equals(spouse[1])) {
                    isVerified = true;
                } else if (dropdownListInWizard.get(i).getText().equals(child[0])) {
                    isVerified = true;
                } else if (dropdownListInWizard.get(i).getText().equals(child[1])) {
                    isVerified = true;
                } else {
                    isVerified = false;
                    break;
                }
            }
        }
        return isVerified;
    }

        //Contacts Page Actions

    public boolean contactsPageIcon() {
        boolean isClicked = false;
        if (contactInMenubar.isDisplayed()){
            Element.click(driver,contactInMenubar);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean submitButtonNotEnabled() {
        boolean isVerified = true;
        Sync.Delay(5000);
        if (submitButtonIncontactPage.isEnabled()) {
            isVerified = false;
        }else{
            isVerified=true;
        }
        return isVerified;
    }

    public boolean promptMessageInContactsPage() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (promptMessageInContactsPage.isEnabled()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean submitButtonEnabled() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (submitButtonIncontactPage.isEnabled()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickSubmitButtonInContactPage() {
        boolean isClicked = false;
        if (submitButtonIncontactPage.isDisplayed()){
            Element.click(driver,submitButtonIncontactPage);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean enterCommentsInContactPage(String comments) {
        boolean isEntered = false;
        if (commentsTextox.isDisplayed()) {
            Textbox.enterValue(driver,commentsTextox,comments);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean enterCallbackNumberInContactPage(String callbackNumber) {
        boolean isEntered = false;
        if (callBackNumberTextbox.isDisplayed()) {
            Textbox.enterValue(driver,callBackNumberTextbox,callbackNumber);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean callbackCheckboxDisplayed() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (callBackCheckbox.isEnabled()) {
            Checkbox.isCheckable(driver,callBackCheckbox);
            isVerified = true;
        }
        return isVerified;
    }

    public boolean callbackCheckbox() {
        boolean isChecked = false;
        Sync.Delay(5000);
        if (callBackCheckbox.isEnabled()) {
            Checkbox.check(driver,callBackCheckbox);
            isChecked = true;
        }
        return isChecked;
    }

    public boolean callForAssistance() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (callForAssistance.isEnabled()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean uploadIconInContactsPage() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (uploadIconInContactPage.isEnabled()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickUploadIconInContactsPage() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (uploadIconInContactPage.isEnabled()) {
            Element.click(driver,uploadIconInContactPage);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean faxInContactsPage() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (faxAndMailInContactPage.get(0).isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean mailInContactsPage() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (faxAndMailInContactPage.get(1).isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    //Profile page

    public boolean profilePhotoIcon() {
        boolean isClicked = false;
        Sync.Delay(10000);
        if (profilePhotoIcon.isEnabled()) {
            Element.click(driver,profilePhotoIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean profileButtonInPopup() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (profileButtonInPopup.isEnabled()) {
            Element.click(driver,profileButtonInPopup);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean addressInProfilePage() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (addressInProfilePage.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean contactNumberDetailsInProfilePage() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (homeContactNumberDetailsInProfilePage.isDisplayed()) {
            if(mobileContactNumberDetailsInProfilePage.isDisplayed()){
                if(workContactNumberDetailsInProfilePage.isDisplayed()){
                    isVerified = true;
                }
            }
        }
        return isVerified;
    }

    public boolean goGreenVerify() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (goGreenVerify.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean emailInGoGreen(String email) {
        boolean isEntered = false;
        if (preferredEmail.isDisplayed()) {
            if (confirmPreferredEmail.isDisplayed()) {
                Textbox.enterValue(driver, preferredEmail, email);
                Textbox.enterValue(driver, confirmPreferredEmail, email);
                isEntered = true;
            }
        }
        return isEntered;
    }

    public boolean outlookNavigation() {
        boolean isEntered = false;
            driver.get("https://login.microsoftonline.com/");
            isEntered = true;
        return isEntered;
    }

    public boolean office365username(String email) {
        boolean isEntered = false;
        if (usernameInOutlook.isDisplayed()) {
            Textbox.enterValue(driver, usernameInOutlook, email);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean office365password(String password) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (passwordInOutlook.isDisplayed()) {
            Textbox.enterValue(driver, passwordInOutlook, password);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean nextButtonInOutlook() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (nextButtonInOutlook.isEnabled()) {
            Element.click(driver,nextButtonInOutlook);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean outlookIcon() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (outlookIcon.isEnabled()) {
            Element.click(driver,outlookIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean loginButtonInOutlook() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (loginButtonInOutlook.isEnabled()) {
            Element.click(driver,loginButtonInOutlook);
            Element.click(driver,yesFromPopupInOutlook);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickActivationEmail() {
        boolean isClicked = false;
        Sync.Delay(30000);
        if (otersTabInOutlook.isDisplayed()) {
            //Element.click(driver,otersTabInOutlook);
            Element.click(driver,activationEmail);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickActivationLink() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (activationLink.isEnabled()) {
            Element.click(driver,activationLink);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean actiaveButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (activateButton.isEnabled()) {
            Element.click(driver,activateButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean activateEmailSentVerify() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (emailSentSuccessfulIcon.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean emailListInProfilePage() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (emailListInProfilePage.isDisplayed()) {
            if(preferredEmailListInProfilePage.isDisplayed()) {
                isVerified = true;
            }
        }
        return isVerified;
    }

    public boolean editButtonInProfilePage() {
        boolean isClicked = false;
        Sync.Delay(10000);
        if (editButtonInProfilePage.isEnabled()) {
            Element.click(driver,editButtonInProfilePage);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean cancelButtonInProfilePopup() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (cancelButtonInProfilePopup.isEnabled()) {
            Element.click(driver,cancelButtonInProfilePopup);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean saveButtonInProfilePopup() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (saveButtonInProfilePopup.isEnabled()) {
            Element.click(driver,saveButtonInProfilePopup);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean enterDetainsInPopupDialog() {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (addressline1UpdateInProfilePage.isDisplayed()) {
            Textbox.enterValue(driver,addressline1UpdateInProfilePage,addressline1);
            Textbox.enterValue(driver,addressline2UpdateInProfilePage,addressline2);
            Textbox.enterValue(driver,cityUpdateInProfilePage,city);
            Textbox.enterValue(driver,zipcodeUpdateInProfilePage,zipcode);
            Textbox.enterValue(driver,homephoneUpdateInProfilePage,homephone);
            Textbox.enterValue(driver,mobileNumberUpdateInProfilePage,mobilephone);
            Textbox.enterValue(driver,workphoneUpdateInProfilePage,workphone);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean authorizedCaller() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (authorizedCaller.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean gridTitlesInAuthorizedCaller() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (nameInAuthorizedCaller.isDisplayed()) {
            if(relationshipInAuthorizedCaller.isDisplayed()) {
                if(authorizedDateInAuthorizedCaller.isDisplayed()) {
                    if(expirationDateInAuthorizedCaller.isDisplayed()) {
                        isVerified = true;
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean removeButtonVerify() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (removeButton.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean authorizedNameVerify() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (enteredAuthorizedCallerName.size()!=0) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean authorizedNameNotVerify() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (enteredAuthorizedCallerName.size()!=0) {
            String str1=enteredAuthorizedCallerName.get(3).getText();
            String str2= DateUtil.getDate();
            String str3= DateUtil.getPreviousDate();
            if(str1.contains(str2)){
                isVerified = true;
            }else if(str1.contains(str3)){
                isVerified=true;
            } else{
                isVerified=false;
            }
        }
        return isVerified;
    }

    public boolean removeButtonClick() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (removeButton.isDisplayed()) {
            Element.click(driver,removeButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean addCallerButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (addCallerButton.isDisplayed()) {
            Element.click(driver,addCallerButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean addCallerName(String callerName) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (addCallerName.isDisplayed()) {
            Textbox.enterValue(driver,addCallerName,callerName);
            Sync.Delay(5000);
            addCallerName.sendKeys(Keys.TAB, Keys.DOWN);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean renewButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (renewButton.isDisplayed()) {
            Element.click(driver,renewButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean confirmButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (confirmButton.isDisplayed()) {
            Element.click(driver,confirmButton);
            Window.refreshWindow(driver);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean cancelButton() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (cancelButton.isDisplayed()) {
            Element.click(driver,cancelButton);
            Window.refreshWindow(driver);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean uploadDocumentInMenubar() {
        boolean isClicked = false;
        Sync.Delay(15000);
        if (uploadDocumentIconInMenubar.isDisplayed()) {
            Element.click(driver,uploadDocumentIconInMenubar);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean removeUploadedDocumentInGrid() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (removeUploadedDocumentInGrid.isDisplayed()) {
            Element.click(driver,removeUploadedDocumentInGrid);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyUploadedDocumntInGrid() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (verifyUploadedDocumntInGrid.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean uploadIconDisableVerify() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (!uploadIcon.isEnabled()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean menuIconsInMenubar() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (dashboardInMenubar.isDisplayed()) {
            if (verificationDetailsInMenubar.isDisplayed()) {
                if (knowledgeCenterInMenubar.isDisplayed()) {
                    if (contactInMenubar.isDisplayed()) {
                        if (privacyPolicyInMenubar.isDisplayed()) {
                            if (logOffButton.isDisplayed()) {
                                if (uploadDocumentIconInMenubar.isDisplayed()) {
                                    isVerified = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean languageSelection() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (languageSelect.isDisplayed()) {
            Element.click(driver,languageSelect);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean spanishLanguage() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (spanishLanguageSelect.isDisplayed()) {
            Element.click(driver,spanishLanguageSelect);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean englishLanguage() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (englishLanguageSelect.isDisplayed()) {
            Element.click(driver,englishLanguageSelect);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifySpanishLanguageInHomePage() {
        boolean isVerified = false;
        Sync.Delay(7000);
        if (submitDocumentsInSpanish.isDisplayed()) {
            isVerified=true;
        }
        return isVerified;
    }

    public boolean verifySpanishLanguageInMenuBar() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (dashboardInSpanish.isDisplayed()) {
            if (verificationDetailsInSpanish.isDisplayed()) {
                if (contactUsInSpanish.isDisplayed()) {
                    if (privacyPolicyInSpanish.isDisplayed()) {
                        isVerified=true;
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean sidebarCollapse() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (sidebarCollapse.isDisplayed()) {
            Element.click(driver,sidebarCollapse);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verificationDetailsInMenubar() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (verificationDetailsInMenubar.isDisplayed()) {
            Element.click(driver,verificationDetailsInMenubar);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean benefitsVerified() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (benefitsVerified.getText().equals("Medical")) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean userNameInCore(String userName) {
        boolean isEntered = false;
        Sync.ImplicityDelay(driver,2000);
        if (userNameInCore.isDisplayed()) {
            Textbox.enterValue(driver,userNameInCore,userName);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean passwordInCore(String password) {
        boolean isEntered = false;
        Sync.ImplicityDelay(driver,3000);
        if (passwordInCore.isDisplayed()) {
            Textbox.enterValue(driver,passwordInCore,password);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean myInventoryTab() {
        boolean isClicked = false;
        Sync.Delay(10000);
        if (myInventory.isDisplayed()) {
            Element.click(driver,myInventory);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean enterConsovaID(String consovaID) {
        boolean isEntered = false;
        Sync.ImplicityDelay(driver,2000);
        if (headerInMyInventory.size()!=0) {
            Textbox.enterValue(driver,headerInMyInventory.get(0),consovaID);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean openAuditInMyInventory() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (loadAudit.isDisplayed()) {
            Element.click(driver,loadAudit);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean openAccountInMyInventory() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (loadAccount.isDisplayed()) {
            Element.click(driver,loadAccount);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean navigateToNewTab() {
        boolean isDisplayed = false;
        Sync.Delay(5000);
        if (driver!=null) {
            tabs_windows = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs_windows.get(1));
            isDisplayed = true;
        }
        return isDisplayed;
    }

    public boolean completeAllDocInList(){
        boolean isClicked=false;
        Sync.Delay(5000);
        if(documentStatusListInCore.size()!=0){
            for(int i=0;i<documentStatusListInCore.size();i++) {
                JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();",documentStatusListInCore.get(i));
                js.executeScript("arguments[0].click();",completedDocInCorePopup);
            }
            isClicked=true;
        }
        return isClicked;
    }

    public boolean missingDocInCore(){
        boolean isAdded=false;
        Sync.Delay(5000);
        if(addDocumentInCore.isDisplayed()){
            Element.click(driver,addDocumentInCore);
            Element.click(driver,addDocumentIconInPopup.get(0));
            Element.click(driver,medicalIcon);
            Element.click(driver,saveButtonInPopup);
            Element.click(driver, documentStatusListInCore.get(documentStatusListInCore.size()-1));
            Element.click(driver, missingDocInCorePopup);
            isAdded=true;
        }
        return isAdded;
    }

    public boolean notApplicableDocInCore(){
        boolean isAdded=false;
        Sync.Delay(5000);
        if(addDocumentInCore.isDisplayed()){
            //driver.close();
            Element.click(driver,addDocumentInCore);
            Element.click(driver,addDocumentIconInPopup.get(0));
            Element.click(driver,medicalIcon);
            Element.click(driver,saveButtonInPopup);
            Element.click(driver, documentStatusListInCore.get(documentStatusListInCore.size()-1));
            Element.click(driver, notApplicableDocInCorePopup);
            isAdded=true;
        }
        return isAdded;
    }

    public boolean firstDependentTab(){
        boolean isClicked=false;
        if(dependentHeaderTab.size()!=0){
            Element.click(driver,dependentHeaderTab.get(0));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean secondDependentTab(){
        boolean isClicked=false;
        if(dependentHeaderTab.size()!=0){
            Element.click(driver,dependentHeaderTab.get(1));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean thirdDependentTab(){
        boolean isClicked=false;
        if(dependentHeaderTab.size()!=0){
            Element.click(driver,dependentHeaderTab.get(2));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean fourthDependentTab(){
        boolean isClicked=false;
        if(dependentHeaderTab.size()!=0){
            Element.click(driver,dependentHeaderTab.get(3));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean bcConfirmationIconClick(){
        boolean isClicked=false;
        if(bcBiologicalChild.size()!=0){
            Element.click(driver,bcBiologicalChild.get(1));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean bcConfirmationIconVerify(){
        boolean isClicked=false;
        if(bcBiologicalChild.get(0).isEnabled()){
            isClicked=true;
        }
        return isClicked;
    }

    public boolean scConfirmationIconClick(){
        boolean isClicked=false;
        if(scStepChild.size()!=0){
            Element.click(driver,scStepChild.get(1));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean scConfirmationIconVerify(){
        boolean isClicked=false;
        if(scStepChild.get(0).isEnabled()){
            isClicked=true;
        }
        return isClicked;
    }

    public boolean yesButtonInPopup(){
        boolean isClicked=false;
        if(yesInPopup.isDisplayed()){
            Element.click(driver,yesInPopup);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean inEligibleCodesButton(){
        boolean isClicked=false;
        if(eligibleCodesButton.isDisplayed()){
            Element.click(driver,eligibleCodesButton);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean inEligibleReasonCodes(){
        boolean isClicked=false;
        if(ineligibleReason.size()!=0){
            Element.click(driver,ineligibleReason.get(0));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean ineligibleVerify(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(ineligibleIcon.isDisplayed()){
            isVerified=true;
        }
        return isVerified;
    }

    public boolean saveAndClose(){
        boolean isClicked=false;
        if(closeButton.isDisplayed()){
            Element.click(driver,closeButton);
            isClicked=true;
        }
        return isClicked;
    }

    public int n12=0,n22=0;
    public boolean countForSecondDependent(){
        boolean isVerified=false;
        if(bcBiologicalChild.get(0).isEnabled()){
            n12=completedDocInCore.size();
            n22=notApplicableDocInCore.size();
            isVerified=true;
        }
        return isVerified;
    }

    public int n13=0,n23=0;
    public boolean countForThirdDependent(){
        boolean isVerified=false;
        if(scStepChild.get(0).isEnabled()){
            n13=completedDocInCore.size();
            n23=notApplicableDocInCore.size();
            isVerified=true;
        }
        return isVerified;
    }

    public int n14=0,n24=0,n34=0;
    public boolean countForFourthDependent(){
        boolean isVerified=false;
        if(scStepChild.get(0).isEnabled()){
            n14=completedDocInCore.size();
            n24=notApplicableDocInCore.size();
            n34=missingDocInCore.size();
            isVerified=true;
        }
        return isVerified;
    }

    public boolean secondHeaderInIvac(){
        boolean isClicked=false;
        if(dependentHeaderTabnIvac.size()!=0){
            Element.click(driver,dependentHeaderTabnIvac.get(1));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean compareStatusForSecondDependent(){
        boolean isVerified=true;
        if(completedDocInIvac.size()==n12){
            if(notApplicableDocInIvac.size()==n22){
                isVerified=true;
            }
        }
        return isVerified;
    }

    public boolean thirdHeaderInIvac(){
        boolean isClicked=false;
        if(dependentHeaderTabnIvac.size()!=0){
            Element.click(driver,dependentHeaderTabnIvac.get(2));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean compareStatusForThirdDependent(){
        boolean isVerified=true;
        if(completedDocInIvac.size()==n13){
            if(notApplicableDocInIvac.size()==n23){
                isVerified=true;
            }
        }
        return isVerified;
    }

    public boolean fourthHeaderInIvac(){
        boolean isClicked=false;
        if(dependentHeaderTabnIvac.size()!=0){
            Element.click(driver,dependentHeaderTabnIvac.get(3));
            isClicked=true;
        }
        return isClicked;
    }

    public boolean compareStatusForFourthDependent(){
        boolean isVerified=true;
        if(completedDocInIvac.size()==n14){
            if(notApplicableDocInIvac.size()==n24){
                if(missingDocInIvac.size()==n34)
                isVerified=true;
            }
        }
        return isVerified;
    }

    public boolean verifyNewPackage() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (actionIconForPackage.size()!=0) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean completeAllPackages() {
        boolean isVerified = false;
        Sync.Delay(5000);
        do{
            Element.click(driver,actionIconForPackage.get(0));
            if(submitButtonInNewPackagePopup.isEnabled()) {
                submitButtonInNewPackagePopup();
            }
        }while(actionIconForPackage.size()!=0);
        isVerified=true;
        return isVerified;
    }

    public boolean submitButtonInNewPackagePopup(){
        boolean isClicked=false;
        if(profileIconInCore.isDisplayed()){
            Element.click(driver,submitButtonInNewPackagePopup);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean profileIconInCore(){
        boolean isClicked=false;
        if(profileIconInCore.isDisplayed()){
            Element.click(driver,profileIconInCore);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean logoffButtonInCore(){
        boolean isClicked=false;
        if(logoffButtonInCore.isDisplayed()){
            Element.click(driver,logoffButtonInCore);
            isClicked=true;
        }
        return isClicked;
    }

    public boolean closeCurrentTab() {
        boolean isClosed = false;
        Sync.ImplicityDelay(driver,20000);
        if (driver!=null){
            driver.close();
            driver.switchTo().window(tabs_windows.get(0));
            isClosed = true;
        }
        return isClosed;
    }


}
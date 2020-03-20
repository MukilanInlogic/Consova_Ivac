package demotest.action;

import commonpage.toolbox.*;
import commonpage.util.TestdataConstants;
import demotest.Repository.HomePageUI;
import gherkin.lexer.El;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageActions extends HomePageUI {
    public HomePageActions(WebDriver driver) {
        super(driver);
    }


    public boolean verifyHomeloginPage() {
        boolean isVerified = false;
        Sync.Delay(5000);

        if (lblConsovaPage.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean EnterUserName(String strUsername) {
        boolean isEntred = false;
        if (TxtBoxUserName.isDisplayed()) {
            Textbox.enterValue(driver,TxtBoxUserName,strUsername);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean EnterPassword(String strPassword) {
        boolean isEntred = false;
        if (TxtBoxUserName.isDisplayed()) {
            Textbox.enterValue(driver,TxtBoxPassword,strPassword);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean ClickLogin() {
        boolean isClicked = false;
        Sync.ImplicityDelay(driver,2000);
        if (BtnLoginConsova.isDisplayed()){
            Element.click(driver,BtnLoginConsova);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyLoginPage() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,2000);
        if (imgLoginPage.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean lastNameText(String lastName) {
        boolean isEntred = false;
        Sync.ImplicityDelay(driver,2000);
        if (LastNameTxt.isDisplayed()) {
            Textbox.enterValue(driver,LastNameTxt,lastName);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean consovaIdText(String consovaID) {
        boolean isEntred = false;
        Sync.ImplicityDelay(driver,3000);
        if (consovaIDTxt.isDisplayed()) {
            Textbox.enterValue(driver,consovaIDTxt,consovaID);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean ssnText(String sSN) {
        boolean isEntred = false;
        Sync.ImplicityDelay(driver,3000);
        if (sSNTxt.isDisplayed()) {
            Textbox.enterValue(driver,sSNTxt,sSN);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean verifyLoginButton() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,2000);
        if (submitButton.isEnabled()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean submitButton() {
        boolean isClicked = false;
        Sync.ImplicityDelay(driver,2000);
        if (submitButton.isDisplayed()){
            Element.click(driver,submitButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyHomePage() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,20000);
        if (clientLOGO.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean notVerifyHomePage() {
        boolean isVerified = false;
        Sync.ImplicityDelay(driver,10000);
        if (clientLOGO.isDisplayed()) {
            isVerified = false;
        }else {
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

    public boolean closeDriver() {
        boolean isClosed = false;
        Sync.ImplicityDelay(driver,20000);
        if (driver!=null){
            Browser.driverclose(driver);
            isClosed = true;
        }
        return isClosed;
    }

    public boolean enterURL(String url) {
        boolean isEntred = false;
        Sync.ImplicityDelay(driver,5000);
        if (driver!=null){
            driver.get(url);
            isEntred = true;
        }
        return isEntred;
    }

    public boolean logoffButton() {
        boolean isClicked = false;
        Sync.ImplicityDelay(driver,5000);
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
            Element.click(driver,acceptButton);
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

    public boolean wizardButton() {
        boolean isClicked = false;
        if (wizardStratButton.isDisplayed()){
            Element.click(driver,wizardStratButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean firstSlideInWizard() {
        boolean isClicked = false;
        if (firstSlideWizard.isDisplayed()){
            Element.click(driver,firstSlideWizard);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean firstSlideInWizardVerify() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (firstSlideWizardVerify.isDisplayed()) {
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

    public boolean closeWizard() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (closeWizardIcon.isDisplayed()){
            Element.click(driver,closeWizardIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean closePopup(){
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
        if(dOB!=null){
            Element.verifyDescendingOrder(dOB,dataType,dateFormat);
            isVerified=true;
        }
        return isVerified;
    }

    public boolean dOBVerify(){
        boolean isVerified=false;
        Sync.Delay(5000);
        if(dOB.size()!=0){
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

}

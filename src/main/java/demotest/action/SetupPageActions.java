package demotest.action;

import commonpage.toolbox.Combobox;
import commonpage.toolbox.Element;
import commonpage.toolbox.Textbox;
import demotest.Repository.SetupPageUI;
import org.openqa.selenium.WebDriver;

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
}
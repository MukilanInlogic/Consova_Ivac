package demotest.action;

import commonpage.toolbox.Alert;
import commonpage.toolbox.Element;
import commonpage.toolbox.Sync;
import commonpage.toolbox.Textbox;
import commonpage.util.Testdata;
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

    public boolean verifyUpdateProfilePage() {
        Boolean isVerified = false;
        if (lblEditProfileDetails.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
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

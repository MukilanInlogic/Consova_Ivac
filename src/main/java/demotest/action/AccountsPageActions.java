package demotest.action;

import commonpage.toolbox.Element;
import demotest.Repository.AccountsPageUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        Boolean isClicked = false;
        if (eleACCESSINFORMATION.isDisplayed()) {
            isClicked = Element.click(driver, eleACCESSINFORMATION);
        }
        return isClicked;
    }


}
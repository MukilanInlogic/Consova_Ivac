package demotest.action;

import commonpage.toolbox.Element;
import demotest.Repository.HomePageUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public boolean clickSetupEserviceIcon()
    {
        Boolean isClicked=false;
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

}

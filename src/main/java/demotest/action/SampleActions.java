package demotest.action;

import commonpage.toolbox.*;
import demotest.Repository.SampleUI;
import javafx.application.ConditionalFeature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.SplittableRandom;


public class SampleActions extends SampleUI {

    private SplittableRandom style;
    public String strReplacedXpathValue;

    public static String strReplacedXpathValuePin;

    /**
     * @param driver
     */

    public SampleActions(WebDriver driver) {
        super(driver);
    }

    /**
     * @return
     */

    public boolean clickSecureLoginBtn() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnSecureLogin);
        return isClicked;
    }

    /**
     * @param strUsername
     * @return
     * @throws InterruptedException
     */

    public boolean enterUserNameInMMH(String strUsername) throws InterruptedException {
        Boolean isEntered = false;
        Sync.waitForSeconds(5);
        if (txtUserName.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtUserName, strUsername);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    /**
     * @param strPassword
     * @return
     * @throws InterruptedException
     */


    public boolean enterPasswordInMMH(String strPassword) throws InterruptedException {
        Boolean isEntered = false;
        Sync.waitForSeconds(5);
        if (txtPassword.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtPassword, strPassword);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    /**
     * @return
     */

    public boolean clickLoginBtn() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnLogin);
        return isClicked;
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
        isClicked = Element.click(driver, menuMyAccount);
        return isClicked;
    }

    public boolean verifyMyAccountPage() {
        Boolean isVerified = false;
        if (lblMyAccount.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }
}


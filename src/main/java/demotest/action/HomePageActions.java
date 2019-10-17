package demotest.action;

import commonpage.toolbox.Element;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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


}

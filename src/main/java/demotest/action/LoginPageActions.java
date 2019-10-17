package demotest.action;

import commonpage.toolbox.Element;
import commonpage.toolbox.Sync;
import commonpage.toolbox.Textbox;
import demotest.Repository.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class LoginPageActions extends LoginPageUI {
    public LoginPageActions(WebDriver driver) {
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
}

package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUI {
    protected final WebDriver driver;

    /**
     * @param driver
     */
    public LoginPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Secure Login')]")
    protected WebElement btnSecureLogin;

    @FindBy(how = How.ID, using = "Login4_LoginWebControlMMH_UserName")
    protected WebElement txtUserName;

    @FindBy(how = How.XPATH, using = "//input[@id='Login4_LoginWebControlMMH_Password']")
    protected WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//input[@id='Login4_LoginWebControlMMH_LoginButton']")
    protected WebElement btnLogin;

}

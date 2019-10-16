package demotest.Repository;

/**
 * created by Magesh 09-08-2019
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.stringtemplate.v4.ST;

public class SampleUI {


    protected final WebDriver driver;

    /**
     * @param driver
     */
    public SampleUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    protected String strLeftPaneHeaderLocator=new StringBuilder("//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    protected String strLeftPaneSubHeaderLocator=new StringBuilder("//div[@id='ctl01_LeftMainMenu']//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();



    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Secure Login')]")
    protected WebElement btnSecureLogin;

    @FindBy(how = How.ID, using = "Login4_LoginWebControlMMH_UserName")
    protected WebElement txtUserName;

    @FindBy(how = How.XPATH, using = "//input[@id='Login4_LoginWebControlMMH_Password']")
    protected WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//input[@id='Login4_LoginWebControlMMH_LoginButton']")
    protected WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']")
    protected WebElement lblHomePage;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Set-Up Menu')]")
    protected WebElement lblSetUpMenu;

    @FindBy(how = How.XPATH, using = "//i[@title='Sign Out']")
    protected WebElement iconLogout;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Inbox')]")
    protected WebElement lblInbox;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'My Account')]")
    protected WebElement menuMyAccount;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']//span[contains(text(),'My Account')]")
    protected WebElement lblMyAccount;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_UserProfile1_lnkEditProfile']")
    protected WebElement iconUpdateProfile;









}





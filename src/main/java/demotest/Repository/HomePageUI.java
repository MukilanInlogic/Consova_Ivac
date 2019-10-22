package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.stringtemplate.v4.ST;

public class HomePageUI {


    protected final WebDriver driver;

    public HomePageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    protected String strLeftPaneHeaderLocator = new StringBuilder("//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    protected String strLeftPaneSubHeaderLocator = new StringBuilder("//div[@id='ctl01_LeftMainMenu']//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();


    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']")
    protected WebElement lblHomePage;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Set-Up Menu')]")
    protected WebElement lblSetUpMenu;

    @FindBy(how = How.XPATH, using = "//i[@title='Sign Out']")
    protected WebElement iconLogout;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Inbox')]")
    protected WebElement lblInbox;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'My Account')]")
    protected WebElement eleMyAccount;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Provider Inbox')]")
    protected WebElement eleProviderInbox;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_UserProfile1_lnkEditProfile']")
    protected WebElement iconUpdateProfile;


}





package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Patient Inbox')]")
    protected WebElement elePatientInbox;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Calendar')]")
    protected WebElement eleCalender;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Journal')]")
    protected WebElement eleJournal;

    @FindBy(how = How.XPATH, using = "//span[@class='menu-img my-account Practice']//a[contains(text(),'Practice')]")
    protected WebElement elePractice;

    @FindBy(how = How.XPATH, using = "//span[@class='menu-img my-account Downloads']//a[contains(text(),'Downloads')]")
    protected WebElement eleDownloads;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Clinical Menu')]")
    protected WebElement eleClinicalMenu;


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Set-Up Menu')]")
    protected WebElement eleSetupMenu;


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Appointment Inbox')]")
    protected WebElement eleAppointmentinbox;


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Setup e-Services')]")
    protected WebElement eleSetupeService;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Group Mail')]")
    protected WebElement eleGroupMail;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_ServiceType1_btnAdd']/img")
    protected WebElement btnAddEsevices;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'My Practice')]")
    protected WebElement eleMyPractice;

}





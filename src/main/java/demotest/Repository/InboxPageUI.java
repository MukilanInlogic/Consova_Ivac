package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InboxPageUI {
    protected final WebDriver driver;

    /**
     * @param driver
     */
    public InboxPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_ucReceive_lnkToCompose']")
    protected WebElement linkCompose;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_lnkComposeNew']")
    protected WebElement eleTabCompose;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ucCompose_ddlPractice']")
    protected WebElement ddbHealthCentre;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ucCompose_ddlService']")
    protected WebElement ddbServiceName;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ucCompose_ddlRoles']")
    protected WebElement ddbTo;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucCompose_txtSubject']")
    protected WebElement txtSubject;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucCompose_chkAcceptTerm']")
    protected WebElement chkAcceptTermsConditions;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ucCompose_ddlLocation']")
    protected WebElement ddbLocation;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ucCompose_ddlToUSer']")
    protected WebElement ddbUserName;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucCompose_btnUpload']")
    protected WebElement btnAttachFiles;

    @FindBy(how = How.XPATH, using = "//html//body")
    protected WebElement txtMessage;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucCompose_btnSend']")
    protected WebElement btnSendMessage;

    @FindBy(how = How.XPATH, using = "//div[@class='success']")
    protected WebElement eleSuccess;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucCompose_btnClose']")
    protected WebElement btnReturnToInbox;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_lnkSent']")
    protected WebElement eleTabSent;

    @FindBy(how = How.XPATH, using = "//img[@id='btnTrash']")
    protected WebElement btnTrash;

    @FindBy(how = How.XPATH, using = "//iframe[@id='ctl01_MainContent_ucCompose_EditBody_ctl02_ctl00']")
    protected WebElement iframeSentMessageProviderInbox;


}

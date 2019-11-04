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

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Provider Inbox')]")
    protected WebElement lblProviderInbox;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucCompose_cbo1']")
    protected WebElement txtPatientName;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Patient Inbox')]")
    protected WebElement lblPatientInbox;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']//span[contains(text(),'Calendar')]")
    protected WebElement lblCalender;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'fc-today ui-state-highlight')]")
    protected WebElement eleEventToday;

    @FindBy(how = How.XPATH, using = "//input[@id='txtTitle']")
    protected WebElement txtEventTitle;

    @FindBy(how = How.XPATH, using = "//textarea[@id='txtDescription']")
    protected WebElement txtEventDescription;

    @FindBy(how = How.XPATH, using = "//input[@id='btnSaveEvent']")
    protected WebElement btnEventSave;

    @FindBy(how = How.XPATH, using = "//div[@class='fc-content']")
    protected WebElement eleEvent;

    @FindBy(how = How.XPATH, using = "//input[@id='btnDeleteEvent']")
    protected WebElement btnDeleteEvent;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']//span[contains(text(),'Journal')]")
    protected WebElement lblJournal;

    @FindBy(how = How.XPATH, using = "//div[@class='hs_addnew']//a//img")
    protected WebElement btnAddJournal;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucJournalAddEntry_txtSubject']")
    protected WebElement txtSubjectJournal;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ucJournalAddEntry_ddl_Category']")
    protected WebElement ddbCategoryJournal;

    @FindBy(how = How.XPATH, using = "//textarea[@id='ctl01_MainContent_ucJournalAddEntry_txtDescription']")
    protected WebElement txtNoteJournal;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucJournalAddEntry_btnAddnewEntry']")
    protected WebElement btnSaveEntry;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Test')]")
    protected WebElement eleAddedJournal;

    @FindBy(how = How.XPATH, using = "//tr[@class='ob_gR']//img[@id='btnDelete']")
    protected WebElement btnDeleteJournal;

    @FindBy(how = How.XPATH, using = "//option[contains(text(),'Medtech')]")
    protected WebElement eleHealthCenter;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']//span[contains(text(),'Practice')]")
    protected WebElement lblPractice;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']//span[contains(text(),'Downloads')]")
    protected WebElement lblDownloads;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Setup e-Services')]")
    protected WebElement lblSetupEservices;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_ServiceType1_btnAdd']//img")
    protected WebElement btnAddEsevices;


}

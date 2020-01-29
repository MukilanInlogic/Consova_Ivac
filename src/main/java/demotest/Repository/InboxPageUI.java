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

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Group Message')]")
    protected WebElement lblGroupMessage;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_GroupMessage1_ddlFrom']")
    protected WebElement ddbFromGroupMessage;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_GroupMessage1_ddlTo']")
    protected WebElement ddbToGroupMessage;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_GroupMessage1_txtSubject']")
    protected WebElement txtSubjectGroupMessage;

    @FindBy(how = How.XPATH, using = "//iframe[@id='ctl01_MainContent_GroupMessage1_bodyMessageEditor_ctl02_ctl00']")
    protected WebElement iframeGroupMessage;

    @FindBy(how = How.XPATH, using = "//html//body")
    protected WebElement txtMessageGroupMessage;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_GroupMessage1_btnSend']")
    protected WebElement btnSendMessageGroupMessage;

    @FindBy(how = How.XPATH, using = "//a[text()='Settings']")
    protected WebElement btnSettingtab;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucSettings_radbtnlstSettings1_0']")
    protected WebElement btnYesAlertSettings;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucSettings_bntsave']")
    protected WebElement btnSaveSettings;

    @FindBy(how = How.XPATH, using = "//div[@class='success']")
    protected WebElement SuccessMessageProviserInbox;

    @FindBy(how = How.XPATH, using = "//span[text()='Automatic Replies']")
    protected WebElement BtnAutomaticRepliestab;

    @FindBy(how = How.XPATH, using = "//label[text()='Enable Out Of Office Reply']")
    protected WebElement ChkBoxEnableOutOfOfficeReplyProiderInbox;

    @FindBy(how = How.XPATH, using = "//div[@class='oae_editor_base oae_editor_default']//table[@class='oae_editor_container']//tr//td[@class='oae_editor_editpanel_container']/following::div[@id='ctl01_MainContent_ucSettings_TabContainer1_tbAutomaticreplies_oeOutOfOffice_ctl02']")
    protected WebElement txtBoxAutomaticRepliesProviderInbox;

    @FindBy(how = How.XPATH, using = "//h4[text()='Compose New Mesage']")
    protected WebElement CaptionComposenewmessage;

    @FindBy(how = How.XPATH, using = "//div[@class='container-fluid']//div[@id='ctl01_MainContent_ucCompose_panCompose']//div[@id='ctl01_MainContent_ucCompose_trRRP']/preceding::input[@value='Cancel']")
    protected WebElement btnCancelComposeMessageTab;

    @FindBy(how = How.XPATH, using = "//input[@value='Refresh']")
    protected WebElement btnRefreshInboxTab;

    @FindBy(how = How.XPATH, using = "//span[text()='Automatic Replies']")
    protected WebElement BtnSignatureSettingstab;

    @FindBy(how = How.XPATH, using = "//span[text()='Automatic Replies']")
    protected WebElement txtBoxSignatureSettingsProviderInbox;





}

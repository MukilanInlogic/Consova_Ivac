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

    @FindBy(how = How.CSS, using = "i[title='Sign Out']")
    protected WebElement iconLogout;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Inbox')]")
    protected WebElement lblInbox;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'My Account')]")
    protected WebElement eleMyAccount;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Provider Inbox')]")
    protected WebElement eleProviderInbox;

    @FindBy(how = How.XPATH, using = "//span[@class='menu-img my-account Inbox']//a[contains(text(),'Inbox')]")
    protected WebElement eleInboxForPatient;

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

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'e-Requests')]")
    protected WebElement eleERequestClinicalMenu;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'e-Requests')]")
    protected WebElement eleDashboardClinicalMenu;

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

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Staff List')]")
    protected WebElement eleStaffListSetupMenu;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Practice Helpdesk')]")
    protected WebElement elePracticeHelpdeskSetupMenu;

    @FindBy(how = How.XPATH, using = "//input[@value='Save Entry']")
    protected WebElement BtnSaveEntryJaurnal;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$ucJournalAddEntry$txtSubject']/following-sibling::span[contains(text(),'* Required')]")
    protected WebElement lblRequiredErrorSubjectTxtBox;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_ViewEventDetails1_grdJournalEvent_ob_grdJournalEventBodyContainer_ctl02_ctl29_ctl00_lnkBtnEdit']")
    protected WebElement BtnEditViewJournal;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$ucEditEntry$txtSubject']/following-sibling::span[contains(text(),'* Required')]")
    protected WebElement lblRequiredErrorEditSubjectTxtBox;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Staff')]")
    protected WebElement BtnStaffTabPracticePage;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$txtSearchusername']")
    protected WebElement txtBoxUserNameStafftabPracticePage;

    @FindBy(how = How.XPATH, using = "//input[@value='Search']")
    protected WebElement BtnSearchStaffTabPracticePage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'No Records Found')]")
    protected WebElement CaptionNoRecordAvailableStafftabPracticepage;

    @FindBy(how = How.XPATH, using = "//a[@class='pract_map']")
    protected WebElement BtnMapLocationRolePracticePage;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$btnLocUpdate']")
    protected WebElement BtnUpdateMapLocationRole;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$btnLocMapCancel']")
    protected WebElement BtnCancelMapLocation;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Search Users')]")
    protected WebElement BtnSearchUserMainMenu;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucSearch_cbo1']")
    protected WebElement TxtBoxNameSearchPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$ucSearch$btnGo']")
    protected WebElement BtnSearchPatientPage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'No Patient(s) found in ')]")
    protected WebElement WarningnoPatientFoundSearchPatient;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucSearch_radSearchInput_0']")
    protected WebElement BtnlastnamefirstnameSearchpatient;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucSearch_radSearchInput_1']")
    protected WebElement BtnfirstnamelastnameSearchpatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$ucSearch$btnclear']")
    protected WebElement BtnClearSearchPatient;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucSearch_chkAutoSuggest']")
    protected WebElement BtnAutoSuggestSearchPatient;

    @FindBy(how = How.XPATH, using = "//li[@class='ac_even ac_over']")
    protected WebElement ListNameSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Health Indicators')]")
    protected WebElement BtnHealthIndicatorMainMenu;

    @FindBy(how = How.XPATH, using = "//a[contains(@id,'grid_link_Add_0')]")
    protected WebElement BtnAddHealthIndicatorMainMenu;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'BMI')]/following::div[@id='trPHQ9']/following::div[@id='trHIComments']/following::div[@class='up_Section']//div[@class='btn_group btn_linkbtn ec_edit']//input[@value='Save']")
    protected WebElement BtnSaveAddHealthIndicator;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'BMI')]/following::div[@id='trPHQ9']/following::div[@id='trHIComments']/following::div[@class='up_Section']/following::div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//button[text()='Close']")
    protected WebElement BtnCloseAddHealthIndicator;

    @FindBy(how = How.XPATH, using = "//input[@id='txtCurrentValue']")
    protected WebElement TxtBoxHeightBMIHealthIndicator;

    @FindBy(how = How.XPATH, using = "//input[@id='txtWeight']")
    protected WebElement TxtBoxWeightBMIHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[@class='menu-img my-account Home']//a[contains(text(),'Home')]")
    protected WebElement BtnHomeMainMenu;

}





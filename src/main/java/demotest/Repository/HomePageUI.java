package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

// Search Patient

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

    @FindBy(how = How.XPATH, using = "//span[text()='Search Patients']")
    protected WebElement lblSearchPatient;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$ucSearch$cmbPractice']")
    protected WebElement DropDnSearchInSearchPatient;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucSearch_chkAdvSearch']")
    protected WebElement BtnAdvancedSearchPatient;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucSearch_chkAdvSearch']")
    protected WebElement lblAdvancedSearchPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Age :')]/following::select[@name='ctl01$MainContent$ucSearch$ddlAgeGreater']")
    protected WebElement lblAgeSearchPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'DOB :')]/following::input[@name='ctl01$MainContent$ucSearch$txtDOBDate']")
    protected WebElement lblDOBSearchPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'To :')]/following::select[@name='ctl01$MainContent$ucSearch$ddlAgeLessthen']")
    protected WebElement lblToSearchPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Gender :')]/following::select[@name='ctl01$MainContent$ucSearch$cmbGender']")
    protected WebElement lblGenderSearchPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Email :')]/following::input[@name='ctl01$MainContent$ucSearch$txtEmail']")
    protected WebElement lblEmailSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_ucSearch_lstvewSearchResult_ctrl0_lnkUserName']")
    protected WebElement lblDisplayPatientSearchPatient;

    @FindBy(how = How.XPATH, using = "//img[@id='imgVidyoIO']")
    protected WebElement BtnVideoIconSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[text()='Send a Message']")
    protected WebElement BtnSendAMessageSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[text()='View Dashboard']")
    protected WebElement BtnViewDashBoardSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[text()='View Goals']")
    protected WebElement BtnViewGoalsSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[text()='Clinical Notes']")
    protected WebElement BtnClinicalNotesSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[text()='View Health Indicator']")
    protected WebElement BtnViewHealthIndicatorSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[text()='View Health Summary']")
    protected WebElement BtnViewHealthSummarySearchPatient;

    @FindBy(how = How.XPATH, using = "//a[text()='View Journal']")
    protected WebElement BtnViewJournalSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[text()='View Profile']")
    protected WebElement BtnViewProfileSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[text()='Back To Search']")
    protected WebElement BtnBacktoSearchPatient;

    @FindBy(how = How.XPATH, using = "//option[@selected='selected' and @value='Any']")
    protected WebElement eleAnyAgeSearchPatient;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$ucSearch$ddlAgeGreater']")
    protected WebElement eleAgeDropDownSearchPatient;

    @FindBy(how = How.XPATH, using = "//option[@selected='selected' and @value='25']")
    protected WebElement eleToDropDownSearchPatient;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$ucSearch$ddlAgeLessthen']")
    protected WebElement TxtBoxToDropDownSearchPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$ucSearch$txtDOBDate']")
    protected WebElement TxtBoxDOBSearchPatient;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'TEST TEST')]")
    protected WebElement lblpatientSearchPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$ucSearch$txtEmail']")
    protected WebElement txtBoxEmailSearchPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$ucSearch$btnAdvancedGo']")
    protected WebElement btnSearchPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$ucSearch$Button2']")
    protected WebElement btnClearSearchPatient;
//Dash Board Details
    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']")
    protected WebElement lblDashBoard;

    @FindBy(how = How.XPATH, using = "//a[text()='Goals']")
    protected WebElement btnGoalsDashBoard;

    @FindBy(how = How.XPATH, using = "//a[text()='Health Summary']")
    protected WebElement btnHealthSummaryDashBoard;

    @FindBy(how = How.XPATH, using = "//a[text()='Health Summary']/following::a[text()='Journal']")
    protected WebElement btnJournalDashBoard;

    @FindBy(how = How.XPATH, using = "//a[text()='Health Indicator']")
    protected WebElement btnHealthIndicatorDashBoard;

    @FindBy(how = How.XPATH, using = "//a[text()='View Profile']")
    protected WebElement btnViewProfileDashBoard;

    @FindBy(how = How.XPATH, using = "//a[text()='Send a Message']")
    protected WebElement btnSendAMessageDashBoard;

    @FindBy(how = How.XPATH, using = "//a[text()='Clinical Notes']")
    protected WebElement btnClinicalNotesDashBoard;

    @FindBy(how = How.XPATH, using = "//a[text()='Clinical Notes']/following::a[text()='Dashboard']")
    protected WebElement btnDashBoard;

    @FindBy(how = How.XPATH, using = "//li[text()='History']")
    protected WebElement lblHistoryTabDashBoard;

    @FindBy(how = How.XPATH, using = "//li[text()='Trends']")
    protected WebElement lblTrendsTabDashBoard;

    @FindBy(how = How.XPATH, using = "//li[text()='Manage Patient']")
    protected WebElement lblmanagePatientTabDashBoard;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_MainContent_ucPatientBanner_lblPatientName']")
    protected WebElement lblPatientDashBoard;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_ucSearch_lstvewSearchResult_ctrl0_lnkUserName']")
    protected WebElement BtnPatientDashBoard;

    @FindBy(how = How.XPATH, using = "//span[text()='View Profile']")
    protected WebElement lblViewPatient;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Patient Current Condition :')]")
    protected WebElement lblPatientCurrentConditionViewPatient;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Personal Details  ')]")
    protected WebElement lblPersonalDetailsViewPatient;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Login Details  ')]")
    protected WebElement lblLoginDetailsViewPatient;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Contact Details  ')]")
    protected WebElement lblContactDetailsViewPatient;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Insurance Information   ')]")
    protected WebElement lblInsuranceDetailsViewPatient;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Additional Information')]")
    protected WebElement lblAdditionalInfoViewPatient;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Edit Profile Details')]")
    protected WebElement lblEditProfileTabViewPatient;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Emergency Contacts')]")
    protected WebElement lblEmergencyContactsTabViewPatient;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Additional Information')]")
    protected WebElement lblAdditionalInfoTabViewPatient;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Device Information')]")
    protected WebElement lblDeviceInfoTabViewPatient;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Mrs')]")
    protected WebElement lblFullNameViewPatient;

    @FindBy(how = How.XPATH, using = "//option[text()='Mrs']")
    protected WebElement OptionMrsTitleViewPatient;

    @FindBy(how = How.XPATH, using = "//option[text()='Mr']")
    protected WebElement OptionMrTitleViewPatient;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Mr')]")
    protected WebElement lblFullNameUpdatedViewPatient;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_UserProfile1_lnkEditProfile']")
    protected WebElement BtnUpdateViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$EditBasicProfile1$btnUpdateProfile']")
    protected WebElement BtnUpdateProfileViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$EditBasicProfile1$btnCancel']")
    protected WebElement BtnCancelUpdateViewPatient;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$EditBasicProfile1$ddlTitle']")
    protected WebElement BtnTitleViewPatient;





}





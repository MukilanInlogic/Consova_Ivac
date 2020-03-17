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

    @FindBy(how = How.XPATH, using = "//li[@id='ctl01_MainContent_div6']//a[@id='ctl01_MainContent_lnkEmergencyContacts']")
    protected WebElement lblEmergencyContactsTabViewPatient;

    @FindBy(how = How.XPATH, using = "//li[@id='ctl01_MainContent_div8']//a[@id='ctl01_MainContent_lnkAdditionalInformation']")
    protected WebElement lblAdditionalInfoTabViewPatient;

    @FindBy(how = How.XPATH, using = "//li[@id='ctl01_MainContent_div9']//a[@id='ctl01_MainContent_lnkDeviceInformation']")
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
//Additional Information Tab View Profile
    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Provider  ')]")
    protected WebElement lblProviderViewPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Managing Provider  :')]")
    protected WebElement lblManagingProviderViewPatient;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Clinical Details')]")
    protected WebElement lblClinicalDetailsViewPatient;

    @FindBy(how = How.XPATH, using = "//div[@class='ob_gCc1']//div[text()='Proposed Start Date']")
    protected WebElement lblProposedStartDateViewPatient;

    @FindBy(how = How.XPATH, using = "//div[text()='Proposed End Date']")
    protected WebElement lblEndDateViewPatient;

    @FindBy(how = How.XPATH, using = "//div[text()='Trial Group']")
    protected WebElement lblTrialGroupViewPatient;

    @FindBy(how = How.XPATH, using = "//div[text()='Trial Status']")
    protected WebElement lblTrialStatusViewPatient;

    @FindBy(how = How.XPATH, using = "//h4[text()='External System Integration']")
    protected WebElement lblExternalSysIntegViewPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Patient ID  :')]")
    protected WebElement lblPatientIdViewPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Interpreter Service :')]")
    protected WebElement lblInterpreterServiceViewPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Interpreter Language  :')]")
    protected WebElement lblInterpretereViewPatient;

    @FindBy(how = How.XPATH, using = "//h4[text()='Regular GP']")
    protected WebElement lblRegularGPViewPatient;

    @FindBy(how = How.XPATH, using = "//div[@class='ob_gCc1']//div[contains(text(),'Hospital Name')]")
    protected WebElement lblHospitalNameViewPatient;

    @FindBy(how = How.XPATH, using = "//div[@class='ob_gCc1']//div[contains(text(),'URN (Unique Record Number)')]")
    protected WebElement lblURNViewPatient;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_AdditionalInformationUC_lnkEdit']")
    protected WebElement BtnEditAddInfoViewPatient;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$AdditionalInformationUC$ddlProvider']")
    protected WebElement TxtBoxManagingProviderViewPatient;

    @FindBy(how = How.XPATH, using = "//option[text()='Dr Willian Bonney']")
    protected WebElement TxtBoxManagingProviderValueViewPatient;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$AdditionalInformationUC$ddlClinic']")
    protected WebElement TxtBoxClicinViewPatient;

    @FindBy(how = How.XPATH, using = "//option[text()='Family']")
    protected WebElement TxtBoxclinicValueViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$AdditionalInformationUC$txtGPFirstName']")
    protected WebElement TxtBoxProviderFirstNameViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$AdditionalInformationUC$txtGPLastName']")
    protected WebElement TxtBoxProviderLastNameViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$AdditionalInformationUC$btnUpdateProfile']")
    protected WebElement BtnUpdateProfileEditViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$AdditionalInformationUC$btnCancel']")
    protected WebElement BtnCancelEditViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@value='Vimal']")
    protected WebElement TxtBoxProviderFirstNameValueViewPatient;
//Device Information Details
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Device Name')]")
    protected WebElement lblDeviceNameViewPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Serial No.')]")
    protected WebElement lblSerialNoViewPatient;

    @FindBy(how = How.XPATH, using = "//div[@class='ob_gCc1']//div[contains(text(),'MAC Address')]")
    protected WebElement lblMACAddressViewPatient;

    @FindBy(how = How.XPATH, using = "//div[@class='ob_gCc1']//div[contains(text(),'IMEI No.')]")
    protected WebElement lblIMEINoViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$btnDeviceInformationAdd']")
    protected WebElement BtnAddViewPatient;

    @FindBy(how = How.XPATH, using = "//span[text()='Add Device Information']")
    protected WebElement lblAddDeviceInfoViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtSerialNumber']")
    protected WebElement txtboxSerialNumberViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtIMEINumber']")
    protected WebElement txtboxIMEINumberViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtIMEINumber']/following::button[@class='ui-state-default ui-corner-all' and text()='Save']")
    protected WebElement BtnSaveDeviceinfoViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtIMEINumber']/following::button[@class='ui-state-default ui-corner-all' and text()='Close']")
    protected WebElement BtnCloseDeviceinfoViewPatient;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Device :')]")
    protected WebElement lblDeviceViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtIMEINumber']/following::span[text()='IMEI Number Required']")
    protected WebElement WarningIMEIDeviceInfoViewPatient;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$DeviceInformationUC$ddlDevice']")
    protected WebElement TxtBoxDeviceDeviceInfoViewPatient;

    protected String TxtBoxValueDeviceInfoViewPatient = new StringBuilder("//option[text()='")
            .append("<<REPLACE>>")
            .append("']").toString();

    protected String CreatedValueDeviceInfoViewPatient = new StringBuilder("//div[text()='")
            .append("<<REPLACE>>")
            .append("']").toString();

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtMAC1']")
    protected WebElement TxtBoxMacaddDeviceInfoViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtMAC2']")
    protected WebElement TxtBoxMacadd1DeviceInfoViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtMAC3']")
    protected WebElement TxtBoxMacadd2DeviceInfoViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtMAC4']")
    protected WebElement TxtBoxMacadd3DeviceInfoViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtMAC5']")
    protected WebElement TxtBoxMacadd4DeviceInfoViewPatient;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$DeviceInformationUC$txtMAC6']")
    protected WebElement TxtBoxMacadd5DeviceInfoViewPatient;
    //Clinical Noted Details

    @FindBy(how = How.XPATH, using = "//span[text()='Clinical Note']")
    protected WebElement lblClinicalNotes;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_addNew']//img")
    protected WebElement BtnAddClinicalNotes;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Patient Name / Gender : ')]")
    protected WebElement lblPatientNameClinicalNotes;


    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Clinical Notes')]")
    protected WebElement lblTabClinicalNotes;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Health Indicator' )]")
    protected WebElement lblHealthIndicatorClinicalNotes;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Health Indicator' )]")
    protected WebElement lblContactDetailsClinicalNotes;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Notes Details')]")
    protected WebElement lblNotesClinicalNotes;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Medical Warning :')]/following::textarea[@name='ctl01$MainContent$txtMedical']")
    protected WebElement TxtBoxMedicalWarningClinicalNotes;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$ddlPracticeList']")
    protected WebElement TxtBoxHealthCentreClinicalNotes;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Reason for Visit')]/following::textarea[@id='ctl01_MainContent_txtSubject']")
    protected WebElement TxtBoxReaseonForVisitClinicalNotes;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Subjective')]/following::textarea[@id='ctl01_MainContent_txtSubjective']")
    protected WebElement TxtBoxSubjectiveClinicalNotes;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Objective')]/following::textarea[@id='ctl01_MainContent_txtObjective']")
    protected WebElement TxtBoxObjectiveClinicalNotes;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Diagnosis')]/following::textarea[@id='ctl01_MainContent_txtAssessment']")
    protected WebElement TxtBoxDiagnosisClinicalNotes;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_btnSave']")
    protected WebElement BtnSaveClinicalNotes;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_btnCancel']")
    protected WebElement BtnCancelClinicalNotes;

    protected String CreatedClinicalNotes = new StringBuilder("//td[contains(text(),'")
            .append("<<REPLACECONTENT>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Prescription')]")
    protected WebElement BtnPrescriptionTabClinicalNotes;

    protected String ViewClinicalNotes = new StringBuilder("//td[contains(text(),'")
            .append("<<REPLACECONTENT>>")
            .append("')]/following::div[contains(@class,'edit')]//img[@title='View']").toString();

    protected String EditClinicalNotes = new StringBuilder("//td[contains(text(),'")
            .append("<<REPLACECONTENT>>")
            .append("')]/following::div[contains(@class,'edit')]//img[@title='Edit']").toString();

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Prescription')]")
    protected WebElement lblStartDatePrescriptionTab;

    @FindBy(how = How.XPATH, using = "//div[text()='Drug Name' and @class='ob_gCc2']")
    protected WebElement lblDrugNamePrescriptionTab;

    @FindBy(how = How.XPATH, using = "//div[text()='Dosage' and @class='ob_gCc2']")
    protected WebElement lblDosagePrescriptionTab;

    @FindBy(how = How.XPATH, using = "//div[text()='Strength' and @class='ob_gCc2']")
    protected WebElement lblStrengthPrescriptionTab;

    @FindBy(how = How.XPATH, using = "//div[text()='Frequency' and @class='ob_gCc2']")
    protected WebElement lblFrequencyPrescriptionTab;

    @FindBy(how = How.XPATH, using = "//div[text()='Period' and @class='ob_gCc2']")
    protected WebElement lblPeriodPrescriptionTab;

    @FindBy(how = How.XPATH, using = "//div[text()='Status' and @class='ob_gCc2']")
    protected WebElement lblStatusPrescriptionTab;

    @FindBy(how = How.XPATH, using = "//div[text()='More Info' and @class='ob_gCc2']")
    protected WebElement lblMoreInfoPrescriptionTab;

    @FindBy(how = How.XPATH, using = "//div[text()='State' and @class='ob_gCc2']")
    protected WebElement lblStatePrescriptionTab;

    @FindBy(how = How.XPATH, using = "//span[text()='Reason for Visit']")
    protected WebElement lblReasonForVisitClinicalNotes;

    @FindBy(how = How.XPATH, using = "//span[text()='Date']")
    protected WebElement lblDateClinicalNotes;

    @FindBy(how = How.XPATH, using = "//span[text()='Provider Name']")
    protected WebElement lblProviderNameClinicalNotes;

    @FindBy(how = How.XPATH, using = "//span[text()='Practice Name']")
    protected WebElement lblPracticeNameClinicalNotes;

    @FindBy(how = How.XPATH, using = "//input[@value='Back to Patient Profile']")
    protected WebElement BtnBackToPatientClinicalNotes;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Audit ')]")
    protected WebElement BtnAuditTabClinicalNotes;

    @FindBy(how = How.XPATH, using = "//input[@value='Audit Log']")
    protected WebElement BtnAuditLogClinicalNotes;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Modified Date :')]")
    protected WebElement lblmodifieddateClinicalNotes;

    @FindBy(how = How.XPATH, using = "//span[@class='ui-dialog-title' and text()='Audit']")
    protected WebElement AuditWindowClinicalNotes;

    @FindBy(how = How.XPATH, using = "//span[@id='lblDate']")
    protected WebElement lblDateTimeAuditWinClinicalNotes;

    @FindBy(how = How.XPATH, using = "//span[@class='ui-dialog-title' and text()='Audit']/following::a[@class='ui-dialog-titlebar-close ui-corner-all']")
    protected WebElement BtnCloseAuditWinClinicalNotes;


    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_AddNew']")
    protected WebElement BtnAddMedicationPrescriptionClinicalNotes;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Medication Details')]")
    protected WebElement WindowAddMedicationPrescription;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$txtDrugName']")
    protected WebElement TxtBoxDrugNameAddMedicationPrescription;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$txtDrugName']")
    protected WebElement TxtBoxDosageAddMedicationPrescription;

    @FindBy(how = How.XPATH, using = "//input[@id='txtstrength']")
    protected WebElement TxtBoxStrengthAddMedicationPrescription;

    @FindBy(how = How.XPATH, using = "//input[@id='txtfrequency']")
    protected WebElement TxtBoxFrequencyAddMedicationPrescription;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$txtperiod']")
    protected WebElement TxtBoxPeriodAddMedicationPrescription;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$txtperiod']")
    protected WebElement BtnDateIconAddMedicationPrescription;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$txtperiod']")
    protected WebElement BtnTodayDateAddMedicationPrescription;

    @FindBy(how = How.XPATH, using = "//button[@class='ui-state-default ui-corner-all' and text()='Save']")
    protected WebElement BtnSaveAddMedicationPrescription;






//Health Summary Menu Details
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Health Summary')]")
    protected WebElement BtnHealthSummaryMenu;

    @FindBy(how = How.XPATH, using = "//label[text()='Entries From Clinical Staff']/preceding-sibling::input[@name='ctl01$MainContent$rblEntryType']")
    protected WebElement BtnEntriesFromClinicalStaffHealthSummaryMenu;

    @FindBy(how = How.XPATH, using = "//span[text()='Health Summary']")
    protected WebElement lblHealthSummaryMenu;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Prescriptions')]")
    protected WebElement lblPrescriptionsTabHealthSummaryMenu;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Allergies')]")
    protected WebElement lblAllergiesTabHealthSummaryMenu;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Immunisations')]")
    protected WebElement lblImmunisationsTabHealthSummaryMenu;

    @FindBy(how = How.XPATH, using = "//li[@id='ctl01_MainContent_HESTabs1_divLabRes']//a[contains(text(),'Lab Results')]")
    protected WebElement lblLabResultsTabHealthSummaryMenu;

    protected String lblHealthSummaryGrid = new StringBuilder("//div[text()='")
            .append("<<REPLACECONTENT>>")
            .append("']").toString();
//Health Indicator
    protected String BtnMoreinfoHealthIndicator = new StringBuilder("//div[text()='")
            .append("<<REPLACECONTENT>>")
            .append("']/following::img[@alt='More Info']").toString();

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

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Health Indicators')]")
    protected WebElement lblHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[text()='More Info']")
    protected WebElement MoreInfoWinHealthIndicator;

    @FindBy(how = How.XPATH, using = "//span[text()='More Info']/following::div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//button[@class='ui-state-default ui-corner-all']")
    protected WebElement BtnCloseMoreInfoWinHealthIndicator;









}





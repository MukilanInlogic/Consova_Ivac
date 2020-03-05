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

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_lnkTrash']")
    protected WebElement eleTrashTab;

    @FindBy(how = How.XPATH, using = "//iframe[@id='ctl01_MainContent_ucCompose_EditBody_ctl02_ctl00']")
    protected WebElement iframeSentMessageProviderInbox;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Provider Inbox')]")
    protected WebElement lblProviderInbox;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucCompose_cbo1']")
    protected WebElement txtPatientName;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Patient Inbox')]")
    protected WebElement lblPatientInbox;

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

    @FindBy(how = How.XPATH, using = "//option[contains(text(),'Medtech')]")
    protected WebElement eleHealthCenter;

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

    @FindBy(how = How.XPATH, using = "//div[@class='col-md-4 msg_comp']//a[text()='Compose']")
    protected WebElement btnComposeInboxTab;

    @FindBy(how = How.XPATH, using = "//input[@value='Refresh']")
    protected WebElement btnRefreshInboxTab;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$ucReceive$drpMoreActions']")
    protected WebElement btnMoreActionsInboxTab;

    @FindBy(how = How.XPATH, using = "//span[text()='Signature Settings']")
    protected WebElement BtnSignatureSettingstab;

    @FindBy(how = How.XPATH, using = "//td[@class='oae_editor_editpanel_container']//div[@id='ctl01_MainContent_ucSettings_TabContainer1_tbAlert_editSignature_ctl02']")
    protected WebElement txtBoxSignatureSettingsProviderInbox;

    @FindBy(how = How.XPATH, using = "//div[@class='menu-bar']//a[text()='Inbox']")
    protected WebElement BtnInboxTab;

    @FindBy(how = How.XPATH, using = "//div[text()='There are no records available.']")
    protected WebElement CaptionNoRecordAvailableInboxTab;


    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_GroupMessage1_txtSubject']/following-sibling::span[contains(text(),'*Required')]")
    protected WebElement lblRequiredWarningGroupMessage;

    @FindBy(how = How.XPATH, using = "//div[text()='Records per page:']")
    protected WebElement CaptionRecordsPerPages;

    @FindBy(how = How.XPATH, using = "//div[text()='Records per page:']")
    protected WebElement CaptionRecordsPages;
    //Compose Tab Elements
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Health Centre')]")
    protected WebElement lblHealthCentre;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Location')]")
    protected WebElement lblLocation;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Service Name')]")
    protected WebElement lblServiceName;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Cost: No Charge')]")
    protected WebElement lblCost;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'To')]")
    protected WebElement lblTo;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl01$MainContent$ucCompose$cbo1']")
    protected WebElement TxtBoxStartTyping;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Subject')]")
    protected WebElement lblSubject;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Attachments :')]")
    protected WebElement lblAttachments;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucCompose_chkAcceptTerm']")
    protected WebElement ChkBoxAccept;
//Journal Link

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

    @FindBy(how = How.XPATH, using = "//input[@value='Cancel']")
    protected WebElement BtnCancelJournal;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ucEditEntry_txtSubject']")
    protected WebElement txtBoxSubjectEditjournal;

    @FindBy(how = How.XPATH, using = "//input[@value='Update']")
    protected WebElement BtnUpdateViewJournal;

    @FindBy(how = How.XPATH, using = "//div[text()='Date']")
    protected WebElement lblDateViewjournal;

    @FindBy(how = How.XPATH, using = "//div[text()='Subject']")
    protected WebElement lblSubjectViewjournal;

    @FindBy(how = How.XPATH, using = "//div[text()='Category']")
    protected WebElement lblCategoryViewjournal;

    @FindBy(how = How.XPATH, using = "//div[text()='More Info']")
    protected WebElement lblMoreInfoViewjournal;

    @FindBy(how = How.XPATH, using = "//div[text()='Edit']")
    protected WebElement lblEditViewjournal;

    @FindBy(how = How.XPATH, using = "//div[text()='Delete']")
    protected WebElement lblDeleteViewjournal;

    @FindBy(how = How.XPATH, using = "//div[text()='Records per page:']")
    protected WebElement lblRecordsPerPageViewjournal;

    @FindBy(how = How.XPATH, using = "//div[@class='ob_gFPT']")
    protected WebElement lblRecordPagesViewjournal;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Add New Entry')]")
    protected WebElement TabAddNewEntryjournal;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-question-circle fa-lg colour_white help_icon help_image']")
    protected WebElement ImgHelpJournal;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Subject')]")
    protected WebElement lblSubjectAddJournal;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Subject')]")
    protected WebElement lblCategoryAddJournal;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Notes')]")
    protected WebElement lblNotesAddJournal;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Date')]")
    protected WebElement lblDateAddJournal;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Schedule event')]")
    protected WebElement lblScheduleEventAddJournal;

    @FindBy(how = How.XPATH, using = "//a[contains(@id,'grid_link')]")
    protected WebElement BtnMoreInfoViewJournal;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Journal Information')]")
    protected WebElement lblJorunalInformationWindow;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Subject:')]")
    protected WebElement lblSubjectJorunalInformationWindow;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Category:')]")
    protected WebElement lblCategoryJorunalInformationWindow;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Event Date:')]")
    protected WebElement lblEventDateJorunalInformationWindow;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Start Date:')]")
    protected WebElement lblStartDateJorunalInformationWindow;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Last Updated Date:')]")
    protected WebElement lblLastUpdatedDateJorunalInformationWindow;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Description:')]")
    protected WebElement lblDescriptionJorunalInformationWindow;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Reminder Set On:')]")
    protected WebElement lblReminderSetOnJorunalInformationWindow;

    @FindBy(how = How.XPATH, using = "//div[@id='EventDetailsDialog']/following::div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']//button[@class='ui-state-default ui-corner-all' and text()='Close']")
    protected WebElement BtnCloseJorunalInformationWindow;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$ucEditEntry$ddlRemindHours']")
    protected WebElement ListDontRemindMeJorunalInformationWindow;

//Calender Details
    @FindBy(how = How.XPATH, using = "//i[@title='Help']")
    protected WebElement ImgHelpCalenderWindow;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']//span[contains(text(),'Calendar')]")
    protected WebElement lblCalender;

    @FindBy(how = How.XPATH, using = "//div[@class='col-md-8 up_right ']//input[@id='ctl01_MainContent_ucJournalAddEntry_chkAddtoCalender']")
    protected WebElement lblAddEventAddJournal;

    @FindBy(how = How.XPATH, using = "//div[@class='col-md-8 up_right ']//input[@id='ctl01_MainContent_ucEditEntry_chkAddtoCalender']")
    protected WebElement lblEditAddEventAddJournal;

    @FindBy(how = How.XPATH, using = "//input[@value='CANCEL']")
    protected WebElement BtnCancelEventCalender;

    @FindBy(how = How.XPATH, using = "//button[text()='Today']")
    protected WebElement BtnTodayCalender;

    @FindBy(how = How.XPATH, using = "//span[@class='fa  fa-2x fa-angle-left']")
    protected WebElement BtnLeftNavigationCalender;

    @FindBy(how = How.XPATH, using = "//span[@class='fa  fa-2x fa-angle-right']")
    protected WebElement BtnRightNavigationCalender;

    @FindBy(how = How.XPATH, using = "//button[text()='Day']")
    protected WebElement BtnDayCalender;

    @FindBy(how = How.XPATH, using = "//button[text()='Week']")
    protected WebElement BtnWeekCalender;

    @FindBy(how = How.XPATH, using = "//button[text()='Month']")
    protected WebElement BtnMonthCalender;

    @FindBy(how = How.XPATH, using = "//div[text()='General ']/preceding-sibling::div[@class='user_color round_indication']")
    protected WebElement lblGeneralCalender;

    @FindBy(how = How.XPATH, using = "//div[text()='Appointment ']/preceding-sibling::div[@class='appointment_color round_indication']")
    protected WebElement lblAppointmentCalender;

    @FindBy(how = How.XPATH, using = "//div[text()='Journal ']/preceding-sibling::div[@class='journal_color round_indication']")
    protected WebElement lblJournalCalender;

    @FindBy(how = How.XPATH, using = "//td[@class='fc-day ui-widget-content fc-tue fc-today ui-state-highlight']")
    protected WebElement BtnTodayDateSlotCalender;

    @FindBy(how = How.XPATH, using = "//td[@class='fc-day ui-widget-content fc-tue fc-today ui-state-highlight']/following-sibling::td[@class='fc-day ui-widget-content fc-wed fc-future']")
    protected WebElement BtnNextDateSlotCalender;

    @FindBy(how = How.XPATH, using = "//span[text()='00:00']")
    protected WebElement lblTimeStampCalender;

    @FindBy(how = How.XPATH, using = "//th[@class='fc-day-header ui-widget-header fc-sun']")
    protected WebElement lblDateStampCalender;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Help:Calendar')]")
    protected WebElement HelpCalenderWindow;

    @FindBy(how = How.XPATH, using = "//button[text()='Close']")
    protected WebElement BtnCloseHelpCalenderWindow;

    @FindBy(how = How.XPATH, using = "//td[text()='Title : ']")
    protected WebElement lblTitleEventCalender;

    @FindBy(how = How.XPATH, using = "//td[text()='Description : ']")
    protected WebElement lblDescriptionEventCalender;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'All day Event :')]")
    protected WebElement lblAllDayEventCalender;

    @FindBy(how = How.XPATH, using = "//button[text()='Close']")
    protected WebElement lblStartEventCalender;

    @FindBy(how = How.XPATH, using = "//button[text()='Close']")
    protected WebElement lblEndEventCalender;

//Practice Details

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']//span[contains(text(),'Practice')]")
    protected WebElement lblPractice;

    @FindBy(how = How.XPATH, using = "//h4[@id='ctl01_MainContent_spnPracticeName']")
    protected WebElement lblTitlePractice;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$drpPractice']")
    protected WebElement BtnSelectYourPractice;

    @FindBy(how = How.XPATH, using = "//select[@name='ctl01$MainContent$drpPractice']")
    protected WebElement BtnEditPractice;

    @FindBy(how = How.XPATH, using = "//div[text()='Id']")
    protected WebElement lblIDLocationTabPractice;

    @FindBy(how = How.XPATH, using = "//div[text()='Location Name']")
    protected WebElement lblLocationNameLocationTabPractice;

    @FindBy(how = How.XPATH, using = "//div[text()='Location']")
    protected WebElement lblLocationLocationTabPractice;

    @FindBy(how = How.XPATH, using = "//div[text()='Time Zone']")
    protected WebElement lblTimeZoneLocationTabPractice;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Staff')]")
    protected WebElement BtnStaffTabPracticePage;

    @FindBy(how = How.XPATH, using = "//div[text()='Full Name']")
    protected WebElement lblFullNameStaffTabPracticePage;

    @FindBy(how = How.XPATH, using = "//div[text()='UserName']")
    protected WebElement lblUserNameStaffTabPracticePage;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_search']")
    protected WebElement BtnSearchStaffTabPracticePage;

    @FindBy(how = How.XPATH, using = "//h4[text()='Staff details']")
    protected WebElement lblStaffTabPracticePage;

    @FindBy(how = How.XPATH, using = "//img[@alt='Practice location google map']")
    protected WebElement ImgMapPracticePage;

    @FindBy(how = How.XPATH, using = "//span[text()='Practice Location Google Map']")
    protected WebElement WindowMapPracticePage;

    @FindBy(how = How.XPATH, using = "//div[@id='googleMapDialog']/following::button[text()='Close']")
    protected WebElement BtnCloseWindowMapPracticePage;


}

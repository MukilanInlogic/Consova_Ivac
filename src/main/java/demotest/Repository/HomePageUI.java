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


    protected String strLeftPaneHeaderLocator = new StringBuilder("//a[contains(text(),'").append("<<REPLACE>>").append("')]").toString();

    protected String strLeftPaneSubHeaderLocator = new StringBuilder("//div[@id='ctl01_LeftMainMenu']//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'GDPR NOTICE')]")
    protected WebElement disclaimer1;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Privacy by Design')]")
    protected WebElement disclaimer2;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Right to be Forgotten')]")
    protected WebElement disclaimer3;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Right to Access')]")
    protected WebElement disclaimer4;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'HIPAA NOTICE – Acknowledgement')]")
    protected WebElement disclaimer5;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Legal Disclaimer - Liability Waiver')]")
    protected WebElement disclaimer6;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Legal Disclaimer - Right to Obtain Internet Protocol Address')]")
    protected WebElement disclaimer7;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Legal Disclaimer - Acknowledgement of Penalties')]")
    protected WebElement disclaimer8;

    @FindBy(how = How.XPATH, using = "//p[contains(@class,'text-danger')]")
    protected WebElement errorMessage;

    @FindBy(how = How.XPATH, using = "//h2[@class='mb-4']")
    protected WebElement imgLoginPage;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    protected WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//span[@class='d-none d-sm-block order-sm-1 page-title']")
    protected WebElement dashboardTitle;

    @FindBy(how = How.ID, using = "LastName")
    protected WebElement LastNameTxt;

    @FindBy(how = How.ID, using = "ConsovaPIN")
    protected WebElement consovaIDTxt;

    @FindBy(how = How.ID, using = "EmployeeSSN")
    protected WebElement sSNTxt;

    @FindBy(how = How.XPATH, using = "//img[@class='img-fluid']")
    protected WebElement loginError;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary f-20 py-2']")
    protected WebElement warningButton;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'text-danger')]")
    protected WebElement warningMessage;

    @FindBy(how = How.XPATH, using = "//span[@class='menu_icon logout_icon']")
    protected WebElement logOffButton;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Accept')]")
    protected WebElement acceptButton;
    protected String acceptBtn;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Decline')]")
    protected WebElement declineButton;

    @FindBy(how = How.XPATH, using = "//img[@alt='Verification Details']")
    protected List<WebElement> verificationDetails;

    @FindBy(how = How.XPATH, using = "//div[@class='col-6 col-md-1 px-1']")
    protected List<WebElement> dOBInDashboard;

    @FindBy(how = How.XPATH, using = "//div[@class='col-6 col-md-1 px-1 mt-3 mt-md-0']")
    protected List<WebElement> deadLineAndStatus;

    @FindBy(how = How.XPATH, using = "//div[@class='col-6 col-md-2 px-1']")
    protected List<WebElement> relationShipInDashboard;

    @FindBy(how = How.XPATH, using = "//div[@class='d-flex justify-content-left align-items-center flex-wrap my-4 dependent-list ng-star-inserted'][1]//button[@class='btn btn-primary mw-90px mt-3 mt-md-0 ml-4 dashboard_upload_btn_mobile ng-star-inserted']")
    protected WebElement uploadDocumentIcon;

    @FindBy(how = How.XPATH, using = "//input[@type='file']")
    protected WebElement browsePath;
    protected String filename = "BirthCertificate.jpg";

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Invalid file size')]")
    protected WebElement uploadErrorMessageVerify;
    protected String Highmbfilename = "6MBFile.pdf";

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
    protected WebElement uploadIcon;

    @FindBy(how = How.XPATH, using = "//span[text()='Uploaded Document']")
    protected List<WebElement> uploadDocumentVerify;

    @FindBy(how = How.XPATH, using = "//span[@class='cursor-pointer ng-star-inserted']")
    protected List<WebElement> uploadDocumentOpenIcon;

    @FindBy(how = How.XPATH, using = "//span[@class='cursor-pointer']")
    protected WebElement closeModal;

    //Wizard Page references

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary f-24 ng-star-inserted']")
    protected WebElement wizardStratButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Begin']")
    protected WebElement firstSlideWizardBtn;

    @FindBy(how = How.XPATH, using = "//h2[@class='mb-4 mb-2 d-flex align-items-center justify-content-between popup-header-title']")
    protected WebElement secondSlideWizardVerify;

    @FindBy(how = How.XPATH, using = "//span[text()='Save & Finish Later']")
    protected WebElement saveAndFinishLaterBtn;

    @FindBy(how = How.XPATH, using = "//body[@class='ui-overflow-hidden']//button[@class='btn btn-primary btn-block mt-3']")
    protected WebElement popupWindowCloseBtn;

    @FindBy(how = How.XPATH, using = "//div[@role='dialog']//div[@class='col-6 col-md-2 pl-1']//label[@class='dependent-value']")
    protected List<WebElement> dOBInWizard;

    @FindBy(how = How.XPATH, using = "//h3[contains(@class,'dependent-name')]")
    protected List<WebElement> fullNameInWizard;

    @FindBy(how = How.XPATH, using = "//div[@class='d-flex justify-content-left align-items-center flex-wrap my-4 dependent-list ng-star-inserted']//div[@class='col-6 col-md-2 pl-1 mt-4 mt-md-0']")
    protected List<WebElement> genderInWizard;

    @FindBy(how = How.XPATH, using = "//label[text()='Relationship']")
    protected List<WebElement> relationshipInWizard;

    @FindBy(how = How.XPATH, using = "//label[text()='Child ']")
    protected WebElement childRelationshipInWizard;

    @FindBy(how = How.XPATH, using = "//button[text()='Back']")
    protected WebElement BackWizardIcon;

    @FindBy(how = How.XPATH, using = "//span[text()='Save & Continue']")
    protected WebElement saveAndContinue;

    @FindBy(how = How.XPATH, using = "//div[@class='col-12 col-sm-12 px-0']//p[@class='col-12 col-sm-12 text-truncate mb-3 px-0']")
    protected WebElement individualDependentSlideVerify;

    @FindBy(how = How.XPATH, using = "//div[@class='col-6 col-md-3 px-1'][1]")
    protected WebElement dOBIndividualWizard;

    @FindBy(how = How.XPATH, using = "//div[@class='col-6 col-md-3 px-1'][2]")
    protected WebElement relationshipIndividualWizard;

    @FindBy(how = How.XPATH, using = "//div[@class='custom-control custom-radio custom-control-inline']//label[@class='custom-control-label']")
    protected List<WebElement> eligibleRadioBtns;

    @FindBy(how = How.XPATH, using = "//div[@class='ui-dropdown-label-container']")
    protected WebElement eligibleDropDownBtns;

    @FindBy(how = How.XPATH, using = "//ul[@class='ui-dropdown-items ui-dropdown-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']")
    protected List<WebElement> eligibleDropDownBtnSelection;

    @FindBy(how = How.XPATH, using = "//span[text()='Finish']")
    protected WebElement finishButton;

    @FindBy(how = How.XPATH, using = "//div[@class='col-9 px-2']")
    protected List<WebElement> uploadDescription;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary mw-90px mt-3 mt-md-0 dashboard_upload_btn_mobile']")
    protected List<WebElement> uploadDescriptionIcon;

    @FindBy(how = How.XPATH, using = "//li[@role='option']")
    protected List<WebElement> dropdownListInWizard;

    @FindBy(how = How.XPATH, using = "//label[text()='Sub Relationship']")
    protected List<WebElement> clickDropdownListInWizard;

    @FindBy(how = How.XPATH, using = "//span[@class='ml-2']")
    protected List<WebElement> statusInSummarySlide;

    //Contacts Page references

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'contact_icon')]")
    protected WebElement contactInMenubar;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'contact_icon')]")
    protected WebElement promptMessageInContactsPage;

    @FindBy(how = How.ID, using = "Comments")
    protected WebElement commentsTextox;

    @FindBy(how = How.ID, using = "callBackNeeded")
    protected WebElement callBackCheckbox;

    @FindBy(how = How.ID, using = "CallBackNumber")
    protected WebElement callBackNumberTextbox;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    protected WebElement submitButtonIncontactPage;

    @FindBy(how = How.XPATH, using = "//p[text()='Call for assistance']")
    protected WebElement callForAssistance;

    @FindBy(how = How.XPATH, using = "//div[@class='d-block d-sm-flex align-items-center']//button[@type='button']")
    protected WebElement uploadIconInContactPage;

    @FindBy(how = How.XPATH, using = "//p[@class='contact-title faxmailtitle']")
    protected List<WebElement> faxAndMailInContactPage;

    //Profile page

    @FindBy(how = How.XPATH, using = "//div[@class='user_image']")
    protected WebElement profilePhotoIcon;

    @FindBy(how = How.XPATH, using = "//span[@class='dropdown-btn user_icon']")
    protected WebElement profileButtonInPopup;

    @FindBy(how = How.XPATH, using = "//label[text()='Address']")
    protected WebElement addressInProfilePage;

    @FindBy(how = How.XPATH, using = "//strong[text()='Home']")
    protected WebElement homeContactNumberDetailsInProfilePage;

    @FindBy(how = How.XPATH, using = "//strong[text()='Mobile']")
    protected WebElement mobileContactNumberDetailsInProfilePage;

    @FindBy(how = How.XPATH, using = "//strong[text()='Work']")
    protected WebElement workContactNumberDetailsInProfilePage;

    @FindBy(how = How.XPATH, using = "//strong[text()='Email']")
    protected WebElement emailListInProfilePage;

    @FindBy(how = How.XPATH, using = "//strong[text()='Preferred Email']")
    protected WebElement preferredEmailListInProfilePage;

    @FindBy(how = How.XPATH, using = "//button[text()='Edit']")
    protected WebElement editButtonInProfilePage;

    @FindBy(how = How.ID, using = "addressline1")
    protected WebElement addressline1UpdateInProfilePage;
    protected String addressline1="Po Box 11";
    @FindBy(how = How.ID, using = "addressline2")
    protected WebElement addressline2UpdateInProfilePage;
    protected String addressline2="Third Avenue";
    @FindBy(how = How.ID, using = "city")
    protected WebElement cityUpdateInProfilePage;
    protected String city="Ohio";
    @FindBy(how = How.ID, using = "zipcode")
    protected WebElement zipcodeUpdateInProfilePage;
    protected String zipcode="2526";
    @FindBy(how = How.ID, using = "homephone")
    protected WebElement homephoneUpdateInProfilePage;
    protected String homephone="1234567890";
    @FindBy(how = How.ID, using = "mobilephone")
    protected WebElement mobileNumberUpdateInProfilePage;
    protected String mobilephone="1234567890";
    @FindBy(how = How.ID, using = "workphone")
    protected WebElement workphoneUpdateInProfilePage;
    protected String workphone="12345678901234";

    @FindBy(how = How.XPATH, using = "//button[text()='Cancel']")
    protected WebElement cancelButtonInProfilePopup;

    @FindBy(how = How.XPATH, using = "//button[text()='Save']")
    protected WebElement saveButtonInProfilePopup;

    @FindBy(how = How.XPATH, using = "//h5[text()='Authorized Caller ']")
    protected WebElement authorizedCaller;

    @FindBy(how = How.XPATH, using = "//span[text()='Add Caller']")
    protected WebElement addCallerButton;

    @FindBy(how = How.XPATH, using = "//img[@class='action-img']")
    protected WebElement removeButton;

    @FindBy(how = How.ID, using = "CallerName")
    protected WebElement addCallerName;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'text-truncate')]")
    protected List<WebElement> enteredAuthorizedCallerName;

    @FindBy(how = How.XPATH, using = "//span[@class='renew-button mr-2']")
    protected WebElement renewButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Confirm']")
    protected WebElement confirmButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Cancel']")
    protected WebElement cancelButton;

    @FindBy(how = How.XPATH, using = "//th[text()=' Name ']")
    protected WebElement nameInAuthorizedCaller;
    @FindBy(how = How.XPATH, using = "//th[text()=' Relationship ']")
    protected WebElement relationshipInAuthorizedCaller;
    @FindBy(how = How.XPATH, using = "//th[text()=' Authorized Date ']")
    protected WebElement authorizedDateInAuthorizedCaller;
    @FindBy(how = How.XPATH, using = "//th[text()=' Expiration Date ']")
    protected WebElement expirationDateInAuthorizedCaller;

    @FindBy(how = How.XPATH, using = "//span[text()='Go Green']")
    protected WebElement goGreenVerify;

    @FindBy(how = How.ID, using = "PreferredEmail")
    protected WebElement preferredEmail;

    @FindBy(how = How.ID, using = "ConfirmPreferredEmail")
    protected WebElement confirmPreferredEmail;

    @FindBy(how = How.XPATH, using = "//span[text()='Activate']")
    protected WebElement activateButton;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'ic_mail_sent')]")
    protected WebElement emailSentSuccessfulIcon;

    @FindBy(how = How.XPATH, using = "//span[text()=' Medical']")
    protected WebElement benefitsVerified;

    //Menu PAge

    @FindBy(how = How.XPATH, using = "//select[contains(@class,'language-select')]")
    protected WebElement languageSelect;

    @FindBy(how = How.XPATH, using = "//option[text()=' Spanish']")
    protected WebElement spanishLanguageSelect;

    @FindBy(how = How.XPATH, using = "//option[text()=' English']")
    protected WebElement englishLanguageSelect;

    @FindBy(how = How.XPATH, using = "//button[text()=' subir documentos ']")
    protected WebElement submitDocumentsInSpanish;

    @FindBy(how = How.XPATH, using = "//span[text()='Tablero']")
    protected WebElement dashboardInSpanish;

    @FindBy(how = How.XPATH, using = "//span[text()='Detalles de verificación']")
    protected WebElement verificationDetailsInSpanish;

    @FindBy(how = How.XPATH, using = "//span[text()='Contacta con nosotros']")
    protected WebElement contactUsInSpanish;

    @FindBy(how = How.XPATH, using = "//span[text()='Política de privacidad']")
    protected WebElement privacyPolicyInSpanish;

    @FindBy(how = How.XPATH, using = "//span[text()='Upload Documents']")
    protected WebElement uploadDocumentIconInMenubar;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-trash']")
    protected WebElement removeUploadedDocumentInGrid;

    @FindBy(how = How.XPATH, using = "//div[text()='BirthCertificate.jpg']")
    protected WebElement verifyUploadedDocumntInGrid;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'dashboard_icon')]")
    protected WebElement dashboardInMenubar;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'admin_ticket_icon')]")
    protected WebElement verificationDetailsInMenubar;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'knowledge_center_icon')]")
    protected WebElement knowledgeCenterInMenubar;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'privacy_policy_icon')]")
    protected WebElement privacyPolicyInMenubar;

    @FindBy(how = How.ID, using = "sidebarCollapse")
    protected WebElement sidebarCollapse;

    @FindBy(how = How.ID, using = "username")
    protected WebElement userNameInCore;

    @FindBy(how = How.ID, using = "password")
    protected WebElement passwordInCore;

    @FindBy(how = How.XPATH, using = "//span[text()='My Inventory']")
    protected WebElement myInventory;

    @FindBy(how = How.XPATH, using = "//input[@class='form-control form-control-sm']")
    protected List<WebElement> headerInMyInventory;

    @FindBy(how = How.XPATH, using = "//i[contains(@id,'loadAudit')]")
    protected WebElement loadAudit;

    @FindBy(how = How.XPATH, using = "//span[contains(@id,'loadAccount')]")
    protected WebElement loadAccount;

    @FindBy(how = How.XPATH, using = "//span[text()='BC']")
    protected List<WebElement> bcBiologicalChild;

    @FindBy(how = How.XPATH, using = "//span[text()='SC']")
    protected List<WebElement> scStepChild;

    @FindBy(how = How.XPATH, using = "//strong[text()='Yes']")
    protected WebElement yesInPopup;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'ic_done')]")
    protected List<WebElement> completedDocInCore;

    @FindBy(how = How.XPATH, using = "//strong[text()='N/A']")
    protected List<WebElement> notApplicableDocInCore;

    @FindBy(how = How.XPATH, using = "//strong[text()='INC']")
    protected List<WebElement> inCompleteDocInCore;

    @FindBy(how = How.XPATH, using = "//strong[text()='MIS']")
    protected List<WebElement> missingDocInCore;

    @FindBy(how = How.XPATH, using = "//strong[text()='ALT']")
    protected List<WebElement> alternateDocInCore;

    @FindBy(how = How.XPATH, using = "//span[text()=' Not Received ']")
    protected List<WebElement> notReceivedDocInCoreAndIvac;

    @FindBy(how = How.XPATH, using = "//span[text()=' Complete ']")
    protected List<WebElement> completedDocInIvac;

    @FindBy(how = How.XPATH, using = "//span[text()=' N/A ']")
    protected List<WebElement> notApplicableDocInIvac;

    @FindBy(how = How.XPATH, using = "//span[text()=' Incomplete ']")
    protected List<WebElement> inCompleteDocInIvac;

    @FindBy(how = How.XPATH, using = "//span[text()=' Missing ']")
    protected List<WebElement> missingDocInIvac;

    @FindBy(how = How.XPATH, using = "//span[text()=' Complete ']")
    protected List<WebElement> alternateDocInIvac;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'position-relative')]")
    protected List<WebElement> documentStatusListInCore;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'border-bottom-mobile')]")
    protected List<WebElement> documentStatusListInIvac;

    @FindBy(how = How.XPATH, using = "//ul[@class='list-group']//img[contains(@src,'ic_done')]")
    protected WebElement completedDocInCorePopup;

    @FindBy(how = How.XPATH, using = "//ul[@class='list-group']//strong[text()='N/A']")
    protected WebElement notApplicableDocInCorePopup;

    @FindBy(how = How.XPATH, using = "//ul[@class='list-group']//strong[text()='INC']")
    protected WebElement inCompleteDocInCorePopup;

    @FindBy(how = How.XPATH, using = "//ul[@class='list-group']//strong[text()='MIS']")
    protected WebElement missingDocInCorePopup;

    @FindBy(how = How.XPATH, using = "//ul[@class='list-group']//strong[text()='ALT']")
    protected WebElement alternateDocInCorePopup;

    @FindBy(how = How.XPATH, using = "//button[text()='Save']")
    protected WebElement saveButton;

    @FindBy(how = How.ID, using = "btnGroupDrop1")
    protected WebElement addDocumentInCore;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-lg fa-plus pointer mr-2']")
    protected List<WebElement> addDocumentIconInPopup;

    @FindBy(how = How.XPATH, using = "//label[text()='M']")
    protected WebElement medicalIcon;

    @FindBy(how = How.XPATH, using = "//strong[text()='Save']")
    protected WebElement saveButtonInPopup;

    @FindBy(how = How.XPATH, using = "//ul[@class='nav mx-0']//li[contains(@class,'ng-star-inserted')]")
    protected List<WebElement> dependentHeaderTab;

    @FindBy(how = How.XPATH, using = "//span[@class='ui-tabview-title ng-star-inserted']")
    protected List<WebElement> dependentHeaderTabnIvac;

    @FindBy(how = How.XPATH, using = "//button[text()='Ineligible Codes']")
    protected WebElement eligibleCodesButton;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'sticky-section')]//label[text()='M']")
    protected List<WebElement> ineligibleReason;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-circle pull-right']")
    protected WebElement closeButton;

    @FindBy(how = How.XPATH, using = "//img[contains(@src,'exclamation-red')]")
    protected WebElement ineligibleIcon;

    @FindBy(how = How.XPATH, using = "//img[contains(@class,'userInitial')]")
    protected WebElement profileIconInCore;

    @FindBy(how = How.ID, using = "logout")
    protected WebElement logoffButtonInCore;

    @FindBy(how = How.XPATH, using = "//input[@name='loginfmt']")
    protected WebElement usernameInOutlook;

    @FindBy(how = How.ID, using = "passwordInput")
    protected WebElement passwordInOutlook;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    protected WebElement nextButtonInOutlook;

    @FindBy(how = How.XPATH, using = "//div[@title='Outlook']")
    protected WebElement outlookIcon;

    @FindBy(how = How.ID, using = "submitButton")
    protected WebElement loginButtonInOutlook;

    @FindBy(how = How.ID, using = "idSIButton9")
    protected WebElement yesFromPopupInOutlook;

    @FindBy(how = How.XPATH, using = "//span[text()='support@consova.com']")
    protected WebElement activationEmail;

    @FindBy(how = How.XPATH, using = "//span[text()='Other']")
    protected WebElement otersTabInOutlook;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'iverify.consova.com')]")
    protected WebElement activationLink;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa-check')]")
    protected List<WebElement> actionIconForPackage;

    @FindBy(how = How.XPATH, using = "//button[text()='Proceed']")
    protected WebElement submitButtonInNewPackagePopup;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    protected WebElement submitButtonInPortalEnquiryPopop;

    @FindBy(how = How.XPATH, using = "//textarea[@name='additionalNote']")
    protected WebElement textarea;


}
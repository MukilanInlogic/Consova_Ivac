package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AccountsPageUI {
    protected final WebDriver driver;

    /**
     * @param driver
     */
    public AccountsPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_SiteMapPath1']//span[contains(text(),'My Account')]")
    protected WebElement lblMyAccount;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_LinkButton1']")
    protected WebElement eleProfileTab;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_LinkButton4']")
    protected WebElement eleMYHEALTHCENTRES;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_MainContent_MyHealthCentres1_Repeater1_ctl00_rptRoles_ctl01_lblLocationRoles'][contains(text(),'Clinical Staff')]")
    protected WebElement eleRoleClinicalStaff;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_LinkButton5']")
    protected WebElement eleACCESSINFORMATION;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Access Information')]")
    protected WebElement lblAccessInformation;
//Emergency Contact Details
    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_lnkEmergencyContacts']")
    protected WebElement eleEMERGENCYCONTACTS;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Emergency Contacts')]")
    protected WebElement lblEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_EmergencyContacts1_lnkAdd']//img")
    protected WebElement btnAddEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'First Name ')]/following::input[@name='ctl01$MainContent$EmergencyContacts1$txtFirstNameAdd']")
    protected WebElement lblTxtBoxFirstNameEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Last Name ')]/following::input[@name='ctl01$MainContent$EmergencyContacts1$txtLastNameAdd']")
    protected WebElement lblTxtBoxLastNameEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'E-mail : ')]/following::input[@name='ctl01$MainContent$EmergencyContacts1$txtEmailAdd']")
    protected WebElement lblTxtBoxEmailEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Home Phone :')]")
    protected WebElement lblTxtBoxHomePhoneEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Mobile Phone')]")
    protected WebElement lblTxtBoxMobilePhoneEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Work Phone :')]")
    protected WebElement lblTxtBoxWorkPhoneEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Relationship ')]/following::input[@name='ctl01$MainContent$EmergencyContacts1$txtRelationshipAdd']")
    protected WebElement lblTxtBoxRelationshipEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'City :')]/following::input[@name='ctl01$MainContent$EmergencyContacts1$txtSuburbAdd']")
    protected WebElement lblTxtBoxCityEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Street : ')]/following::input[@name='ctl01$MainContent$EmergencyContacts1$txtStreetAdd']")
    protected WebElement lblTxtBoxStreetEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'State : ')]/following::input[@name='ctl01$MainContent$EmergencyContacts1$txtStateAdd']")
    protected WebElement lblTxtBoxStateEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Post code')]/following::input[@name='ctl01$MainContent$EmergencyContacts1$txtPostcodeAdd']")
    protected WebElement lblTxtBoxPostCodeEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_EmergencyContacts1_txtFirstNameAdd']")
    protected WebElement txtFirstName;

    @FindBy(how = How.XPATH, using = "//input[@id='txtMobilePhoneAdd']")
    protected WebElement txtMobilePhone;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_EmergencyContacts1_txtRelationshipAdd']")
    protected WebElement txtRelationship;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_EmergencyContacts1_txtLastNameAdd']")
    protected WebElement txtLastName;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_EmergencyContacts1_btnSaveAdd']")
    protected WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_EmergencyContacts1_rptEmergencyContact_ctl00_lnkDelete']")
    protected WebElement btnDelete;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_MainContent_EmergencyContacts1_rptEmergencyContact_ctl00_lblFirstName']")
    protected WebElement lblEmergenyContactsAdded;

    @FindBy(how = How.XPATH, using = "//a[text()='Edit']")
    protected WebElement btnEditEmergenceContact;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_EmergencyContacts1_txtFirstnameEdit']")
    protected WebElement txtFirstNameEdit;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_EmergencyContacts1_btnSave']")
    protected WebElement BtnSaveEdit;

    @FindBy(how = How.XPATH, using = "//input[@value='Cancel']")
    protected WebElement BtnCancelEmergencyContacts;

    @FindBy(how = How.XPATH, using = "//h4[text()='Emergency Contacts  ']")
    protected WebElement CaptionEmergencyContacts;

    //Patient Profile Details

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_UserProfile1_lnkEditProfile']")
    protected WebElement lblUpdateProfile;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_EditBasicProfile1_btnUpdateProfile']")
    protected WebElement btnUpdateProfile;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_LinkButton1'][contains(text(),'Edit Profile Details')]")
    protected WebElement lblEditProfileDetails;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_EditBasicProfile1_txtMobileNumber']")
    protected WebElement txtMobilePhoneEditProfileDetails;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_MainContent_UserProfile1_lblMobileNumber']")
    protected WebElement lblUpdatedMobilePhone;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_UserProfile1_lnkChangePass']")
    protected WebElement BtnChangePassword;

    @FindBy (how = How.XPATH, using = "//input[@id='ctl01_MainContent_ChangePassword1_ChangePassword1_ChangePasswordContainerID_CurrentPassword']")
    protected WebElement txtBoxCurrentPassword;

    @FindBy (how = How.XPATH, using = "//input[@id='ctl01_MainContent_ChangePassword1_ChangePassword1_ChangePasswordContainerID_NewPassword']")
    protected WebElement txtBoxNewPassword;

    @FindBy (how = How.XPATH, using = "//input[@id='ctl01_MainContent_ChangePassword1_ChangePassword1_ChangePasswordContainerID_ConfirmNewPassword']")
    protected WebElement txtBoxConfirmNewPassword;

    @FindBy (how = How.XPATH, using = "//div[@class='text-right btn_group mob_btn_goup']//input[@id='ctl01_MainContent_ChangePassword1_ChangePassword1_ChangePasswordContainerID_ChangePasswordPushButton']")
    protected WebElement BtnChangepasswordGreenBtn;

    @FindBy (how = How.XPATH, using = "//div[@class='text-right btn_group mob_btn_goup']//div[contains(.,'Current Password is incorrect. Try again')]")
    protected WebElement ErrorTextInChangePassword;

    @FindBy (how = How.XPATH, using = "//span[contains(.,'* Please match the requested format')]")
    protected WebElement ErrorTextMatchTherequest;

    @FindBy (how = How.XPATH, using = "//span[contains(.,'The Confirm New Password must match the New Password entry.')]")
    protected WebElement ErrorTextMissMatchConfirmNewPassword;

    @FindBy (how = How.XPATH, using = "//a[text()='Change Photo']")
    protected WebElement BtnChangePhotoMyACC;

    @FindBy (how = How.XPATH, using = "//input[@type='file']")
    protected WebElement BtnChooseFile;

    @FindBy (how = How.XPATH, using = "//input[@value='Verify']")
    protected WebElement BtnVerifyMyAcc;

    @FindBy (how = How.XPATH, using = "//div[text()='Characters on the image did not match, Please try again']")
    protected WebElement WarningimageNotMatched;

    @FindBy (how = How.XPATH, using = "//input[@value='Cancel']")
    protected WebElement BtnCancelMyACC;

    @FindBy (how = How.XPATH, using = "//h4[contains(text(),'Profile Photo  ')]")
    protected WebElement CaptionProfilePhoto;

//Personal DetailsMy Account UI
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Full Name : ')]")
    protected WebElement lblFullNamePD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Preferred Name : ')]")
    protected WebElement lblPreferedNamePD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Gender : ')]")
    protected WebElement lblGenderPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Gender : ')]")
    protected WebElement lblDOBPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Occupation : ')]")
    protected WebElement lblOccupationPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Highest Education Level :')]")
    protected WebElement lblHighestEducationLevelPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Username / E-mail : ')]")
    protected WebElement lblUsernameEmailPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Password : ')]")
    protected WebElement lblPasswordPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Street : ')]")
    protected WebElement lblStreetPD;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'City / Province / County')]")
    protected WebElement lblCityProvinceCountyPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Post code')]")
    protected WebElement lblPostCodePD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Home Phone : ')]")
    protected WebElement lblHomePhonePD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Mobile Phone : ')]")
    protected WebElement lblMobilePhonePD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Work Phone : ')]")
    protected WebElement lblWorkPhonePD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Insurance Carrier : ')]")
    protected WebElement lblInsuranceCarrierPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Company Name : ')]")
    protected WebElement lblCompanyNamePD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Coverage : ')]")
    protected WebElement lblCoveragePD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Group Name : ')]")
    protected WebElement lblGroupNamePD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Group Number : ')]")
    protected WebElement lblGroupNumberPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'I.D. Number : ')]")
    protected WebElement lblIDNumberPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Health Care Card :')]")
    protected WebElement lblHealthCareCardPD;

    @FindBy(how = How.XPATH, using = "//Span[contains(text(),'IHI Number')]")
    protected WebElement lblIHINumberPD;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'HPI-I Number')]]")
    protected WebElement lblHPIINumberPD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Appointment Confirmation Mode : ')]")
    protected WebElement lblAppointmentConfirmationModePD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Residency Status : ')]")
    protected WebElement lblResidencyStatusPD;

    @FindBy(how = How.XPATH, using = "//span[text()='Automatic']")
    protected WebElement lblAppointmentModeAutomaticPD;



}

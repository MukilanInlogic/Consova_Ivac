package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SetupPageUI {

    protected final WebDriver driver;

    public SetupPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Setup e-Services')]")
    protected WebElement lblSetupEservices;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_ServiceType1_btnAdd']/img")
    protected WebElement btnAddEsevices;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_ddlPractice']")
    protected WebElement ddbHealthCentre;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_ddlServiceAdd']")
    protected WebElement ddbServiceCategory;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_txtServiceAdd']")
    protected WebElement txtServiceName;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_txtServiceCodeAdd']")
    protected WebElement txtServiceCode;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_chkRoles_0']")
    protected WebElement chkBoxPatient;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_rptRecipient_ctl01_ddlRoles']")
    protected WebElement ddbRecipientRole;

    @FindBy(how = How.XPATH, using = "//select[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_rptRecipient_ctl01_ddlToUsersAdd']")
    protected WebElement ddbRecipient;

    @FindBy(how = How.XPATH, using = "//textarea[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_txtDescAdd']")
    protected WebElement txtDescription;

    @FindBy(how = How.XPATH, using = "//textarea[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_txtTermsAdd']")
    protected WebElement txtTerms;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl01_MainContent_ServiceType1_ServiceTypeAdd1_btnSave']")
    protected WebElement btnSaveEService;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Practice Details')]")
    protected WebElement lblPracticeDetails;

}
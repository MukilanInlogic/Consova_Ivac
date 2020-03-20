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


    @FindBy(how = How.XPATH, using = "//img[@alt='Consova']")
    protected WebElement lblConsovaPage;

    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    protected WebElement TxtBoxUserName;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    protected WebElement TxtBoxPassword;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    protected WebElement BtnLoginConsova;

    @FindBy(how = How.XPATH, using = "//h2[@class='mb-4']")
    protected WebElement imgLoginPage;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    protected WebElement submitButton;

    @FindBy(how = How.XPATH, using = "//img[@class='img-rounded img-fluid ng-star-inserted']")
    protected WebElement clientLOGO;

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

    @FindBy(how = How.XPATH, using = "//span[@class='menu_icon logout_icon']")
    protected WebElement logOffButton;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-success btn-md']")
    protected WebElement acceptButton;
    protected String acceptBtn;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-danger btn-md pull-left']")
    protected WebElement declineButton;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary f-24 ng-star-inserted']")
    protected WebElement wizardStratButton;

    @FindBy(how = How.XPATH, using = "//span[@class='ng-star-inserted']")
    protected WebElement firstSlideWizard;

    @FindBy(how = How.XPATH, using = "//span[@class='ng-star-inserted']")
    protected WebElement firstSlideWizardVerify;

    @FindBy(how = How.XPATH, using = "//span[@class='ng-star-inserted']")
    protected WebElement secondSlideWizardVerify;

    @FindBy(how = How.XPATH, using = "//span[@class='ng-star-inserted']")
    protected WebElement closeWizardIcon;

    @FindBy(how = How.XPATH, using = "//body[@class='ui-overflow-hidden']//button[@class='btn btn-primary btn-block mt-3']")
    protected WebElement popupWindowCloseBtn;

    @FindBy(how = How.XPATH, using = "//div[@role='dialog']//div[@class='col-6 col-md-2 pl-1']//label[@class='dependent-value']")
    protected List<WebElement> dOB;

    @FindBy(how = How.XPATH, using = "//div[@class='d-flex justify-content-left align-items-center flex-wrap my-4 dependent-list ng-star-inserted']//h3[@class='dependent-name']")
    protected List<WebElement> fullNameInWizard;

    @FindBy(how = How.XPATH, using = "//div[@class='d-flex justify-content-left align-items-center flex-wrap my-4 dependent-list ng-star-inserted']//div[@class='col-6 col-md-2 pl-1 mt-4 mt-md-0']")
    protected List<WebElement> genderInWizard;

    @FindBy(how = How.XPATH, using = "//div[@class='d-flex justify-content-left align-items-center flex-wrap my-4 dependent-list ng-star-inserted']//div[@class='col-6 col-md-2 px-1']")
    protected List<WebElement> relationshipInWizard;


}





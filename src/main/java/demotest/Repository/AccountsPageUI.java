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

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_LinkButton4']")
    protected WebElement eleMYHEALTHCENTRES;

    @FindBy(how = How.XPATH, using = "//span[@id='ctl01_MainContent_MyHealthCentres1_Repeater1_ctl00_rptRoles_ctl01_lblLocationRoles'][contains(text(),'Clinical Staff')]")
    protected WebElement eleRoleClinicalStaff;

    @FindBy(how = How.XPATH, using = "//a[@id='ctl01_MainContent_LinkButton5']")
    protected WebElement eleACCESSINFORMATION;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Access Information')]")
    protected WebElement lblAccessInformation;



}

package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.*;
import demotest.util.ActionContainer;
import commonpage.util.TestdataConstants;
import org.openqa.selenium.WebDriver;

import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class HomePageSteps {
    private ActionContainer actionContainer;
    TestdataConstants testdataConstants = new TestdataConstants();

    public HomePageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }
    /*
    @Given("^I am on Consova page$")
    public void iAmOnConsovaPage() {
        assertTrue(actionContainer.homePageActions.verifyHomeloginPage());
    }

    @And("^I Enter (.*) and (.*)$")
    public void iEnterUserNameAndPassword(String strUserName, String strPassword) {
        assertTrue(actionContainer.homePageActions.EnterUserName(testdataConstants.loginUserName));
        assertTrue(actionContainer.homePageActions.EnterPassword(testdataConstants.loginPassword));
    }

    @And("^I click Login button Consova$")
    public void iClickLoginButtonConsova() {
        assertTrue(actionContainer.homePageActions.ClickLogin());
    }*/

    @Given("^I should verify login screen$")
    public void iShouldVerifyLoginScreen() {
        assertTrue(actionContainer.homePageActions.verifyLoginPage());
        System.out.println("iShouldVerifyLoginScreen");
    }

    @When("^I should Login to application with (.*) , (.*) and (.*)$")
    public void iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String lastName,String consovaID,String sSN) {
        assertTrue(actionContainer.homePageActions.lastNameText(Testdata.getValue(lastName)));
        assertTrue(actionContainer.homePageActions.consovaIdText(Testdata.getValue(consovaID)));
        assertTrue(actionContainer.homePageActions.ssnText(Testdata.getValue(sSN)));
        System.out.println("iShouldLoginToApplicationWithLastNameConsovaIdAndSSN");
    }

    @And("^I should verify login button$")
    public void iShouldVerifyLoginButton() {
        assertTrue(actionContainer.homePageActions.verifyLoginButton());
        System.out.println("iShouldVerifyLoginButton");
    }

    @And("^I should click on Login button from Login screen$")
    public void iShouldClickOnLoginButtonFromLoginScreen() {
        assertTrue(actionContainer.homePageActions.submitButton());
        System.out.println("iShouldClickOnLoginButtonFromLoginScreen");
    }

    @Then("^I should verify homepage screen$")
    public void iShouldVerifyHomepageScreen() {
        assertTrue(actionContainer.homePageActions.verifyHomePage());
        System.out.println("iShouldVerifyHomepageScreen");
    }

    @And("^I should see a warning/error message$")
    public void iShouldSeeAWarningErrorMessage() {
        assertTrue(actionContainer.homePageActions.verifyWarning());
        System.out.println("iShouldSeeAWarningErrorMessage");
    }

    @And("^I should click on warning message$")
    public void iShouldClickOnWarningMessage() {
        assertTrue(actionContainer.homePageActions.warningButton());
        System.out.println("iShouldClickOnWarningMessage");
    }

    @And("^I should close the browser$")
    public void iShouldCloseTheBrowser() {
        assertTrue(actionContainer.homePageActions.closeDriver());
        System.out.println("iShouldCloseTheBrowser");
    }

    @Given("^I should enter login url (.*)$")
    public void iShouldEnterLoginUrlURL(String url) {
        assertTrue(actionContainer.homePageActions.enterURL(Testdata.getValue(url)));
        System.out.println("iShouldEnterLoginUrlURL");
    }

    @And("^I should logoff from home screen$")
    public void iShouldLogoffFromLoginScreen() {
        assertTrue(actionContainer.homePageActions.logoffButton());
        System.out.println("iShouldLogoffFromLoginScreen");
    }

    @And("^I should accept disclaimer Notice if displayed$")
    public void iShouldAcceptGDPRNoticeIfDisplayed() {
        assertTrue(actionContainer.homePageActions.disclaimerAcceptButton());
        System.out.println("iShouldAcceptGDPRNoticeIfDisplayed");
    }

    @And("^I should decline disclaimer Notice if displayed$")
    public void iShouldDeclineDisclaimerNoticeIfDisplayed() {
        assertTrue(actionContainer.homePageActions.disclaimerDeclineButton());
        System.out.println("iShouldDeclineDisclaimerNoticeIfDisplayed");
    }

    @And("^I should click on wizard start icon$")
    public void iShouldClickOnWizardStartIcon() {
        assertTrue(actionContainer.homePageActions.wizardButton());
        System.out.println("iShouldClickOnWizardStartIcon");
    }

    @Then("^I should verify the first Introduction slide$")
    public void iShouldVerifyTheFirstIntroductionSlide() {
        assertTrue(actionContainer.homePageActions.firstSlideInWizardVerify());
        System.out.println("iShouldVerifyTheFirstIntroductionSlide");
    }

    @And("^I should click on Begin button in first slide$")
    public void iShouldClickOnBeginButtonInFirstSlide() {
        assertTrue(actionContainer.homePageActions.firstSlideInWizard());
        System.out.println("iShouldClickOnBeginButtonInFirstSlide");
    }

    @And("^I should verify the second dependent slide$")
    public void iShouldVerifyTheSecondDependentSlide() {
        assertTrue(actionContainer.homePageActions.secondSlideInWizardVerify());
        System.out.println("iShouldVerifyTheSecondDependentSlide");
    }

    @Then("^I should close the wizard window$")
    public void iShouldCloseTheWizardWindow() {
        assertTrue(actionContainer.homePageActions.closeWizard());
        System.out.println("iShouldCloseTheWizardWindow");
    }

    @And("^I should click on OK button in popup$")
    public void iShouldClickOnOKButtonInPopup() {
        assertTrue(actionContainer.homePageActions.closePopup());
        System.out.println("iShouldClickOnOKButtonInPopup");
    }

    @And("^I should verify DOB of dependents sorted descending by age (.*) and (.*)$")
    public void iShouldVerifyDOBOfDependentsSortedDescendingByAge(String dataType,String dateFormat) {
        assertTrue(actionContainer.homePageActions.dOBAscendingCheck(Testdata.getValue(dataType),Testdata.getValue(dateFormat)));
        System.out.println("iShouldVerifyDOBOfDependentsSortedDescendingByAge");
    }

    @And("^I should verify Dependent's full name present in Dependent information$")
    public void iShouldVerifyDependentSFullNamePresentInDependentInformation() {
        assertTrue(actionContainer.homePageActions.fullNameVerify());
        System.out.println("iShouldVerifyDependentSFullNamePresentInDependentInformation");
    }

    @And("^I should verify Dependent's relationship present in Dependent information$")
    public void iShouldVerifyDependentSRelationshipPresentInDependentInformation() {
        assertTrue(actionContainer.homePageActions.relationshipVerify());
        System.out.println("iShouldVerifyDependentSRelationshipPresentInDependentInformation");
    }

    @And("^I should verify Dependent's DOB present in Dependent information$")
    public void iShouldVerifyDependentSDOBPresentInDependentInformation() {
        assertTrue(actionContainer.homePageActions.dOBVerify());
        System.out.println("iShouldVerifyDependentSDOBPresentInDependentInformation");
    }

    @And("^I should verify Dependent's Gender present in Dependent information$")
    public void iShouldVerifyDependentSGenderPresentInDependentInformation() {
        assertTrue(actionContainer.homePageActions.genderVerify());
        System.out.println("iShouldVerifyDependentSGenderPresentInDependentInformation");
    }

}

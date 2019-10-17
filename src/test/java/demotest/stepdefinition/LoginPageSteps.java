package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;

import static org.junit.Assert.assertTrue;

public class LoginPageSteps {

    private ActionContainer actionContainer;

    public LoginPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }


    @Given("^I am on manage my health home page$")
    public void iAmOnManageMyHealthHomePage() throws Throwable {
        assertTrue(actionContainer.loginPageActions.clickSecureLoginBtn());
    }


    @And("^I Enter (.*) in User name textbox$")
    public void iEnterUserNameInUserNameTextbox(String strUserName) throws Throwable {
        assertTrue(actionContainer.loginPageActions.enterUserNameInMMH(Testdata.getValue(strUserName)));
    }

    @And("^I Enter (.*) in password textbox$")
    public void iEnterPasswordInPasswordTextbox(String strPassword) throws Throwable {
        assertTrue(actionContainer.loginPageActions.enterPasswordInMMH(Testdata.getValue(strPassword)));

    }
    @And("^I Enter (.*), (.*) valid credentials in Manage my health page$")
    public void iEnterUserNamePasswordValidCredentialsInManageMyHealthPage(String strUserName, String strPassword) throws Throwable {
        assertTrue(actionContainer.loginPageActions.enterUserNameInMMH(Testdata.getValue(strUserName)));
        assertTrue(actionContainer.loginPageActions.enterPasswordInMMH(Testdata.getValue(strPassword)));
    }


    @When("^I click Login button$")
    public void iClickLoginButton() throws Throwable {
        assertTrue(actionContainer.loginPageActions.clickLoginBtn());

    }
}

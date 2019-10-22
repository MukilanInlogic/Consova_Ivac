package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;

import static org.junit.Assert.assertTrue;

public class InboxPageSteps {

    private ActionContainer actionContainer;

    public InboxPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @And("^I click compose Tab$")
    public void iClickComposeTab() throws Throwable {
        assertTrue(actionContainer.inboxPageActions.clickComposeTab());
    }

    @And("^I select healthcenter(.*) and Location(.*)$")
    public void iSelectHealthcenterHealthCentreAndLocationLocation(String strHealthCentre, String strLocation) throws Throwable {
        assertTrue(actionContainer.inboxPageActions.selectValuefromHealthcentre(Testdata.getValue(strHealthCentre)));
        assertTrue(actionContainer.inboxPageActions.selectValuefromLocation(Testdata.getValue(strLocation)));
    }

    @And("^I select the Services in the dropdown(.*)$")
    public void iSelectTheServicesInTheDropdownServiceName(String strServiceName) throws Throwable {
        assertTrue(actionContainer.inboxPageActions.selectValuefromServiceName(Testdata.getValue(strServiceName)));
    }

    @And("^I select To as Clinical Provider(.*)$")
    public void iSelectToAsClinicalProviderTo(String strTo) throws Throwable {
        assertTrue(actionContainer.inboxPageActions.selectValuefromTo(Testdata.getValue(strTo)));
    }

    @And("^I select UserName(.*)$")
    public void iSelectUserNameUserName(String strUserName) throws Throwable {
        assertTrue(actionContainer.inboxPageActions.selectValuefromUserName(Testdata.getValue(strUserName)));
    }

    @And("^I Enter manadory fields(.*)$")
    public void iEnterManadoryFieldsMessage(String strMessage ,int strFrame) throws Throwable {
        assertTrue(actionContainer.inboxPageActions.swithtoframe(strFrame));
        assertTrue(actionContainer.inboxPageActions.enterMessage(Testdata.getValue(strMessage)));
    }

    @When("^I click Send Message Button$")
    public void iClickSendMessageButton() throws Throwable{
        assertTrue(actionContainer.inboxPageActions.clickSendMessage());
    }

    @And("^I click Reuturn to Inbox Button$")
    public void iClickReuturnToInboxButton() throws Throwable{
        assertTrue(actionContainer.inboxPageActions.clickReturnToInbox());
    }

    @And("^I click sent Tab$")
    public void iClickSentTab()throws Throwable {
        assertTrue(actionContainer.inboxPageActions.clickSentTab());
    }

    @And("^I click delete Button$")
    public void iClickDeleteButton() {
        assertTrue(actionContainer.inboxPageActions.clickTrashButton());
        assertTrue(actionContainer.inboxPageActions.AcceptAlert());
    }

    @Then("^I should see Send successfully$")
    public void iShouldSeeSendSuccessfully() {
        assertTrue(actionContainer.inboxPageActions.verifySendSuccess());
    }
}

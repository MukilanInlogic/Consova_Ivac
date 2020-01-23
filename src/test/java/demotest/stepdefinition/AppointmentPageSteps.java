package demotest.stepdefinition;

import commonpage.toolbox.Alert;
import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class AppointmentPageSteps {
    private ActionContainer actionContainer;

    public AppointmentPageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }



    @Then("^I should see Appointment inbox Menu$")
    public void iShouldSeeAppointmentInboxMenu() {
        assertTrue(actionContainer.appointmentsPageActions.verifyAppointmentInboxPage());
    }

}

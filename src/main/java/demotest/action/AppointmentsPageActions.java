package demotest.action;

import commonpage.toolbox.Element;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.Repository.AppointmentsPageUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppointmentsPageActions extends AppointmentsPageUI {
    public AppointmentsPageActions(WebDriver driver) {
        super(driver);
    }


    public boolean verifyAppointmentInboxPage() {
        Boolean isVerified = false;
        if (lblAppointmentInbox.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }
}

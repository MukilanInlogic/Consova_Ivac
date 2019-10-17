package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AppointmentsPageUI {
    protected final WebDriver driver;

    /**
     * @param driver
     */
    public AppointmentsPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}

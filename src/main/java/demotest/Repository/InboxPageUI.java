package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InboxPageUI {
    protected final WebDriver driver;

    /**
     * @param driver
     */
    public InboxPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}

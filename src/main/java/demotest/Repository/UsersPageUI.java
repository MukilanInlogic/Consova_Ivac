package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UsersPageUI {
    protected final WebDriver driver;

    /**
     * @param driver
     */
    public UsersPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}

package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPageUI {
    protected final WebDriver driver;

    /**
     * @param driver
     */
    public DashBoardPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}

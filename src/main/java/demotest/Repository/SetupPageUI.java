package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SetupPageUI {
    protected final WebDriver driver;

    /**
     * @param driver
     */
    public SetupPageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}




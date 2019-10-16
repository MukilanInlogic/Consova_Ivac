package commonpage.util;

import commonpage.toolbox.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SharedDriver extends EventFiringWebDriver {
    protected static WebDriver driver;


    /**
     * Description:It returns Web Driver
     * @return driver
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    static {
        driver = Browser.getDriver();
    }

    /**
     * Description:This thread closes the Web Browser once all the scenarios are executed
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            driver.quit();
        }
    };

    /**
     * Description:This method is used to shut down the application in runtime(closes the Web Browser)
     * @param CLOSE_THREAD
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    /**
     * Description:This method is used to share the web driver to Actions file
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public SharedDriver() {
        super(driver);
    }
}

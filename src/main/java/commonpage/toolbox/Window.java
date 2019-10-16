package commonpage.toolbox;

import commonpage.util.KeyUtil;
import commonpage.util.Testdata;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.event.KeyEvent;

public class Window {

    static Logger log = LogManager.getLogger(Window.class.getName());

    /**
     * Description:This method is to Switch to Window by ID(strWindowArrayValue)
     * @param driver,strWindowArrayValue
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean focusWindow(WebDriver driver, int strWindowArrayValue) {
        boolean blResult = false;
        String strWindowHandle = driver.getWindowHandles().toArray()[strWindowArrayValue].toString();
        try {
            driver.switchTo().window(strWindowHandle);
            driver.manage().window().maximize();
            blResult = true;
        } catch (Exception e) {
            log.error("focusWindow"+e);
        }
        return blResult;
    }

    /**
     * Description:This method is to Switch to Window by Name
     * @param driver
     * @return isWindowSwitched
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Apr-2019
     */
    public static boolean switchwindowByName(WebDriver driver) {
        boolean isWindowSwitched = false;
        String currentWinHandle = driver.getWindowHandle();
        System.out.println("currentWinHandle is " + currentWinHandle);
        try {
            if (currentWinHandle != "") {
                driver.switchTo().window(currentWinHandle);
                isWindowSwitched = true;
            } else {
                isWindowSwitched = false;
            }
        } catch (Exception ex) {
            log.error("switchwindowByName"+ex);
        }
        return isWindowSwitched;

    }

    /**
     * Description:This method is to Close Window
     * @param driver
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean closeWindow(WebDriver driver) {
        boolean blResult = false;
        try {
            driver.close();
            blResult = true;
        } catch (Exception e) {
            log.error("closeWindow"+e);
        }
        return blResult;
    }

    /**
     * Description:This method is to open a new window,check new window is opened and enter a URL
     * @param driver,strURL
     * @return isNewWindowOpen
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean openNewWindow(WebDriver driver, String strURL) {
        boolean isNewWindowOpen = false;
        int windowInitialSize = driver.getWindowHandles().size();
        String strWindowHandle;
        try {
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");
            if ((windowInitialSize + 1) == driver.getWindowHandles().size()) {
                strWindowHandle = driver.getWindowHandles().toArray()[windowInitialSize].toString();
                driver.switchTo().window(strWindowHandle);
                driver.manage().window().maximize();
                driver.get(Testdata.getValue(strURL));
                isNewWindowOpen = true;
            }
            else if((windowInitialSize) == driver.getWindowHandles().size()){
                KeyUtil.pressKey(KeyEvent.VK_CONTROL);
                Sync.waitForSeconds(1);
                KeyUtil.pressKey(KeyEvent.VK_N);
                KeyUtil.releaseKey(KeyEvent.VK_N);
                KeyUtil.releaseKey(KeyEvent.VK_CONTROL);
                strWindowHandle = driver.getWindowHandles().toArray()[windowInitialSize].toString();
                driver.switchTo().window(strWindowHandle);
                driver.manage().window().maximize();
                driver.get(Testdata.getValue(strURL));
                isNewWindowOpen = true;
            }
        } catch (Exception e) {
            log.error("openNewWindow"+e);
            isNewWindowOpen = false;
        }
        return isNewWindowOpen;
    }

    /**
     * Description:This method is to Switch Window to DefaultContent
     * @param driver
     * @return isFrameSwitchedToDefaultContent
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean switchToDefaultContent(WebDriver driver) {
        boolean isFrameSwitchedToDefaultContent = false;
        try {
            Sync.waitForSeconds(3);
            driver.switchTo().defaultContent();
            isFrameSwitchedToDefaultContent = true;
        } catch (Exception e) {
            log.error("switchToDefaultContent"+e);
            isFrameSwitchedToDefaultContent = false;
        }
        return isFrameSwitchedToDefaultContent;
    }


    /**
     * Description:This method is to refresh the current window
     * @param driver
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean refreshWindow(WebDriver driver) {
        boolean blResult = false;
        try {
            driver.navigate().refresh();
            blResult = true;
        } catch (Exception e) {
            log.error("refreshWindow"+e);
        }
        return blResult;
    }
}

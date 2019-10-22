package commonpage.toolbox;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {

    static Logger log = LogManager.getLogger(Element.class.getName());

    /**
     * Description:This method is used to Check Frame is available in that page or not
     * @param driver
     * @return isFramePresent
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean checkFrame(WebDriver driver) {
        boolean isFramePresent = false;
        Sync.waitForSeconds(3);
        try {
            isFramePresent = driver.getPageSource().contains("iframe");
            if (isFramePresent) {
                System.out.println("INSIDE IF checkFrame");
                isFramePresent = true;
            } else {
                System.out.println("INSIDE ELSE checkFrame");
                isFramePresent = false;
            }
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("switchFrameById catch " + Ex.getMessage());
        }
        return isFramePresent;
    }


    /**
     * Description:This method is used to Switch to Frame by Index
     * @param strFrameIndex,driver
     * @return isFrameSwitched
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean switchFrameByIndex(int strFrameIndex,WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().frame(strFrameIndex);
            isFrameSwitched = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("switchFrameById catch " + Ex.getMessage());
        }
        return isFrameSwitched;
    }

    /**
     * Description:This method is used to Switch to Frame by Name
     * @param strFrameName,driver
     * @return isFrameSwitched
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean switchFrameByName(String strFrameName,WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().frame(strFrameName);
            isFrameSwitched = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("switchFrameByName catch " + Ex.getMessage());
        }
        return isFrameSwitched;
    }

    /**
     * Description:This method is used to Switch to Frame by Id
     * @param strFrameId,driver
     * @return isFrameSwitched
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean switchFrameById(int strFrameId,WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().frame(strFrameId);
            isFrameSwitched = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("switchFrameById catch " + Ex.getMessage());
        }
        return isFrameSwitched;
    }

    /**
     * Description:This method is used to Switch to Frame by WebElement
     * @param frameWebElement,driver
     * @return isFrameSwitched
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean switchFrameByWebElement(WebElement frameWebElement,WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().frame(frameWebElement);
            isFrameSwitched = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("switchFrameByWebElement catch " + Ex.getMessage());
        }
        return isFrameSwitched;
    }

    /**
     * Description:This method is used to Switch to Parent Frame
     * @param driver
     * @return isFrameSwitched
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean switchToParentFrame(WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().parentFrame();
            isFrameSwitched = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("switchToParentFrame catch " + Ex.getMessage());
        }
        return isFrameSwitched;
    }

    /**
     * Description:This method is used to Switch to Default Content only when we switch to parent frame
     * @param driver
     * @return isFrameSwitched
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean switchFrameToDefaultContent(WebDriver driver) {
        boolean isFrameSwitched = false;
        try {
            driver.switchTo().defaultContent();
            isFrameSwitched = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("switchFrameToDefaultContent catch " + Ex.getMessage());
        }
        return isFrameSwitched;
    }


}

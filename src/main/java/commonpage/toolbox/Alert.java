package commonpage.toolbox;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Alert {

    static Logger log = LogManager.getLogger(Alert.class.getName());

    /**
     * Description:This method is used to Switch to Alert
     * @param driver
     * @return isAlertSwitched
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:10-Aug-2019
     */
    public static boolean switchToAlert(WebDriver driver) {
        boolean isAlertSwitched = false;
        try {
            driver.switchTo().alert();
            isAlertSwitched = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("switchToAlert catch " + Ex.getMessage());
        }
        return isAlertSwitched;
    }

    /**
     * Description:This method is used to accept Alert
     * @param driver
     * @return isAlertAccepted
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:10-Aug-2019
     */
    public static boolean acceptAlert(WebDriver driver) {
        boolean isAlertAccepted = false;
        try {
            driver.switchTo().alert().accept();
            isAlertAccepted = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("acceptAlert catch " + Ex.getMessage());
        }
        return isAlertAccepted;
    }


    /**
     * Description:This method is used to dismiss Alert
     * @param driver
     * @return isAlertDismiss
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:10-Aug-2019
     */
    public static boolean dismissAlert(WebDriver driver) {
        boolean isAlertDismiss = false;
        try {
            driver.switchTo().alert().dismiss();
            isAlertDismiss = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("dismissAlert catch " + Ex.getMessage());
        }
        return isAlertDismiss;
    }

    /**
     * Description:This method is used to get text message from Alert
     * @param driver
     * @return isgetMessage
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:10-Aug-2019
     */
    public static boolean getMesssageFromAlert(WebDriver driver) {
        boolean isgetMessage = false;
        try {
            driver.switchTo().alert().getText();
            isgetMessage = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("getMesssageFromAlert catch " + Ex.getMessage());
        }
        return isgetMessage;
    }

    /**
     * Description:This method is used to send data to Alert
     * @param strTextValue,driver
     * @return isSendDataToAlert
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:10-Aug-2019
     */
    public static boolean sendDataToAlert(String strTextValue,WebDriver driver) {
        boolean isSendDataToAlert = false;
        try {
            driver.switchTo().alert().sendKeys(strTextValue);
            isSendDataToAlert = true;
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("sendDataToAlert catch " + Ex.getMessage());
        }
        return isSendDataToAlert;
    }
}
package commonpage.toolbox;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

    static Logger log = LogManager.getLogger(Checkbox.class.getName());

    /**
     * Description:This method is used to check a checkbox if the checkbox is unchecked
     * @param driver,element
     * @return isChecked
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:31-May-2019
     */
    public static boolean check(WebDriver driver, WebElement element) {
        boolean isChecked = false;
        try {
            isChecked = element.isSelected();
            System.out.println("check bool value" + isChecked);
            if (!isChecked) {
                Thread.sleep(5000);
                System.out.println("not selected inside if " + isChecked);
                isChecked = Element.jsClick(driver,element);
                System.out.println("check inside if isChecked JSClick " + isChecked);
            }
        } catch (Exception Ex) {
            System.out.println("check " + Ex.getMessage());
            log.error(Ex);
        }

        System.out.println("isChecked check " + isChecked);
        return isChecked;
    }


    /**
     * Description:This method is used to uncheck a checkbox if the checkbox is checked
     * @param driver,element
     * @return isUnChecked
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:31-May-2019
     */
    public static boolean unCheck(WebDriver driver, WebElement element) {

        boolean isUnChecked = false;
        try {
            boolean isSelected = element.isSelected();
            if (isSelected) {
                Sync.waitForSeconds(4);
                isUnChecked = Element.jsClick(driver,element);
                Sync.waitForSeconds(4);
            }
        } catch (Exception Ex) {
            System.out.println("unCheck " + Ex.getMessage());
            log.error(Ex);
        }

        System.out.println("isUnChecked unCheck " + isUnChecked);
        return isUnChecked;
    }


    /**
     * Description:This method is used to check whether a checkbox is selected
     * @param driver,element
     * @return isSelected
     * Author Name:Sankar Ganesh
     * Date of Development:31-May-2019
     */
    public static boolean isChecked(WebDriver driver, WebElement element) {
        boolean isSelected = false;
        try {
            if (element.isSelected()) {
                isSelected = true;
            }
        } catch (Exception Ex) {
            System.out.println("isChecked " + Ex.getMessage());
            log.error(Ex);
        }

        return isSelected;
    }

    /**
     * Description:This method is used to check whether a checkbox is not selected
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:31-May-2019
     */
    public static boolean isCheckable(WebDriver driver, WebElement element) {

        boolean blResult = false;
        try{
            element = Sync.waitForElement(driver, element);
            if (element.isDisplayed()) {
                if (element.isEnabled()) {
                    if (!element.isSelected()) {
                        blResult = true;
                    }
                }
            }
        } catch (Exception Ex) {
            System.out.println("isCheckable " + Ex.getMessage());
            log.error(Ex);
        }
        return blResult;
    }
}

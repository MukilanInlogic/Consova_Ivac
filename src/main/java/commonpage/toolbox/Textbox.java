package commonpage.toolbox;

import commonpage.util.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;

public class Textbox {
    static Logger log = LogManager.getLogger(Textbox.class.getName());

    /**
     * Description:This method is used to enter the input value in text box
     * @param driver,element,strValue
     * @return isValueEntered
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean enterValue(WebDriver driver,WebElement element, String strValue) {
        boolean isValueEntered = false;
        try {
            Sync.waitForSeconds(3);
            if (element.isDisplayed()) {
                String strOldText= Textbox.getText(driver,element);
                if((strOldText == null) && (strOldText.isEmpty())){
                    element.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
                    element.sendKeys(strValue);
                }
                else{
                    element.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
                    element.sendKeys(strValue);
                }
                isValueEntered = true;
            } else {
                isValueEntered = false;
            }
        } catch (Exception e) {

            log.error(e);
        }
        return isValueEntered;
    }

    /**
     * Description:This method is used to enter the input value in text box through JavascriptExecutor
     * @param driver,element,strValue
     * @return isEntered
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean jsEnterValue(WebDriver driver,WebElement element, String strValue) {
        boolean isEntered = false;
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            if (element.isDisplayed()) {
                element.click();
                element.clear();
                executor.executeScript("arguments[0].value='+strValue+;", element);
                isEntered = true;
            } else {
                isEntered = false;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isEntered;
    }

    /**
     * Description:This method is to get Text of an Web Element
     * @param driver,element
     * @return strText
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static String getText(WebDriver driver, WebElement element) {
        String strText ="";
        try {
            Sync.waitForElement(driver, element);
            strText = element.getText();
        } catch (Exception e) {
            log.error(e);
        }
        return strText;
    }

    /**
     * Description:This method is to get Text of an Web Element
     * @param driver,element
     * @return strText
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static String getTextAndCompare(WebDriver driver, WebElement element, String Value) {
        String strText ="";
        try {
            Sync.waitForElement(driver, element);
            strText = element.getText();
            strText.equalsIgnoreCase(Value);
        } catch (Exception e) {
            log.error(e);
        }
        return strText;
    }

    /**
     * Description:This method is to get Text of an Web Element
     * @param driver,by
     * @return strText
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static String getText(WebDriver driver, By by) {
        String strText ="";
        WebElement element=null;
        try {

            element =driver.findElement(by);
            Sync.waitForElement(driver, element);
            strText = element.getText();
        } catch (Exception e) {
            log.error(e);
        }
        return strText;
    }


    /**
     * Description:This method is to clear an input box value
     * @param driver,element
     * @return isValueCleared
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean clearValue(WebDriver driver, WebElement element) {
        boolean isValueCleared=false;
        try{
            element = Sync.waitForElement(driver, element);
            element.clear();
            isValueCleared = true;
        } catch (Exception e) {
            log.error(e);
        }
        return isValueCleared;
    }

    /**
     * Description:This method is to focus a web element using JavascriptExecutor
     * @param driver,element
     * @return isFocused
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean focus(WebDriver driver, WebElement element) {
        boolean isFocused=false;
        try{
            element = Sync.waitForElement(driver, element);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].focus();", element);
            isFocused = true;
        } catch (Exception e) {
            log.error(e);
        }
        return isFocused;
    }


    /**
     * Description:This method is to enter check input field has no values/empty
     * @param driver,element
     * @return isVerified
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean isEmpty(WebDriver driver, WebElement element) {
        boolean isVerified = false;
        try{
            element = Sync.waitForElement(driver, element);
            String strTextBoxValue = Element.getAttributeValue(driver, element, Constants.VALUE_ATTRIBUTE);
            if (strTextBoxValue.isEmpty()) {
                isVerified = true;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isVerified;
    }

}

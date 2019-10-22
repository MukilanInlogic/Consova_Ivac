package commonpage.toolbox;

import commonpage.util.Helper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Combobox {
    static Logger log = LogManager.getLogger(Combobox.class.getName());

    /**
     * Description:This method is used to select a value by Index
     * @param driver,element,strIndex
     * @return isSelected
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:10-Aug-2019
     */
    public static boolean selectValueByIndex(WebDriver driver, WebElement element,int strIndex) {
        boolean isSelected = false;
        element = Sync.waitForElement(driver, element);
        Sync.waitForAjax(driver);
        try {
            Select elementsSelect = new Select(element);
            elementsSelect.selectByIndex(strIndex);
            isSelected=true;
        } catch (Exception ex) {
            log.error(ex);
            isSelected=false;
        }
        return isSelected;
    }


    /**
     * Description:This method is used to select a value by Visible Text value
     * @param driver,element,strText
     * @return isTextSelected
     * Author Name:Sankar Ganesh
     * Date of Development:10-Aug-2019
     */
    public static boolean selectText(WebDriver driver, WebElement element, String strText) {
        boolean isTextSelected;
        try {
            element = Sync.waitForElement(driver, element);
            Sync.waitForAjax(driver);
            if (!Helper.getBrowser().equalsIgnoreCase("FIREFOX")) {
                Sync.waitForSeconds(10);
            }
            Select sel = new Select(element);
            sel.selectByVisibleText(strText);
            isTextSelected = true;
        } catch (Exception ex) {
            log.error(ex);
            isTextSelected=false;
        }
        return isTextSelected;
    }

    /**
     * Description:This method is used to select a value by Select Option Value
     * @param driver,element,strValue
     * @return isTextSelected
     * Author Name:Sankar Ganesh
     * Date of Development:10-Aug-2019
     */
    public static boolean selectValue(WebDriver driver, WebElement element, String strValue) {
        boolean isTextSelected;
        try {
            element = Sync.waitForElement(driver, element);
            Sync.waitForAjax(driver);
            if (!Helper.getBrowser().equalsIgnoreCase("FIREFOX")) {
                Sync.waitForSeconds(10);
            }
            System.out.println("entry");
            Select sel = new Select(element);
            sel.selectByValue(strValue);
            isTextSelected = true;
        } catch (Exception ex) {
            log.error(ex);
            isTextSelected=false;
        }
        return isTextSelected;
    }

    /**
     * Description:This method is used to select a value if that option is not selected
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:10-Aug-2019
     */
    public static boolean setSelected(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            element = Sync.waitForElement(driver, element);
            if (!element.isSelected()) {
                element.click();
                blResult = true;
            }
        } catch (Exception ex) {
            log.error(ex);
            blResult=false;
        }
        return blResult;
    }

    /**
     * Description:This method is used to get the selected option Text
     * @param driver,element
     * @return strExpectedValue
     * Author Name:Sankar Ganesh
     * Date of Development:10-Aug-2019
     */
    public static String getSelectedOption(WebDriver driver, WebElement element) {
        String strExpectedValue="";
        try {
            element = Sync.waitForElement(driver, element);
            Select defaultSelect = new Select(element);
            WebElement elmntDefaultValue = defaultSelect.getFirstSelectedOption();
            strExpectedValue = elmntDefaultValue.getText();
        } catch (Exception ex) {
            log.error(ex);
        }
        return strExpectedValue;

    }

    /**
     * Description:This method is used to get Longest String from a List
     * @param Element
     * @return longestString
     * Author Name:Sankar Ganesh
     * Date of Development:10-Aug-2019
     */
    public static String getLongestStringInList(List<WebElement> Element) {
        List<String> eleList = new ArrayList<String>();
        String longestString="";
        try {
            for (WebElement eleSortItem : Element) {
                if (!eleSortItem.getText().equals(""))
                    eleList.add(eleSortItem.getText());
            }
            longestString = eleList.get(0);
            for (String List : eleList) {
                if (List.length() > longestString.length()) {
                    longestString = List;
                }
            }
        } catch (Exception ex) {
            log.error(ex);
        }
        return longestString;
    }

    /**
     * Description:This method is used to send each value from a list to compare with the dropdown values in compareDropdownValue method
     * @param driver,element,strOptionsList
     * @return isCompared
     * Author Name:Sankar Ganesh
     * Date of Development:10-Aug-2019
     */
    public static boolean compareDropdownValues(WebDriver driver, WebElement element, List<String> strOptionsList) {
        boolean isCompared = false;
        try {
            element = Sync.waitForElement(driver, element);
            for (String elmntOption : strOptionsList) {
                isCompared = compareDropdownValue(driver, element, elmntOption);
                if (!isCompared) {
                    break;
                }
            }
        } catch (Exception ex) {
            log.error(ex);
        }
        return isCompared;
    }

    /**
     * Description:This method is used to get First Dropdown Option
     * @param driver,element
     * @return strActualValue
     * Author Name:Sankar Ganesh
     * Date of Development:10-Aug-2019
     */
    public static String getFirstOption(WebDriver driver, WebElement element) {
        String strActualValue ="";
        try {
            strActualValue = getOptions(driver, element).stream().findFirst().get();
        } catch (Exception ex) {
            log.error(ex);
        }
        return strActualValue;
    }

    /**
     * Description:This method is used to get all the dropdown values and store it in a list
     * @param driver,element
     * @return lstDropdownValues
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static List<String> getOptions(WebDriver driver, WebElement element) {
        List<String> lstDropdownValues = new ArrayList<String>();
        try {
            Sync.waitForElement(driver, element);
            Select allOptions = new Select(element);
            allOptions.getOptions().forEach(dropdownValue -> lstDropdownValues.add(dropdownValue.getText()));
        } catch (Exception ex) {
            log.error(ex);
        }
        return lstDropdownValues;
    }

    /**
     * Description:This method is used to compare all dropdown values with a string value from a list in compareDropdownValues method
     * @param driver,element
     * @return isCompared
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean compareDropdownValue(WebDriver driver, WebElement element, String strOption) {
        boolean isCompared = false;
        try {
            element = Sync.waitForElement(driver, element);
            Select allOptions = new Select(element);
            isCompared = allOptions.getOptions().stream().anyMatch(item -> item.getText().equals(strOption));
        } catch (Exception ex) {
            log.error(ex);
        }
        return isCompared;
    }
}

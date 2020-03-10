package commonpage.toolbox;

import com.google.common.collect.Ordering;
import commonpage.util.DateUtil;
import commonpage.util.Testdata;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.*;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Element implements Comparator {
    static Logger log = LogManager.getLogger(Element.class.getName());


    /**
     * Description:This method is used to verify whether a element is displayed
     * @param by,driver
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyElement(By by, WebDriver driver) {
        boolean blResult = false;
        try {
            if (driver.findElement(by).isDisplayed()) {
                blResult = true;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to verify whether a element is displayed
     * @param element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyElement(WebElement element) {
        boolean blResult = false;
        try {
            if (element.isDisplayed()) {
                blResult = true;
            } else {
                blResult = false;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to replace content and verify whether a element is displayed
     * @param driver,strLocator,strElement
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyElement(WebDriver driver, String strLocator, String strElement) {
        boolean blResult = false;
        try {
            WebElement elmntLocator = Sync.waitForElement(driver, By
                    .xpath(strLocator.replace("<<REPLACECONTENT>>",
                            strElement)));
            blResult = Element.verifyElement(elmntLocator);
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to replace content and click on the web element
     * @param driver,strElement,strLocator
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean click(WebDriver driver, String strElement, String strLocator) {
        boolean blResult = false;
        try {
            WebElement elmntLocator = Sync.waitForElement(driver, By
                    .xpath(strLocator.replace("<<REPLACECONTENT>>",
                            strElement)));
            blResult = Element.click(driver, elmntLocator);
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }


    /**
     * Description:This method is used to verify whether a element is not displayed
     * @param driver,by
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean notVerifyElement(WebDriver driver, By by) {
        boolean blResult = true;
        try {
            if (driver.findElement(by).isDisplayed()) {
                blResult = false;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to verify whether a element is not displayed
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean notVerifyElement(WebDriver driver, WebElement element) {
        boolean blResult = true;
        try {
            if (element.isDisplayed()) {
                blResult = false;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to click a webelement
     * @param driver,by
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean click(WebDriver driver, By by) {
        boolean blResult = false;
        try {
            Sync.waitForElement(driver, by).click();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to click a web element
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean click(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            element = Sync.waitForElement(driver, element);
            element.click();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to click a web element using Actions Click(mouse click)
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean mouseClick(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            element = Sync.waitForElement(driver, element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            // Sync.waitForSeconds(5);
            actions.click();
            actions.build().perform();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }



    /**
     * Description:This method is used to click a web element using Actions Click(mouse click)
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean mouseClick(WebDriver driver,  By by) {
        boolean blResult = false;
        try {

            WebElement element = Sync.waitForElement(driver, by);
            element = Sync.waitForElement(driver, element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            // Sync.waitForSeconds(5);
            actions.click();
            actions.build().perform();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to click a web element using Actions Click(mouse click with coordinate)
     * @param driver,element,inX,inY
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean mouseClickWithCoordinate(WebDriver driver, WebElement element, int inX, int inY) {
        boolean blResult = false;
        try {
            element = Sync.waitForElement(driver, element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element, inX, inY);
            //actions.moveToElement(element, inX, inY).build().perform();
            actions.click();
            actions.build().perform();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        System.out.println("mouseClickWithCoordinate driver boolean value is: "+blResult);
        return blResult;
    }

    /**
     * Description:This method is used to click a web element using Actions Click(mouse click)
     * @param driver,by,inX,inY
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean mouseClickWithCoordinate(WebDriver driver, By by, int inX, int inY) {
        boolean blResult = false;
        try {
            WebElement element = Sync.waitForElement(driver, by);
            Actions actions = new Actions(driver);
            actions.moveToElement(element, inX, inY);
            actions.click();
            actions.build().perform();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to mouse over a web element
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean mouseOver(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            element = Sync.waitForElement(driver, element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to mouse over a web element
     * @param driver,by
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean mouseOver(WebDriver driver, By by) {
        boolean blResult = false;
        try {
            WebElement element = Sync.waitForElement(driver, by);
            element = Sync.waitForElement(driver, element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to mouse over a web element with mouse coordinate
     * @param driver,element,inX,inY
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean mouseOverWithCoordinate(WebDriver driver, WebElement element, int inX, int inY) {
        boolean blResult = false;
        try {
            element = Sync.waitForElement(driver, element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element, inX, inY).build().perform();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }


    /**
     * Description:This method is used to double click a web element using Actions Click(mouse click)
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean mouseDoubleClick(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            element = Sync.waitForElement(driver, element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element);
            actions.doubleClick(element);
            actions.build().perform();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to verify a web element is enabled
     * @param by,driver
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyElementEnabled(By by, WebDriver driver) {
        boolean blResult = false;
        try {
            if (driver.findElement(by).isDisplayed()) {
                if (driver.findElement(by).isEnabled()) {
                    blResult = true;
                }
            }
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to verify a web element is enabled
     * @param element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyElementEnabled(WebElement element) {
        boolean blResult = false;
        try {
            if (element.isDisplayed()) {
                System.out.println("verifyElementEnabled isDisplayed");
                if (element.isEnabled()) {
                    System.out.println("verifyElementEnabled isEnabled");
                    blResult = true;
                }
            }
        } catch (Exception e) {
            log.error(e);
            System.out.println("verifyElementEnabled catch "+e.getMessage());
            blResult=false;
        }
        System.out.println("verifyElementEnabled driver boolean value is: "+blResult);
        return blResult;
    }

    /**
     * Description:This method is used to verify a web element is not enabled
     * @param element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyElementDisabled(WebElement element) {
        boolean blResult = true;
        try {
            Sync.waitForSeconds(2);
            if (element.isDisplayed()) {
                Sync.waitForSeconds(2);
                if (element.isEnabled()) {
                    System.out.println("inside if verifyElementDisabled");
                    blResult = false;
                }
            }
        } catch (Exception e) {
            log.error(e);
            System.out.println("verifyElementDisabled catch "+e.getMessage());
        }
        System.out.println("verifyElementDisabled boolean value is: "+blResult);
        return blResult;
    }

    /**
     * Description:This method is used to make the web driver wait for a specified time and verify web element is not clickable
     * @param driver,by
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean notClickable(WebDriver driver, By by) {
        boolean blResult=true;
        try {
            Sync.waitForElement(driver, by).click();
            blResult = false;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to verify RGB color of a web element(split R,G and B value and check each integer value - ignore "rgba" and 4th integer value(1))
     * @param element,strTextColor
     * @return isColor
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyRGBColor(WebElement element, String strTextColor) {
        boolean isColor = false;
        String strOriginalColor = element.getCssValue("color");
        String[] strSplitcolor = strOriginalColor.replace("rgba(", "").replace(")", "").split(",");
        int redColor = Integer.parseInt(strSplitcolor[0].trim());
        int greenColor = Integer.parseInt(strSplitcolor[1].trim());
        int blueColor = Integer.parseInt(strSplitcolor[2].trim());
        Color getColor;
        try {
            Field field = Class.forName("java.awt.Color").getField(strTextColor);
            getColor = (Color) field.get(strTextColor);
            int red = getColor.getRed();
            int green = getColor.getGreen();
            int blue = getColor.getBlue();
            if (red == redColor && green == greenColor && blue == blueColor) {
                isColor = true;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isColor;
    }


    /**
     * Description: This method is used to verify the values stored in the list is in ascending order based on the input type
     * @param elementList,strType,strDateFormat
     * @return isSorted
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyAscendingOrder(List<WebElement> elementList, String strType, String strDateFormat) {
        boolean isSorted = false;
        try {
            if (strType.equals("string")) {
                List<String> eleStringSortedList = new ArrayList<String>();
                for (WebElement eleItem : elementList) {
                    eleStringSortedList.add(eleItem.getText().toLowerCase());

                }
                isSorted = Ordering.natural().isOrdered(eleStringSortedList);

            } else if (strType.equals("date")) {
                List<Date> eleDateList = new ArrayList<Date>();
                for (WebElement eleItem : elementList) {
                    Date strDate = DateUtil.convertDateFormatForSorting(eleItem, strDateFormat);
                    eleDateList.add(strDate);
                }
                isSorted = Ordering.natural().isOrdered(eleDateList);
            } else if (strType.equals("int")) {
                List<Integer> eleIntegerList = new ArrayList<Integer>();
                for (WebElement eleItem : elementList) {
                    eleIntegerList.add(Integer.valueOf(eleItem.getText()));
                }
                isSorted = Ordering.natural().isOrdered(eleIntegerList);

            } else if (strType.equals("stringwithnumbers")) {

                List<String> eleStringSortedList = new ArrayList<String>();
                List<String> eleStringUnSortedList = new ArrayList<String>();
                for (WebElement eleItem : elementList)
                    if (!eleItem.getText().equals("")) {
                        String strText = eleItem.getText().toLowerCase().replace("“", "\"").replace("”", "\"");
                        eleStringUnSortedList.add(strText);
                    }
                eleStringSortedList.addAll(eleStringUnSortedList);
                Collections.sort(eleStringSortedList);
                if (eleStringUnSortedList.equals(eleStringSortedList)) {
                    isSorted = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSorted;
    }

    /**
     * Description: This method is used to verify the values stored in the list is in descending order based on the input type
     * @param elementList,strType,strDateFormat
     * @return isSorted
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyDescendingOrder(List<WebElement> elementList, String strType, String strDateFormat) {
        boolean isSorted = false;

        try {
            if (strType.equalsIgnoreCase("string")) {
                List<String> eleStringSortedList = new ArrayList<String>();
                for (WebElement eleItem : elementList) {
                    eleStringSortedList.add(eleItem.getText().toLowerCase());
                }
                isSorted = Ordering.natural().reverse().isOrdered(eleStringSortedList);

            } else if (strType.equalsIgnoreCase("date")) {
                List<Date> eleDateList = new ArrayList<Date>();
                for (WebElement eleItem : elementList) {
                    Date strDate = DateUtil.convertDateFormatForSorting(eleItem, strDateFormat);
                    eleDateList.add(strDate);
                }
                isSorted = Ordering.natural().reverse().isOrdered(eleDateList);
            } else if (strType.equals("int")) {
                List<Integer> eleIntegerList = new ArrayList<Integer>();
                for (WebElement eleItem : elementList) {
                    eleIntegerList.add(Integer.valueOf(eleItem.getText()));

                }
                isSorted = Ordering.natural().reverse().isOrdered(eleIntegerList);

            } else if (strType.equals("stringwithnumbers")) {

                List<String> eleStringSortedList = new ArrayList<String>();
                List<String> eleStringUnSortedList = new ArrayList<String>();
                for (WebElement eleItem : elementList)
                    if (!eleItem.getText().equals("")) {
                        String strText = eleItem.getText().toLowerCase().replace("“", "\"").replace("”", "\"");
                        eleStringSortedList.add(strText);
                    }
                eleStringUnSortedList.addAll(eleStringSortedList);

                Collections.sort(eleStringSortedList, Collections.reverseOrder());

                if (eleStringUnSortedList.equals(eleStringSortedList)) {
                    isSorted = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isSorted;
    }

    /**
     * Description:This method is used to check web element is not clickable
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyNotClickable(WebDriver driver, WebElement element) {
        boolean blResult=true;
        try {
            element = Sync.waitForElement(driver, element);
            element.click();
            blResult = false;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to verify a web element is selected
     * @param element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyElementSelected(WebElement element) {
        boolean blResult = false;
        try {
            if (element.isDisplayed()) {
                if (element.isEnabled()) {
                    if (element.isSelected()) {
                        blResult = true;
                    }
                }
            }
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to verify a web element is not selected
     * @param element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyElementDeSelected(WebElement element) {
        boolean blResult = true;

        try {
            if (element.isDisplayed()) {
                if (element.isEnabled()) {
                    if (element.isSelected()) {
                        blResult = false;
                    } else {
                        blResult = true;
                    }
                }
            }
        } catch (Exception e) {
            log.error(e);
        }

        return blResult;
    }

    /**
     * Description:This method is used to verify RGB color of a web element
     * @param element,strAttribute,strRGBValue
     * @return isColor
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyRGBCode(WebElement element, String strAttribute, String strRGBValue) {
        boolean isColor = false;
        String strOriginalColor = element.getCssValue(strAttribute);
        System.out.println("verifyRGBCode strOriginalColor"+strOriginalColor);
        try {
            if (strOriginalColor.equals(strRGBValue)) {
                isColor = true;
            }
        } catch (Exception e) {
            log.error(e);
        }
        System.out.println("verifyRGBCode boolean value is:"+isColor);
        return isColor;

    }


    /**
     * Description:This method is used to verify RGB color of a web element from a list of web elements
     * @param driver,strAttribute,strRGBValue,strWholelist,strLocator
     * @return isColorVerified
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyListOfRGBCode(WebDriver driver, String strAttribute, String strRGBValue, List<String> strWholelist, String strLocator) {
        boolean isColorVerified = false;
        try {
            for (String strlist : strWholelist) {
                WebElement elmntField = Sync.waitForElement(driver, By.xpath(strLocator.replace("<<REPLACECONTENT>>",
                        Testdata.getValue(strlist))));
                isColorVerified = Element.verifyRGBCode(elmntField, strAttribute, strRGBValue);
                if (!isColorVerified) {
                    break;
                }
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isColorVerified;
    }


    /**
     * Description:This method is used to verify list of web elements are displayed
     * @param driver,lstReplaceContents,strLocator
     * @return isVerified
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyListOfElements(WebDriver driver, List<String> lstReplaceContents, String strLocator) {
        boolean isVerified = false;
        try {
            Sync.waitForSeconds(2);
            System.out.println("INSIDE verifyListOfElements BEFORE VERIFICATION");
            isVerified = lstReplaceContents.stream().allMatch(strReplaceValue -> Element.verifyElement(
                    Sync.waitForElement(driver, By.xpath(strLocator.replace("<<REPLACECONTENT>>",
                            Testdata.getValue(strReplaceValue))))));
            System.out.println("verifyListOfElements isVerified value for each xpath is: "+isVerified);
        } catch (Exception e) {
            log.error(e);
        }
        System.out.println("verifyListOfElements boolean value is: "+isVerified);
        return isVerified;
    }

    /**
     * Description:This method is used to click list of web elements
     * @param driver,strWholelist,strLocator
     * @return isVerified
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean clickListOfElements(WebDriver driver, List<String> strWholelist, String strLocator) {
        boolean isVerified = false;
        try {
            for (String strlist : strWholelist) {
                WebElement elmntField = Sync.waitForElement(driver, By.xpath(strLocator.replace("<<REPLACECONTENT>>",
                        Testdata.getValue(strlist))));
                isVerified = Element.click(driver, elmntField);
                if (!isVerified) {
                    break;
                }
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isVerified;
    }

    /**
     * Description:This method is used to verify Font-Weight is Bold for a web element
     * @param element
     * @return isBold
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyIsBold(WebElement element) {
        boolean isBold = false;
        try {
            String fontWeight = element.getCssValue("font-weight");
            if (fontWeight.equals("bold") || fontWeight.equals("700")) {
                isBold = true;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isBold;
    }

    /**
     * Description:This method is used to verify web element text is aligned center
     * @param element
     * @return isCenterAligned
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyIsCenterAligned(WebElement element) {
        boolean isCenterAligned = false;
        try {
            String fontWeight = element.getCssValue("text-align");
            if (fontWeight.equals("center")) {
                isCenterAligned = true;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isCenterAligned;
    }

    /**
     * Description:This method is used to verify web elements are not displayed
     * @param driver,strWholelist,strLocator
     * @return isNotVerified
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyNoListOfElements(WebDriver driver, List<String> strWholelist, String strLocator) {
        boolean isNotVerified = false;
        try {
            for (String strlist : strWholelist) {
                isNotVerified = Element.notVerifyElement(driver, By.xpath(strLocator.replace("<<REPLACECONTENT>>",
                        Testdata.getValue(strlist))));
                if (!isNotVerified) {
                    break;
                }
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isNotVerified;
    }


    /**
     * Description:This method is used to right click on a Web Element
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean rightClick(WebDriver driver, WebElement element) {
        boolean blResult=false;
        try{
            element = Sync.waitForElement(driver, element);
            Actions action = new Actions(driver);
            action.contextClick(element).build().perform();
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to get attribute value of a web element
     * @param driver,element,strAttribute
     * @return value
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static String getAttributeValue(WebDriver driver, WebElement element, String strAttribute) {
        String value = null;
        try {
            element = Sync.waitForElement(driver, element);
            value = element.getAttribute(strAttribute);
        } catch (Exception e) {
            log.error(e);
        }
        return value;
    }

    /**
     * Description:This method is used to get attribute value of a web element
     * @param driver,strlocator,strAttribute
     * @return value
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static String getAttributeValue(WebDriver driver, By by, String strAttribute) {
        String value = null;
        try {
            WebElement elmntField = Sync.waitForElement(driver,by);
            value = elmntField.getAttribute(strAttribute);
        } catch (Exception e) {
            log.error(e);
        }
        return value;
    }

    /**
     * Description:This method is used to verify color and background color of a web element
     * @param element,strTextRGBValue,strBGColorRGBValue
     * @return isColor
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyTextAndBackgroundColor(WebElement element, String strTextRGBValue, String strBGColorRGBValue) {
        boolean isColor = false;
        String strOriginalTextColor = element.getCssValue("color");
        String strOriginalBgColor = element.getCssValue("background-color");
        try {
            if (strOriginalTextColor.equals(strTextRGBValue) && strOriginalBgColor.equals(strBGColorRGBValue)) {
                isColor = true;
            } else {
                //Once it method is failed, sysout Print
                System.out.println();
                System.out.println("");
                System.out.println("Verify Text And BG Color");
                System.out.println("elements TXT : " + element.getText());
                System.out.println(">> TXT COLOR : " + strOriginalTextColor + ", strTextRGBValue: " + strTextRGBValue);
                System.out.println(">> BG COLOR : " + strOriginalBgColor + ", strBGColorRGBValue: " + strBGColorRGBValue);
                System.out.println("FINAL Boolean : " + isColor);
                System.out.println();
                isColor = false;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isColor;

    }

    /**
     * Description:This method is used to Verify Text color and Background color and Border color
     * @param element,strTextRGBValue,strBGColorRGBValue,strBorderRGBValue
     * @return isColor
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyTextBGAndBorderColor(WebElement element, String strTextRGBValue, String strBGColorRGBValue, String strBorderRGBValue) {
        boolean isColor = false;
        String strOriginalTextColor = element.getCssValue("color");
        String strOriginalBgColor = element.getCssValue("background-color");
        //  String strOriginalBorderColor = element.getCssValue("box-shadow");
        try {
            //  if (strOriginalTextColor.equals(strTextRGBValue) && strOriginalBgColor.equals(strBGColorRGBValue) && strOriginalBorderColor.equals(strBorderRGBValue)) {
            if (strOriginalTextColor.equals(strTextRGBValue) && strOriginalBgColor.equals(strBGColorRGBValue) ) {
                isColor = true;
            } else {
                //Once it method is failed, sysout Print
                System.out.println();
                System.out.println("");
                System.out.println("Verify Text BG And Border Color: ");
                System.out.println(">> TXT COLOR : " + strOriginalTextColor + ", strTextRGBValue: " + strTextRGBValue);
                System.out.println(">> BG COLOR : " + strOriginalBgColor + ", strBGColorRGBValue: " + strBGColorRGBValue);
                System.out.println(">> Border COLOR : " + strBorderRGBValue);
                System.out.println("FINAL BOOLEAN : " + isColor);
                System.out.println();
                isColor = false;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isColor;

    }

    /**
     * Description:This method is used to Verify UI Background color
     * @param element,strTextRGBValue,strBorderRGBValue
     * @return isColor
     * Author Name:Vimalan
     * Date of Development:03-March-2020
     */
    public static boolean verifyBGColor(WebElement element, String strBorderRGBValue) {
        boolean isColor = false;
        String strOriginalBgColor = element.getCssValue("background-color");

        try {
            if (strOriginalBgColor.equals(strBorderRGBValue)) {
                isColor = true;
            } else {
                System.out.println();
                System.out.println("");
                System.out.println("Verify Text BG And Border Color: ");
                System.out.println(">> Border COLOR : " + strBorderRGBValue);
                System.out.println("FINAL BOOLEAN : " + isColor);
                System.out.println();
                isColor = false;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isColor;
    }

    /**
     * Description:This method is used to Compare Two List value Webelement List and Testdata List
     * @param lstElements,lstDataValues
     * @return boolean
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean compareList(List<WebElement> lstElements, List<String> lstDataValues) {
        String strUIDFlag = "Y";
        List<String> lstActualValue = new ArrayList<String>();
        List<String> lstExpectedValues = new ArrayList<String>();
        try{
            lstElements.stream().forEach(eleItem -> lstActualValue.add(eleItem.getText()));
            for (String strData : lstDataValues) {
                if (strData.contains("SECTIONNAME")) {
                    String strTermAndYear = " (Winter ".concat(DateUtil.getCurrentDate("YYYY")).concat(")");
                    String strSectionName = Testdata.getValue(strData, strUIDFlag);
                    lstExpectedValues.add(strSectionName.concat(strTermAndYear));
                } else {
                    lstExpectedValues.add(Testdata.getValue(strData));
                }
            }
        }
        catch (Exception e) {
            log.error(e);
        }
        return (lstActualValue.equals(lstExpectedValues));
    }

    /**
     * Description:This method is used to Compare Two List values(concat to a single string)
     * @param elmntList1,strListValue
     * @return isorder
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean compareListOfStrings(List<String> elmntList1, List<String> strListValue) {
        boolean isorder = false;
        String strDataOne="";
        String strDataTwo="";
        try{
            for (String strData : elmntList1) {
                strDataOne=strDataOne.concat(strData);
            }
            for (String strData : strListValue) {
                strDataTwo=strDataOne.concat(strData);
            }
            System.out.println("String one is>>"+strDataOne);
            System.out.println("String two is>>"+strDataTwo);
            if (strDataOne.equals(strDataTwo)) {
                isorder = true;
            }
        }
        catch (Exception e) {
            log.error(e);
        }
        return isorder;
    }

    /**
     * Description:This method is used to get Tagname of an web element
     * @param driver,element
     * @return strValue
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static String getTagName(WebDriver driver, WebElement element) {
        String strValue = "";
        try {
            Sync.waitForElement(driver, element);
            strValue = element.getTagName();
        } catch (Exception e) {
            log.error(e);
        }
        return strValue;
    }

    /*
     * @DESCRIPTION: Get Character Count
     * Date: 28-06-16
     */
    public static int getCharacterCountFromString(String strText, String strSpecificLetter) {
        int count = 0;
        try {
            char ch = strText.charAt(strText.indexOf(strSpecificLetter));
            long characterCount = strText.chars().filter(num -> num == ch).count();
            count = Integer.valueOf((int) characterCount);
        } catch (Exception e) {
            log.error(e);
        }
        return count;
    }


    /**
     * Description:This method is used to verify border color of a web element
     * @param element,strAttribute,strBorderRGBValue
     * @return isColor
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyBorderColor(WebElement element, String strAttribute, String strBorderRGBValue) {
        boolean isColor = false;
        String strOriginalBorderColor = element.getCssValue(strAttribute);
        try {
            if (strOriginalBorderColor.equals(strBorderRGBValue)) {
                isColor = true;
            } else
                isColor = false;
        } catch (Exception e) {
            log.error(e);
        }
        return isColor;

    }


    /**
     * Description:This method is used to check size of two list values are equal and replace locator with values
     * from list one - lstOne and list two - lstTwo and verify web element is displayed
     * @param driver,lstOne,lstTwo,strLocator
     * @return isVerified
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyListsOfElements(WebDriver driver, List<String> lstOne, List<String> lstTwo, String strLocator) {
        boolean isVerified = false;
        try {
            if (lstOne.size() == lstTwo.size()) {
                for (int i = 0; i < lstOne.size(); i++) {
                    WebElement elmntField = Sync.waitForElement(driver, By.xpath(strLocator.replace("<<REPLACE1>>",
                            Testdata.getValue(lstOne.get(i).toString())).replace("<<REPLACE2>>", Testdata.getValue(lstTwo.get(i).toString()))));
                    isVerified = Element.verifyElement(elmntField);
                    if (!isVerified)
                        break;
                }
            }
        } catch (Exception e) {
            log.error(e);
        }
        return isVerified;

    }


    /**
     * Description:This method is used to Get a coordinate for an web element (X and Y axis)
     * @param driver,element
     * @return xcord,ycord
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static int[] getCoordinate(WebDriver driver, WebElement element) {
        int xcord = 0, ycord = 0;
        try{
            Sync.waitForElement(driver, element);
            Point point = element.getLocation();
            xcord = point.getX();
            System.out.println("Element's Position from left side Is " + xcord + " pixels.");
            ycord = point.getY();
            System.out.println("Element's Position from top side Is " + ycord + " pixels.");
        } catch (Exception e) {
            log.error(e);
        }
        return new int[]{xcord, ycord};
    }

    /*
     * @Description: This method is used to Verify particular text to be present in the List of Elements
     * @param driver,element
     * @return xcord,ycord
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyStringMatchedWithListOfElement(WebDriver driver, List<WebElement> elements, String strValue) {
        boolean isVerified = false;
        try {
            Sync.waitForElements(driver, elements);
            isVerified = elements.stream().allMatch(element -> element.getText().contains(strValue));
        } catch (Exception e) {
            isVerified = false;
            log.error(e);
        }
        return isVerified;
    }

    /*
     * @Description: This method is used to verify the values stored in the list is in ascending order for the date values in a specified date format
     * @param lstItemValue,strDateFormat
     * @return isSorted
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyListAscendingOrder(List<String> lstItemValue, String strDateFormat) {
        boolean isSorted = false;
        try {
            List<Date> eleDateList = new ArrayList<Date>();
            for (String strItem : lstItemValue) {
                Date strDate = DateUtil.convertListDateFormat(strItem, strDateFormat);
                eleDateList.add(strDate);
            }
            isSorted = Ordering.natural().isOrdered(eleDateList);
        } catch (Exception e) {
            isSorted = false;
            log.error(e);
        }
        return isSorted;
    }

    /*
     * @Description: This method is used to verify the values stored in the list is in descending order for the date values in a specified date format
     * @param lstItemValue,strDateFormat
     * @return isSorted
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyListDescendingOrder(List<String> lstItemValue, String strDateFormat) {
        boolean isSorted = false;
        try {
            List<Date> eleDateList = new ArrayList<Date>();
            for (String strItem : lstItemValue) {
                Date strDate = DateUtil.convertListDateFormat(strItem, strDateFormat);
                eleDateList.add(strDate);
            }
            isSorted = Ordering.natural().reverse().isOrdered(eleDateList);
        } catch (Exception e) {
            isSorted = false;
            log.error(e);
        }
        return isSorted;
    }

    /**
     * @Description: The method compares the alphanumeric strings
     * @param firstObjToCompare,secondObjToCompare
     * @return int
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public int compare(Object firstObjToCompare, Object secondObjToCompare) {
        int lengthFirstStr=0;
        int lengthSecondStr=0;
        try{
            String firstString = firstObjToCompare.toString();
            String secondString = secondObjToCompare.toString();
            if (secondString == null || firstString == null) {
                return 0;
            }
            lengthFirstStr = firstString.length();
            lengthSecondStr = secondString.length();
            int index1 = 0;
            int index2 = 0;
            while (index1 < lengthFirstStr && index2 < lengthSecondStr) {
                char ch1 = firstString.charAt(index1);
                char ch2 = secondString.charAt(index2);
                char[] space1 = new char[lengthFirstStr];
                char[] space2 = new char[lengthSecondStr];
                int loc1 = 0;
                int loc2 = 0;
                do {
                    space1[loc1++] = ch1;
                    index1++;

                    if (index1 < lengthFirstStr) {
                        ch1 = firstString.charAt(index1);
                    } else {
                        break;
                    }
                } while (Character.isDigit(ch1) == Character.isDigit(space1[0]));
                do {
                    space2[loc2++] = ch2;
                    index2++;

                    if (index2 < lengthSecondStr) {
                        ch2 = secondString.charAt(index2);
                    } else {
                        break;
                    }
                } while (Character.isDigit(ch2) == Character.isDigit(space2[0]));
                String str1 = new String(space1);
                String str2 = new String(space2);
                int result;
                if (Character.isDigit(space1[0]) && Character.isDigit(space2[0])) {
                    Integer firstNumberToCompare = new Integer(Integer.parseInt(str1.trim()));
                    Integer secondNumberToCompare = new Integer(Integer.parseInt(str2.trim()));
                    result = firstNumberToCompare.compareTo(secondNumberToCompare);
                } else {
                    result = str1.compareTo(str2);
                }
                if (result != 0) {
                    return result;
                }
            }
        } catch (Exception e) {

            log.error(e);
        }
        return lengthFirstStr - lengthSecondStr;
    }

    /**
     * @Description: The method is to verify alphanumeric order from a list of string values(alphabets and numbers)
     * @param elementList
     * @return isSorted
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyAlphanumericOrder(List<WebElement> elementList) {
        boolean isSorted = false;
        try {
            List<String> eleStringUnSortedList = new ArrayList<String>();
            List<String> eleStringSortedList = new ArrayList<String>();
            for (WebElement eleItem : elementList) {
                eleStringSortedList.add(eleItem.getText().toLowerCase());
            }
            eleStringUnSortedList.addAll(eleStringSortedList);
            String alphaNumericStringArray[] = eleStringSortedList.toArray(new String[eleStringSortedList.size()]);
            Arrays.sort(alphaNumericStringArray, new Element());
            List<String> eleStringAlphanumericSortedList = Arrays.asList(alphaNumericStringArray);
            if (eleStringUnSortedList.equals(eleStringAlphanumericSortedList)) {
                isSorted = true;
            }

        } catch (Exception e) {
            log.error(e);
        }
        return isSorted;
    }

    /**
     * @Description: The method is used to click on the web element using JavascriptExecutor
     * @param driver,element
     * @return isClicked
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean jsClick(WebDriver driver, WebElement element) {
        boolean isClicked = false;
        try {
            Sync.waitForElement(driver, element);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
            isClicked = true;
        } catch (Exception e) {
            isClicked = false;
            log.error(e);
        }
        System.out.println("jsClick boolena vlaue is"+isClicked);
        return isClicked;
    }


    /**
     * @Description: The method is used to click on the web element using JavascriptExecutor
     * @param driver,element
     * @return isClicked
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean jsClick(WebDriver driver, By by) {
        boolean isClicked = false;
        try {
            WebElement element = Sync.waitForElement(driver,by);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", element);
            isClicked = true;
        } catch (Exception e) {
            isClicked = false;
            log.error(e);
        }
        return isClicked;
    }


    /**
     * @Description: The method is used to verify the tagname of an web element
     * @param driver,element,strTagValue
     * @return isVerified
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyTagName(WebDriver driver, WebElement element, String strTagValue) {
        boolean isVerified = false;
        try {
            Sync.waitForElement(driver, element);
            String strValue = element.getTagName();
            isVerified = (strValue.equals(strTagValue));
        } catch (Exception e) {
            log.error(e);
        }
        return isVerified;
    }

    /**
     * @Description: The method is used to get a Unicode character (UTF_8) values and convert it to Encode a HTML character
     * @param strUnicodeValue
     * @return strUnicodeCharacter
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static String unicodeConversion(String strUnicodeValue) {
        String strUnicodeCharacter = "";
        try {
            byte[] charInUnicode = strUnicodeValue.getBytes(UTF_8);
            strUnicodeCharacter = new String(charInUnicode, UTF_8);
        } catch (Exception e) {
            log.error(e);
        }
        return strUnicodeCharacter;
    }

    /**
     * @Description: The method is used to compare Co-ordinate value using "getCoordinate" (X and Y-axis)
     * @param driver,element,strXcord,strYcord
     * @return isVerifyYValue,isVerifyXValue
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean compareCoordinateValue(WebDriver driver, WebElement element, String strXcord, String strYcord) {
        boolean isVerifyXValue = false;
        boolean isVerifyYValue = false;
        int coord[] = Element.getCoordinate(driver, element);
        int xcordLive = coord[0];
        int ycordLive = coord[1];
        int xcordData = Integer.parseInt(strXcord);
        int ycordData = Integer.parseInt(strYcord);
        isVerifyXValue = (((xcordLive <= xcordData + 1) || (xcordLive >= xcordData - 1)));
        isVerifyYValue = (((ycordLive <= ycordData + 1) || (ycordLive >= ycordData - 1)));
        System.out.println("Element's Co-Ordinate X-Axis - Expected: " + xcordLive + ", Actual: " + xcordData + ", Greater and Lesser: " + (xcordData + 1) + ", " + (xcordData - 1));
        System.out.println("Element's Co-Ordinate Y-Axis - Expected: " + ycordLive + ", Actual: " + ycordData + ", Greater and Lesser: " + (ycordData + 1) + ", " + (ycordData - 1));
        return (isVerifyYValue && isVerifyXValue);
    }

    /**
     * @Description: The method is used to check specified text to be present in lists of elements
     * @param driver,element,strValue
     * @return isVerified
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifyTextToBePresentWithListOfElement(WebDriver driver, List<WebElement> elements, String strValue) {
        boolean isVerified = false;
        try {
            isVerified = elements.stream().allMatch(element -> Sync.waitForTextToBePresentInElement(
                    driver, element, strValue));
        } catch (Exception e) {
            isVerified = false;
            log.error(e);
        }
        return isVerified;
    }


    /**
     * @Description: The method is used to check list values contains specified text
     * @param lstValues,strValue
     * @return isVerified
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean verifySpecificValueInList(List<String> lstValues, String strValue) {
        boolean isVerified = false;
        try {
            isVerified = lstValues.stream().anyMatch(strKey -> strKey.equals(strValue));
        } catch (Exception e) {
            isVerified = false;
            log.error(e);
        }
        return isVerified;
    }

    /**
     * Description:This method is used to convert string array to string
     * @param strArr,delimiter
     * @return sb
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static String convertStringArrayToString(String[] strArr, String delimiter) {
        StringBuilder sb = new StringBuilder();
        try {
            for (String str : strArr) {
                sb.append(str).append(delimiter);
            }
        }
        catch(Exception e ){
            log.error(e);
        }
        return sb.substring(0, sb.length() - 1);
    }

    /**
     * Description:This method is to Drag a Web Element and Drop on another Web Element using Xpath
     * @param dragElement,dropElement,driver
     * @return isDraggable
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean dragAndDropXpath(WebElement dragElement,WebElement dropElement, WebDriver driver) {
        boolean isDraggable = false;
        try {
            try {
                if (dragElement.isDisplayed() && dropElement.isDisplayed()) {
                    Sync.waitForSeconds(5);
                    Actions builder = new Actions(driver);
                    builder.dragAndDrop(dragElement, dropElement).build().perform();
                    isDraggable = true;
                } else {
                    isDraggable = false;
                }
            } catch (Exception e) {
                log.error(e);
            }

        } catch (Exception e) {
            log.error(e);
        }
        return isDraggable;
    }

    /**
     * Description:This method is to Scroll to a Web Element
     * @param driver,element
     * @return isScrollToView
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:19-Aug-2019
     */
    public static boolean scrollToElement(WebDriver driver,WebElement element) {
        boolean isScrollToView = false;
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            isScrollToView = true;

        } catch (Exception e) {
            log.error(e);
        }
        System.out.println("scrollToElement bool value is"+isScrollToView);
        return isScrollToView;
    }

    /**
     * Description:This method is to Scroll to a Web Element
     * @param driver,by
     * @return isScrollToView
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:19-Aug-2019
     */
    public static boolean scrollToElement(WebDriver driver,By by) {
        boolean isScrollToView = false;
        WebElement element = driver.findElement(by);
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            isScrollToView = true;

        } catch (Exception e) {
            log.error(e);
        }
        System.out.println("scrollToElement boolean value is"+isScrollToView);
        return isScrollToView;
    }

    /**
     * Description:This method is used to check CSS attribute value
     * @param elements,strExpectedValue,attribute
     * @return isfontSize
     * Author Name:Magesh Sankaran
     * Date of Development:19-Aug-2019
     */
    public static boolean checkCSSattributeValue(WebElement elements, String strExpectedValue, String attribute) {
        boolean isfontSize = false;
        try {

        String strActualAttribute = elements.getCssValue(attribute);
        if (strActualAttribute.equals(strExpectedValue)) {
            isfontSize = true;
        } else {
            isfontSize = false;
        }
        } catch (Exception e) {
            log.error(e);
        }
        return isfontSize;
    }


    /**
     * Description:This method is used to check CSS attribute value
     * @param driver,by,strExpectedValue,attribute
     * @return isfontSize
     * Author Name:Magesh Sankaran
     * Date of Development:19-Aug-2019
     */
    public static boolean checkCSSattributeValue(WebDriver driver,By by, String strExpectedValue, String attribute) {
        boolean isfontSize = false;
        WebElement element;
        try{
            element = Sync.waitForElement(driver,by);
        String strActualAttribute = element.getCssValue(attribute);
        if (strActualAttribute.equals(strExpectedValue)) {
            isfontSize = true;
        } else {
            isfontSize = false;
        }
        } catch (Exception e) {
            log.error(e);
        }
        return isfontSize;
    }

}

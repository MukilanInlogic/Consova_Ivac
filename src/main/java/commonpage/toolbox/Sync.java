package commonpage.toolbox;

/**
 * created by SAN 09-08-2019
 */

import com.google.common.base.Predicate;
import commonpage.util.Constants;
import commonpage.util.ExecutionConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Sync {
    public static WebDriver driver;
    static Logger log = LogManager.getLogger(Sync.class.getName());

    /**
     * Description:This method is used to make the web driver wait until the specified web element is visible(Fluent Wait)
     * @param driver,by
     * @return element
     * Author Name:Sankar Ganesh
     * Date of Development:10-Aug-2019
     */
    public static WebElement waitForElement(WebDriver driver, By by) {
        WebElement element = null;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit=Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            String strFluentWaitFlag = ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_FLAG);

            if (strFluentWaitFlag.equalsIgnoreCase("Y")) {
                long lngPollingSeconds = Long.parseLong(ExecutionConfig
                        .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));
                Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                        .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

                element = fluentWait.until(visibilityOfElementLocated(by));
            } else {
                element = new WebDriverWait(driver, lngWaitTime)
                        .until(ExpectedConditions
                                .visibilityOfElementLocated(by));
            }

        } catch (Exception e) {
            log.error(e);
        }
        return element;
    }


    /**
     * Description:This method is used to make the web driver wait for each web element from list of web elements until specified web element is visible(Fluent wait)
     * @param driver,by
     * @return element
     * Author Name:Sankar Ganesh
     * Date of Development:10-Aug-2019
     */
    public static List<WebElement> waitForElements(WebDriver driver, By by) {
        List<WebElement> element = null;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit = Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            String strFluentWaitFlag = ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_FLAG);

            if (strFluentWaitFlag.equalsIgnoreCase("Y")) {
                long lngPollingSeconds = Long.parseLong(ExecutionConfig
                        .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));
                Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                        .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

                element = fluentWait.until(visibilityOfElementsLocated(by));
            } else {
                element = new WebDriverWait(driver, lngWaitTime)
                        .until(ExpectedConditions.
                                visibilityOfAllElementsLocatedBy(by));
            }

        } catch (Exception e) {
            log.error(e);
        }
        return element;
    }

    /**
     * Description:This method is used to make the web driver wait for each web element from list of web elements until specified web element is visible(Fluent wait)
     * @param driver,element
     * @return element
     * Author Name:Sankar Ganesh
     * Date of Development:10-Aug-2019
     */
    public static List<WebElement> waitForElements(WebDriver driver, List<WebElement> element) {
        List<WebElement> elements = null;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit = Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            String strFluentWaitFlag = ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_FLAG);

            if (strFluentWaitFlag.equalsIgnoreCase("Y")) {
                long lngPollingSeconds = Long.parseLong(ExecutionConfig
                        .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));
                Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                        .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

                elements = fluentWait.until(visibilityOfElements(element));
            } else {
                elements = new WebDriverWait(driver, lngWaitTime)
                        .until(ExpectedConditions.
                                visibilityOfAllElements(element));
            }

        } catch (Exception e) {
            log.error(e);
        }
        return elements;
    }

    /**
     * Description:This method is used to make the web driver wait for until a web element gets disappeared
     * @param driver,by
     * @return isElementDisappear
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitForElementDisappear(WebDriver driver, By by) {
        boolean isElementDisappear = false;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));
            long lngWaitUnit = Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));
            new WebDriverWait(driver, lngWaitTime * lngWaitUnit).until(ExpectedConditions.invisibilityOfElementLocated(by));
            isElementDisappear = true;

        } catch (Exception e) {
            log.error(e);
        }
        return isElementDisappear;
    }

    /**
     * Description:This method is used to make the web driver wait until the whole web page is loaded in DOM(AJAX Loader)
     * @param driver
     * @return isElementDisappear
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitForAjax(WebDriver driver) {
        boolean isElementDisappear = false;
        try {
            long lngElapsedTime=0;
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit=Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            lngWaitTime=lngWaitTime * lngWaitUnit;

            while (lngElapsedTime<=lngWaitTime)
            {
                boolean ajaxIsComplete = (Boolean) ((JavascriptExecutor) driver).executeScript("return (window.jQuery != null) && (jQuery.active === 0);");
                if (ajaxIsComplete)
                    break;
                Thread.sleep(1000);
                lngElapsedTime++;
            }

        } catch (Exception e) {
            log.error(e);
        }
        return isElementDisappear;
    }

    /**
     *
     * @param driver
     * @param element
     * @return
     */
    public static WebElement waitForElement(WebDriver driver, WebElement element) {
        WebElement foundElement = null;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));
            long lngWaitUnit=Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));
            String strFluentWaitFlag = ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_FLAG);
            if (strFluentWaitFlag.equalsIgnoreCase("Y")) {
                long lngPollingSeconds = Long.parseLong(ExecutionConfig
                        .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));
                Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                        .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

                foundElement = fluentWait.until(visibilityOfElementLocated(element));
            } else {
                foundElement = new WebDriverWait(driver, lngWaitTime)
                        .until(ExpectedConditions.visibilityOf(element));
            }
        } catch (Exception e) {
            log.error(e);
        }

        return foundElement;
    }


    /**
     * Description:This method is used to make the web driver wait until text for the web element gets displayed
     * @param driver,element,strExpectedValue
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitForElementValue(WebDriver driver,WebElement element,String strExpectedValue) {
        boolean blResult = false;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig.getValue(Constants.OBJECT_WAIT_TIME));
            long lngWaitUnit=Long.parseLong(ExecutionConfig.getValue(Constants.WAIT_UNIT));
            new WebDriverWait(driver, lngWaitTime * lngWaitUnit)
                    .until(ExpectedConditions.textToBePresentInElementValue(element,strExpectedValue));
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to make the web driver to wait for a specified seconds(Thread.sleep())
     * @param lngSeconds
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static void waitForSeconds(long lngSeconds) {
        try {
            long lngWaitUnit=Long.parseLong(ExecutionConfig.getValue(Constants.WAIT_UNIT));
            Thread.sleep(lngWaitUnit * lngSeconds * 1000);

        } catch (Exception e) {
            log.error(e);
        }
    }

    /**
     * Description:This method is used to check expected condition - expected web element is visible
     * @param by
     * @return element
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    private static ExpectedCondition<WebElement> visibilityOfElementLocated(
            final By by) {
        return new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(by);
                return element.isDisplayed() ? element : null;
            }
        };
    }

    /**
     * Description:This method is used to check expected condition - expected list of web elements is visible
     * @param by
     * @return element
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    private static ExpectedCondition<List<WebElement>> visibilityOfElementsLocated(
            final By by) {
        return new ExpectedCondition<List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                List<WebElement> element = driver.findElements(by);
                return element.size()>0 ? element : null;
            }
        };
    }

    /**
     * Description:This method is used to check expected condition - expected web element is visible
     * @param element
     * @return element
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    private static ExpectedCondition<List<WebElement>> visibilityOfElements(
            final List<WebElement> element) {
        return new ExpectedCondition<List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return element.size()>0 ? element : null;
            }
        };
    }

    /**
     * Description:This method is used to check expected condition - expected list of web elements is visible
     * @param element
     * @return element
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    private static ExpectedCondition<WebElement> visibilityOfElementLocated(
            final WebElement element) {
        return new ExpectedCondition<WebElement>() {
            @SuppressWarnings("unused")
            public WebElement apply(WebDriver driver) {
                return element.isDisplayed() ? element : null;
            }
        };
    }

    /**
     * Description:This method is used to make the web driver wait until web element becomes clickable
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitForElementToBeClickable(WebDriver driver,WebElement element) {
        boolean blResult = false;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit=Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            new WebDriverWait(driver, lngWaitTime * lngWaitUnit)
                    .until(ExpectedConditions.elementToBeClickable(element));
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to make the web driver wait until select option gets populated - Fluent Wait
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitUntilSelectOptionsPopulated(final WebDriver driver, final WebElement element) {
        boolean blResult = false;
        try {
            final Select select = new Select(element);

            long lngPollingSeconds = Long.parseLong(ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));

            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit = Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            new FluentWait<WebDriver>(driver)
                    .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                    .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                    .until(new Predicate<WebDriver>() {
                        public boolean apply(WebDriver d) {
                            return (select.getOptions().size() > 0);
                        }
                    });

            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to make the web driver wait until web element is displayed - Fluent Wait
     * @param driver,by
     * @return element
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static WebElement waitForElementPresence(WebDriver driver, By by) {
        WebElement element = null;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit=Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            String strFluentWaitFlag = ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_FLAG);

            if (strFluentWaitFlag.equalsIgnoreCase("Y")) {
                long lngPollingSeconds = Long.parseLong(ExecutionConfig
                        .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));
                Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                        .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

                element = fluentWait.until(presenceOfElementLocated(by));
            } else {
                element = new WebDriverWait(driver, lngWaitTime)
                        .until(ExpectedConditions
                                .presenceOfElementLocated(by));
            }

        } catch (Exception e) {
            log.error(e);
        }
        return element;
    }

    /**
     * Description:This method is used to make the web driver wait until web element attribute contains expected value - Fluent Wait
     * @param driver,element,strAttribute,strContained
     * @return isContained
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitForAttributeContains(WebDriver driver, WebElement element,String strAttribute,String strContained) {
        boolean isContained = false;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit = Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            String strFluentWaitFlag = ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_FLAG);

            if (strFluentWaitFlag.equalsIgnoreCase("Y")) {
                long lngPollingSeconds = Long.parseLong(ExecutionConfig
                        .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));
                Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                        .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

                isContained = fluentWait.until(ExpectedConditions.attributeContains(element, strAttribute, strContained));
            } else {
                isContained = new WebDriverWait(driver, lngWaitUnit)
                        .until(ExpectedConditions.attributeContains(element, strAttribute, strContained));
            }
        }
        catch(Exception e){
            log.error(e);
        }
        return isContained;
    }

    /**
     * Description:This method is used to make the web driver wait until web element text contains expected value - Fluent Wait
     * @param driver,element,strText
     * @return isTextPresentInElement
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitForTextToBePresentInElement(WebDriver driver, WebElement element,String strText) {
        boolean isTextPresentInElement = false;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit = Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            String strFluentWaitFlag = ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_FLAG);

            if (strFluentWaitFlag.equalsIgnoreCase("Y")) {
                long lngPollingSeconds = Long.parseLong(ExecutionConfig
                        .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));
                Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                        .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

                isTextPresentInElement = fluentWait.until(ExpectedConditions.textToBePresentInElement(element, strText));
            } else {
                isTextPresentInElement = new WebDriverWait(driver, lngWaitUnit)
                        .until(ExpectedConditions.textToBePresentInElement(element, strText));
            }
        }
        catch(Exception e){
            log.error(e);
        }
        return isTextPresentInElement;
    }

    /**
     * Description:This method is used to make the web driver wait until specified URL is populated in window address bar - Fluent Wait
     * @param driver,strURL
     * @return isUrlPresent
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitForUrlToBe(WebDriver driver, String strURL) {
        boolean isUrlPresent = false;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit = Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            String strFluentWaitFlag = ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_FLAG);

            if (strFluentWaitFlag.equalsIgnoreCase("Y")) {
                long lngPollingSeconds = Long.parseLong(ExecutionConfig
                        .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));
                Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                        .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

                isUrlPresent = fluentWait.until(ExpectedConditions.urlToBe(strURL));
            } else {
                isUrlPresent = new WebDriverWait(driver, lngWaitUnit)
                        .until(ExpectedConditions.urlToBe(strURL));

            }
        } catch (Exception e) {
            log.error(e);
        }
        return isUrlPresent;
    }

    /**
     * Description:This method is used to make the web driver wait until No of window gets opened
     * @param driver,strNoOfWindows
     * @return isWindowAppeared
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitForNumberOfWindowsToBe(WebDriver driver, String strNoOfWindows) {
        boolean isWindowAppeared = false;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit = Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            int noOfWindows= Integer.parseInt(strNoOfWindows);
            isWindowAppeared= new WebDriverWait(driver, lngWaitTime * lngWaitUnit).until(ExpectedConditions.numberOfWindowsToBe(noOfWindows));


        } catch (Exception e) {
            log.error(e);
        }
        return isWindowAppeared;
    }

    /**
     * Description:This method is used to make the web driver wait for a frame to be available and switch to it
     * @param driver,element
     * @return frameDriver
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static WebDriver waitForframeToBeAvailableAndSwitchToIt(WebDriver driver, WebElement element) {
        WebDriver frameDriver = null;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit = Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            String strFluentWaitFlag = ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_FLAG);

            if (strFluentWaitFlag.equalsIgnoreCase("Y")) {
                long lngPollingSeconds = Long.parseLong(ExecutionConfig
                        .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));
                Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                        .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

                frameDriver = fluentWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
            } else {
                frameDriver = new WebDriverWait(driver, lngWaitUnit)
                        .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));

            }
        } catch (Exception e) {
            log.error(e);
        }

        return frameDriver;
    }

    /**
     * Description:This method is used to make the web driver wait until the whole page gets loaded in DOM - JavascriptExecutor loader
     * @param driver
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitForPageToLoad(WebDriver driver) {
        boolean blResult = false;
        try {
            JavascriptExecutor jsPageLoad = (JavascriptExecutor) driver;
            jsPageLoad.executeScript("return document.readyState").toString().equals("complete");
            blResult = true;
        } catch (Exception e) {
            log.error("Unable to PageLoad", e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to make the web driver wait until the web element gets clickable - Fluent wait
     * @param driver,by
     * @return element
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static WebElement waitForClickableElement(WebDriver driver, By by) {
        WebElement element = null;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit=Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            String strFluentWaitFlag = ExecutionConfig
                    .getValue(Constants.FLUENT_WAIT_FLAG);

            if (strFluentWaitFlag.equalsIgnoreCase("Y")) {
                long lngPollingSeconds = Long.parseLong(ExecutionConfig
                        .getValue(Constants.FLUENT_WAIT_POLLING_SECONDS));
                Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                        .withTimeout(lngWaitTime * lngWaitUnit, TimeUnit.SECONDS)
                        .pollingEvery(lngPollingSeconds * lngWaitUnit, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

                element = fluentWait.until(ExpectedConditions
                        .elementToBeClickable(by));
            } else {
                element = new WebDriverWait(driver, lngWaitTime)
                        .until(ExpectedConditions
                                .elementToBeClickable(by));
            }

        } catch (Exception e) {
            log.error(e);
        }
        return element;
    }
    /**
     * Description:This method is used to make the web driver wait until the web element gets clickable - Explicit wait
     * @param driver,by
     * @return blResult
     * Author Name:Magesh Sankaran
     * Date of Development:13-Aug-2019
     */
    public static boolean WebElementExplicitWaitForElement(WebDriver driver,By by) {
        boolean WaitForElement = false;
        try {
            WebDriverWait waitForElement = new WebDriverWait(driver, 5000);
            WebElement waitElement = waitForElement.until(ExpectedConditions.visibilityOfElementLocated(by));
            if (waitElement.isDisplayed()) {
                WaitForElement = true;
            } else {
                return false;
            }
        } catch (Exception e) {
            log.error(e);
        }
        return WaitForElement;
    }
    /**
     * Description:This method is used to make the web driver wait until the web element gets clickable - Explicit wait
     * @param driver,element
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public static boolean waitForClickableElement(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            long lngWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.OBJECT_WAIT_TIME));

            long lngWaitUnit = Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            new WebDriverWait(driver, lngWaitTime * lngWaitUnit)
                    .until(ExpectedConditions.elementToBeClickable(element));
            blResult = true;

        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to make the web driver wait until alert is displayed
     * @param driver
     * @return blResult
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:10-Aug-2019
     */
    public static boolean waitForAlert(WebDriver driver) {
        boolean blResult = false;
        try {
            long lngAlertWaitTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.ALERT_WAIT_TIME));

            long lngWaitUnit=Long.parseLong(ExecutionConfig
                    .getValue(Constants.WAIT_UNIT));

            new WebDriverWait(driver, lngAlertWaitTime * lngWaitUnit)
                    .until(ExpectedConditions.alertIsPresent());
            blResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blResult;
    }



}

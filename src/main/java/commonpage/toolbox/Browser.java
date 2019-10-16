package commonpage.toolbox;

import commonpage.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Browser {

    private static Logger log = LogManager.getLogger(Browser.class.getName());

    /**
     * Description:This method is used to get execution mode from Helper.java and get local browser driver from getLocalDriver() and application Url from Helper.java
     *
     * @return driver
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static WebDriver getDriver() {
        WebDriver driver = null;
        try {
            String strExecutionMode = Helper.getExecutionMode();
            if (strExecutionMode.equalsIgnoreCase(Constants.MODE_LOCAL)) {
                driver = getLocalDriver();
            }
            long lngPageLoadTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.PAGELOAD_WAIT_TIME));
            driver.manage().timeouts()
                    .pageLoadTimeout(lngPageLoadTime, TimeUnit.SECONDS);
            long lngScriptLoadTime = Long.parseLong(ExecutionConfig
                    .getValue(Constants.SCRIPT_WAIT_TIME));
            driver.manage().timeouts()
                    .setScriptTimeout(lngScriptLoadTime, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            Thread.sleep(5000);
            driver.get(Helper.getURL());
        } catch (Exception e) {
            log.error(e);
            System.out.println("getDriver " + e.getMessage());
        }
        return driver;
    }

    /**
     * Description:This method is used to get local browser driver and configure browser settings
     *
     * @return driver
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    private static WebDriver getLocalDriver() {
        WebDriver driver = null;
        try {
            String strBrowser = Helper.getBrowser();

            if (strBrowser.equalsIgnoreCase(Constants.FIREFOX)) {
                driver = new FirefoxDriver(DownloadUtil.downloadFileFirefox());
                driver.manage().window().maximize();
            } else if (strBrowser.equalsIgnoreCase(Constants.CHROME)
                    || strBrowser.equalsIgnoreCase(Constants.GOOGLE_CHROME)) {
                System.setProperty("webdriver.chrome.logfile", new StringBuilder().append(Constants.RESOURCES_FOLDER)
                        .append(File.separator).append(Constants.DRIVERS_FOLDER)
                        .append(File.separator).append(Constants.CHROME_LOG).toString());
                //driver = new ChromeDriver(DownloadUtil.downloadFileChrome());
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } else if (strBrowser.equalsIgnoreCase(Constants.IE)
                    || strBrowser.equalsIgnoreCase(Constants.INTERNET_EXPLORER)) {
                DesiredCapabilities ieCap = new DesiredCapabilities();
                ieCap.setCapability("ignoreZoomSetting", true);
                ieCap.setCapability("requireWindowFocus", true);
                ieCap.setCapability("enablePersistentHover", false);
                driver = new InternetExplorerDriver(ieCap);
                driver.manage().window().maximize();
            }
        } catch (Exception e) {
            log.error(e);
            System.out.println("getLocalDriver " + e.getMessage());
        }

        return driver;
    }


    /**
     * Description:This method is used to set browser driver for specific OS
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static void setBrowserDrivers() {
        try {
            System.setProperty("webdriver.chrome.driver",
                    getBrowserDriverPath("chrome"));

            if (OSValidator.getOSName().equalsIgnoreCase("VISTA")
                    || OSValidator.getOSName().equalsIgnoreCase("WIN8")
                    || OSValidator.getOSName().equalsIgnoreCase("WINDOWS")
                    || OSValidator.getOSName().equalsIgnoreCase("XP")) {
                System.setProperty("webdriver.ie.driver",
                        getBrowserDriverPath("ie"));
            }
        } catch (Exception e) {
            log.error(e);
            System.out.println("setBrowserDrivers " + e.getMessage());
        }
    }

    /**
     * Description:This method is used to get browser driver path based on OS from OSValidator.java
     *
     * @param strBrowser
     * @return strDriverPath
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    private static String getBrowserDriverPath(String strBrowser) {
        String strDriverPath = null;
        try {
            if (strBrowser.equalsIgnoreCase("chrome")) {
                if (OSValidator.isWindows()) {
                    strDriverPath = Constants.CHROME_WINDOWS_DRIVER;

                }
            } else if (strBrowser.equalsIgnoreCase("ie")) {
                if (OSValidator.is32Bit()) {
                    strDriverPath = Constants.IE_32_DRIVER;
                } else {
                    strDriverPath = Constants.IE_32_DRIVER;
                }
            }
        } catch (Exception e) {
            log.error(e);
            System.out.println("getBrowserDriverPath " + e.getMessage());
        }
        return new StringBuilder().append(Constants.RESOURCES_FOLDER)
                .append(File.separator).append(Constants.DRIVERS_FOLDER)
                .append(File.separator).append(strDriverPath).toString();
    }

    /**
     * Description:This method is used to verify Window Title
     *
     * @param driver,strExpectedTitle
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean verifyWindowTitle(WebDriver driver, String strExpectedTitle) {
        boolean blResult = false;
        try {
            String strActualTitle = driver.getTitle().trim();
            if (strExpectedTitle.equals(strActualTitle)) {
                blResult = true;
            }
        } catch (Exception e) {
            log.error("verifyWindowTitle - Unable to Verify Window Title", e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to scroll up on a web page
     *
     * @param driver
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean jsScrollUp(WebDriver driver) {
        boolean blResult = false;
        try {
            JavascriptExecutor mouseScrollUp = (JavascriptExecutor) driver;
            mouseScrollUp.executeScript("scroll(250, 0)");
            blResult = true;
        } catch (Exception e) {
            log.error("jsScrollUp - Unable to Scroll UP", e);
        }
        return blResult;
    }

    /**
     * Description:This method is used to open new window and enter new URL
     *
     * @param strUrl,driver
     * @return isLaunched
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean getNewWindow(String strUrl, WebDriver driver) {
        boolean isLaunched = false;
        try {
            driver.get(strUrl);
            isLaunched = true;
        } catch (Exception e) {
            log.error("getNewWindow", e);
            isLaunched = false;
        }
        return isLaunched;
    }

    /**
     * Description:This method is used to navigate back to previous page
     *
     * @param driver
     * @return isNavigated
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean navigateBack(WebDriver driver) {
        boolean isNavigated = false;
        try {
            driver.navigate().back();
            isNavigated = true;
        } catch (Exception e) {
            isNavigated = false;
            log.error("navigateBack", e);
        }
        return isNavigated;
    }

    /**
     * Description:This method is used to refresh the current page
     *
     * @param driver
     * @return isRefreshed
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean refresh(WebDriver driver) {
        boolean isRefreshed = false;
        try {
            driver.navigate().refresh();
            isRefreshed = true;
        } catch (Exception e) {
            isRefreshed = false;
            log.error("refresh", e);
        }
        return isRefreshed;
    }

    /**
     * Description:This method is used to maximize the current window
     *
     * @param driver
     * @return isMaximized
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean maximize(WebDriver driver) {
        boolean isMaximized = false;
        try {
            driver.manage().window().maximize();
            isMaximized = true;
        } catch (Exception e) {
            isMaximized = false;
            log.error("maximize", e);
        }
        return isMaximized;
    }

    /**
     * Description:This method is used to delete all Cookies
     *
     * @param driver
     * @return isCleared
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean deleteAllCookies(WebDriver driver) {
        boolean isCleared = false;
        try {
            driver.manage().deleteAllCookies();
            isCleared = true;
        } catch (Exception e) {
            isCleared = false;
            log.error("deleteAllCookies", e);
        }
        return isCleared;
    }

    /**
     * Description:This method is used to scroll down on a web page
     *
     * @param driver
     * @return blResult
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean jsScrollDown(WebDriver driver) {
        boolean blResult = false;
        try {
            JavascriptExecutor mouseScrollDown = (JavascriptExecutor) driver;
            mouseScrollDown.executeScript("scroll(0, 250)");
            blResult = true;
        } catch (Exception e) {
            log.error("Unable to Scroll Down", e);
        }
        return blResult;
    }

    public static boolean driverclose(WebDriver driver) {
        boolean isclosed = false;
        try {
            driver.close();
            isclosed = true;
        } catch (Exception e) {
            isclosed = false;
            log.error("driverclose", e);
        }
        return isclosed;
    }

}


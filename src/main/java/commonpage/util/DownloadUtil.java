package commonpage.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;

public class DownloadUtil {

    public static String strLastexportedFileName="";
    static Logger log = LogManager.getLogger(DownloadUtil.class.getName());
    /**
     * Description:This method is to set firefox profile for downloading files and images in downloads path
     * @return profile
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static FirefoxProfile downloadFileFirefox() {

        FirefoxProfile profile = new FirefoxProfile();
        try {
            String strWorkingDirectory = System.getProperty("user.dir");
            String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                    .append(File.separator).append(Constants.RESOURCES_FOLDER)
                    .append(File.separator).append(Constants.DOWNLOADS_FOLDER).toString();

            profile.setPreference("browser.download.folderList", 2);
            profile.setPreference("browser.download.manager.showWhenStarting", false);
            profile.setPreference("browser.download.dir", strDownloadLocation);
            profile.setPreference("browser.helperApps.neverAsk.openFile", "application/vnd.openxmlformats-officedocument.presentationml.presentation,application/vnd.ms-powerpoint,application/vnd.ms-powerpoint,application/vnd.ms-powerpoint");
            profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.presentationml.presentation,application/vnd.ms-powerpoint,application/vnd.ms-powerpoint,application/vnd.ms-powerpoint");
            profile.setPreference("browser.helperApps.alwaysAsk.force", false);
            profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
            profile.setPreference("browser.download.manager.focusWhenStarting", false);
            profile.setPreference("browser.download.manager.useWindow", false);
            profile.setPreference("browser.download.manager.showAlertOnComplete", false);
            profile.setPreference("browser.download.manager.closeWhenDone", false);
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("downloadFileFirefox" + Ex.getMessage());
        }
        return profile;
    }

    /**
     * Description:This method is to set chrome options for downloading files and images in downloads path
     * @return options
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static ChromeOptions downloadFileChrome() {
        ChromeOptions options = new ChromeOptions();
        try {
            String strWorkingDirectory1 = System.getProperty("user.dir");
            String strDownloadLocation1 = new StringBuilder(strWorkingDirectory1)
                    .append(File.separator).append(Constants.RESOURCES_FOLDER)
                    .append(File.separator).append(Constants.DOWNLOADS_FOLDER).toString();
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.default_directory", strDownloadLocation1);
            options.setExperimentalOption("prefs", chromePrefs);
            options.addArguments("chrome.switches", "--disable-extensions");
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            cap.setCapability(ChromeOptions.CAPABILITY, options);
        } catch (Exception Ex) {
            log.error(Ex);
            System.out.println("downloadFileChrome" + Ex.getMessage());
        }
        return options;
    }


}

package commonpage.util;

import commonpage.toolbox.Browser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Helper {

    private static String strExecutionID;
    private static String strModule;
    private static String strEnvironment;
    private static String strURL;
    static Logger log = LogManager.getLogger(Helper.class.getName());

    /**
     * Description:This method is used to get execution Test Data(Execution Environment,OS,Static Name,Excel Version and Wait Time from
     * execution-config.yml,used to set Browser Drivers,load test data from .yml file based on Execution Environment,get Execution Id and Application URL
     * @return strExecutionID,strURL
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */

    static {
        try {
            //This method is used to load data from "Testdata.yml" file
            ExecutionConfig.loadConfig();
            Browser.setBrowserDrivers();
            //This method is to get a string value from "Testdata.yml" file
            Testdata.loadData();
            String strExecutionIDValue = ExecutionConfig.getValue(Constants.STATIC_NAME);
            if (System.getProperties().containsKey(Constants.STATIC_NAME.toUpperCase().trim())) {
                strExecutionID = System.getProperties().get(Constants.STATIC_NAME).toString();
            } else if (strExecutionIDValue.equalsIgnoreCase("NULL")) {
                strExecutionID = Helper.getRandomString();
            } else {
                strExecutionID = strExecutionIDValue;
            }
            strURL = Testdata.getValue("DP:LOGIN.URL");
            System.out.println("Execution Id: " + strExecutionID);
            System.out.println("Execution URL: " + strURL);
        } catch (Exception e) {
            log.error("Helper "+e);
        }
    }


    /**
     * Description:This method is used to get Execution Environment from execution-config.yml,if no value then take default environment
     * @return strEnvironment
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getEnvironment() {
        try {
            if (System.getProperties().contains(Constants.ENVIRONMENT.toUpperCase().trim())) {
                strEnvironment = System.getProperties().get(Constants.ENVIRONMENT.toUpperCase().trim()).toString();
            } else {
                strEnvironment = ExecutionConfig.getValue(Constants.ENVIRONMENT);
                if (strEnvironment.isEmpty())
                    throw new Exception();
            }
        } catch (Exception e) {
            strEnvironment = Constants.DEFAULT_ENVIRONMENT;
            log.error("getEnvironment "+e);
        }
        return strEnvironment;
    }

    /**
     * Description:This method is used to get Browser,if no value then take Chrome browser
     * @return strBrowser
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getBrowser() {
        String strBrowser;
        try {
            strBrowser = System.getProperties().get(Constants.BROWSER).toString();
        } catch (Exception e) {
            strBrowser = Constants.CHROME;
            log.error("getBrowser "+e);
        }
        return strBrowser;
    }

    /**
     * Description:This method is used to get Execution Mode,if no value then take Local mode
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getExecutionMode() {
        String strMode;
        try {
            strMode = System.getProperties().get(Constants.EXECUTION_MODE)
                    .toString();
        } catch (Exception e) {
            strMode = Constants.MODE_LOCAL;
            log.error("getExecutionMode "+e);
        }
        return strMode;
    }


    /**
     * Description:This method is used to return Execution Id
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getExecutionID() {
        return strExecutionID;
    }


    /**
     * Description:This method is used to return Applicaiton URL
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getURL() {
        return strURL;
    }

    /**
     * Description:This method is used to generate a new random string(Lowercase Alphabets)
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        String strRandomID="";
        try {
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int i = 0; i < targetStringLength; i++) {
                int randomLimitedInt = leftLimit + (int)
                        (new Random().nextFloat() * (rightLimit - leftLimit));
                buffer.append((char) randomLimitedInt);
            }
            strRandomID = new StringBuilder("-").append(buffer).toString();
        } catch (Exception e) {
            log.error("getRandomString "+e);
        }
        return strRandomID.toUpperCase();
    }

}

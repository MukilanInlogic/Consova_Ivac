package commonpage.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testdata extends YamlReader {
    public static Map<String, Object> dataMap;
    static Logger log = LogManager.getLogger(Testdata.class.getName());

    /**
     * Description:This method is used to load Test data (.yml) file based on Execution Environment
     * @return strEnvironment
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static void loadData() {
        try {
            String strEnv = "";
            String strTestDataFileName = "";
            if (System.getProperties().containsKey(Constants.ENVIRONMENT.toUpperCase().trim())) {
                strEnv = System.getProperties().get(Constants.ENVIRONMENT.toUpperCase()).toString();
            } else {
                strEnv = ExecutionConfig.getValue(Constants.ENVIRONMENT);
            }
            switch (strEnv) {
                case Constants.Evo_ENVIRONMENT:
                    strTestDataFileName = Constants.EVO_TESTDATA_FILE;
                    break;
            }
            String strTestDataFile = new StringBuilder()
                    .append(Constants.RESOURCES_FOLDER).append(File.separator)
                    .append(Constants.TESTDATA_FOLDER).append(File.separator)
                    .append(strTestDataFileName).toString();
            dataMap = getYamlAsMap(strTestDataFile);
        } catch (Exception e) {
            log.error("loadData" +e);
        }
    }

    /**
     * Description:This method is to get a string value from ".yml" file
     * @param strKey
     * @return strValue
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getValue(String strKey) {
        String strValue = strKey;
        String strRandomPattern = Constants.RANDOM_STRING;
        String strPattern = "DP:";
        String strRegularExpressionPattern = "&(.*)&";

        try {
            if (strKey.contains(strPattern)) {
                strValue = strKey.split(strPattern)[1];
                if (System.getProperties().containsKey(strValue.toUpperCase().trim())) {
                    strValue = System.getProperties().get(strValue.toUpperCase().trim()).toString();
                } else {
                    strValue = getMapValue(dataMap, strValue);
                }
            } else if (strValue.matches(strRegularExpressionPattern)) {
                strValue = patternHandler(strRegularExpressionPattern, strValue);
                if (System.getProperties().containsKey(strValue.toUpperCase().trim())) {
                    strValue = System.getProperties().get(strValue.toUpperCase().trim()).toString();
                }
                else {
                    if (strValue.contains(strRandomPattern)) {
                        strValue = strValue.split(strRandomPattern)[0];
                        strValue = getMapValue(dataMap, strValue);
                        strValue = strValue.concat(Helper.getExecutionID());
                    } else {
                        strValue = getMapValue(dataMap, strValue);
                    }
                }
            } else {
                if (strValue == "null") {
                    strValue = strKey;
                }
            }
        } catch (Exception e) {
            log.error("getValue_2"+e);
        }
        return strValue;
    }


    /**
     * Description:This method is to get a string value from ".yml" file from "getValue" method
     * @param strKey,strUIDFlag
     * @return strValue
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getValue(String strKey, String strUIDFlag) {
        String strValue = strKey;
        try {
            strValue = getValue(strKey);
        } catch (Exception e) {
            log.error("getValue_1"+e);
        }
        if (strUIDFlag.equalsIgnoreCase("Y")) {
            strValue = new StringBuilder(strValue).append(Helper.getExecutionID()).toString();
        }
        return strValue;
    }

    /**
     * Description:This method is to handle pattern to get values from ".yml" file
     * @param strPattern,strValue
     * @return strData
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String patternHandler(String strPattern, String strValue) {
        String strData = "";
        try {
            Pattern p = Pattern.compile(strPattern);
            Matcher m = p.matcher(strValue);
            if (m.find()) {
                strData = m.group(1);
            }
        } catch (Exception e) {
            log.error("patternHandler"+e);
        }
        return strData;
    }

    /**
     * Description:This method is to get values from a list in ".yml" file
     * @param strKey
     * @return lstValue
     * Author Name:Sankar Ganesh
     * Date of Development:12-Apr-2019
     */
    public static List<String> getListValue(String strKey) {
        List lstValue = new ArrayList<String>();
        String strRegularExpressionPattern = "&(.*)&";

        try {
            if (strKey.matches(strRegularExpressionPattern)) {
                strKey = patternHandler(strRegularExpressionPattern, strKey);
                lstValue = (List) getMapAsObject(dataMap, strKey);
            } else {
                lstValue = (List) getMapAsObject(dataMap, strKey);
            }
        } catch (Exception e) {
            log.error("getListValue" +e);
        }
        return lstValue;
    }
}

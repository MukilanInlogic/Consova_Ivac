package commonpage.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.Map;

public class ExecutionConfig extends YamlReader {
    public static Map<String, Object> executionConfigMap;
    static Logger log = LogManager.getLogger(ExecutionConfig.class.getName());

    /**
     * Description:This method is used to load data from "execution-config.yml" file
     * @return strEnvironment
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static void loadConfig() {
        try {
            String strTestDataFile = new StringBuilder()
                    .append(Constants.RESOURCES_FOLDER).append(File.separator)
                    .append(Constants.CONFIG_FOLDER).append(File.separator)
                    .append(Constants.EXECUTION_CONFIG_FILE).toString();
            executionConfigMap = getYamlAsMap(strTestDataFile);
            System.out.println("Check the Value"+executionConfigMap);
        } catch (Exception e) {
            log.error("executionconfig - loadConfig"+e);
        }
    }

    /**
     * Description:This method is to get a string value from "execution-config.yml" file
     * @param strKey
     * @return strValue
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getValue(String strKey) {
        String strValue = "";
        try {
            if(System.getProperties().containsKey(strKey.toUpperCase().trim())){
                strValue=System.getProperties().get(strKey.toUpperCase().trim()).toString();
            }
            else {
                strValue = getMapValue(executionConfigMap, strKey);
            }
        } catch (Exception e) {
            log.error("ExecutionConfig - getValue"+e);
        }
        return strValue;
    }
}

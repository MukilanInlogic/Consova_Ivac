package commonpage.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.io.Reader;
import java.util.Map;

public class YamlReader {
	static Logger log = LogManager.getLogger(YamlReader.class.getName());

	/**
	 * Description:This method is used to read .yml file and store it in a map
	 * @param strFile
	 * @return map
	 * Author Name:Sankar Ganesh
	 * Date of Development:12-Aug-2019
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> getYamlAsMap(String strFile) {
		Map<String, Object> map = null;
		try {
			Reader doc = new FileReader(strFile);
			Yaml yaml = new Yaml();
			map = (Map<String, Object>) yaml.load(doc);
		} catch (Exception e) {
			log.error("Map"+e);
		}
		return map;
	}

	/**
	 * Description:This method is used to get map value and split the value after (.)
	 * @param object,token
	 * @return st
	 * Author Name:Sankar Ganesh
	 * Date of Development:12-Aug-2019
	 */
	public static String getMapValue(Map<String, Object> object, String token) {
		String[] st = token.split("\\.");
		return parseMap(object, token).get(st[st.length - 1]).toString();
	}


	/**
	 * Description:This method is used to get map value and split the value after (.) and return the object
	 * @param object,token
	 * @return object
	 * Author Name:Sankar Ganesh
	 * Date of Development:12-Aug-2019
	 */
	@SuppressWarnings("unchecked")
	private static Map<String, Object> parseMap(Map<String, Object> object,
												String token) {
		try {
			if (token.contains(".")) {
				String[] st = token.split("\\.");
				object = parseMap((Map<String, Object>) object.get(st[0]),
						token.replace(st[0] + ".", ""));
			}
		} catch (Exception e) {
			log.error("parseMap "+e);
		}
		return object;
	}


	/**
	 * Description:This method is used to get map value as object and split the value after (.)
	 * @param object,token
	 * @return st
	 * Author Name:Sankar Ganesh
	 * Date of Development:12-Aug-2019
	 */
	public static Object getMapAsObject(Map<String, Object> object, String token) {
		String[] st = token.split("\\.");
		return parseMap(object, token).get(st[st.length - 1]);
	}

	/**
	 * Description:This method is used to get map value and split the value after (.)
	 * @param object,token
	 * @return st
	 * Author Name:Sankar Ganesh
	 * Date of Development:12-Aug-2019
	 */

	public static Map<String, Object> getMap(Map<String, Object> object, String token) {
		String[] st = token.split("\\.");
		return (Map<String, Object>)parseMap(object, token).get(st[st.length-1]);
	}

}

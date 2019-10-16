package commonpage.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OSValidator {

	static Logger log = LogManager.getLogger(OSValidator.class.getName());

	/**
	 * Description:This method is to get System OS Name
	 * @return OS Name
	 * Author Name:Sankar Ganesh
	 * Date of Development:12-Aug-2019
	 */
	public static String getOSName() {
		return org.openqa.selenium.Platform.getCurrent().toString();
	}

	/**
	 * Description:This method is to check system is configured with Windows OS
	 * @return OS Name
	 * Author Name:Sankar Ganesh
	 * Date of Development:12-Aug-2019
	 */
	public static boolean isWindows() {
		String os = System.getProperty("os.name").toLowerCase();
		// windows
		return (os.indexOf("win") >= 0);

	}

	/**
	 * Description:This method is to check system is configured with Windows OS of 32 bit or 64 bit processor
	 * @return blResult
	 * Author Name:Sankar Ganesh
	 * Date of Development:12-Aug-2019
	 */
	public static boolean is32Bit() {
		boolean blResult = false;
		try {
			String arch = System.getenv("PROCESSOR_ARCHITECTURE");
			String wow64Arch = System.getenv("PROCESSOR_ARCHITEW6432");
			String realArch = arch.endsWith("64") || wow64Arch != null
					&& wow64Arch.endsWith("64") ? "64" : "32";
			System.out.println("OS Version: " + realArch);
			if (realArch.equalsIgnoreCase("32")) {
				blResult = true;
			}
		} catch (Exception e) {
			log.error("is32Bit"+e);
		}
		return blResult;
	}
}

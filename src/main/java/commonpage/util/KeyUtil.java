package commonpage.util;

import Client.Robotil;
import commonpage.toolbox.Sync;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class KeyUtil {

    static Logger log = LogManager.getLogger(KeyUtil.class.getName());
    public static String strfileUploadPath;
    //static Logger log = LogManager.getLogger(ImageUtil.class.getName());
    //static Robot r;
    static Robotil robotil = new Robotil("localhost", 6666);


    static {
        String strWorkingDir = System.getProperty("user.dir");
        String strRobotilPath = new StringBuilder(strWorkingDir)
                .append(File.separator).append(Constants.RESOURCES_FOLDER)
                .append(File.separator).append(Constants.DRIVERS_FOLDER)
                .append(File.separator).append(Constants.ROBOTIL).toString();
        try {
            Runtime.getRuntime().exec("java -jar" + strRobotilPath + ".jar");

        } catch (IOException e) {
            e.printStackTrace();
        }
        Sync.waitForSeconds(3);
    }


    /**
     * Description:This method is to press the specified key
     * @param key
     * @return blKeyPressResult
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean pressKey(int key) {
        boolean blKeyPressResult = false;
        try {
            Robot robot = new Robot();
            robot.keyPress(key);
            blKeyPressResult = true;
        } catch (AWTException e) {
            log.error(e);
        }
        return blKeyPressResult;
    }


    /**
     * Description:This method is to release the specified key
     * @param key
     * @return blKeyPressResult
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean releaseKey(int key) {
        boolean blKeyPressResult = false;
        try {
            Robot robot = new Robot();
            robot.keyRelease(key);
            blKeyPressResult = true;
        } catch (AWTException e) {
            log.error(e);
        }
        return blKeyPressResult;
    }

    /**
     * Description:This method is to press and release the specified key using robotil in specified path "localhost"
     * @param key
     * @return blKeyPressResult
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean PressAndReleaseKey(int key) {
        boolean blKeyPressResult = false;
        try {
            robotil.pressAndReleaseKey(key);
            blKeyPressResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blKeyPressResult;
    }


    /**
     * Description:This method is to click on the key in the keyboard
     * @param key
     * @return isClicked
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean keyboardClick(char key) {
        boolean isClicked = false;
        try {
            if (Character.isLowerCase(key)) {
                key=Character.toUpperCase(key);
                KeyUtil.PressAndReleaseKey((int) key);
            } else if (Character.isUpperCase(key)) {
                KeyUtil.PressAndReleaseKey(KeyEvent.VK_CAPS_LOCK);
                KeyUtil.PressAndReleaseKey((int) key);
                KeyUtil.PressAndReleaseKey(KeyEvent.VK_CAPS_LOCK);
            } else if (key == ' ') {
                isClicked = KeyUtil.PressAndReleaseKey(KeyEvent.VK_SPACE);
            } else if (key == ';') {
                isClicked = KeyUtil.PressAndReleaseKey(KeyEvent.VK_SEMICOLON);
            } else if (key == '"') {
                KeyUtil.PressAndReleaseKey(KeyEvent.VK_QUOTE);
                Sync.waitForSeconds(3);
                isClicked = KeyUtil.PressAndReleaseKey(KeyEvent.VK_QUOTE);
            } else if (key == ',') {
                isClicked = KeyUtil.PressAndReleaseKey(KeyEvent.VK_COMMA);
            } else if (key == '?') {
                KeyUtil.pressKey(KeyEvent.VK_SHIFT);
                KeyUtil.pressKey(KeyEvent.VK_SLASH);
                KeyUtil.releaseKey(KeyEvent.VK_SLASH);
                isClicked = KeyUtil.releaseKey(KeyEvent.VK_SHIFT);
            } else if (key == '.') {
                isClicked = KeyUtil.PressAndReleaseKey(KeyEvent.VK_PERIOD);
            } else if (key == ':') {
                KeyUtil.pressKey(KeyEvent.VK_COLON);
                isClicked = KeyUtil.releaseKey(KeyEvent.VK_COLON);
            }
        } catch (Exception e) {
            log.error(e);
            isClicked = false;
        }
        return isClicked;
    }

    /**
     * Description:This method is to upload file/image and switch to application window.
     * @param strFilename
     * @return isUploaded
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:12-Aug-2019
     */
    public static boolean fileUpload(String strFilename) {
        boolean isUploaded = false;
        try {
            strfileUploadPath = new StringBuilder()
                    .append(Constants.PROJECTDIRPATH).append(File.separator)
                    .append(Constants.RESOURCES_FOLDER).append(File.separator)
                    .append(Constants.UPLOADFILESANDIMAGES).append(File.separator)
                    .append(strFilename).toString();
            System.out.println("file path " + strfileUploadPath);
            StringSelection stringSelection = new StringSelection(strfileUploadPath);
            System.out.println("stringSelection is " + stringSelection);
            Sync.waitForSeconds(2);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, stringSelection);
            System.out.println("VK_CONTROL");
            Sync.waitForSeconds(2);
            isUploaded = pressKey(KeyEvent.VK_CONTROL);
            isUploaded = pressKey(KeyEvent.VK_V);
            Sync.waitForSeconds(2);
            isUploaded = releaseKey(KeyEvent.VK_V);
            isUploaded = releaseKey(KeyEvent.VK_CONTROL);
            Sync.waitForSeconds(2);
            isUploaded = pressKey(KeyEvent.VK_ENTER);
            isUploaded = releaseKey(KeyEvent.VK_ENTER);
            Sync.waitForSeconds(2);

            /*Robot robot = new Robot();
            System.out.println("VK_CONTROL");
            Sync.waitForSeconds(2);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            Sync.waitForSeconds(2);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Sync.waitForSeconds(2);
            robot.keyPress(KeyEvent.VK_ENTER);
            System.out.println("VK_ENTER");
            robot.keyRelease(KeyEvent.VK_ENTER);
            Sync.waitForSeconds(2);*/
            //isUploaded = Window.switchwindowByName();
        } catch (Exception e) {
            log.error(e);
        }
        return isUploaded;

    }
}

	


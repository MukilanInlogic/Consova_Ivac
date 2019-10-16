package commonpage.util;

/**
 * created by SAN 09-08-2019
 */

import commonpage.toolbox.Sync;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Key;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.api.robot.desktop.DesktopMouse;

import java.io.File;
import java.util.List;

public class ImageUtil {
    static Logger log = LogManager.getLogger(ImageUtil.class.getName());


    public static boolean compareImage(String strExpectedImagePath) {
        boolean blImageCompareResult = false;

        try {
            ScreenRegion screen = new DesktopScreenRegion();

            Target target = new ImageTarget(new File(strExpectedImagePath));

            List<ScreenRegion> regions = screen
                    .findAll(target);

            if (regions.size() > 0) {

                blImageCompareResult = true;
            }
        } catch (Exception e) {
            log.error(e);
        }

        return blImageCompareResult;
    }

    public static boolean compareImage(String strExpectedImagePath, String strImageName) {
        boolean blImageCompareResult = false;
        strExpectedImagePath = new StringBuilder(strExpectedImagePath).append(strImageName).toString();
        try {
            ScreenRegion screen = new DesktopScreenRegion();

            Target target = new ImageTarget(new File(strExpectedImagePath));

            List<ScreenRegion> regions = screen
                    .findAll(target);
            if (regions.size() > 0) {

                blImageCompareResult = true;
            }
        } catch (Exception e) {
            log.error(e);
        }

        return blImageCompareResult;
    }

    public static boolean clickImage(String strExpectedImagePath) {
        boolean isImageClicked = false;

        try {
            ScreenRegion screen = new DesktopScreenRegion();

            Target target = new ImageTarget(new File(strExpectedImagePath));

            ScreenRegion region = screen.find(target);

            Mouse mouse = new DesktopMouse();
            mouse.click(region.getCenter());

            isImageClicked = true;
        } catch (Exception e) {
            log.error(e);
        }

        return isImageClicked;
    }

    public static boolean clickImage(String strExpectedImagePath, String strImageName) {
        boolean isImageClicked = false;
        strExpectedImagePath = new StringBuilder(strExpectedImagePath).append(strImageName).toString();
        try {
            ScreenRegion screen = new DesktopScreenRegion();

            Target target = new ImageTarget(new File(strExpectedImagePath));

            ScreenRegion region = screen.find(target);

            Mouse mouse = new DesktopMouse();
            mouse.click(region.getCenter());

            isImageClicked = true;
        } catch (Exception e) {
            log.error(e);
        }

        return isImageClicked;
    }

    public static boolean waitForImage(String strExpectedImagePath,
                                       String strWaitTime) {

        boolean blWaitResult = false;

        try {
            int inElapsedTime = 0;
            int inWaitTime = Integer.parseInt(strWaitTime);

            ScreenRegion screen = new DesktopScreenRegion();

            Target target = new ImageTarget(new File(strExpectedImagePath));

            while (inElapsedTime <= inWaitTime) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                List<ScreenRegion> regions = screen
                        .findAll(target);
                if (regions.size() > 0) {
                    blWaitResult = true;
                    break;
                }
                inElapsedTime++;
            }

        } catch (Exception e) {
            log.error(e);
        }

        return blWaitResult;
    }

    public static boolean waitForImage(String strExpectedImagePath, String strImageName,
                                       String strWaitTime) {
        boolean blWaitResult = false;
        strExpectedImagePath = new StringBuilder(strExpectedImagePath).append(strImageName).toString();

        try {
            int inElapsedTime = 0;
            int inWaitTime = Integer.parseInt(ExecutionConfig.getValue(strWaitTime));

            ScreenRegion screen = new DesktopScreenRegion();

            Target target = new ImageTarget(new File(strExpectedImagePath));

            while (inElapsedTime <= inWaitTime) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                List<ScreenRegion> regions = screen
                        .findAll(target);
                if (regions.size() > 0) {
                    blWaitResult = true;
                    break;
                }

                inElapsedTime++;
            }

        } catch (Exception e) {
            log.error(e);
        }

        return blWaitResult;
    }

    public static boolean enterText(String strExpectedImagePath, String strImageName, String strText) {
        boolean isTextEntered = false;
        strExpectedImagePath = new StringBuilder(strExpectedImagePath).append(strImageName).toString();
        try {
            ScreenRegion screen = new DesktopScreenRegion();

            Target target = new ImageTarget(new File(strExpectedImagePath));

            ScreenRegion region = screen.find(target);
            Mouse mouse = new DesktopMouse();
            mouse.click(region.getCenter());
            Sync.waitForSeconds(2);
            Keyboard keyboard = new DesktopKeyboard();
            keyboard.type(strText);

            isTextEntered = true;
        } catch (Exception e) {
            log.error(e);
        }

        return isTextEntered;
    }

    public static boolean clearText(String strExpectedImagePath, String strImageName) {
        boolean isTextEntered = false;
        strExpectedImagePath = new StringBuilder(strExpectedImagePath).append(strImageName).toString();
        try {
            ScreenRegion screen = new DesktopScreenRegion();

            Target target = new ImageTarget(new File(strExpectedImagePath));

            ScreenRegion region = screen.find(target);
            Mouse mouse = new DesktopMouse();
            mouse.click(region.getCenter());
            Sync.waitForSeconds(2);
            Keyboard keyboard = new DesktopKeyboard();
            keyboard.keyDown(Key.CTRL);
            keyboard.type("a");
            keyboard.keyUp(Key.CTRL);
            keyboard.type(Key.DELETE);
            isTextEntered = true;
        } catch (Exception e) {
            log.error(e);
        }

        return isTextEntered;
    }


    /*	@Description: For Using Image Wait  and After Click the image
     */
    public static boolean waitAndClickImage(String strExpectedImagePath, String strImageName,
                                            String strWaitTime) {
        boolean blWaitResult = false;

        try {
            Sync.waitForSeconds(3);
            waitForImage(strExpectedImagePath, strImageName, strWaitTime);
            clickImage(strExpectedImagePath, strImageName);
            blWaitResult = true;
        } catch (Exception e) {
            log.error(e);
        }
        return blWaitResult;
    }

    /***
     * @param strExpectedImagePath
     * @param strImageName
     * @return
     * @description for not comparing image
     */
    public static boolean notCompareImage(String strExpectedImagePath, String strImageName) {
        boolean blImageNotCompareResult = false;
        strExpectedImagePath = new StringBuilder(strExpectedImagePath).append(strImageName).toString();
        try {
            ScreenRegion screen = new DesktopScreenRegion();

            Target target = new ImageTarget(new File(strExpectedImagePath));

            List<ScreenRegion> regions = screen
                    .findAll(target);

            if (regions.size() == 0) {

                blImageNotCompareResult = true;
            }
        } catch (Exception e) {
            log.error(e);
        }

        return blImageNotCompareResult;
    }

}

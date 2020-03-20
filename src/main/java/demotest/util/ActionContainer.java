package demotest.util;

import commonpage.util.SharedDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import demotest.action.*;
import org.openqa.selenium.OutputType;

import java.util.LinkedHashMap;
import java.util.Map;

public class ActionContainer {

    private SharedDriver sharedDriver;
    public HomePageActions homePageActions;

    static public int i = 0;
    public static LinkedHashMap<String, String> printTestDataMap = new LinkedHashMap<String, String>();

    /**
     * Description:This method is to get web driver object and pass it to all actions file
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    public ActionContainer() {
        sharedDriver = new SharedDriver();
        initPages();
    }

    /**
     * Description:This method is to create constructor for all actions file and pass web driver object to it
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    private void initPages() {
        homePageActions = new HomePageActions(sharedDriver);
    }

    /**
     * Description:This method is to capture screenshot of the application incase of any failure for each Scenario(printTestDataMap -> scenario count and name)
     * Author Name:Sankar Ganesh
     * Date of Development:13-Aug-2019
     */
    @After
    public void after(Scenario scenario) {
        if (printTestDataMap.size() > 0) {
            for (Map.Entry<String, String> entry : printTestDataMap.entrySet()) {
                scenario.write(entry.getKey().concat(": ").concat(entry.getValue()));
            }
        }
        if (scenario.isFailed()) {
            scenario.embed(sharedDriver.getScreenshotAs(OutputType.BYTES), "image/png");
        }
        System.out.println("SCENARIO NO " + i + " " + scenario.getStatus());
    }

    /**
     * Description:This method is to clear all the existing scenario count of last execution
     * and get the scenario count of current execution before each scenario gets executed(printTestDataMap -> scenario count and name)
     *
     * @param scenario1 Author Name:Sankar Ganesh
     *                  Date of Development:13-Aug-2019
     */
    @Before
    public static void before(Scenario scenario1) {
        printTestDataMap.clear();
        System.out.println("SCENARIO NO: " + (++i));
        System.out.println("SCENARIO NAME: " + scenario1.getName());
    }
}



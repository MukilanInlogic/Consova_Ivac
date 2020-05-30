package commonpage.toolbox;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    protected static WebDriver driver;
    private static Logger log = LogManager.getLogger(Sync.class.getName());

    /**
     * Description:This method is to Select Drop down using text
     *
     * @param SelectBtn,StrGivenValue
     * @return isSelected
     * Author Name:Vimalan
     * Date of Development:20-Feb-2020
     */


    public static boolean SelectValueByText(WebElement SelectBtn, String StrGivenValue) {
        boolean isSelected = false;

        try {
            if (SelectBtn.isDisplayed()) {
                Select select = new Select(SelectBtn);
                select.selectByVisibleText(StrGivenValue);
                isSelected = true;
            }

        } catch (Exception e) {
            log.error(e);
        }
        return true;
    }


    /**
     * Description:This method is to Select Drop down Without select Keyword
     *
     * @param DropDownBtn,StrDDValue
     * Author Name:Vimalan
     * Date of Development:20-Feb-2020
     */

    public static void   SelectValue(WebDriver driver, WebElement DropDownBtn, String StrDDValue){
        List<WebElement> listdata = (List<WebElement>) DropDownBtn;
        System.out.println(listdata.size());

        for (int i = 0;i<listdata.size();i++){
            System.out.println(listdata.get(i).getText());
            if (listdata.get(i).getText().equals(StrDDValue)){
                driver.switchTo().activeElement();
                listdata.get(i).click();
                break;
            }
        }
    }


    /**
     * Description:This method is to Select Drop down Without select Keyword
     *
     * @param SelectBtn,IndexValue
     * Author Name:Vimalan
     * Date of Development:20-Feb-2020
     */

    public static boolean SelectValueByIndex(WebElement SelectBtn, int indexValue) {
        boolean isSelected = false;

        try {
            if (SelectBtn.isDisplayed()) {
                Select select = new Select(SelectBtn);
                select.selectByIndex(indexValue);
                isSelected = true;
            }

        } catch (Exception e) {
            log.error(e);
        }
        return true;
    }

    public static void   VerifyValue(WebDriver driver, WebElement DropDownBtn, String StrDDValue){
        List<WebElement> listdata = (List<WebElement>) DropDownBtn;
        System.out.println(listdata.size());

        for (int i = 0;i<listdata.size();i++){
            System.out.println(listdata.get(i).getText());
            if (listdata.get(i).getText().equals(StrDDValue)){
                driver.switchTo().activeElement();
                listdata.get(i).click();
                break;
            }
        }
    }

    public static void VerifyDropDownValue(WebDriver driver, WebElement DropDownBtn, String[] StrDDValue){
        Select select = new Select(DropDownBtn);
        List<WebElement> options = select.getOptions();
        for(WebElement we:options)
        {
            for (int i=0; i<StrDDValue.length; i++){
                if (we.getText().equals(StrDDValue[i])){
                    System.out.println("Matched");
                }
            }

        }
    }

}
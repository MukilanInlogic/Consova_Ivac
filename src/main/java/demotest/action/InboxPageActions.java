package demotest.action;

import commonpage.toolbox.*;
import demotest.Repository.HomePageUI;
import demotest.Repository.InboxPageUI;
import org.openqa.selenium.WebDriver;

public class InboxPageActions extends InboxPageUI {
    public InboxPageActions(WebDriver driver) {
        super(driver);
    }

    public boolean clickComposelink() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, linkCompose);
        return isClicked;
    }


    public boolean clickComposeTab() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleTabCompose);
        return isClicked;
    }


    public boolean selectValuefromHealthcentre(String strHealthCentre){
        Boolean isSelcted = false;
        System.out.println("locator"+ddbHealthCentre.isDisplayed());
        if(ddbHealthCentre.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbHealthCentre, strHealthCentre);
        }
        return isSelcted;
    }

    public boolean selectValuefromLocation(String strLocation){
        Boolean isSelcted = false;
        if(ddbLocation.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbLocation, strLocation);
        }
        return isSelcted;
    }

    public boolean selectValuefromTo(String strTo){
        Boolean isSelcted = false;
        if(ddbTo.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbTo, strTo);
        }
        return isSelcted;
    }


    public boolean enterSubject(String strSubject) {
        Boolean isEntered = false;
        if (txtSubject.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtSubject, strSubject);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean selectValuefromServiceName(String strServiceName){
        Boolean isSelcted = false;
        if(ddbServiceName.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbServiceName, strServiceName);
        }
        return isSelcted;
    }

    public boolean selectValuefromUserName(String strUserName){
        Boolean isSelcted = false;
        if(ddbUserName.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbUserName, strUserName);
        }
        return isSelcted;
    }

    public boolean enterMessage(String strMessage) {
        Boolean isEntered = false;
        if (txtMessage.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtMessage, strMessage);
        } else {
            isEntered = false;
        }
        return isEntered;
    }


    public boolean clickSendMessage() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnSendMessage);
        return isClicked;
    }

    public boolean verifySendSuccess(){
        Boolean isVerified = false;
        if(eleSuccess.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }


    public boolean clickReturnToInbox() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnReturnToInbox);
        return isClicked;
    }


    public boolean clickSentTab() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleTabSent);
        return isClicked;
    }


    public boolean clickTrashButton() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnTrash);
        return isClicked;
    }

    public boolean AcceptAlert() {
        boolean isAccept = false;
        isAccept = Alert.acceptAlert(driver);
        return isAccept;
    }

    public boolean swithtoframe(int strFrame){
        Boolean isDisplayed = false;
        isDisplayed=Frame.switchFrameById(strFrame, driver);
        return isDisplayed;
    }

    public static boolean switchFrameToDefaultContent(WebDriver driver) {
        boolean isFrameSwitched = false;
            driver.switchTo().defaultContent();
            isFrameSwitched = true;
            return isFrameSwitched;
    }




}

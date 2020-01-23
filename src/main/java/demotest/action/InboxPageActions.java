package demotest.action;

import commonpage.toolbox.*;
import commonpage.util.KeyUtil;
import demotest.Repository.HomePageUI;
import demotest.Repository.InboxPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.event.KeyEvent;

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
            System.out.println(txtMessage.isDisplayed());
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

    public boolean swithToProviderInboxFrame(){
        Boolean isDisplayed = false;
        isDisplayed=Frame.switchToFrameByElement(driver,iframeSentMessageProviderInbox);
        return isDisplayed;
    }
    public boolean swithToProviderdefault(){
        Boolean isDisplayed = false;
        isDisplayed=Frame.switchFrameToDefaultContent(driver);
        return isDisplayed;
    }

    public boolean verifyProviderInboxPage(){
        Boolean isVerified = false;
        if(lblProviderInbox.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean enterPatientName(String strPatientName) {
        Boolean isEntered = false;
        if (txtPatientName.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtPatientName, strPatientName);
            KeyUtil.pressKey(KeyEvent.VK_DOWN);
            KeyUtil.releaseKey(KeyEvent.VK_DOWN);
            KeyUtil.pressKey(KeyEvent.VK_TAB);
            KeyUtil.releaseKey(KeyEvent.VK_TAB);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean verifyPatientInboxPage(){
        Boolean isVerified = false;
        if(lblPatientInbox.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyCalenderPage(){
        Boolean isVerified = false;
        if(lblCalender.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }


    public boolean clickCalender() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleEventToday);
        return isClicked;
    }

    public boolean enterEventTitle(String strEventTitle) {
        Boolean isEntered = false;
        if (txtEventTitle.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtEventTitle, strEventTitle);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean enterEventDescription(String strEventDescription) {
        Boolean isEntered = false;
        if (txtEventDescription.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtEventDescription, strEventDescription);
        } else {
            isEntered = false;
        }
        return isEntered;
    }


    public boolean clickEventSave() {
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnEventSave);
        return isClicked;
    }

    public boolean clickEvent(){
        Boolean isClicked = false;
        isClicked = Element.click(driver, eleEvent);
        return isClicked;
    }

    public boolean clickDeleteEvent(){
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnDeleteEvent);
        return isClicked;
    }


    public boolean verifyAddedEvent(){
        Boolean isVerified = false;
        if(eleEvent.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyJournalPage(){
        Boolean isVerified = false;
        if(lblJournal.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickAddJournal(){
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnAddJournal);
        return isClicked;
    }

    public boolean enterSubjectJournal(String strSubjectJournal) {
        Boolean isEntered = false;
        if (txtSubjectJournal.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtSubjectJournal, strSubjectJournal);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean selectValuefromCategory(String strCategory){
        Boolean isSelcted = false;
        if(ddbCategoryJournal.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbCategoryJournal, strCategory);
        }
        return isSelcted;
    }

    public boolean enterNoteJournal(String strNoteJournal) {
        Boolean isEntered = false;
        if (txtNoteJournal.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtNoteJournal, strNoteJournal);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean clickSaveEntry(){
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnSaveEntry);
        return isClicked;
    }

    public boolean verifyJournallist(){
        Boolean isVerified = false;
        if(eleAddedJournal.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickDeleteJournal(){
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnDeleteJournal);
        return isClicked;
    }

    public boolean verifyHealthCenter(){
        Boolean isVerified = false;
        if(eleHealthCenter.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyPracticePage(){
        Boolean isVerified = false;
        if(lblPractice.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyDownloadsPage(){
        Boolean isVerified = false;
        if(lblDownloads.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyGroupMessagePage(){
        Boolean isVerified = false;
        if(lblGroupMessage.isDisplayed()){
            isVerified = true;
        }
        return isVerified;
    }

    public boolean selectValuefromGroupMessage(String strFromGroupMessage){
        Boolean isSelcted = false;
        if(ddbFromGroupMessage.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbFromGroupMessage, strFromGroupMessage);
        }
        return isSelcted;
    }

    public boolean selectValueToGroupMessage(String strToGroupMessage){
        Boolean isSelcted = false;
        if(ddbToGroupMessage.isDisplayed()){
            isSelcted= Combobox.selectText(driver, ddbToGroupMessage, strToGroupMessage);
        }
        return isSelcted;
    }

    public boolean enterGroupMessageSubject(String strGroupMessageSubject) {
        Boolean isEntered = false;
        if (txtSubjectGroupMessage.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtSubjectGroupMessage, strGroupMessageSubject);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean swithToGroupMessageFrame(){
        Boolean isDisplayed = false;
        isDisplayed=Frame.switchToFrameByElement(driver,iframeGroupMessage);
        return isDisplayed;
    }

    public boolean enterGroupMessage(String strGroupMessage) {
        Boolean isEntered = false;
        if (txtMessageGroupMessage.isDisplayed()) {
            isEntered = Textbox.enterValue(driver, txtMessageGroupMessage, strGroupMessage);
        } else {
            isEntered = false;
        }
        return isEntered;
    }

    public boolean clickSendMessageGroupMessage(){
        Boolean isClicked = false;
        isClicked = Element.click(driver, btnSendMessageGroupMessage);
        return isClicked;
    }

}

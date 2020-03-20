$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/resources/Feature/EndToEnd.feature");
formatter.feature({
  "line": 1,
  "name": "EneToEnd",
  "description": "",
  "id": "enetoend",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 1624,
  "name": "MT-84297:User should able to Enable out of reply for the Message",
  "description": "",
  "id": "enetoend;mt-84297:user-should-able-to-enable-out-of-reply-for-the-message",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1623,
      "name": "@MT-84297"
    }
  ]
});
formatter.step({
  "line": 1625,
  "name": "I am on manage my health home page",
  "keyword": "Given "
});
formatter.step({
  "line": 1626,
  "name": "I Enter \u003cProviderName\u003e, \u003cProviderPassword\u003e valid credentials in Manage my health page",
  "keyword": "And "
});
formatter.step({
  "line": 1627,
  "name": "I click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 1628,
  "name": "I click Inbox link",
  "keyword": "When "
});
formatter.step({
  "line": 1629,
  "name": "I Click Setting Tab",
  "keyword": "And "
});
formatter.step({
  "line": 1630,
  "name": "I Click Yes Button in Alert settings",
  "keyword": "And "
});
formatter.step({
  "line": 1631,
  "name": "I Click Automatic replies Tab",
  "keyword": "And "
});
formatter.step({
  "line": 1632,
  "name": "I Click The Enable Check Box",
  "keyword": "And "
});
formatter.step({
  "line": 1633,
  "name": "I Enter \u003cAutoRepliesText\u003e The Valid Text In to The Automatic Replies Text box",
  "keyword": "Then "
});
formatter.step({
  "line": 1634,
  "name": "I Click Save Settings Button",
  "keyword": "And "
});
formatter.step({
  "line": 1635,
  "name": "I Verify The Success Message in Provider Inbox",
  "keyword": "And "
});
formatter.step({
  "line": 1636,
  "name": "I click Logout button",
  "keyword": "And "
});
formatter.examples({
  "line": 1638,
  "name": "",
  "description": "",
  "id": "enetoend;mt-84297:user-should-able-to-enable-out-of-reply-for-the-message;",
  "rows": [
    {
      "cells": [
        "ProviderName",
        "ProviderPassword",
        "AutoRepliesText"
      ],
      "line": 1639,
      "id": "enetoend;mt-84297:user-should-able-to-enable-out-of-reply-for-the-message;;1"
    },
    {
      "cells": [
        "DP:LOGIN.PATIENTNAME",
        "DP:LOGIN.PATIENTPASSWORD",
        "Test Message"
      ],
      "line": 1640,
      "id": "enetoend;mt-84297:user-should-able-to-enable-out-of-reply-for-the-message;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14258099951,
  "status": "passed"
});
formatter.scenario({
  "line": 1640,
  "name": "MT-84297:User should able to Enable out of reply for the Message",
  "description": "",
  "id": "enetoend;mt-84297:user-should-able-to-enable-out-of-reply-for-the-message;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1623,
      "name": "@MT-84297"
    }
  ]
});
formatter.step({
  "line": 1625,
  "name": "I am on manage my health home page",
  "keyword": "Given "
});
formatter.step({
  "line": 1626,
  "name": "I Enter DP:LOGIN.PATIENTNAME, DP:LOGIN.PATIENTPASSWORD valid credentials in Manage my health page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 1627,
  "name": "I click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 1628,
  "name": "I click Inbox link",
  "keyword": "When "
});
formatter.step({
  "line": 1629,
  "name": "I Click Setting Tab",
  "keyword": "And "
});
formatter.step({
  "line": 1630,
  "name": "I Click Yes Button in Alert settings",
  "keyword": "And "
});
formatter.step({
  "line": 1631,
  "name": "I Click Automatic replies Tab",
  "keyword": "And "
});
formatter.step({
  "line": 1632,
  "name": "I Click The Enable Check Box",
  "keyword": "And "
});
formatter.step({
  "line": 1633,
  "name": "I Enter Test Message The Valid Text In to The Automatic Replies Text box",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 1634,
  "name": "I Click Save Settings Button",
  "keyword": "And "
});
formatter.step({
  "line": 1635,
  "name": "I Verify The Success Message in Provider Inbox",
  "keyword": "And "
});
formatter.step({
  "line": 1636,
  "name": "I click Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnManageMyHealthHomePage()"
});
formatter.result({
  "duration": 3473441916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.PATIENTNAME",
      "offset": 8
    },
    {
      "val": "DP:LOGIN.PATIENTPASSWORD",
      "offset": 30
    }
  ],
  "location": "LoginPageSteps.iEnterUserNamePasswordValidCredentialsInManageMyHealthPage(String,String)"
});
formatter.result({
  "duration": 6640621610,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickLoginButton()"
});
formatter.result({
  "duration": 7143319028,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickInboxLink()"
});
formatter.result({
  "duration": 8406275590,
  "status": "passed"
});
formatter.match({
  "location": "InboxPageSteps.iClickSettingTab()"
});
formatter.result({
  "duration": 7783719819,
  "status": "passed"
});
formatter.match({
  "location": "InboxPageSteps.iClickYesButtonInAlertSettings()"
});
formatter.result({
  "duration": 132911153,
  "status": "passed"
});
formatter.match({
  "location": "InboxPageSteps.iClickAutomaticRepliesTab()"
});
formatter.result({
  "duration": 147931023,
  "status": "passed"
});
formatter.match({
  "location": "InboxPageSteps.iClickTheEnableCheckBox()"
});
formatter.result({
  "duration": 162741623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Message",
      "offset": 8
    }
  ],
  "location": "InboxPageSteps.iEnterAutoRepliesTextTheValidTextInToTheAutomaticRepliesTextBox(String)"
});
formatter.result({
  "duration": 3325655423,
  "status": "passed"
});
formatter.match({
  "location": "InboxPageSteps.iClickSaveSettingsButton()"
});
formatter.result({
  "duration": 6546542701,
  "status": "passed"
});
formatter.match({
  "location": "InboxPageSteps.iVerifyTheSuccessMessageInProviderInbox()"
});
formatter.result({
  "duration": 31999462,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027success\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.130)\n  (Driver info: chromedriver\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 31 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027INLOGICPCS71\u0027, ip: \u0027192.168.2.71\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:50563}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90), userDataDir\u003dC:\\Users\\vvimalan\\AppData\\Local\\Temp\\scoped_dir25348_3292}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d79.0.3945.130, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: e93489059f240757fd169aa2249144ba\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027success\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat sun.reflect.GeneratedMethodAccessor10.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:103)\r\n\tat com.sun.proxy.$Proxy21.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:188)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy23.getText(Unknown Source)\r\n\tat demotest.action.InboxPageActions.VerifyTheSuccessMessDisplaysInProviderInbox(InboxPageActions.java:428)\r\n\tat demotest.stepdefinition.InboxPageSteps.iVerifyTheSuccessMessageInProviderInbox(InboxPageSteps.java:223)\r\n\tat ✽.And I Verify The Success Message in Provider Inbox(test/resources/Feature/EndToEnd.feature:1635)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSteps.iClickLogoutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 583095717,
  "status": "passed"
});
});
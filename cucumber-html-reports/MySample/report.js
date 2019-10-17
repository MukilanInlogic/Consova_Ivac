$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/resources/Feature/Smoke_Module.feature");
formatter.feature({
  "line": 1,
  "name": "Smoke Module",
  "description": "",
  "id": "smoke-module",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 115,
  "name": "MT-82552:User should able to add the Emergency Contact",
  "description": "",
  "id": "smoke-module;mt-82552:user-should-able-to-add-the-emergency-contact",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 114,
      "name": "@MT-82552"
    }
  ]
});
formatter.step({
  "line": 116,
  "name": "I am on manage my health home page",
  "keyword": "Given "
});
formatter.step({
  "line": 117,
  "name": "I Enter \u003cProviderName\u003e, \u003cProviderPassword\u003e valid credentials in Manage my health page",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "I click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "I Click My Account Main Menu",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "I click Emergency Contacts Tab",
  "keyword": "When "
});
formatter.step({
  "line": 121,
  "name": "Emergeny Contacts tab opened",
  "keyword": "Then "
});
formatter.step({
  "line": 122,
  "name": "click Add icon the Emergency contact Tab",
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "Enter the required details in the Emergency contacts tab: \u003cFirstName\u003e, \u003cMobilePhone\u003e, \u003cRelationship\u003e, \u003cLastName\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "I should see added emergency contacts in the Emergency Contacts tab",
  "keyword": "Then "
});
formatter.step({
  "line": 125,
  "name": "Delete the Emergency Contacts",
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "I click Logout button",
  "keyword": "And "
});
formatter.examples({
  "line": 128,
  "name": "",
  "description": "",
  "id": "smoke-module;mt-82552:user-should-able-to-add-the-emergency-contact;",
  "rows": [
    {
      "cells": [
        "ProviderName",
        "ProviderPassword",
        "FirstName",
        "MobilePhone",
        "Relationship",
        "LastName"
      ],
      "line": 129,
      "id": "smoke-module;mt-82552:user-should-able-to-add-the-emergency-contact;;1"
    },
    {
      "cells": [
        "DP:LOGIN.PROVIDERNAME",
        "DP:LOGIN.PROVIDERPASSWORD",
        "DP:EMERGENCYCONTACTS.FIRSTNAME",
        "DP:EMERGENCYCONTACTS.MOBILEPHONE",
        "DP:EMERGENCYCONTACTS.RELATIONSHIP",
        "DP:EMERGENCYCONTACTS.LASTNAME"
      ],
      "line": 130,
      "id": "smoke-module;mt-82552:user-should-able-to-add-the-emergency-contact;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15683683348,
  "status": "passed"
});
formatter.scenario({
  "line": 130,
  "name": "MT-82552:User should able to add the Emergency Contact",
  "description": "",
  "id": "smoke-module;mt-82552:user-should-able-to-add-the-emergency-contact;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 114,
      "name": "@MT-82552"
    }
  ]
});
formatter.step({
  "line": 116,
  "name": "I am on manage my health home page",
  "keyword": "Given "
});
formatter.step({
  "line": 117,
  "name": "I Enter DP:LOGIN.PROVIDERNAME, DP:LOGIN.PROVIDERPASSWORD valid credentials in Manage my health page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "I click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "I Click My Account Main Menu",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "I click Emergency Contacts Tab",
  "keyword": "When "
});
formatter.step({
  "line": 121,
  "name": "Emergeny Contacts tab opened",
  "keyword": "Then "
});
formatter.step({
  "line": 122,
  "name": "click Add icon the Emergency contact Tab",
  "keyword": "And "
});
formatter.step({
  "line": 123,
  "name": "Enter the required details in the Emergency contacts tab: DP:EMERGENCYCONTACTS.FIRSTNAME, DP:EMERGENCYCONTACTS.MOBILEPHONE, DP:EMERGENCYCONTACTS.RELATIONSHIP, DP:EMERGENCYCONTACTS.LASTNAME",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 124,
  "name": "I should see added emergency contacts in the Emergency Contacts tab",
  "keyword": "Then "
});
formatter.step({
  "line": 125,
  "name": "Delete the Emergency Contacts",
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "I click Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnManageMyHealthHomePage()"
});
formatter.result({
  "duration": 4894355147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.PROVIDERNAME",
      "offset": 8
    },
    {
      "val": "DP:LOGIN.PROVIDERPASSWORD",
      "offset": 31
    }
  ],
  "location": "LoginPageSteps.iEnterUserNamePasswordValidCredentialsInManageMyHealthPage(String,String)"
});
formatter.result({
  "duration": 7121318159,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickLoginButton()"
});
formatter.result({
  "duration": 7966485356,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickMyAccountMainMenu()"
});
formatter.result({
  "duration": 4828588786,
  "status": "passed"
});
formatter.match({
  "location": "AccountsPageSteps.iClickEmergencyContactsTab()"
});
formatter.result({
  "duration": 5039128368,
  "status": "passed"
});
formatter.match({
  "location": "AccountsPageSteps.emergenyContactsTabOpened()"
});
formatter.result({
  "duration": 153985606,
  "status": "passed"
});
formatter.match({
  "location": "AccountsPageSteps.clickAddIconTheEmergencyContactTab()"
});
formatter.result({
  "duration": 5269393473,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:EMERGENCYCONTACTS.FIRSTNAME",
      "offset": 58
    },
    {
      "val": "DP:EMERGENCYCONTACTS.MOBILEPHONE",
      "offset": 90
    },
    {
      "val": "DP:EMERGENCYCONTACTS.RELATIONSHIP",
      "offset": 124
    },
    {
      "val": "DP:EMERGENCYCONTACTS.LASTNAME",
      "offset": 159
    }
  ],
  "location": "AccountsPageSteps.enterTheRequiredDetailsInTheEmergencyContactsTabFirstNameMobilePhoneRelationshipLastName(String,String,String,String)"
});
formatter.result({
  "duration": 19974337072,
  "status": "passed"
});
formatter.match({
  "location": "AccountsPageSteps.iShouldSeeAddedEmergencyContactsInTheEmergencyContactsTab()"
});
formatter.result({
  "duration": 194629288,
  "status": "passed"
});
formatter.match({
  "location": "AccountsPageSteps.deleteTheEmergencyContacts()"
});
formatter.result({
  "duration": 225105607,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickLogoutButton()"
});
formatter.result({
  "duration": 11549516988,
  "status": "passed"
});
formatter.after({
  "duration": 223264,
  "status": "passed"
});
});
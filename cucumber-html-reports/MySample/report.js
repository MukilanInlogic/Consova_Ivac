$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/resources/Feature/CHF Module.feature");
formatter.feature({
  "line": 1,
  "name": "CHF Module",
  "description": "",
  "id": "chf-module",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "MT-83052:Service Provider able to view the Inbox widget in the Home page",
  "description": "",
  "id": "chf-module;mt-83052:service-provider-able-to-view-the-inbox-widget-in-the-home-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@MT-83052"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I am on manage my health home page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I Enter \u003cProviderName\u003e, \u003cProviderPassword\u003e valid credentials in Manage my health page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I should see home page of Managemyhealth",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I sholuld see Inbox widget defaultly available",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I click Logout button",
  "keyword": "And "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "chf-module;mt-83052:service-provider-able-to-view-the-inbox-widget-in-the-home-page;",
  "rows": [
    {
      "cells": [
        "ProviderName",
        "ProviderPassword",
        "SETUPHEADER"
      ],
      "line": 39,
      "id": "chf-module;mt-83052:service-provider-able-to-view-the-inbox-widget-in-the-home-page;;1"
    },
    {
      "cells": [
        "DP:LOGIN.PROVIDERNAME",
        "DP:LOGIN.PROVIDERPASSWORD",
        "DP:LEFTPANE.SETUPHEADER"
      ],
      "line": 40,
      "id": "chf-module;mt-83052:service-provider-able-to-view-the-inbox-widget-in-the-home-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15847421590,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "MT-83052:Service Provider able to view the Inbox widget in the Home page",
  "description": "",
  "id": "chf-module;mt-83052:service-provider-able-to-view-the-inbox-widget-in-the-home-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@MT-83052"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I am on manage my health home page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "I Enter DP:LOGIN.PROVIDERNAME, DP:LOGIN.PROVIDERPASSWORD valid credentials in Manage my health page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I should see home page of Managemyhealth",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I sholuld see Inbox widget defaultly available",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I click Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "SampleSteps.iAmOnManageMyHealthHomePage()"
});
formatter.result({
  "duration": 2696821423,
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
  "location": "SampleSteps.iEnterUserNamePasswordValidCredentialsInManageMyHealthPage(String,String)"
});
formatter.result({
  "duration": 16899994309,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iClickLoginButton()"
});
formatter.result({
  "duration": 7637452385,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iShouldSeeHomePageOfManagemyhealth()"
});
formatter.result({
  "duration": 49616402,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iSholuldSeeInboxWidgetDefaultlyAvailable()"
});
formatter.result({
  "duration": 46650376,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iClickLogoutButton()"
});
formatter.result({
  "duration": 3700894728,
  "status": "passed"
});
formatter.after({
  "duration": 217908,
  "status": "passed"
});
});
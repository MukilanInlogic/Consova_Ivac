$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/resources/Feature/Smoke_Module.feature");
formatter.feature({
  "line": 1,
  "name": "Smoke Module",
  "description": "",
  "id": "smoke-module",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "MT-82538:Login with valid username and password",
  "description": "",
  "id": "smoke-module;mt-82538:login-with-valid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@MT-82538"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on manage my health home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Enter \u003cUserName\u003e, \u003cPassword\u003e valid credentials in Manage my health page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see home page of Managemyhealth",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click Logout button",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "smoke-module;mt-82538:login-with-valid-username-and-password;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 14,
      "id": "smoke-module;mt-82538:login-with-valid-username-and-password;;1"
    },
    {
      "cells": [
        "DP:LOGIN.USERNAME",
        "DP:LOGIN.PASSWORD"
      ],
      "line": 15,
      "id": "smoke-module;mt-82538:login-with-valid-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 23713806193,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "MT-82538:Login with valid username and password",
  "description": "",
  "id": "smoke-module;mt-82538:login-with-valid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@MT-82538"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on manage my health home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Enter DP:LOGIN.USERNAME, DP:LOGIN.PASSWORD valid credentials in Manage my health page",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see home page of Managemyhealth",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnManageMyHealthHomePage()"
});
formatter.result({
  "duration": 10159967866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.USERNAME",
      "offset": 8
    },
    {
      "val": "DP:LOGIN.PASSWORD",
      "offset": 27
    }
  ],
  "location": "LoginPageSteps.iEnterUserNamePasswordValidCredentialsInManageMyHealthPage(String,String)"
});

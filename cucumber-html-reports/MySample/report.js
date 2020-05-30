$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/resources/Feature/Employee_Portal_Sprint_1.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page",
  "description": "",
  "id": "home-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 184,
  "name": "EVS-825-As a user I should see call section on contact page",
  "description": "",
  "id": "home-page;evs-825-as-a-user-i-should-see-call-section-on-contact-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 183,
      "name": "@EVS-825"
    }
  ]
});
formatter.step({
  "line": 185,
  "name": "I should enter login url \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 186,
  "name": "I should Login to application with \u003clastName\u003e , \u003cconsovaId\u003e and \u003csSN\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 187,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 188,
  "name": "I should go to Cotacts page by clicking Contacts icon",
  "keyword": "And "
});
formatter.step({
  "line": 189,
  "name": "I should verify Verification Assistance Center",
  "keyword": "And "
});
formatter.step({
  "line": 190,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.examples({
  "line": 192,
  "name": "",
  "description": "",
  "id": "home-page;evs-825-as-a-user-i-should-see-call-section-on-contact-page;",
  "rows": [
    {
      "cells": [
        "URL",
        "lastName",
        "consovaId",
        "sSN"
      ],
      "line": 193,
      "id": "home-page;evs-825-as-a-user-i-should-see-call-section-on-contact-page;;1"
    },
    {
      "cells": [
        "DP:LOGIN.URL",
        "DP:LOGIN.LASTNAME",
        "DP:LOGIN.CONSOVAID",
        "DP:LOGIN.SSN"
      ],
      "line": 194,
      "id": "home-page;evs-825-as-a-user-i-should-see-call-section-on-contact-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 21086629263,
  "status": "passed"
});
formatter.scenario({
  "line": 194,
  "name": "EVS-825-As a user I should see call section on contact page",
  "description": "",
  "id": "home-page;evs-825-as-a-user-i-should-see-call-section-on-contact-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 183,
      "name": "@EVS-825"
    }
  ]
});
formatter.step({
  "line": 185,
  "name": "I should enter login url DP:LOGIN.URL",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 186,
  "name": "I should Login to application with DP:LOGIN.LASTNAME , DP:LOGIN.CONSOVAID and DP:LOGIN.SSN",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 187,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 188,
  "name": "I should go to Cotacts page by clicking Contacts icon",
  "keyword": "And "
});
formatter.step({
  "line": 189,
  "name": "I should verify Verification Assistance Center",
  "keyword": "And "
});
formatter.step({
  "line": 190,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.URL",
      "offset": 25
    }
  ],
  "location": "HomePageSteps.iShouldEnterLoginUrlURL(String)"
});
formatter.result({
  "duration": 401888113,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.LASTNAME",
      "offset": 35
    },
    {
      "val": "DP:LOGIN.CONSOVAID",
      "offset": 55
    },
    {
      "val": "DP:LOGIN.SSN",
      "offset": 78
    }
  ],
  "location": "HomePageSteps.iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String,String,String)"
});
formatter.result({
  "duration": 9842227668,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnLoginButtonFromLoginScreen()"
});
formatter.result({
  "duration": 134492035,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldGoToCotactsPageByClickingContactsIcon()"
});
formatter.result({
  "duration": 7095703463,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldVerifyVerificationAssistanceCenter()"
});
formatter.result({
  "duration": 5025153792,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldLogoffFromLoginScreen()"
});
formatter.result({
  "duration": 7145269300,
  "status": "passed"
});
formatter.after({
  "duration": 172919,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 197,
  "name": "EVS-826-As a user I should see submit documents section on contact page",
  "description": "",
  "id": "home-page;evs-826-as-a-user-i-should-see-submit-documents-section-on-contact-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 196,
      "name": "@EVS-826"
    }
  ]
});
formatter.step({
  "line": 198,
  "name": "I should enter login url \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 199,
  "name": "I should Login to application with \u003clastName\u003e , \u003cconsovaId\u003e and \u003csSN\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 200,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 201,
  "name": "I should go to Cotacts page by clicking Contacts icon",
  "keyword": "And "
});
formatter.step({
  "line": 202,
  "name": "I should verify FAX in contacts page",
  "keyword": "And "
});
formatter.step({
  "line": 203,
  "name": "I should verify mail in contacts page",
  "keyword": "And "
});
formatter.step({
  "line": 204,
  "name": "I should verify upload icon in contacts page",
  "keyword": "And "
});
formatter.step({
  "line": 205,
  "name": "I should click upload icon in contacts page",
  "keyword": "And "
});
formatter.step({
  "line": 206,
  "name": "I should select desired document by Browse icon",
  "keyword": "And "
});
formatter.step({
  "line": 207,
  "name": "I should upload the document",
  "keyword": "And "
});
formatter.step({
  "line": 208,
  "name": "I should click on OK button in popup",
  "keyword": "And "
});
formatter.step({
  "line": 209,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.examples({
  "line": 211,
  "name": "",
  "description": "",
  "id": "home-page;evs-826-as-a-user-i-should-see-submit-documents-section-on-contact-page;",
  "rows": [
    {
      "cells": [
        "URL",
        "lastName",
        "consovaId",
        "sSN"
      ],
      "line": 212,
      "id": "home-page;evs-826-as-a-user-i-should-see-submit-documents-section-on-contact-page;;1"
    },
    {
      "cells": [
        "DP:LOGIN.URL",
        "DP:LOGIN.LASTNAME",
        "DP:LOGIN.CONSOVAID",
        "DP:LOGIN.SSN"
      ],
      "line": 213,
      "id": "home-page;evs-826-as-a-user-i-should-see-submit-documents-section-on-contact-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8747022,
  "status": "passed"
});
formatter.scenario({
  "line": 213,
  "name": "EVS-826-As a user I should see submit documents section on contact page",
  "description": "",
  "id": "home-page;evs-826-as-a-user-i-should-see-submit-documents-section-on-contact-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 196,
      "name": "@EVS-826"
    }
  ]
});
formatter.step({
  "line": 198,
  "name": "I should enter login url DP:LOGIN.URL",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 199,
  "name": "I should Login to application with DP:LOGIN.LASTNAME , DP:LOGIN.CONSOVAID and DP:LOGIN.SSN",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 200,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 201,
  "name": "I should go to Cotacts page by clicking Contacts icon",
  "keyword": "And "
});
formatter.step({
  "line": 202,
  "name": "I should verify FAX in contacts page",
  "keyword": "And "
});
formatter.step({
  "line": 203,
  "name": "I should verify mail in contacts page",
  "keyword": "And "
});
formatter.step({
  "line": 204,
  "name": "I should verify upload icon in contacts page",
  "keyword": "And "
});
formatter.step({
  "line": 205,
  "name": "I should click upload icon in contacts page",
  "keyword": "And "
});
formatter.step({
  "line": 206,
  "name": "I should select desired document by Browse icon",
  "keyword": "And "
});
formatter.step({
  "line": 207,
  "name": "I should upload the document",
  "keyword": "And "
});
formatter.step({
  "line": 208,
  "name": "I should click on OK button in popup",
  "keyword": "And "
});
formatter.step({
  "line": 209,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.URL",
      "offset": 25
    }
  ],
  "location": "HomePageSteps.iShouldEnterLoginUrlURL(String)"
});
formatter.result({
  "duration": 827077360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.LASTNAME",
      "offset": 35
    },
    {
      "val": "DP:LOGIN.CONSOVAID",
      "offset": 55
    },
    {
      "val": "DP:LOGIN.SSN",
      "offset": 78
    }
  ],
  "location": "HomePageSteps.iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String,String,String)"
});
formatter.result({
  "duration": 9650423900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnLoginButtonFromLoginScreen()"
});
formatter.result({
  "duration": 166947297,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldGoToCotactsPageByClickingContactsIcon()"
});
formatter.result({
  "duration": 5389041730,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldVerifyFAXInContactsPage()"
});
formatter.result({
  "duration": 5032138659,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldVerifyMailInContactsPage()"
});
formatter.result({
  "duration": 5025057380,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldVerifyUploadIconInContactsPage()"
});
formatter.result({
  "duration": 5026719392,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickUploadIconInContactsPage()"
});
formatter.result({
  "duration": 5177917695,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSelectDesiredDocumentByBrowseIcon()"
});
formatter.result({
  "duration": 7054911084,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldUploadTheDocument()"
});
formatter.result({
  "duration": 125605372,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnOKButtonInPopup()"
});
formatter.result({
  "duration": 5130740690,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldLogoffFromLoginScreen()"
});
formatter.result({
  "duration": 7112181764,
  "status": "passed"
});
formatter.after({
  "duration": 60024,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 216,
  "name": "EVS-562-As a user, I should be able to change the contact information profile page",
  "description": "",
  "id": "home-page;evs-562-as-a-user,-i-should-be-able-to-change-the-contact-information-profile-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 215,
      "name": "@EVS-562"
    }
  ]
});
formatter.step({
  "line": 217,
  "name": "I should enter login url \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 218,
  "name": "I should Login to application with \u003clastName\u003e , \u003cconsovaId\u003e and \u003csSN\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 219,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 220,
  "name": "I should click on profile photo icon",
  "keyword": "And "
});
formatter.step({
  "line": 221,
  "name": "I should click on profile from popup",
  "keyword": "And "
});
formatter.step({
  "line": 222,
  "name": "I should see the address table with address, city, state and pincode",
  "keyword": "And "
});
formatter.step({
  "line": 223,
  "name": "I should see the phone numbers table",
  "keyword": "And "
});
formatter.step({
  "line": 224,
  "name": "I should verify the both preferred email and confirm preferred email",
  "keyword": "And "
});
formatter.step({
  "line": 225,
  "name": "I should click edit button in profile page",
  "keyword": "And "
});
formatter.step({
  "line": 226,
  "name": "I should enter details in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 227,
  "name": "I should click on Cancel button in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 228,
  "name": "I should click edit button in profile page",
  "keyword": "And "
});
formatter.step({
  "line": 229,
  "name": "I should enter details in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 230,
  "name": "I should click on Save button in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 231,
  "name": "I should click on OK button in popup",
  "keyword": "And "
});
formatter.step({
  "line": 232,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.examples({
  "line": 234,
  "name": "",
  "description": "",
  "id": "home-page;evs-562-as-a-user,-i-should-be-able-to-change-the-contact-information-profile-page;",
  "rows": [
    {
      "cells": [
        "URL",
        "lastName",
        "consovaId",
        "sSN"
      ],
      "line": 235,
      "id": "home-page;evs-562-as-a-user,-i-should-be-able-to-change-the-contact-information-profile-page;;1"
    },
    {
      "cells": [
        "DP:LOGIN.URL",
        "DP:LOGIN.LASTNAME",
        "DP:LOGIN.CONSOVAID",
        "DP:LOGIN.SSN"
      ],
      "line": 236,
      "id": "home-page;evs-562-as-a-user,-i-should-be-able-to-change-the-contact-information-profile-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5318811,
  "status": "passed"
});
formatter.scenario({
  "line": 236,
  "name": "EVS-562-As a user, I should be able to change the contact information profile page",
  "description": "",
  "id": "home-page;evs-562-as-a-user,-i-should-be-able-to-change-the-contact-information-profile-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 215,
      "name": "@EVS-562"
    }
  ]
});
formatter.step({
  "line": 217,
  "name": "I should enter login url DP:LOGIN.URL",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 218,
  "name": "I should Login to application with DP:LOGIN.LASTNAME , DP:LOGIN.CONSOVAID and DP:LOGIN.SSN",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 219,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 220,
  "name": "I should click on profile photo icon",
  "keyword": "And "
});
formatter.step({
  "line": 221,
  "name": "I should click on profile from popup",
  "keyword": "And "
});
formatter.step({
  "line": 222,
  "name": "I should see the address table with address, city, state and pincode",
  "keyword": "And "
});
formatter.step({
  "line": 223,
  "name": "I should see the phone numbers table",
  "keyword": "And "
});
formatter.step({
  "line": 224,
  "name": "I should verify the both preferred email and confirm preferred email",
  "keyword": "And "
});
formatter.step({
  "line": 225,
  "name": "I should click edit button in profile page",
  "keyword": "And "
});
formatter.step({
  "line": 226,
  "name": "I should enter details in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 227,
  "name": "I should click on Cancel button in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 228,
  "name": "I should click edit button in profile page",
  "keyword": "And "
});
formatter.step({
  "line": 229,
  "name": "I should enter details in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 230,
  "name": "I should click on Save button in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 231,
  "name": "I should click on OK button in popup",
  "keyword": "And "
});
formatter.step({
  "line": 232,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.URL",
      "offset": 25
    }
  ],
  "location": "HomePageSteps.iShouldEnterLoginUrlURL(String)"
});
formatter.result({
  "duration": 527154178,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.LASTNAME",
      "offset": 35
    },
    {
      "val": "DP:LOGIN.CONSOVAID",
      "offset": 55
    },
    {
      "val": "DP:LOGIN.SSN",
      "offset": 78
    }
  ],
  "location": "HomePageSteps.iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String,String,String)"
});
formatter.result({
  "duration": 9862395425,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnLoginButtonFromLoginScreen()"
});
formatter.result({
  "duration": 120124216,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnProfilePhotoIcon()"
});
formatter.result({
  "duration": 10136999048,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnProfileFromPopup()"
});
formatter.result({
  "duration": 5203797063,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSeeTheAddressTableWithAddAddCityStateAndPincode()"
});
formatter.result({
  "duration": 5027390852,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSeeThePhoneNumbersTable()"
});
formatter.result({
  "duration": 5083568038,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldVerifyTheBothPreferredEmailAndConfirmPreferredEmail()"
});
formatter.result({
  "duration": 5054465102,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickEditButtonInProfilePage()"
});
formatter.result({
  "duration": 10149078181,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldEnterDetailsInPopupDialogBox()"
});
formatter.result({
  "duration": 27887448140,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnCancelButtonInPopupDialogBox()"
});
formatter.result({
  "duration": 5117166866,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickEditButtonInProfilePage()"
});
formatter.result({
  "duration": 10124005561,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldEnterDetailsInPopupDialogBox()"
});
formatter.result({
  "duration": 27763970355,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnSaveButtonInPopupDialogBox()"
});
formatter.result({
  "duration": 5130301551,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnOKButtonInPopup()"
});
formatter.result({
  "duration": 5105019003,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldLogoffFromLoginScreen()"
});
formatter.result({
  "duration": 7125640204,
  "status": "passed"
});
formatter.after({
  "duration": 61268,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 239,
  "name": "EVS-714-As a user, I should see employee information account view",
  "description": "",
  "id": "home-page;evs-714-as-a-user,-i-should-see-employee-information-account-view",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 238,
      "name": "@EVS-714"
    }
  ]
});
formatter.step({
  "line": 240,
  "name": "I should enter login url \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 241,
  "name": "I should Login to application with \u003clastName\u003e , \u003cconsovaId\u003e and \u003csSN\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 242,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 243,
  "name": "I should click on profile photo icon",
  "keyword": "And "
});
formatter.step({
  "line": 244,
  "name": "I should click on profile from popup",
  "keyword": "And "
});
formatter.step({
  "line": 245,
  "name": "I should see the address table with address, city, state and pincode",
  "keyword": "And "
});
formatter.step({
  "line": 246,
  "name": "I should see the phone numbers table",
  "keyword": "And "
});
formatter.step({
  "line": 247,
  "name": "I should verify the both preferred email and confirm preferred email",
  "keyword": "And "
});
formatter.step({
  "line": 248,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.examples({
  "line": 250,
  "name": "",
  "description": "",
  "id": "home-page;evs-714-as-a-user,-i-should-see-employee-information-account-view;",
  "rows": [
    {
      "cells": [
        "URL",
        "lastName",
        "consovaId",
        "sSN"
      ],
      "line": 251,
      "id": "home-page;evs-714-as-a-user,-i-should-see-employee-information-account-view;;1"
    },
    {
      "cells": [
        "DP:LOGIN.URL",
        "DP:LOGIN.LASTNAME",
        "DP:LOGIN.CONSOVAID",
        "DP:LOGIN.SSN"
      ],
      "line": 252,
      "id": "home-page;evs-714-as-a-user,-i-should-see-employee-information-account-view;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14592987,
  "status": "passed"
});
formatter.scenario({
  "line": 252,
  "name": "EVS-714-As a user, I should see employee information account view",
  "description": "",
  "id": "home-page;evs-714-as-a-user,-i-should-see-employee-information-account-view;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 238,
      "name": "@EVS-714"
    }
  ]
});
formatter.step({
  "line": 240,
  "name": "I should enter login url DP:LOGIN.URL",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 241,
  "name": "I should Login to application with DP:LOGIN.LASTNAME , DP:LOGIN.CONSOVAID and DP:LOGIN.SSN",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 242,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 243,
  "name": "I should click on profile photo icon",
  "keyword": "And "
});
formatter.step({
  "line": 244,
  "name": "I should click on profile from popup",
  "keyword": "And "
});
formatter.step({
  "line": 245,
  "name": "I should see the address table with address, city, state and pincode",
  "keyword": "And "
});
formatter.step({
  "line": 246,
  "name": "I should see the phone numbers table",
  "keyword": "And "
});
formatter.step({
  "line": 247,
  "name": "I should verify the both preferred email and confirm preferred email",
  "keyword": "And "
});
formatter.step({
  "line": 248,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.URL",
      "offset": 25
    }
  ],
  "location": "HomePageSteps.iShouldEnterLoginUrlURL(String)"
});
formatter.result({
  "duration": 573781637,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.LASTNAME",
      "offset": 35
    },
    {
      "val": "DP:LOGIN.CONSOVAID",
      "offset": 55
    },
    {
      "val": "DP:LOGIN.SSN",
      "offset": 78
    }
  ],
  "location": "HomePageSteps.iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String,String,String)"
});
formatter.result({
  "duration": 9778945257,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnLoginButtonFromLoginScreen()"
});
formatter.result({
  "duration": 153855532,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnProfilePhotoIcon()"
});
formatter.result({
  "duration": 10135939764,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnProfileFromPopup()"
});
formatter.result({
  "duration": 5197114493,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSeeTheAddressTableWithAddAddCityStateAndPincode()"
});
formatter.result({
  "duration": 5029190329,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSeeThePhoneNumbersTable()"
});
formatter.result({
  "duration": 5082021721,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldVerifyTheBothPreferredEmailAndConfirmPreferredEmail()"
});
formatter.result({
  "duration": 5059528578,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldLogoffFromLoginScreen()"
});
formatter.result({
  "duration": 7109664799,
  "status": "passed"
});
formatter.after({
  "duration": 49139,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 255,
  "name": "EVS-829-As a user, I should see list of authorized user on Profile page",
  "description": "",
  "id": "home-page;evs-829-as-a-user,-i-should-see-list-of-authorized-user-on-profile-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 254,
      "name": "@EVS-829"
    }
  ]
});
formatter.step({
  "line": 256,
  "name": "I should enter login url \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 257,
  "name": "I should Login to application with \u003clastName\u003e , \u003cconsovaId\u003e and \u003csSN\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 258,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 259,
  "name": "I should click on profile photo icon",
  "keyword": "And "
});
formatter.step({
  "line": 260,
  "name": "I should click on profile from popup",
  "keyword": "And "
});
formatter.step({
  "line": 261,
  "name": "I should check the Authorized Caller table",
  "keyword": "And "
});
formatter.step({
  "line": 262,
  "name": "I should check the grid with caller name, relationship, Authorized Date and Expiration date",
  "keyword": "And "
});
formatter.step({
  "line": 263,
  "name": "I should click on Add caller button displayed",
  "keyword": "And "
});
formatter.step({
  "line": 264,
  "name": "I should enter the caller name and select relationship in dropdown in popup dialog box \u003ccallerName\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 265,
  "name": "I should click on Save button in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 266,
  "name": "I should click on OK button in popup",
  "keyword": "And "
});
formatter.step({
  "line": 267,
  "name": "I should check and click the renew button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 268,
  "name": "I should click on confirm button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 269,
  "name": "I should check the remove button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 270,
  "name": "I should click the remove button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 271,
  "name": "I should click on confirm button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 272,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.examples({
  "line": 274,
  "name": "",
  "description": "",
  "id": "home-page;evs-829-as-a-user,-i-should-see-list-of-authorized-user-on-profile-page;",
  "rows": [
    {
      "cells": [
        "URL",
        "lastName",
        "consovaId",
        "sSN",
        "callerName"
      ],
      "line": 275,
      "id": "home-page;evs-829-as-a-user,-i-should-see-list-of-authorized-user-on-profile-page;;1"
    },
    {
      "cells": [
        "DP:LOGIN.URL",
        "DP:LOGIN.LASTNAME",
        "DP:LOGIN.CONSOVAID",
        "DP:LOGIN.SSN",
        "DP:PROFILE.CALLERNAME"
      ],
      "line": 276,
      "id": "home-page;evs-829-as-a-user,-i-should-see-list-of-authorized-user-on-profile-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4685604,
  "status": "passed"
});
formatter.scenario({
  "line": 276,
  "name": "EVS-829-As a user, I should see list of authorized user on Profile page",
  "description": "",
  "id": "home-page;evs-829-as-a-user,-i-should-see-list-of-authorized-user-on-profile-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 254,
      "name": "@EVS-829"
    }
  ]
});
formatter.step({
  "line": 256,
  "name": "I should enter login url DP:LOGIN.URL",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 257,
  "name": "I should Login to application with DP:LOGIN.LASTNAME , DP:LOGIN.CONSOVAID and DP:LOGIN.SSN",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 258,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 259,
  "name": "I should click on profile photo icon",
  "keyword": "And "
});
formatter.step({
  "line": 260,
  "name": "I should click on profile from popup",
  "keyword": "And "
});
formatter.step({
  "line": 261,
  "name": "I should check the Authorized Caller table",
  "keyword": "And "
});
formatter.step({
  "line": 262,
  "name": "I should check the grid with caller name, relationship, Authorized Date and Expiration date",
  "keyword": "And "
});
formatter.step({
  "line": 263,
  "name": "I should click on Add caller button displayed",
  "keyword": "And "
});
formatter.step({
  "line": 264,
  "name": "I should enter the caller name and select relationship in dropdown in popup dialog box DP:PROFILE.CALLERNAME",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 265,
  "name": "I should click on Save button in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 266,
  "name": "I should click on OK button in popup",
  "keyword": "And "
});
formatter.step({
  "line": 267,
  "name": "I should check and click the renew button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 268,
  "name": "I should click on confirm button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 269,
  "name": "I should check the remove button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 270,
  "name": "I should click the remove button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 271,
  "name": "I should click on confirm button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 272,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.URL",
      "offset": 25
    }
  ],
  "location": "HomePageSteps.iShouldEnterLoginUrlURL(String)"
});
formatter.result({
  "duration": 311985519,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.LASTNAME",
      "offset": 35
    },
    {
      "val": "DP:LOGIN.CONSOVAID",
      "offset": 55
    },
    {
      "val": "DP:LOGIN.SSN",
      "offset": 78
    }
  ],
  "location": "HomePageSteps.iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String,String,String)"
});
formatter.result({
  "duration": 9693335469,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnLoginButtonFromLoginScreen()"
});
formatter.result({
  "duration": 134589379,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnProfilePhotoIcon()"
});
formatter.result({
  "duration": 10140024196,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnProfileFromPopup()"
});
formatter.result({
  "duration": 5192610205,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckTheAuthorizedCallerTable()"
});
formatter.result({
  "duration": 5029210544,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckTheGridWithCallerNameRelationshipAuthorizedDateAndExpirationDate()"
});
formatter.result({
  "duration": 5109882502,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnAddCallerButtonDisplayed()"
});
formatter.result({
  "duration": 5134976270,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:PROFILE.CALLERNAME",
      "offset": 87
    }
  ],
  "location": "HomePageSteps.iShouldEnterTheCallerNameAndSelectRelationshipInPopupDialogBox(String)"
});
formatter.result({
  "duration": 14115715405,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnSaveButtonInPopupDialogBox()"
});
formatter.result({
  "duration": 5121129384,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnOKButtonInPopup()"
});
formatter.result({
  "duration": 9764967127,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckAndClickTheRenewButtonInRespectiveCaller()"
});
formatter.result({
  "duration": 5377171283,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShoulClinkOnConfirmButtonInPopupWindow()"
});
formatter.result({
  "duration": 6807335992,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckTheRemoveButtonInRespectiveCaller()"
});
formatter.result({
  "duration": 5036102731,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickTheRemoveButtonInRespectiveCaller()"
});
formatter.result({
  "duration": 5352660650,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShoulClinkOnConfirmButtonInPopupWindow()"
});
formatter.result({
  "duration": 6321602423,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldLogoffFromLoginScreen()"
});
formatter.result({
  "duration": 7155974411,
  "status": "passed"
});
formatter.after({
  "duration": 78996,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 279,
  "name": "EVS-834-As a user, I should manage the authorized user list on profile page",
  "description": "",
  "id": "home-page;evs-834-as-a-user,-i-should-manage-the-authorized-user-list-on-profile-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 278,
      "name": "@EVS-834"
    }
  ]
});
formatter.step({
  "line": 280,
  "name": "I should enter login url \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 281,
  "name": "I should Login to application with \u003clastName\u003e , \u003cconsovaId\u003e and \u003csSN\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 282,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 283,
  "name": "I should click on profile photo icon",
  "keyword": "And "
});
formatter.step({
  "line": 284,
  "name": "I should click on profile from popup",
  "keyword": "And "
});
formatter.step({
  "line": 285,
  "name": "I should check the Authorized Caller table",
  "keyword": "And "
});
formatter.step({
  "line": 286,
  "name": "I should check the grid with caller name, relationship, Authorized Date and Expiration date",
  "keyword": "And "
});
formatter.step({
  "line": 287,
  "name": "I should click on Add caller button displayed",
  "keyword": "And "
});
formatter.step({
  "line": 288,
  "name": "I should enter the caller name and select relationship in dropdown in popup dialog box \u003ccallerName\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 289,
  "name": "I should click on Save button in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 290,
  "name": "I should click on OK button in popup",
  "keyword": "And "
});
formatter.step({
  "line": 291,
  "name": "I should check the callername saved for authorized caller",
  "keyword": "And "
});
formatter.step({
  "line": 292,
  "name": "I should check and click the renew button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 293,
  "name": "I should click on confirm button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 294,
  "name": "I should click the remove button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 295,
  "name": "I should click on cancel button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 296,
  "name": "I should check the callername saved for authorized caller",
  "keyword": "And "
});
formatter.step({
  "line": 297,
  "name": "I should click the remove button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 298,
  "name": "I should click on confirm button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 299,
  "name": "I should check the callername is removed from authorized caller",
  "keyword": "And "
});
formatter.step({
  "line": 300,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.examples({
  "line": 302,
  "name": "",
  "description": "",
  "id": "home-page;evs-834-as-a-user,-i-should-manage-the-authorized-user-list-on-profile-page;",
  "rows": [
    {
      "cells": [
        "URL",
        "lastName",
        "consovaId",
        "sSN",
        "callerName"
      ],
      "line": 303,
      "id": "home-page;evs-834-as-a-user,-i-should-manage-the-authorized-user-list-on-profile-page;;1"
    },
    {
      "cells": [
        "DP:LOGIN.URL",
        "DP:LOGIN.LASTNAME",
        "DP:LOGIN.CONSOVAID",
        "DP:LOGIN.SSN",
        "DP:PROFILE.CALLERNAME"
      ],
      "line": 304,
      "id": "home-page;evs-834-as-a-user,-i-should-manage-the-authorized-user-list-on-profile-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2516966,
  "status": "passed"
});
formatter.scenario({
  "line": 304,
  "name": "EVS-834-As a user, I should manage the authorized user list on profile page",
  "description": "",
  "id": "home-page;evs-834-as-a-user,-i-should-manage-the-authorized-user-list-on-profile-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 278,
      "name": "@EVS-834"
    }
  ]
});
formatter.step({
  "line": 280,
  "name": "I should enter login url DP:LOGIN.URL",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 281,
  "name": "I should Login to application with DP:LOGIN.LASTNAME , DP:LOGIN.CONSOVAID and DP:LOGIN.SSN",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 282,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 283,
  "name": "I should click on profile photo icon",
  "keyword": "And "
});
formatter.step({
  "line": 284,
  "name": "I should click on profile from popup",
  "keyword": "And "
});
formatter.step({
  "line": 285,
  "name": "I should check the Authorized Caller table",
  "keyword": "And "
});
formatter.step({
  "line": 286,
  "name": "I should check the grid with caller name, relationship, Authorized Date and Expiration date",
  "keyword": "And "
});
formatter.step({
  "line": 287,
  "name": "I should click on Add caller button displayed",
  "keyword": "And "
});
formatter.step({
  "line": 288,
  "name": "I should enter the caller name and select relationship in dropdown in popup dialog box DP:PROFILE.CALLERNAME",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 289,
  "name": "I should click on Save button in popup dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 290,
  "name": "I should click on OK button in popup",
  "keyword": "And "
});
formatter.step({
  "line": 291,
  "name": "I should check the callername saved for authorized caller",
  "keyword": "And "
});
formatter.step({
  "line": 292,
  "name": "I should check and click the renew button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 293,
  "name": "I should click on confirm button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 294,
  "name": "I should click the remove button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 295,
  "name": "I should click on cancel button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 296,
  "name": "I should check the callername saved for authorized caller",
  "keyword": "And "
});
formatter.step({
  "line": 297,
  "name": "I should click the remove button in respective caller",
  "keyword": "And "
});
formatter.step({
  "line": 298,
  "name": "I should click on confirm button in popup window",
  "keyword": "And "
});
formatter.step({
  "line": 299,
  "name": "I should check the callername is removed from authorized caller",
  "keyword": "And "
});
formatter.step({
  "line": 300,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.URL",
      "offset": 25
    }
  ],
  "location": "HomePageSteps.iShouldEnterLoginUrlURL(String)"
});
formatter.result({
  "duration": 685881295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.LASTNAME",
      "offset": 35
    },
    {
      "val": "DP:LOGIN.CONSOVAID",
      "offset": 55
    },
    {
      "val": "DP:LOGIN.SSN",
      "offset": 78
    }
  ],
  "location": "HomePageSteps.iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String,String,String)"
});
formatter.result({
  "duration": 9637656825,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnLoginButtonFromLoginScreen()"
});
formatter.result({
  "duration": 156149195,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnProfilePhotoIcon()"
});
formatter.result({
  "duration": 10140785848,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnProfileFromPopup()"
});
formatter.result({
  "duration": 5196321430,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckTheAuthorizedCallerTable()"
});
formatter.result({
  "duration": 5028270997,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckTheGridWithCallerNameRelationshipAuthorizedDateAndExpirationDate()"
});
formatter.result({
  "duration": 5107980083,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnAddCallerButtonDisplayed()"
});
formatter.result({
  "duration": 5136031823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:PROFILE.CALLERNAME",
      "offset": 87
    }
  ],
  "location": "HomePageSteps.iShouldEnterTheCallerNameAndSelectRelationshipInPopupDialogBox(String)"
});
formatter.result({
  "duration": 13291448912,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnSaveButtonInPopupDialogBox()"
});
formatter.result({
  "duration": 5126853747,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnOKButtonInPopup()"
});
formatter.result({
  "duration": 5103716823,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckTheCallernameSavedForAuthorizedCaller()"
});
formatter.result({
  "duration": 5017174642,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckAndClickTheRenewButtonInRespectiveCaller()"
});
formatter.result({
  "duration": 5147582867,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShoulClinkOnConfirmButtonInPopupWindow()"
});
formatter.result({
  "duration": 6175946233,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickTheRemoveButtonInRespectiveCaller()"
});
formatter.result({
  "duration": 5154569911,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnCancelButtonInPopupWindow()"
});
formatter.result({
  "duration": 6067039665,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckTheCallernameSavedForAuthorizedCaller()"
});
formatter.result({
  "duration": 5016846531,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickTheRemoveButtonInRespectiveCaller()"
});
formatter.result({
  "duration": 5191666304,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShoulClinkOnConfirmButtonInPopupWindow()"
});
formatter.result({
  "duration": 5863049468,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckTheCallernameIsRemovedFromAuthorizedCaller()"
});
formatter.result({
  "duration": 5049818373,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldLogoffFromLoginScreen()"
});
formatter.result({
  "duration": 7155720320,
  "status": "passed"
});
formatter.after({
  "duration": 172919,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 307,
  "name": "EVS-557-As a user, I should see upload documents menu item",
  "description": "",
  "id": "home-page;evs-557-as-a-user,-i-should-see-upload-documents-menu-item",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 306,
      "name": "@EVS-557"
    }
  ]
});
formatter.step({
  "line": 308,
  "name": "I should enter login url \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 309,
  "name": "I should Login to application with \u003clastName\u003e , \u003cconsovaId\u003e and \u003csSN\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 310,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 311,
  "name": "I should click on Upload documents icon in menubar",
  "keyword": "And "
});
formatter.step({
  "line": 312,
  "name": "I should check upload icon is disabled till document upload",
  "keyword": "And "
});
formatter.step({
  "line": 313,
  "name": "I should select desired document by Browse icon",
  "keyword": "And "
});
formatter.step({
  "line": 314,
  "name": "I should click on remove document from pop dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 315,
  "name": "I should select desired document by Browse icon",
  "keyword": "And "
});
formatter.step({
  "line": 316,
  "name": "I should check the uploaded document in grid",
  "keyword": "And "
});
formatter.step({
  "line": 317,
  "name": "I should upload the document",
  "keyword": "And "
});
formatter.step({
  "line": 318,
  "name": "I should click on OK button in popup",
  "keyword": "And "
});
formatter.step({
  "line": 319,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.examples({
  "line": 321,
  "name": "",
  "description": "",
  "id": "home-page;evs-557-as-a-user,-i-should-see-upload-documents-menu-item;",
  "rows": [
    {
      "cells": [
        "URL",
        "lastName",
        "consovaId",
        "sSN"
      ],
      "line": 322,
      "id": "home-page;evs-557-as-a-user,-i-should-see-upload-documents-menu-item;;1"
    },
    {
      "cells": [
        "DP:LOGIN.URL",
        "DP:LOGIN.LASTNAME",
        "DP:LOGIN.CONSOVAID",
        "DP:LOGIN.SSN"
      ],
      "line": 323,
      "id": "home-page;evs-557-as-a-user,-i-should-see-upload-documents-menu-item;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3418258,
  "status": "passed"
});
formatter.scenario({
  "line": 323,
  "name": "EVS-557-As a user, I should see upload documents menu item",
  "description": "",
  "id": "home-page;evs-557-as-a-user,-i-should-see-upload-documents-menu-item;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 306,
      "name": "@EVS-557"
    }
  ]
});
formatter.step({
  "line": 308,
  "name": "I should enter login url DP:LOGIN.URL",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 309,
  "name": "I should Login to application with DP:LOGIN.LASTNAME , DP:LOGIN.CONSOVAID and DP:LOGIN.SSN",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 310,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 311,
  "name": "I should click on Upload documents icon in menubar",
  "keyword": "And "
});
formatter.step({
  "line": 312,
  "name": "I should check upload icon is disabled till document upload",
  "keyword": "And "
});
formatter.step({
  "line": 313,
  "name": "I should select desired document by Browse icon",
  "keyword": "And "
});
formatter.step({
  "line": 314,
  "name": "I should click on remove document from pop dialog box",
  "keyword": "And "
});
formatter.step({
  "line": 315,
  "name": "I should select desired document by Browse icon",
  "keyword": "And "
});
formatter.step({
  "line": 316,
  "name": "I should check the uploaded document in grid",
  "keyword": "And "
});
formatter.step({
  "line": 317,
  "name": "I should upload the document",
  "keyword": "And "
});
formatter.step({
  "line": 318,
  "name": "I should click on OK button in popup",
  "keyword": "And "
});
formatter.step({
  "line": 319,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.URL",
      "offset": 25
    }
  ],
  "location": "HomePageSteps.iShouldEnterLoginUrlURL(String)"
});
formatter.result({
  "duration": 487520293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.LASTNAME",
      "offset": 35
    },
    {
      "val": "DP:LOGIN.CONSOVAID",
      "offset": 55
    },
    {
      "val": "DP:LOGIN.SSN",
      "offset": 78
    }
  ],
  "location": "HomePageSteps.iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String,String,String)"
});
formatter.result({
  "duration": 9653124669,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnLoginButtonFromLoginScreen()"
});
formatter.result({
  "duration": 141038384,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnUploadDocumentsIconInMenubar()"
});
formatter.result({
  "duration": 15172300630,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckUploadIconIsDisabledTillDocumentUpload()"
});
formatter.result({
  "duration": 5024548264,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSelectDesiredDocumentByBrowseIcon()"
});
formatter.result({
  "duration": 7052416511,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnRemoveDocumentFromPopDialogBox()"
});
formatter.result({
  "duration": 5131804950,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldSelectDesiredDocumentByBrowseIcon()"
});
formatter.result({
  "duration": 7036456344,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckTheUploadedDocumentInGrid()"
});
formatter.result({
  "duration": 5027882552,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldUploadTheDocument()"
});
formatter.result({
  "duration": 114708371,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnOKButtonInPopup()"
});
formatter.result({
  "duration": 5100771604,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldLogoffFromLoginScreen()"
});
formatter.result({
  "duration": 7112857579,
  "status": "passed"
});
formatter.after({
  "duration": 78995,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 326,
  "name": "EVS-701-As a user, I should see menu bar on the left side of the page",
  "description": "",
  "id": "home-page;evs-701-as-a-user,-i-should-see-menu-bar-on-the-left-side-of-the-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 325,
      "name": "@EVS-701"
    }
  ]
});
formatter.step({
  "line": 327,
  "name": "I should enter login url \u003cURL\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 328,
  "name": "I should Login to application with \u003clastName\u003e , \u003cconsovaId\u003e and \u003csSN\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 329,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 330,
  "name": "I should check the icons in menubar",
  "keyword": "And "
});
formatter.step({
  "line": 331,
  "name": "I should click the sidebar collapse icon",
  "keyword": "And "
});
formatter.step({
  "line": 332,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.examples({
  "line": 334,
  "name": "",
  "description": "",
  "id": "home-page;evs-701-as-a-user,-i-should-see-menu-bar-on-the-left-side-of-the-page;",
  "rows": [
    {
      "cells": [
        "URL",
        "lastName",
        "consovaId",
        "sSN"
      ],
      "line": 335,
      "id": "home-page;evs-701-as-a-user,-i-should-see-menu-bar-on-the-left-side-of-the-page;;1"
    },
    {
      "cells": [
        "DP:LOGIN.URL",
        "DP:LOGIN.LASTNAME",
        "DP:LOGIN.CONSOVAID",
        "DP:LOGIN.SSN"
      ],
      "line": 336,
      "id": "home-page;evs-701-as-a-user,-i-should-see-menu-bar-on-the-left-side-of-the-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8468673,
  "status": "passed"
});
formatter.scenario({
  "line": 336,
  "name": "EVS-701-As a user, I should see menu bar on the left side of the page",
  "description": "",
  "id": "home-page;evs-701-as-a-user,-i-should-see-menu-bar-on-the-left-side-of-the-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 325,
      "name": "@EVS-701"
    }
  ]
});
formatter.step({
  "line": 327,
  "name": "I should enter login url DP:LOGIN.URL",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 328,
  "name": "I should Login to application with DP:LOGIN.LASTNAME , DP:LOGIN.CONSOVAID and DP:LOGIN.SSN",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 329,
  "name": "I should click on Login button from Login screen",
  "keyword": "And "
});
formatter.step({
  "line": 330,
  "name": "I should check the icons in menubar",
  "keyword": "And "
});
formatter.step({
  "line": 331,
  "name": "I should click the sidebar collapse icon",
  "keyword": "And "
});
formatter.step({
  "line": 332,
  "name": "I should logoff from home screen",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.URL",
      "offset": 25
    }
  ],
  "location": "HomePageSteps.iShouldEnterLoginUrlURL(String)"
});
formatter.result({
  "duration": 258214270,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DP:LOGIN.LASTNAME",
      "offset": 35
    },
    {
      "val": "DP:LOGIN.CONSOVAID",
      "offset": 55
    },
    {
      "val": "DP:LOGIN.SSN",
      "offset": 78
    }
  ],
  "location": "HomePageSteps.iShouldLoginToApplicationWithLastNameConsovaIdAndSSN(String,String,String)"
});
formatter.result({
  "duration": 9555701037,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickOnLoginButtonFromLoginScreen()"
});
formatter.result({
  "duration": 130510857,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldCheckTheIconsInMenubar()"
});
formatter.result({
  "duration": 5218558304,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldClickTheSidebarCollapseIcon()"
});
formatter.result({
  "duration": 5119543258,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldLogoffFromLoginScreen()"
});
formatter.result({
  "duration": 7103226057,
  "status": "passed"
});
formatter.after({
  "duration": 49139,
  "status": "passed"
});
});
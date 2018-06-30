$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Adithya/eclipse-workspace/CUCUMBER_MAVEN/src/main/java/features/LoginCredentials.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verification of reset button with numbers of credential",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15,
      "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;;1"
    },
    {
      "cells": [
        "User1",
        "password1"
      ],
      "line": 16,
      "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;;2"
    },
    {
      "cells": [
        "User2",
        "password2"
      ],
      "line": 17,
      "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;;3"
    },
    {
      "cells": [
        "User3",
        "password3"
      ],
      "line": 18,
      "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 286025,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verification of reset button with numbers of credential",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter the \"User1\" and \"password1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.match({
  "location": "guru.openChrome()"
});
formatter.result({
  "duration": 7805264824,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User1",
      "offset": 11
    },
    {
      "val": "password1",
      "offset": 23
    }
  ],
  "location": "guru.enter_the_and(String,String)"
});
formatter.result({
  "duration": 419242960,
  "status": "passed"
});
formatter.match({
  "location": "guru.reset_the_credential()"
});
formatter.result({
  "duration": 130782265,
  "status": "passed"
});
formatter.after({
  "duration": 151308,
  "status": "passed"
});
formatter.before({
  "duration": 248494,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verification of reset button with numbers of credential",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter the \"User2\" and \"password2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.match({
  "location": "guru.openChrome()"
});
formatter.result({
  "duration": 7009183989,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User2",
      "offset": 11
    },
    {
      "val": "password2",
      "offset": 23
    }
  ],
  "location": "guru.enter_the_and(String,String)"
});
formatter.result({
  "duration": 393000621,
  "status": "passed"
});
formatter.match({
  "location": "guru.reset_the_credential()"
});
formatter.result({
  "duration": 105382592,
  "status": "passed"
});
formatter.after({
  "duration": 226370,
  "status": "passed"
});
formatter.before({
  "duration": 229135,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verification of reset button with numbers of credential",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button-with-numbers-of-credential;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter the \"User3\" and \"password3\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.match({
  "location": "guru.openChrome()"
});
formatter.result({
  "duration": 6751518714,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User3",
      "offset": 11
    },
    {
      "val": "password3",
      "offset": 23
    }
  ],
  "location": "guru.enter_the_and(String,String)"
});
formatter.result({
  "duration": 302829468,
  "status": "passed"
});
formatter.match({
  "location": "guru.reset_the_credential()"
});
formatter.result({
  "duration": 79201881,
  "status": "passed"
});
formatter.after({
  "duration": 58469,
  "status": "passed"
});
});
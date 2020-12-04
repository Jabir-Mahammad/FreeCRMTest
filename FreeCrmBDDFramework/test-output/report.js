$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/SeleniumWorkspace/FreeCrmBDDFramework/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Applicationt teting",
  "description": "",
  "id": "free-crm-applicationt-teting",
  "keyword": "Feature"
});
formatter.before({
  "duration": 303200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate that Login feature",
  "description": "",
  "id": "free-crm-applicationt-teting;validate-that-login-feature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter uname and pwd",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Hooks.user_is_on_login_page()"
});
formatter.result({
  "duration": 238203800,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.enter_uname_and_pwd()"
});
formatter.result({
  "duration": 413300,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.click_on_login_button()"
});
formatter.result({
  "duration": 1153500,
  "status": "passed"
});
formatter.after({
  "duration": 109000,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Validate Home page",
  "description": "",
  "id": "free-crm-applicationt-teting;validate-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "verify the title",
  "keyword": "Then "
});
formatter.match({
  "location": "Hooks.user_on_home_page()"
});
formatter.result({
  "duration": 423000,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.verify_the_title()"
});
formatter.result({
  "duration": 4335800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Vlidate contacts page",
  "description": "",
  "id": "free-crm-applicationt-teting;vlidate-contacts-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "on contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Validate contacts name",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "free-crm-applicationt-teting;vlidate-contacts-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 20,
      "id": "free-crm-applicationt-teting;vlidate-contacts-page;;1"
    },
    {
      "cells": [
        "tom",
        "123@abc"
      ],
      "line": 21,
      "id": "free-crm-applicationt-teting;vlidate-contacts-page;;2"
    },
    {
      "cells": [
        "batchautomation",
        "Test@12345"
      ],
      "line": 22,
      "id": "free-crm-applicationt-teting;vlidate-contacts-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Vlidate contacts page",
  "description": "",
  "id": "free-crm-applicationt-teting;vlidate-contacts-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "on contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Validate contacts name",
  "keyword": "And "
});
formatter.match({
  "location": "Hooks.on_contact_page()"
});
formatter.result({
  "duration": 463700,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.validate_contacts_name()"
});
formatter.result({
  "duration": 417100,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Vlidate contacts page",
  "description": "",
  "id": "free-crm-applicationt-teting;vlidate-contacts-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "on contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Validate contacts name",
  "keyword": "And "
});
formatter.match({
  "location": "Hooks.on_contact_page()"
});
formatter.result({
  "duration": 125100,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.validate_contacts_name()"
});
formatter.result({
  "duration": 117600,
  "status": "passed"
});
});
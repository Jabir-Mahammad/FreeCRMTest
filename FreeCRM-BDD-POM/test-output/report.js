$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/SeleniumWorkspace/FreeCRM-BDD-POM/src/main/java/com/crm/qa/features/loginValidation.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Free CRM Application",
  "description": "",
  "id": "free-crm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 23,
  "name": "Free CRM Login Validation",
  "description": "",
  "id": "free-crm-application;free-crm-login-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user is on browser",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "validate that user is on login page",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user login the Application",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_browser()"
});
formatter.result({
  "duration": 27791577600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.validate_that_user_is_on_login_page()"
});
formatter.result({
  "duration": 54261500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_login_the_Application()"
});
formatter.result({
  "duration": 15954914400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.validate_home_page_title()"
});
formatter.result({
  "duration": 11784000,
  "status": "passed"
});
});
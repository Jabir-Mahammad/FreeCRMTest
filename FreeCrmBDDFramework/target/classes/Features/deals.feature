Feature: Free CRM Applicationt teting

@First
Scenario: Validate that Login feature
Given user is on login page
Then enter uname and pwd
Then click on login button

@Second
Scenario: Validate Home page
Given user on home page
Then verify the title

@Third
Scenario Outline: Vlidate contacts page
Given on contact page
And Validate contacts name

Examples:
    |username|password|
    |tom     |123@abc|
    |batchautomation|Test@12345|


 
Feature: Free CRM Login feature

#simple data ddriven without Example k/w

#Scenario: Free CRM login Test scenario 
#Given User is already on Logi Page
#When Titlee of the login page is Free CRM 
#Then user enters "batchautomation" and user enters "Test@12345"
#Then user click on Loin button  
#Then user is on Home page

#data driven with example k/w
Scenario Outline: Free CRM login Test scenario 
Given User is already on Logi Page
When Titlee of the login page is Free CRM 
Then user enters "<username>" and user enters "<password>"
Then user click on Loin button  
Then user is on Home page

Examples:
    |username|password|
    |tom     |123@abc|
    |batchautomation|Test@12345|
    


Feature: Free CRM Login data table

Scenario: Valid Login 
Given User is on CRM login page
When User enters Credentials
 | corpdevops@gmail.com |CrmPro123 | 
Then Close the Browser
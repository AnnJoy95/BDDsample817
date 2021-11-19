Feature: Free CRM Login data table with Hashmap

Scenario: Valid Login 
Given User is on CRM login page
When User enters Credentials for hashmap
 | username |password | 
 | corpdevops@gmail.com |CrmPro123 | 
Then Close the Browser
Feature: Contat Management

Scenario: Create a Contact
Given CRM User is on login page
When User enters login credentials
      | username  | password | 
      | corpdevops@gmail.com |CrmPro123 | 
Then Navigate to contact page
And user click to contact page
      
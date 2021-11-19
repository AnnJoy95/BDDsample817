Feature: Free CRM Login

Scenario Outline: Valid Login 
Given User is on CRM login page
When User enters "<username>" and "<password>"
Then Close the Browser

    Examples: 
      | username  | password | 
      | corpdevops@gmail.com |CrmPro123 | 
      | ann@gmail.com |armPro123 | 
      
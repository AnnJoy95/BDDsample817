@phaseone
Feature: CRM contact Management
Background: User Login
Given User must be logged in

Scenario: Create a new contact
When Contact is created
@RegressionTest
Scenario: Update a contact
And Contact must be available
When Contact is updated
@Smoketest
Scenario: View contact details
And Contact must be available
When user view the contact details

@RegressionTest
Scenario: Delet Contact
And Contact must be available
When user delete contact

Scenario: Logout App
When User logout app
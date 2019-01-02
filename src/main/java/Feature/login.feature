Feature: Free CRM login feature

#without EXAMPLES KEYWORD
#Scenario: Free CRM login test scenario
#
#Given User is already on Login page
#When title of login page is Free CRM
#Then User enters "knowledgebase86" and "FreeCRM123$"
#Then User clicks on login button
#Then user is on home page

#with EXAMPLES KEYWORD
Scenario Outline: Free CRM login test scenario

Given User is already on Login page
When title of login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then user is on home page

Examples:
|username|password|
|knowledgebase86|FreeCRM123$|
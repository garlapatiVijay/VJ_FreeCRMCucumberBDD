Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given User is already on Login page
When title of login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

Examples:
	| username | password | firstname | lastname | position |
	| knowledgebase86 | FreeCRM123$ | knowledge	  | Base    | Manager  |
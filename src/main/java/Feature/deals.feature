Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given User is already on Login page 
	When title of login page is Free CRM 
	Then User enters username and password 
		| knowledgebase86 | FreeCRM123$ |
		
	Then User clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details 
		| test deal | 1000 | 50 | 10 |
		
	Then Close the browser
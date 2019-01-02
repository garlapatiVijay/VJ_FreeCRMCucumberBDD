Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given User is already on Login page 
	When title of login page is Free CRM 
	Then User enters username and password 
		| username | password |
		| knowledgebase86 | FreeCRM123$ |
		
	Then User clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details 
		| title | amount | probability | commission|
		| test deal1 | 1000 | 10 | 10 |
		| test deal2 | 2000 | 20 | 20 |
		| test deal3 | 3000 | 30 | 30 |
	Then Close the browser
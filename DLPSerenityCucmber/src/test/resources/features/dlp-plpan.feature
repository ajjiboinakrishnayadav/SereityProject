Feature: User performed DLP PL end to end jounery 

@DLPPL-RegressionTesting-consumercibilPan 
Scenario: As a user, he perform DLP PL end to end jounery

	Given user navigate to the DLP PL URL page
	And user enters username with "rmUser1" 
	And user enters password with "Jocata@111" 
	And user clicks login button
    Then taskboard page should be displayed
	When the user clicks on newapplication link
	Then New application submission form displayed 
	And user enters in  mobile number with "9030828504" 
	And user enters Pan number from Database 
	And user clicks on the state dropdown
	And user selects the state as TELANGANA
	And user clicks on the city dropdown
	And user selects the city as HYDERABAD
	And user clicks on the submit button
	Then user must able to see the application form screen
	When user click on application overview link
	Then Application id is dispalyed in overview screen
	And the page redirected to the application form screen
	And user fill the personal details
	And user fill the address details 
	And user fill the companyaddress details 
	And user verify the coapplicant and click and save and continue button
	And user fill the loan details 
	And user uploads some docments
	And user fill the pricingadcharges
	When the user logged in as CPA user
	Then CPA user perform actions
	And User perform actions on RM,FI,CM user levels
	
	
	
	
	
	
	
	 
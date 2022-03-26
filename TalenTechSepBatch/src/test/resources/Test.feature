@talentech
Feature: User able to successfully login to Orange HRM application 
Scenario: successful login to Orange HRM 
	Given user go to Orange HRM home page 
	When user type user name into the user name field 
	And user type password into the password field 
	Then user click on the login button 
	And user verify page title as "Orange HRM"
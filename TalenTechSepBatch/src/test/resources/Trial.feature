@talentech
Feature: test
Scenario: trial
	Given user go to Orange HRM home page 
	When user type user name into the user name field 
	And user type password into the password field 
	Then user click on the login button 
	And user verify page title as "OrangeHRM"
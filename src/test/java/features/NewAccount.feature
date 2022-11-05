Feature: Techfios bank and cash New Account Functionality 

Scenario: User should be able to login with valid credentials and open a new account	
	Given User is on the techfios login page for add account
	When User enters the username as "<username>" 
	When User enters the password as "<password>"
	And User clicks on signin button
	Then User should land on Dashboard page 
	And User clicks on bankcash link
	And User clicks on newaccount link
	And User enters accountTitle as "<accountTitle>"
	And User enters description as "<description>" 
	And User enters initialBalance as "<initialBalance>"
	And User enters accountNumber as "<accountNumber>"
	And User enters contactPerson as "<contactPerson>" 
	And User enters phoneNumber as "<phone>"
	And User enters internetBankingUrl as "<internetBankingURL>" 
	And User clicks on newaccount button
	Then User should be able to validate account created successfully
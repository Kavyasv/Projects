@account
Feature: Create different new Account
 Create Accounts like savings,current,Rd and FD

	Scenario Outline: Create different account
		Given customer details and opening balance
		When for valid cutomer with minimum opening balance <value> 
		Then create new <accountType> account	
		
	Examples:
	|accountType|value|
	|savings		|1000	|
	|current		|10000|
	|RD					|100	|
	|FD					|500	|
		
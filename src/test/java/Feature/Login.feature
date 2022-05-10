@contactAndPloicy
Feature: This file contains scenario related to login
Scenario: : To verify user is able to login successfully 
	Given user is a login page 
	When  user enters username as "test" and password as "test" 
	And   click on Login 
	Then  Invalid credentials message should be displayed
	When  user enters username as "Admin" and password as "admin123"
	And   click on Login 
	Then  It should be Redirected to HomePage
Feature: This file contains scenario related to paytm

Scenario: verify Paytm 
Given user is at paytm Page
When Selecting metro tab from list
And Enter Metro type details
And Enter Ticket Type details
And Enter Card Number
And Click on Get Card Balance Button
Then verify it is redirected to paytm web account
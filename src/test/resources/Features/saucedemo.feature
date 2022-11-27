@E2E
Feature: User has to order the products and print bill on console

Scenario:
To user has to place a product through valid id credential
Given The user should be in varified page
When user pass the username "standard_user" and password "secret_sauce" and click login btn
And User add a some products on homepage
And user click add icon button
And user click the check btn
And User click the continue btn for next billing section 
And User pass the firstname,lastname and pincode options
   |manikandan|manimaddy|600081|
And user click the btn
And user print in console bill
Then user scrolldown and click finish button   


Scenario:
To pass the invalid user and password to check software design

Given The user should be in varified page
When user pass the username "standaruser" and password "secresauce" and click login btn
Then to check assert current url and assert verification










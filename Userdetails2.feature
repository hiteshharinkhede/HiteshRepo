
Feature: fetching User Details
Scenario: testing the get call for User Details
 
Given url 'https://reqres.in/api/users'
When method GET
Then status 201

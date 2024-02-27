Feature: To verify delet request

Scenario: 
Given url "https://restful-booker.herokuapp.com/booking/1"
When method delet
Then status 201

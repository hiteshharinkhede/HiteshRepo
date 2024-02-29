Feature: To verify delete request

Scenario: delete the recource from database
Given url 'https://restful-booker.herokuapp.com/booking/1'
When method delete
Then status 201

Feature: to get the data from server by get call

Scenario: to test the get call

#Given  url 'https://gorest.co.in/public/v2/users'
#And path 2057
#When method GET
#Then status 200
#* def jsonResponse = response
#* print response
#* match response.id == 2057

Scenario: to test the get call 
* def query = {status:active, gender:male}
Given url 'https://gorest.co.in/public/v2/users'
And params  query
When method GET
Then status 200
* def jasonObject = response
* print response


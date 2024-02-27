Feature: To verify patch request 

Background: 
* def requestBody =
"""
{

"firstname" : "James",
"lastname" : "Brown"

}

"""

Scenario: 
Given url "https://restful-booker.herokuapp.com/booking/1"
And request requestBody
When method put
Then staus 200
* def  responseBody  = response
* print responseBody 
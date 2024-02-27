Feature: to verify the resource at database created or not

Background: 
 
  * def requestBody  = 
  """
  {
    "name": "hitesh",
    "job": "leadership"
}
  
  
  
  """

Scenario:
Given url 'https://reqres.in/api/users'
And request requestBody

When method post
Then status 201

* def responseBody = response

* print response
* match response.name == 'hitesh'
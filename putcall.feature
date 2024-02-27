Feature: to test put call

Background:
  * def requestbody =
  """
  {
  "status":"active"
  
 
  }

"""

  * def  tokenid = '1ba7f1b03795de8e428c33fec80fec13704a0d50259f2eefe6cdfb4b97e81ce1'



Scenario: to test the api by put call

Given url 'https://gorest.co.in/public/v2/users/2065'
And request requestbody
And header Authorization = 'Bearer '+ tokenid
When method put
Then status 200
* def responsebody = response
* print response


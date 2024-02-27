Feature: to test post call
Background: 
* def requestBody =
     """
     {
     
     "name": "hitesh",
    "job": "leader"
     
     
     }
     
     """
     Scenario: to test post call
     Given url "https://reqres.in/api/users"
     And request requestBody
     When method post
     Then status 201
       * def responseBody = response
       * print responseBody
Feature: Get requist analysis for api

Scenario:

Given url 'https://reqres.in/api/users'
And path '2'
When method Get 
Then status 200

* print response
* def jsonResponse = response
* print jsonResponse
* print jsonResponse.data.id
* def  id =  jsonResponse.data.id
* match id == 2

Scenario: to check the headers for given api

* configure  requist_headrs ={Content-Type:'application/json',User-Agent:'PostmanRuntime/7.32.3',Connection:'keep-alive'}

 
 
 When  url 'https://reqres.in/api/users'
And path '2'
When method Get 
Then status 200


Feature: to test api by post call

Background:
   * def requestbody =  read('classpath : src/test/resources/com.karate/user.json')
  

   * def tokenid = '1ba7f1b03795de8e428c33fec80fec13704a0d50259f2eefe6cdfb4b97e81ce1'


Scenario:
  Given url 'https://gorest.co.in/public/v2/users'
  And request  requestbody
  And header Authorization = 'Bearer '+tokenid
  When method post
  Then status 201
  * def response_body = response
  * print response_body
 Feature: To verify postcall request
 
 Background: 
 *def request_body = 
 """
 {
 "username" : "admin",
   "password" : "password123"
 
 
 }
 """
 
 Scenario: 
 Given url "https://restful-booker.herokuapp.com/auth
 And request request_body
 When method post
 Then status 200
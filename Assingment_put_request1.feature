Feature: To verify put request


Background: 
*def requestBody =
"""
{
"firstname " : "James",
"lastname" : 'Brown",
"totalprice" : 111,
"depositpaid" : true,
"bookingdates" :{
"checkin" :"2018-01-01",
"ckeckout" : "2019-01-01"
},

"adsitionalneeds" : 'Breakfast"
}

"""




Scenario: 
Given url "https://restful-booker.herokuapp.com/booking/1"
And request requestBody
When put
Then staus 200
* def responseBody = response
* print response







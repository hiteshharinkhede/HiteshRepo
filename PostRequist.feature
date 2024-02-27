Feature: Creat users inn database by using post requist

Background: 
* def tokenid = '1ba7f1b03795de8e428c33fec80fec13704a0d50259f2eefe6cdfb4b97e81ce1'
* url 'https://gorest.co.in'
*  def requestPayload = 
  """
  {
    "name": "hitesh Jha",
    "email": "hitesh29@kessler.test",
    "gender": "male",
    "status": "inactive"
}
  
  """
  Scenario: To test the post requist
  Given path '/public/v2/users '
  And   request requestPayload
  And header Authorization = 'Bearer '+ tokenid
  When method post
  Then status 201
  * def jsondata = response  
    * print jsondata
    *  def  id = jsondata.id
    * match id == 1580781 
    *  def gender = jsondata.gender
    * print gender 
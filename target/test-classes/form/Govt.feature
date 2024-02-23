#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Indian Registration portal form

  @tag2
  Scenario Outline: To verify the Registation form
    Given User opens the browser and navigate to the india Registration  form website
    When user enters the "<username>","<E-mail address>"
    And enters the "<FirstName>","<LastName>","<PinCode>"
    And select the drop downs "<Country>","<State>","<Education>"
    And  provide "<captcha>" and clicking  the radio button
    Then click on submit button 

    Examples: 
      | username  |E-mail address      |FirstName  |LastName|PinCode |Country |State           |Education                        |captcha |
      | Afreen    |afreen123@gmail.com | shaik     |Afreen  |558360  |India   |Assam           | Higher Secondary Education      | 2Qn34A |
      | Ayesha    |ayesha123@gmail.com | Ayesha    |Shaik   |676767  |India   |Bihar           | Vocational                      | 72wZ&A |
      | munni     |munni123@gmail.com  | shaik     |munni   |543645  |India   |Chhattisgarh    |  Secondary Education            |8Qn34A  | 
      | mayara    |mayara123@gmail.com | mayara    |Shaik   |676767  |India   | Telangana      |  Graduate/Post Graduate-General | 6h8h7f |
      | muskan    |mussu123@gmail.com  | Muskan    |Shaik   |676767  |India   | Uttarakhand    |Elementary Education             |h6546g  |                                  
     

Feature: feature file



  #Scenario: verify desktop product is ordered under computer section
    #Given user can able to enter into home page
    #And user can login with valid credentials
    #When user navigates to computers page and click desktop window
    #And user click add to cart
    #When user select ram hdd and click add to cart
    #And user checkout the product
    #Then product is ordered
    #
    #Scenario: verify size drop down is visible for any product selected
#Given user can able to enter into home page
#And user can login with valid credentials
#When user navigate the apparel and click the shoes	
#Then check the visibility of size drop down

Scenario: verify email is sent in add cart screen for any product
Given user can able to enter into home page
And user can login with valid credentials
When user navigate the electronis and click the camera and photo
And user click the add cart	
Then user click the email a friend and enter the both mail id  and optional message
And verify the email has been sent
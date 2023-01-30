Feature: verify the email 


Scenario: verify email is sent in add cart screen for any product
Given user can able to enter into home page
And user can login with valid credentials
When user navigate the electronis and click the camera and photo
And user click the add cart	
Then user click the email a friend and enter the both mail id  and optional message
And verify the email has been sent

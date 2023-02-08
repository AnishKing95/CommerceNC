Feature: feature file

Scenario: verify review is written for any product
Given user can able enter into home page
And user can login with valid credentials
And  any book screen
When user add the review
Then user can be able to see the review message

Scenario: verify tha message the product has been added to your wishlis in add to card screen on any product
Given user can able enter into home page
And user can login with valid credentials
When user naviget to books and user click add to wishlist
Then user verify the wishlist cart


Scenario: verify the meassage "the new address has been added successfully ." in address page.
Given user can able enter into home page
And user can login with valid credentials
And users can be navigate to the addresses
And users add new click
When users Add new address page 
Then check the verify message in The new address has been added successfully.


Scenario: verify notebook product is ordered under comuter section.
Givenuser can able enter into home page
Anduser can login with valid credentials
Anduser can be navigate to the computer and notebook
Whenuser to the click of checkout
Thenuser show the Your order has been successfully processed message.

Scenario: verify camara product is ordered under electronics selection
Given user can able to enter into home page
And user can login with valid credentials
When  user can be navigate to the Electronics and user click the camara & photo of add to cart 
And user Add new address page
Then user verify Your order has been successfully processed message in showing






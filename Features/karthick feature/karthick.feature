Feature: NopeCommerce

Scenario: Verify shoes product is ordered under apparel section

Given user can able to enter into home page
And user can login with valid credentials
When user navigates to apparel page
And user click the shoes and select adidas shoe
And user select the size and click addtocart
And user click shopping cart and continue with terms and condition checkout
And user provide the valid address and continue with conformations
Then user verify the success message

#Scenario: Verify the success message in gift card section when a gift card is add to cart
#
#Given user can able to enter into home page
#And user can login with valid credentials
#When user navigates to gift card page
#And user click the virtual card add to cart button
#When user navigates to add to cart page
#And user fill the valid credentials in the given forms
#Then user verify message



#Scenario: Verify the message The product has been added to your shopping cart in jewelry section rent screen
#
#Given user can able to enter into home page
#And user can login with valid credentials
#When user navigates to jwelry page
#And click elegant gemstone necklace rent
#And user select start date end date and click rent
#Then user verify the final message

#Scenario: Verify sort by drop down is visible for any product selected
#
#Given user can able to enter into home page
#And user can login with valid credentials
#When user navigates to electronic page
#And click phone icon
#Then user lands on cell phones page



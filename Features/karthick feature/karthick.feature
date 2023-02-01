Feature: NopeCommerce

Scenario: Verify the message The product has been added to your shopping cart in jewelry section rent screen

Given user can able to enter into home page
And user can login with valid credentials
When user navigates to jwelry page
And click elegant gemstone necklace rent
And user select start date end date and click rent
Then user verify the final message

Scenario: Verify sort by drop down is visible for any product selected

Given user can able to enter into home page
And user can login with valid credentials
When user navigates to electronic page
And click phone icon
Then user lands on cell phones page



Feature: verify some functionality in nope commerce

Scenario: verify sample of any book is downloaded
Given user can able enter into home page
And user can login with valid credentials
When user navigates digital downloads and click add to cart
And user click download sample
Then file will downloaded
Feature: verify some functionality in nope commerce

Scenario: verify sample of any book is downloaded
Given user can able enter into home page
And user can login with valid credentials
When user navigates digital downloads and click add to cart
And user click download sample
Then file will downloaded

Scenario: verify desktop product is ordered under computer section
Given user can able to enter into home page
And user can login with valid credentials
When user navigates to computers page and click desktop window
And user click add to cart
When user select ram hdd and click add to cart
And user checkout the product
Then product is ordered
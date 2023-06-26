Feature: Ebay Search Box Functionalities

@Smoke
Scenario: Verifying ebay search box functionalities
Given I am in Ebay Landing Page
When I Type Toyota in search box
Then I Click In the search
Then I Click In Toyota Pickup DLX
Then I use childWindow method
Then I Enter another window
Then I verify that i am in second window page
Then I Back in landing page
Feature: Ordering Food Using Swiggy Application

Scenario: user Enter The Delivery Location
Given user Should Launch The Swiggy Application
When user Should Enter Location In Location Field
Then user Should Click The Find Food Button And It Redirects To Home Page

Scenario: searching And Adding The Food In Cart
When user Should Click Search Button 
And user Type The Dish Name In Search Food And Click Enter
And user Select A Dish And Click The Add Button 
Then click The Cart Button And It Redirects To Checkout Page

Scenario: user Should Login To The Account
When user Should Click Login Button 
And user Type The Phone Number In Number Field And Click Login
And user Type The Otp In Otp Field And Click Verify Otp
And user Choose The Address And Click Deliver Here Button
And user Click Pay Option In Pay Via Upi And Order will Be Placed

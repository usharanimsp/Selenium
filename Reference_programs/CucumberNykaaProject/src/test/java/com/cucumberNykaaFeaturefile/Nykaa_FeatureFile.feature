Feature: purchasing Product Using Nykaa Application

Scenario: user Signin With Mobile Number
Given user Should Launch The Application
When user Should Click The Signin button
Then user Should Click The Signin With Mobile button and Redirects To Verification Page

Scenario: user Signin With The Otp
When user Should Enter "8248965124" In Mobile Number Field
And click The Verify button Otp Will Be Sent To The Mobile Number
And enter The Otp In Console It Will Be Taken As Input In Otp Field
Then user Click The Verify button It Redirects to Home Page 

Scenario: user Should Select The Product From Categories 
When user Move To The Categories In The Home Page
Then user Select The Product and It Redirects To The Product Page

Scenario: select The Product and Add To Cart
When scroll The Page To The Product and Click Add To Bag Option
And user Click The Cart button and Product In Cart Appears
Then click The Proceed button It Redirects To Address Page

Scenario: user Should Add The Address Details In Address Page
When user Click New Address To Add Details
And user Enter The Area In Area Field
And user Enter The House No In House No Field
And user Enter The Pincode In Pincode Field
And user Enter The Email Id In Email Id Field
And user Enter The Name In Name Field
And user Enter The Mobile Number In Mobile Number Field
Then click Ship To This Address button and It Redirects To Payment Page

Scenario: user Should Place The Order
When user Select The Payment Method As Cash On Delivery
Then click The Place Order button And It Redirects To Order Confirmed Page


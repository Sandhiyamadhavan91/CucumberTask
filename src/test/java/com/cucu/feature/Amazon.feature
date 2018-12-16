Feature: Amazon Application end to end cases


Scenario: User verifies login functionality of the application 
Given User launch the chrome browser
When User hit the amazon application


Scenario Outline: User verifies signin with multiple user name and password
Given :Mouserover your order
And  Click the Signin Button
And Enter  the Emailaddress
And Click the Continue Button
And Enter the password

Examples:
    
   | Emailaddress |                Password|
   | msandhiya028@gmail.com|  password@123|

Scenario: User Selected the first Product
And Mouseover the category Button
And mouseover the Mobiles,computers subcategory button 
And Click the powerbank button
And Click the Intex power bank
And Click Add to cart Button

Scenario: User selected another product
Given Again mouseover the category button
When Mouseover TV Appliances,Electronics Subcategory
And Click the Speakers button
And Click Philips Speaker
And  Click Add to cart

Scenario: User selected Todays Deals products
Given  Click the Todays Deal option
And Click the Headset
And Click Add to Cart Button
And Click Cart Button


Scenario: User Selected Tv&Home Entertainment
Given: Mouseover the Tv&Home Entertainment
And Click Mi option
And Scroll down upto Mi Band 3
And Click the Mi Band product
And Click Add to cart Button
And Click Cart Button
Then Click the proceed to Checkout


   
   

  


 





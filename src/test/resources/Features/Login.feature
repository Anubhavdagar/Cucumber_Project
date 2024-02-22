Feature: login

Scenario: Successfully login with valid credential
Given User launch chrome browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enter email as "admin@yourstore.com" and password as "admin"
And User click on login button
Then Page Title should be displayed "Dashboard / nopCommerce administration"
When User click on logout button

#kjndjen
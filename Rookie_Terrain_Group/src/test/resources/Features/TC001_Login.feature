Feature: Login to the Application

Scenario Outline: Login with proper admin credentials
Given User Navigates to NopCommerce URL as <baseURL>
And Enter admin email id as <emailId>
And Enter admin password as <password>
When Click on Login button
Then Home page should be displayed

Examples:
|baseURL|emailId|password|
|https://admin-demo.nopcommerce.com/Admin|admin@yourstore.com|admin|
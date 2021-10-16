Feature: Adding Product 

Background: AdminLogin
Given User Navigates to NopCommerce URL as "https://admin-demo.nopcommerce.com/Admin"
And Enter admin email id as "admin@yourstore.com"
And Enter admin password as "admin"
When Click on Login button
Then Home page should be displayed

Scenario: Adding a new product
Given Click on Catalog
And Click on Product
And Click on Add New button
And Enter Product Name
And Enter SKU number
And Enter Product Price
And Enter Free Shipping
When Click on Save Button
Then Succefully added message should be driven


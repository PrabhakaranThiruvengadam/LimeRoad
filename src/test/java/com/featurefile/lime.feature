Feature: Limeroad order

Background:
Given Launch the browser "chrome"
When Launch the url "https://www.limeroad.com"

Scenario: To search a product for men
And Select Shop Men
And Place mouse on Home icon
And Click Bed Covers it navigates to Bed Covers page
And Click By Saral Home with price
And Click ADD TO CART to order the item
And Close browser

Scenario: To order T-Shirt
And click the element to select the T-Shirt
And Click Step Out In Style to navigates to collection of T-shirt
And Click on maroon solid t-shirt to select
And Click ADD TO CART to order the item
And Close browser

Scenario: To order Jeans
And click the element to select the Jeans pant
And Click on Mid Rice Jeans it navigates to types of Jeans
And Click on mid rise washed denim jean to select
And Click ADD TO CART to order the item
And Close browser
Feature: Login for leaftap application
Scenario Outline: Positive login flow
And Enter the username as <username>
And Enter the password as <password>
When Click on the login button
Then verify login is success
Examples:
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|
#@reg
#Scenario: Negative login flow
#And Enter the username as DemoCSR
#And Enter the password as crmsfa1
#When Click on the login button
#But login is fail






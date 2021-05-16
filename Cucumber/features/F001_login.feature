Feature: Login functionality of LeafTaps application

#Background:
#Given Open the Chrome Browser
#And Load application url 'http://leaftaps.com/opentaps/control/main'

@regression
Scenario Outline: TC001_Login with positive data
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then HomePage should be displayed

Examples:
|username|password|
|'DemoCSR'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@functional @smoke
Scenario: TC002_Login with negative data
Given Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa123'
When Click on Login button
But Error message should be displayed


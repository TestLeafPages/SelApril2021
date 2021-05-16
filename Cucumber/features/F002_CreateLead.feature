Feature: Create Lead functionality

#Background:
#Given Open the Chrome Browser
#And Load application url 'http://leaftaps.com/opentaps/control/main'

@functional
Scenario: TC003_Create Lead with manadatory info
Given Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed
When Click on crmsfa link
Then MyHomePage should be displayed
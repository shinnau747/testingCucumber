Feature: Functionality of changing background  


Scenario: 1 User should be able to change background color to blue
Given User is on the Testing101 page   
Given Set SkyBlue Background button exists 
When I click on the button
Then the background color will change to sky blue


Scenario: 2 User should be able to change background color to white
  
Given Set white Background button exists
When I click on the button two
Then the background color will change to white



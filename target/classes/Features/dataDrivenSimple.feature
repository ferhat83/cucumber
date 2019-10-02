Feature: facebook login feature using simple data driven


# without Examples key word
Scenario: facebook Login Test Scenario

Given User is already in login page
When title of login page is facebook logins
Then user enters "Saadi.Ferhat@live.fr" and "04142016"
Then user clicks on login button
Then user is in home page
Then close the browser 




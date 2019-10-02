Feature: facebook login feature using simple data driven

Scenario: facebook Login Test Scenario

Given User is already in login page
When title of login page is facebook logins
Then user enters username and password
| Saadi.Ferhat@live.fr | 04142016 |
Then user clicks on login button
Then user is in home page
Then close the browser
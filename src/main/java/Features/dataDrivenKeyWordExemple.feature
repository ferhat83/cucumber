Feature: facebook login feature using simple data driven


# with Examples keyword
Scenario Outline: facebook Login Test Scenario

Given User is already in login page
When title of login page is facebook logins
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is in home page
Then close the browser 


Examples:
# to Examples key word we need to change Scenario to Scenario Outline
# and add the parameters to the 3rd step in this example(line 9)
# add examples of username and password down here(using the parameters ex we gave before)
   | username | password | 
   | Saadi.Ferhat@live.fr | 04142016 |
   # the next step will fail because it's wrong username and pw
   | just an wrong ex | just wrong passWord |

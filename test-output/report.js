$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/saadi/eclipse-workspace/seleniumAutomation/CucumberBDDFramework/src/main/java/Features/dataDrivenTableMap.feature");
formatter.feature({
  "line": 1,
  "name": "facebook login feature using simple data driven",
  "description": "",
  "id": "facebook-login-feature-using-simple-data-driven",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "facebook Login Test Scenario",
  "description": "",
  "id": "facebook-login-feature-using-simple-data-driven;facebook-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is facebook logins",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "Saadi.Ferhat@live.fr",
        "04142016"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is in home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenTableMap.user_is_already_in_login_page()"
});
formatter.result({
  "duration": 10071351867,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenTableMap.title_of_login_page_is_facebook_logins()"
});
formatter.result({
  "duration": 15510583,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenTableMap.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 307053812,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenTableMap.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 29639268561,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenTableMap.user_is_in_home_page()"
});
formatter.result({
  "duration": 13150042,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenTableMap.close_the_browser()"
});
formatter.result({
  "duration": 778527098,
  "status": "passed"
});
});
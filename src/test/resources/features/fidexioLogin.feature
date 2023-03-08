Feature: User should be able to login with valid credentials

  Background: When user is on fidexio login page

  Scenario:
    Then user(sales) enters "salesmanager34@info.com" as username and "salesmanager" as password in fields.
    Then user(sales) should be on the dashboard


  Scenario:
    Then user(pos) enters "posmanager34@info.com" as username and "posmanager" as password in fields.
    Then user(pos) should be on the dashboard
Feature: Login
  Description : This features is use to test Login functionality.
  Scenario: Successful Login with valid credentials
    Given User is on Home Page
    When  User enters UserName and Password
    Then He can visit the practice page


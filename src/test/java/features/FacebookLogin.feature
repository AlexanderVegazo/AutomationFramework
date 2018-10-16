@facebookLogin
Feature: FacebookLoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given User navigate to the facebook login page
    When User fills in Email and Password
      | Email | Password |
      | alex  | User@    |
    Then User clicks on Log-In Button
Feature: Login and Logout

  Scenario: Login with valid credentials
    Given User is on home page
    When User clicks on sign in
    And User enters valid email and password
    And User clicks login
    Then User should be logged in successfully

  Scenario: Logout successfully
    Given User is logged in
    When User clicks logout
    Then User should be logged out successfully
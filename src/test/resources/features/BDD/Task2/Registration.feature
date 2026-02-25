Feature: User Registration

  Scenario: Register new user successfully
    Given User is on home page
    When User clicks on sign in
    And User enters email for registration
    And User clicks create account
    And User fills mandatory registration details
    And User submits registration
    Then User account should be created successfully
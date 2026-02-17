Feature: Login and Logout functionality
  Background:
    Given I am on the login page

  Scenario: Successful login with valid credentials
    When I enter valid username and password
    And I click the login button
    Then I should see the successful login message "You logged into a secure area!"

  Scenario: Unsuccessful login with invalid username or password
    When I enter invalid username and valid password
    And I click the login button
    Then I should see the error message "Your username is invalid!"

  Scenario: unsuccessful login with valid username and invalid password
    When I enter valid username and invalid password
    And I click the login button
    Then I should see the error message "Your password is invalid!"

  Scenario: Logout from the application
    When I enter valid username and password
    And I click the login button
    Then I should see the successful login message "You logged into a secure area!"
    When I click the logout button
    Then I should be redirected to the login page
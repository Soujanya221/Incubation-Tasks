Feature: Handling Popups & Alerts on demoqa.com
Background:
    Given I have a web browser open
  Scenario: Handle Alert 1 - Simple Alert
    When I click the button to trigger Alert 1
    Then I should see the alert with message "You clicked a button"
    And I accept the alert

  Scenario: Handle Alert 2 - Timed Alert
    When I click the button to trigger Alert 2
    Then I wait for the alert to appear
    And I should see the alert with message "This alert appeared after 5 seconds"
    And I accept the alert

  Scenario: Handle Alert 3 - Confirmation Alert
    When I click the button to trigger Alert 3
    Then I should see the alert with message "Do you confirm action?"
    And I dismiss the alert
    Then I should see the cancel message "You selected Cancel"

  Scenario: Handle Alert 4 - Prompt Alert
    When I click the button to trigger Alert 4
    Then I should see the alert with message "Please enter your name"
    When I enter "TestUser" in the alert
    And I accept the alert
    Then I should see the entered message "You entered TestUser"
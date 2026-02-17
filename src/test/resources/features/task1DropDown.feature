Feature: Select Menu Dropdowns

  Scenario: Select options from various dropdowns and verify selection
    Given I am on the Select Menu page
    When I select "Group 1, option 1" from the Modern Select dropdown
    And I select "Mr." from the Modern Select one dropdown
    And I select "Purple" from the Old Style Select Dropdown Menu
    And I select "Green" from the Multiselect dropdown
    And I select "Volvo" and "Saab" from the Standard multi select dropdown
    Then the correct options should be selected in all dropdowns
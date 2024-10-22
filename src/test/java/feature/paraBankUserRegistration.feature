Feature: Parabank User Account Management

  Scenario: User Registration
    Given I am on the Parabank registration page
    When I fill in "First Name" with "Tester"
    And I fill in Last Name with "Quality"
    And I fill in Address with "123 Main St"
    And I fill in City with "City of Tshwane"
    And I fill in State with "Gauteng"
    And I fill in Zip Code with "62701"
    And I fill in Phone # with "555-1234"
    And I fill in SSN with "123-45-6789"
    And I fill in Username with "john_QATester"
    And I fill in Password with "SecurePassword123"
    And I fill in Confirm with "SecurePassword123"
    When I click "Register"
#    Then I should see "Your account was created successfully!"
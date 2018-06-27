Feature: Login to Clarinsusa

  Scenario: Successful login
    Given open login page
    When login and password are provided
    Then Check for successful login

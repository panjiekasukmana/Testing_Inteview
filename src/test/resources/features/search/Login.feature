Feature: Login

  Scenario: Succesfully Logged in
    Given  I Already Login In Page
    When I Input Username "standard_user"
    And I Input Password "secret_sauce"
    And I Click Login Button
    Then direct to inventory page
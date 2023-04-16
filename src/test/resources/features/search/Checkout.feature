Feature: Checkout

  Scenario: Checkout one item
    Given I already logged in
    When I'm on the inventory page
    And I click add to cart button on sauce labs back
    And I click on cart button
    Then Price same with inventorypage "$29.99"
    And I click checkout button
    And I am directed to checkout page
    And I input firstname with "Panji"
    And I input lastname with "Eka"
    And I input postal code with "57561"
    And I click on continue button
    And summary of checkout is appear product name "Sauce Labs Backpack"
    And I click finish button
    Then checkout process completed
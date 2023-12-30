Feature: this is background demo

  Background: User is logged in to saucedemo app
    Given User is accessing saucedemo app login page
    When User enter valid username and password
    Then User should be able to navigate to home page

  Scenario: Test menu items
    And click on breadcrumb icon
    Then User should be able to see the menu items

  Scenario: Verify add to cart functionality
    And click on Add to buttton
    Then Item should be added to the cart

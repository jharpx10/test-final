
Feature: Automation Practice commerce
@SelectProduct
  Scenario: User selects a product
    Given user is on automation practice web
    When  user clicks on product
    Then user will see selected product name on details page


@AddShoppingCart
  Scenario: User adds product to shopping cart
    Given user is on automation practice web
    When  user clicks on product
    And user clicks on add button
    Then user will see successfull message

  @ProceedToCheckout
  Scenario: User adds product to shopping cart and goes to checkout
    Given user is on automation practice web
    When  user clicks on product
    And user clicks on add button
    And  user clicks on proceed to checkout button
    Then user will see the same product price of product details page

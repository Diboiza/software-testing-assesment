Feature: Add Products to Cart

  Scenario Outline: Add two products to cart
    Given : I launch the swag labs website
    And : I enter a valid "<username>" and "<password>"
    Then : I should be successfully logged in
    And : I add two products to a cart
    And : I verify that the correct products are added and checkout
    And : I fill in my "<firstname>" and "<lastname>" and "<postalcode>"
    And : I click on continue
    And : I verify the total price
    And : I finish the order
    Then : My order should be completed


    Examples:
      |username     |password    |firstname|lastname|postalcode|
      |standard_user|secret_sauce|tshepo   |zondo   |1861      |
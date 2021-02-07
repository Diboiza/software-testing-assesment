Feature: Login to Swag Labs

  Scenario Outline: Launch browser and login with username and password
    Given : I launch the swag labs website
    And : I enter a valid "<username>" and "<password>"
    Then : I should be successfully logged in

    Examples:
    |username     |password    |
    |standard_user|secret_sauce|
Feature: BigShop Search Product

  @Search
  Scenario Outline: Search for a Product
    Given I am on the BigShop homepage
    When I enter <product> into the search bar
    And I click the search button
    Then I should see a list of products

    Examples:
      | product   |
      | aspirator |
      | mop       |

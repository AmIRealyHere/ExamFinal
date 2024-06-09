#Feature: BigShop Website Testing
#
#  @Login
#  Scenario: Successful Login
#    Given I am on the BigShop login page
#    When I enter valid username and password
#    And I click the login button
#    Then I should be redirected to the homepage
#    And I should see a welcome message
#
#  @UnsuccessfulLogin
#  Scenario: Unsuccessful Login
#    Given I am on the BigShop login page
#    When I enter an invalid username or password
#    And I click the login button
#    Then I should see an error message
#
#  @Search
#  Scenario Outline: Search for a Product
#    Given I am on the BigShop homepage
#    When I enter <product> into the search bar
#    And I click the search button
#    Then I should see a list of products
#
#    Examples:
#      | product  |
#      | laptop   |
#      | friteuza |
#
#  @AddProduct
#  Scenario: Add a Product to the Cart
#    Given I am on the BigShop homepage
#    When I search for "phone"
#    And I add the first product to the cart
#    Then the product should be added to the cart
#    And I should see the cart updated with one item
#
#  @ContactUs
#  Scenario: Navigate to Contact Us Page
#    Given I am on the BigShop homepage
#    When I click on the "Contact Us" link
#    Then I should be redirected to the Contact Us page
#    And I should see the contact information

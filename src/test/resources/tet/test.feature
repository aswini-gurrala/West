Feature: adding items to the shopping cart



  Scenario Outline: Customer should be able to add item successfully into basket
    Given the customer is on home page
    When he chooses to add an "<item>" to the cart
    Then he should be able to do so with by "<clicking>" on the item and adding it to the to cart button
    And  the cart window opens with the item added
    Examples:

   |item            |clicking                                              |
   |Bhuna Spice Pot|//*[@id='item_list']/div[2]/div/div[1]/div/div[3]/a    |
   |Goan Spice Pot |//*[@id='item_list']/div[2]/div/div[1]/div/div[3]/a    |



Scenario: customer should not be able to add item to the basket with out required details
  Given the customer is on home page
  When he searches for an item
  And adds it to the basket before entering the required details
  Then the item should fail to be added to the cart


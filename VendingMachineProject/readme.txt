A vending machine has Products (snacks) stacked in "Product Slots". 
Each "Product Slot" is assigned with an ID which is TWO DIGIT number, and PRICE.
Vending machine has a "coin slot", which can take PENNY, NICKLE, DIME or QUATER only.

 

Vending machine has a keypad with following keys
* KEY 0 to 9 to pick Product Slot ID
* CLEAR is to clear your selection
* ENTER key is used to confirm your Product selection if credit is available
* DONE key is return any balance or deposited coins user can start a transaction by adding coins or by typing the "Product Slot" ID and pressing ENTER.

 

If there is a sufficient credit, dispense the Product, in case of insufficient credit,
 show the "Product" price. So, the user can drop coins for their selections.
  Upon ENTER, dispense the product if credit is available.  

 

Vending machine should expose admin operations
* Update inventory - load one or many Products (quantity) and Product Slot ID
* Update pricing - Set new price on any Product Slot ID. Vending machine should return current state (reporting):
* Inventory report - Print all "Product Slot" with no. of available product
* Sale report - Print sales - No. of Sales per Product and Money, and Total Sales.
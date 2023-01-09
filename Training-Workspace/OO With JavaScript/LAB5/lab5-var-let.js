//5. [var/let] For all the items whose price is greater than or equal to 200 add the discount of 10% to the price. And display the total number of item ordered

//Step1: Use 'queryslector' to get the item price (note: id is 'price-item')
//and to get the span for displaying total number of items (note: class name is '.total-item').
var itemPrices = document.querySelectorAll("#price-item");
var totalItem = document.querySelector(".total-item");

//Iterate through the price item and check if price is greater than or equal to 200.
for (var count = 0; count < itemPrices.length; count++) {
    if (parseInt(itemPrices[count].textContent) >= 200) {
    //Step2: If yes, then give a discount of 10%. (Item final price = Earlier Price - (0.1*Earlier Price)).
    var earlierPrice = parseInt(itemPrices[count].textContent);
    var finalPrice = earlierPrice - 0.1 * earlierPrice;
    //Step3: Change the ealier price with the new price.
    itemPrices[count].textContent = finalPrice;
}
}

totalItem.textContent = count; //Note: we are able to access 'var' outside its block

/// <reference path = "priceCalculator.ts"/>

let finalOrderPrice: number = priceCalculator.orderPrice(300, 12);

console.log(finalOrderPrice);

// tsc --target es6 app.ts --outfile out.js
// node out.js

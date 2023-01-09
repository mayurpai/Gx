const prompt = require("prompt-sync")();

let itemCode = prompt("Enter Item Code : ");
let itemDescription = prompt("Enter Item Description : ");
let quantity = prompt("Enter Quantity : ");
let itemPrice = prompt("Enter Item Price : ");
let payByCard = prompt("Do You Wish To Pay By Card: ");
let grandTotal = 0.0;
grandTotal = grandTotal + quantity * itemPrice;

if (grandTotal > 10000) grandTotal = grandTotal * 0.9;

if (grandTotal < 1000 && payByCard == "Yes")
  grandTotal = grandTotal + 2.5 * grandTotal;

console.log("Item Code : " + itemCode);
console.log("Item Description : " + itemDescription);
console.log("Grand Total : " + grandTotal);

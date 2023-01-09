const prompt = require("prompt-sync")();

let principal = prompt("Enter Principal: ");
let time = prompt("Enter Time: ");
let rate = prompt("Enter Rate: ");

let simpleInterest = (principal * time * rate) / 100;

console.log(`Simple Interest = ₹${simpleInterest}`);
console.log();

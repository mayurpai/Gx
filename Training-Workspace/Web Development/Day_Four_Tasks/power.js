const prompt = require("prompt-sync")();

let result = 1;

let base = prompt("Enter The Base: ");
let exponent = prompt("Enter The Exponent: ");

for (let index = 0; index < exponent; index++) {
  result *= base;
}

console.log(`${base}^${exponent} = ${result}`);

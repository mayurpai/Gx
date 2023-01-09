const prompt = require("prompt-sync")();

var tableOf = prompt("Enter Table Of: ");
for (let j = 1; j <= 10; j++) {
  console.log(tableOf + " * " + j + " = ", tableOf * j);
}
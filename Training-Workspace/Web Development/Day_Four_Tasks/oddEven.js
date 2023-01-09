const prompt = require("prompt-sync")();

let number = prompt("Enter A Number: ");
if (number % 2 === 0) {
  console.log(`${number} Is Even`);
} else {
  console.log(`${number} Is Odd`);
}
console.log();

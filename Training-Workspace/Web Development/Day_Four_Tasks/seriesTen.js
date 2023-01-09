const prompt = require("prompt-sync")();

let n = prompt("Enter The Value Of n: ");

let prev = 1;
for (let i = 0; i < n; i++) {
  let squareNumber = i * i;
  process.stdout.write(prev + squareNumber + " ");
  prev += squareNumber;
}
console.log();

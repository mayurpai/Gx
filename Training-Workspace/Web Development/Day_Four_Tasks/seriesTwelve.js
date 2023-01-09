const prompt = require("prompt-sync")();

let n = prompt("Enter The Value Of n: ");

let first = 1,
  second = 4,
  third = 7;
process.stdout.write(first + " ");
process.stdout.write(second + " ");
process.stdout.write(third + " ");
for (let i = 1; i <= n - 3; i++) {
  let sum = first + second + third;
  process.stdout.write(sum + " ");
  first = second;
  second = third;
  third = sum;
}
console.log();

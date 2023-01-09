const prompt = require("prompt-sync")();

let n = prompt("Enter The Value Of n: ");

let square = 1;
for (let i = 1; i <= n; i++) {
  for (let j = 1; j <= i; j++, square++) {
    if (square % 2 != 0) process.stdout.write(square * square + " ");
    else process.stdout.write("- " + square * square + " ");
  }
  console.log();
}

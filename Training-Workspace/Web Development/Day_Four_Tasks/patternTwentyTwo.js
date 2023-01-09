const prompt = require("prompt-sync")();

let n = prompt("Enter The Value Of n: ");

let k = 1;
for (let i = 1; i <= n; i++) {
  for (let j = 1; j <= n - i; j++) {
    process.stdout.write(" ");
  }
  for (let j = 1; j <= k; j++) {
    process.stdout.write("*");
  }
  k += 2;
  console.log();
}

const prompt = require("prompt-sync")();

let n = prompt("Enter The Value Of n: ");

let prev = 1;
process.stdout.write(prev + " ");
for (let i = 1; i <= n; i++) {
  prev = prev + i * 2;
  if (i % 5 == 0) continue;
  process.stdout.write(prev + " ");
}
console.log();

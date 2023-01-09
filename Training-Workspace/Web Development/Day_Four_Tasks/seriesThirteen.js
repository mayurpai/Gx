const prompt = require("prompt-sync")();

let n = prompt("Enter The Value Of n: ");

for (let i = 1; i <= n; i++) {
  if (i % 4 == 0) continue;
  process.stdout.write(i * i + " ");
}
console.log();

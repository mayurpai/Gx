const prompt = require("prompt-sync")();

let n = prompt("Enter The Value Of n: ");

for (let i = 2; i <= 2 * n; i += 2) {
  process.stdout.write(i * i + " ");
}
console.log();

const prompt = require("prompt-sync")();

let n = prompt("Enter The Value Of n: ");
let i = 1,
  j = 2,
  count = 1;
for (let k = 0; k < n; k++) {
  if (count % 2 != 0) {
    process.stdout.write(`${i} `);
    i += 3;
  } else {
    process.stdout.write(`${j} `);
    j += 4;
  }
  count++;
}

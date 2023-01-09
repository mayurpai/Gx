const prompt = require("prompt-sync")();

let n = prompt("Enter The Value Of n: ");

let firstNum = 0,
  secondNum = 1,
  thirdNum = 1;
for (let i = 1; i <= 10; i++) {
  process.stdout.write(thirdNum + " ");
  thirdNum = firstNum + secondNum;
  firstNum = secondNum;
  secondNum = thirdNum;
}
console.log();
const prompt = require("prompt-sync")();

let name = prompt("Enter The Name : ");
let subjectOne = Number(prompt("Enter The Subject 1 Marks : "));
let subjectTwo = Number(prompt("Enter The Subject 2 Marks : "));
let subjectThree = Number(prompt("Enter The Subject 3 Marks : "));
let total = subjectOne + subjectTwo + subjectThree;
let average = total / 3;
console.log("Name : " + name);
console.log("Total : " + total);
console.log("Average : " + average);
if (average >= 60) console.log("First Class");
else if (average >= 50) console.log("Second Class");
else if (average >= 35) console.log("Pass Class");
else console.log("Fail");

const prompt = require("prompt-sync")();

var name = prompt("Enter Your Name: ");
let person = {
  name: name,
  age: 22,
};
let fruits = ["🍇", "🍉", "🍊", "🍋", "🍌"];
console.log(fruits);
fruits.map((fruit) => console.log(fruit));

function Name(a) {
  console.log("Hello " + a);
}

const Names = (a) => console.log("Hello " + a);

Name("Mayur");
Names("Kiran");

// fruits.map(function(fruit) {
//   console.log(fruit)
// })



console.log(person);
console.log(`Hey, ${name}!`);
console.log(person.age);

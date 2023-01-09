// console.log("Hello!");

// var myName = 'Mayur'
// var myName = "Mayur";
// var myName = 'Mayur';

// var myName = "Mayur";
// var myAge = 21;
// var $USN = "4SF18IS053";
// var _dob = "19/11/1999";
// console.log(myName);
// console.log(myAge);
// console.log($USN);
// console.log(_dob);
// console.log(myName + " Is Of Type " + typeof myName);
// console.log(typeof myAge);

// var right = true;
// var wrong = false;
// console.log(right);
// console.log(typeof(right));
// console.log(wrong);
// console.log(typeof(wrong));

// var iAmUseless = null;
// console.log(iAmUseless);
// console.log(typeof(iAmUseless));

// var iAmStandBy;
// console.log(iAmStandBy);
// console.log(typeof(iAmStandBy));

// console.log(isNaN(myAge));
// console.log(isNaN(myName));
// console.log(NaN === NaN);
// console.log(isNaN(NaN));

// console.log(5+20);
// console.log(5*20);
// console.log(20/4);
// console.log(20%3);

// Let Vs Const Vs Var :

// Let & Const => Block Scope
// Var => Function Scope

// Template Literals (Or) Template Strings :

// for (var n = 1; n <= 10; n++) {
//   var tableNum = 9;
//   console.log(`${tableNum} * ${n} = ${tableNum * n}`);
//console.log(tableNum + " * " + n + " = " + tableNum * n);
// }

// function add(a, b) {
//   return `The Sum Of ${a} And ${b} = ${a + b}`;
// }
// console.log(add(5, 8));

// Fat Arrow Function :=+++
// const sum = (a, b) => {
//   return `The Sum Of ${a} And ${b} = ${a + b}`;
// };
// console.log(sum(6, 8));

// const mul = (a, b) => `The Product Of ${a} And ${b} = ${a * b}`;
// console.log(mul(2, 4));

// Arrays In JS :

// var myName = ["Mayur", "Pai", "B", "H"];
// console.log(myName);
// console.log(myName[0]);
// console.log(myName[1]);
// console.log(myName[2]);
// console.log(myName[3]);
// console.log(myName[myName.length - 4]);
// console.log(myName.length);

// for (var n = 0; n < myName.length; n++) {
//   console.log(myName[n]);
// }

// For In Loop Gives Iteration Value :
// for (let i in myName) {
//   console.log(i);
// }

// For Of Loop Gives Internal Value :
// for (let i of myName) {
//   console.log(i);
// }

// ForEach Loop :
// myName.forEach(function (i, index) {
//   console.log(`${i} In Index : ${index}`);
// });

// IndexOf (Searching From Forward) :
// console.log(myName.indexOf("Pai"));
// console.log(myName.indexOf("Pai", 2));

// LastIndexOf (Searching From Backwards):
// console.log(myName.lastIndexOf("Pai"));
// console.log(myName.lastIndexOf("Pai",3));

// Includes :
// console.log(myName.includes("Mayur"));
// console.log(myName.includes("Mayur",1));

// Find :
// console.log(myName.find((myName) => (myName = "Mayur")));
// console.log(myName.find((myName) => (myName = "BH")));
// Returns undefined

// FindIndex :
// console.log(myName.findIndex((myName) => (myName = "Mayur")));
// console.log(myName.findIndex((myName) => (myName = "BH")));
// Returns -1

// Filter :
// const priceTag = [1000, 200, 300, 400, 500, 600];
// const funExp = priceTag.filter((i, index, array) => {
//   return i < 300;
// });
// console.log(funExp);
// Returns Empty Array

// Sort (Only Works For Strings):
// const priceTag = [1000, 200, 300, 400, 500, 600];
// console.log(priceTag.sort());
// console.log(
//   priceTag.sort((a, b) => {
//     return a - b;
//   })
// );

// var myName = ["Mayur", "Pai", "B", "H"];
// console.log(myName.sort());

// Push :
// var animals = ["Cat", "Dog", "Rat"];
// console.log(animals);
// animals.push("Chicken", "Shark");
// console.log(animals);
// const count = animals.push("Whale");
// console.log(animals.sort());
// console.log(count);
// Returns The Array Length

// Unshift :
// animals.unshift("Bare");
// console.log(animals);
// var myNum = ["1", "2", "5"];
// myNum.unshift("3", "4");
// myNum.push("6", "7");
// console.log(myNum);
// Returns The Array Length

// Pop : (Last Element Delete)
// var myNum = ["1", "2", "5"];
// console.log(myNum);
// console.log(myNum.pop());
// console.log(myNum);
// console.log(myNum.pop());
// console.log(myNum);
// Returns The Popped Element

// Shift : (First Element Delete)
// console.log(myNum.shift());
// Returns The Popped Element

// Spice :
// var months = ["Jan", "Feb", "Mar", "Apr", "May"];
// const newMonth = months.splice(5, 0, "Jun");
// const newMonth = months.splice(months.length, 0, "Jun");
// console.log(months);
// Slice Returns The Total Elements Deleted ,
// If Not An Empty Array Is Returned
// const updateMonth = months.splice(2, 1, "Dec");
// console.log(months);
// const deleteMonth = months.splice(4, 1);
// console.log(months);
// console.log(deleteMonth);

// Map (Doesn't Alter The Original Array Instead Creates A New Array):
var num = [
  { id: "1", firstName: "Akshay", lastName: "Bhimraya", checkbox: "true" },
  { id: "2", firstName: "Ponnappa", lastName: "M", checkbox: "true" },
  { id: "3", firstName: "Akshay", lastName: "fulari", checkbox: "true" },
  { id: "5", firstName: "Yuvaraj", lastName: "Acharya", checkbox: "true" },
  { id: "6", firstName: "Mayur", lastName: "Pai", checkbox: true },
];
let array = num.map(function (i) {
  return `${i.firstName}`;
});
console.log(num);
console.log(array);

// var num = [1, 4, 9, 16, 25];
// let array = num.map((i) => Math.sqrt(i));
// console.log(num);
// console.log(array);

// Map Can Also Be Chained With reduce(),filter(),sort(), And So On
// let array = num.map((i) => i * 2).sort((a, b) => a - b);
// console.log(num);
// console.log(array);

// Reduce :
// let array = num
//   .map((i) => i * 2)
//   .sort((a, b) => a - b)
//   .reduce((acc, i) => (acc += i));
// console.log(num);
// console.log(array);

// Document Objeect Model (DOM) :

// 1. document.documentElement
// 2. document.head
// 3. document.body
// 4. document.style
// 5. document.body.childNodes
// 6. document.body.childElementCount
// 7. document.body.children
// 8. document.body.children.length
// 9. document.body.hasChildNodes()
// 10. document.body.firstChild
// 11. document.body.lastChild
// 12. document.body.firstElementChild
// 13. const divName = document.querySelector('.divName');
//         divName.style.color = 'Black';
// 14. document.body.parentElement
// 15. document.body.parentNode
// 16. document.body.nextSibling
// 17. document.body.previousSibling
// 18. document.body.nextElementSibling
// 19. document.body.previousElementSibling
// 20. document.getElementById('idName').innerHTML = 'Welcome!';
// 21. document.getElementsByClassName('className').innerHTML = 'Welcome!';
// 22. document.getElementsByTagName('tagName').innerHTML = 'Welcome!';
// 23. console.log(document.getElementsByClassName('className')); // Gives Class Member Count
// 24. console.log(document.getElementsByTagName('tagName'));
// 25. console.log(document.getElementsByName('name'));
// 26. document.querySelectorAll('#idName').innerHTML = "Welcome";
// 27. console.log(document.querySelectorAll('#idName'));
// 28. console.log(document.querySelectorAll('.className'));

// Events In JavaScript :

// 1.  onclick = "console.log("Mayur")";

// 2.  onclick = "name();";
//     const name = () => {
//     console.log("Mayur");
//     };

// 3.  const idName = document.getElementById(idName);
//     idName.onclick = function () {
//         console.log("Mayur");
//     }

// 4.  const forthWay = document.querySelector('#idName');
//     forthWay.addEventListener('click', () => {
//         console.log("Mayur");
//     })

//     Alternative :

//     const forthWay = document.querySelector('#idName');
//     forthWay.addEventListener('click', functionName)
//     functionName () => {
//         console.log("Mayur");
//     }

// Mouse Events :

// 1. onmouseenter
// 2. onmouseleave
// 3. onmousedown
// 4. onmouseout
// 5. onmousemove
// 6. onmousewheel
// 7. onmouseover
// 8. onmouseup
// 9. onmousedown

// Keyboard Events :

// 1. onkeypress
// 2. onkeydown
// 3. onkeyup

// event.key event.code

// Input Events :

// 1. onchange

// Timing Intervals : (Mostly Applied Over onClicks)

// 1. setTimeout :

// setTimeout(() => {
//   document.getElementById("idName").innerHTML = "Mayur Pai";
// }, 1000);

// 2. setInterval :

// setInterval(() => {
//     document.getElementById("idName").innerHTML = "Mayur Pai";
// }, 5000);

// 3. clearTimeout :

// clearTimeout(var)

// 4. clearInterval :

// clearInterval(var)

// Objects In JavaScript :

// 1. First Method :

//   let studentInformation = {
//   firstName: "Mayur",
//   lastName: "Pai",
//   usn: "4SF18IS053",
//   display: () => {
//     console.log(
//       `My Name Is ${studentInformation.firstName} ${studentInformation.lastName} And My USN Is ${studentInformation.usn}.`
//     );
//   },
// };

// console.log(studentInformation.firstName);
// console.log(studentInformation.lastName);
// console.log(studentInformation.usn);
// studentInformation.display();

// 2. Second Method :

// let studentInformation = {
//     firstName: "Mayur",
//     lastName: "Pai",
//     usn: "4SF18IS053",
//     display () {
//       console.log(
//         `My Name Is ${studentInformation.firstName} ${studentInformation.lastName} And My USN Is ${studentInformation.usn}.`
//       );
//     },
//   };

//   console.log(studentInformation.firstName);
//   console.log(studentInformation.lastName);
//   console.log(studentInformation.usn);
//   studentInformation.display();

// 3. Object Within A Object :

// let studentInformation = {
//    name : {
//     firstName: "Mayur",
//     lastName: "Pai",
//    }
//     usn: "4SF18IS053",
//     display () {
//       console.log(
//         `My Name Is ${studentInformation.name.firstName} ${studentInformation.name.lastName} And My USN Is ${studentInformation.usn}.`
//       );
//     },
//   };

//   console.log(studentInformation.name.firstName);
//   console.log(studentInformation.name.lastName);
//   console.log(studentInformation.usn);
//   studentInformation.display();

// This Object :

// This With Fat Arrow Function Gives Window As Output
// Within The Function We Can Ue this.variableName And Get It's Access.

// Destructuring :

// Array Destructuring :

// const myBioData = ["Mayur", "Pai"];
// let [firstName, lastName, usn = "4SF18IS053"] = myBioData;
// console.log(firstName);
// console.log(lastName);
// console.log(usn);

// Object Desrtucturing :

// const studentInformation = {
//   firstName: "Mayur",
//   lastName: "Pai",
//   usn: "4SF18IS053",
// };

// const { firstName, lastName, usn } = studentInformation;
// console.log(usn);

// Dynamic Object Properties :

// let firstName = "firstName";
// let studentInformation = {
//     [firstName]: "Mayur",
//     lastName: "Pai",
//     usn: "4SF18IS053",
//     [20+1] : "Age",
//     display () {
//       console.log(
//         `My Name Is ${studentInformation.firstName} ${studentInformation.lastName} And My USN Is ${studentInformation.usn}.`
//       );
//     },
//   };

// console.log(studentInformation);

// Spread Operator : (Works On Both Arrays And Objects)

// const color = ['Black','Red'];
// const newColor = ['Black','Red','Pink','Yellow'];
// const updatedColor = [...color,'Pink','Yellow'];
// console.log(updatedColor);
// console.log(newColor);

// Object Values & Object Entries : (For Loop Type)

// const info = {
//   firstName: "Mayur",
//   lastName: "Pai",
//   age: 21,
// };

// console.log(Object.values(info));
// console.log(Object.entries(info));
// console.log(Object.fromEntries(info));

// Closures:
// var fname = "Mayur";
// function outter() {
//   var lname = "Pai";
//   function inner() {
//     console.log(`${fname}`);
//     console.log(`${lname}`);
//   }
//   inner();
// }
// outter();

// function sayHelloExternal() {
//   alert("Say Hello External");
// }

// var global = "this is global";
// function scopeFunction() {
//   alsoGlobal = "This is also global!";
//   var notGlobal = "This is private to scopeFunction!";
//   function subFunction() {
//     alert(notGlobal); // We can still access notGlobal in this child function.
//   }
//   stillGlobal = "No var keyword so this is global!";
//   var isPrivate = "This is private to subFunction!";
//   alert(stillGlobal); // This is an error since we haven't executed subfunction execute subfunction
//   subFunction();
//   alert(stillGlobal); // This will output 'No var keyword so this is global!'
//   alert(isPrivate); // This generate an error since isPrivate is private to subfunction().
//   alert(global); // outputs: 'this is global'
// }
// alert(global); // outputs: 'this is global'
// alert(alsoGlobal); // generates an error since we haven't run scopeFunction yet.
// scopeFunction();
// alert(alsoGlobal); // outputs: 'This is also global!';
// alert(notGlobal); // generates an error.

// var myjson = {
//   name: "Tarkeshwar",
//   salaryPaid: true,
//   salary: 100,
//   laptop: {
//     brand: "Acer",
//     ram: "32GB",
//   },
// };
// console.logln("Employee Name " + myjson.name);
// console.logln("Employee salary " + myjson.salary);
// console.logln("Employee paid " + myjson.salaryPaid);
// console.logln("Employee paid " + myjson.laptop.brand);
// var myjsonList = [
//   {
//     name: "Mr. ABC",
//     salaryPaid: true,
//     salary: 100,
//     laptop: {
//       brand: "Acer",
//       ram: "32GB",
//     },
//   },
//   {
//     name: "Mr. KBC",
//     salaryPaid: true,
//     salary: 100,
//     laptop: {
//       brand: "Acer",
//       ram: "32GB",
//     },
//   },
//   {
//     name: "Mr XYZ",
//     salaryPaid: true,
//     salary: 100,
//     laptop: {
//       brand: "Acer",
//       ram: "32GB",
//     },
//   },
// ];
// console.logln("Employee Name(Zero Indexed) " + myjsonList[0].name);
// console.logln("Employee salary One index" + myjsonList[1].salary);
// console.logln("Employee paid 2 index" + myjsonList[2].salaryPaid);

// function doAddition(firstVar, secondVar) {
//   var first = firstVar || 5; // if the passed variables actually have a value
//   var second = secondVar || 10;
//   return first + second;
// }
// console.log("No Value " + doAddition());
// console.log("Only First Value " + doAddition(12));
// // console.log("Only Second Value " + doAddition(, 12));
// console.log("20 Both Value zero " + doAddition(null, null));
// //Common JavaScript

// var a = 2; // Bit presentation 10
// var b = 3; // Bit presentation 11
// var linebreak = "<br />";
// console.log("(a & b) => ");
// result = a & b;
// console.log(result);
// console.log(linebreak);
// console.log("(a | b) => ");
// result = a | b;
// console.log(result);
// console.log(linebreak);
// console.log("(a ^ b) => ");
// result = a ^ b;
// console.log(result);
// console.log(linebreak);
// console.log("(~b) => ");
// result = ~b;
// console.log(result);
// console.log(linebreak);

// var a = 2; // Bit presentation 10
// var b = 3; // Bit presentation 11
// var linebreak = "<br />";
// console.log("(a & b) => "); // only supported by web browser
// result = a & b;
// console.log(result);
// console.log(linebreak);
// console.log("(a | b) => ");
// result = a | b;
// console.log(result);
// console.log(linebreak);
// console.log("(a ^ b) => ");
// result = a ^ b;
// console.log(result);
// console.log(linebreak);
// console.log("(~b) => ");
// result = ~b;
// console.log(result);
// console.log(linebreak);

// var a = 2; // Bit presentation 10     00000010
// var b = 3; // Bit presentation 11console.log("(a << b) => ");
// var linebreak = "<br />";
// result = a << b;
// console.log(result);
// console.log(linebreak);
// console.log("(a >> b) => ");
// result = a >> b;
// console.log(result);
// console.log(linebreak);

// var x = 5;
// if (x == 5) {
//   console.log("x is equal to 5!"); // only
// }
// var x = 6;
// if (x == 5) {
//   console.log("x is equal to 5!");
// } else {
//   console.log("x is not equal to 5!");
// }

// var x = 5;
// if (x == 1) {
//   alert("x is equal to 1");
// } else if (x == 2) {
//   alert("x is equal  to 2");
// } else if (x == 5) {
//   alert("x is equal  to 5");
// } else {
//   alert("x is not 1, 2 or not 5");
// }

// var x = 3;
// if (x == 1) {
//   console.log("x is equal to 1");
// } else if (x == 2) {
//   console.log("x is equal  to 2");
// } else if (x == 5) {
//   console.log("x is equal  to 5");
// } else {
//   console.log("x isn't 1, 2 or not 5");
// }

// var x = 3;
// switch (true) {
//   case x == 1:
//     console.log("x is equal to 1!");
//     break;
//   case x == 2:
//     console.log("x is equal to 2!");
//     break;
//   case x == 5:
//     console.log("x is equal to 5!");
//     break;
//   default:
//     console.log("x isn't 1, 2 or 5!");
// }

// function doAddition(firstVar, secondVar) {
//   var first = firstVar || 5; // if the passed variables actually have a value
//   var second = secondVar || 10;
//   return first + second;
// }
// console.log("First Parameter" + doAddition(13));
// console.log("No Parameter" + doAddition());
// console.log("Both Parameter" + doAddition(15, 13));
// console.log("First Parameter Blank(Zero)" + doAddition(0, 13));
// console.log("Both Parameter Zero" + doAddition(0, 0));
// console.log("Second Parameter Zero" + doAddition(13, 0));

// var userName = "Bob";
// var hello = userName == "Bob" ? "Hello Bob!" : "Hello Not Bob!";
// console.log(hello);
// const MAX_PATTERNS = 5;
// for (i = 0; i < MAX_PATTERNS; i++) console.log("Hello " + i);
// var a = 10;
// var b = 20;
// var linebreak = "<br />";
// console.log("((a > b) ? 100 : 200) => ");
// result = a > b ? 100 : 200;
// console.log(result);
// console.log(linebreak);
// console.log("((a < b) ? 100 : 200) => ");
// result = a < b ? 100 : 200;
// console.log(result);
// console.log(linebreak);

// var x = 10;
// console.log(typeof x);
// let name = "Dr Tarkeshwar Barua";
// console.log(typeof name);
// const paid = true;
// console.log(typeof paid);
// var person = { name: "Tarkeshwar", phone: 3343434, "city ": "Bangalore" };
// var persons = [
//   { name: "Tarkeshwar", phone: 3343434, "city ": "Bangalore" },
//   { name: "Tarkeshwar", phone: 3343434, "city ": "Bangalore" },
// ];
// console.log(typeof person);
// console.log(typeof persons);

// var add = function addition(num1, num2) {
//   return num1 + num2;
// };
// console.log(typeof add);
// var variableNotDefined = undefined;
// console.log(typeof variableNotDefined);
// var blankObject = null;
// console.log(typeof blankObject);

// var a = 10;
// var b = "String";
// var linebreak = "<br />";
// result = typeof b == "string" ? "B is String" : "B is Numeric";
// console.log("Result => ");
// console.log(result);
// console.log(linebreak);
// result = typeof a == "string" ? "A is String" : "A is Numeric";
// console.log("Result => ");
// console.log(result);
// console.log(linebreak);

// for (x = 0; x < 10; x++) {
//   console.log("Iteration " + x);
// }

// for (x = 10; x > 0; x--) {
//   console.log("Reverse Iteration " + x);
// }

// var i = 0;
// do {
//   console.log("Hello World");
//   i++;
// } while (i < 5);
// while (i < 7) {
//   console.log("While Loop");
//   i = i + 1;
// }

// var myObject = {
//   animal: "Dog",
//   growls: 1.45565,
//   hasFleas: { name: "Tarkeshwar", phonels: 3343434, "city ": "Bangalore" },
//   loyal: true,
// };
// for (var property in myObject) {
//   console.log(property + " contains " + myObject[property] + "<br>");
// }
// for (var property in myObject) {
//   if (typeof myObject[property] != "function") {
//     console.log(property + " contains " + myObject[property] + "<br>");
//   }
// }

// class Employee {
//   constructor(name, phone, city) {
//     this.name = name; // this keyword represents instance variable
//     this.phone = phone; // name, phone,city are the local variable with function scope
//     this.city = city;
//   }
// }
// let emp = new Employee("Tarkeshwar", "4345435435", "Bangalore");
// console.log("Name of Employee : " + emp.name);
// console.log("Phone Number : " + emp.phone);
// console.log("Employee City  : " + emp.city);

// class Employee {
//   //constructor() {} // constructor overloading
//   constructor(name, phone, city) {
//     this.name = name; // this keyword represents instance variable
//     this.phone = phone; // name, phone,city are the local variable with function scope
//     this.city = city;
//   }
// }
// let emp2 = new Employee("Tarkeshwar", "4345435435", "Bangalore");
// console.log("Name of Employee : " + emp2.name);
// console.log("Phone Number : " + emp2.phone);
// console.log("Employee City  : " + emp2.city);
// let emp1 = new Employee();
// emp1.city = "New Delhi";
// emp1.name = "Mr. ABC";
// emp1.phone = "566778989";
// console.log(emp1);

// class Employee {
//   //constructor() {} // constructor overloading
//   constructor(name, phone, city) {
//     this.name = name; // this keyword represents instance variable
//     this.phone = phone; // name, phone,city are the local variable with function scope
//     this.city = city;
//   }
//   displayData() {
//     console.log(
//       "Inside Method Name : " +
//         this.name +
//         "\n City : " +
//         this.city +
//         "\t phone : " +
//         this.phone
//     );
//     return (
//       "Name : " +
//       this.name +
//       "\n City : " +
//       this.city +
//       "\t phone : " +
//       this.phone
//     );
//   }
// }
// let emp3 = new Employee("Tarkeshwar", "4345435435", "Bangalore");
// console.log("Name of Employee : " + emp3.name);
// console.log("Phone Number : " + emp3.phone);
// console.log("Employee City  : " + emp3.city);
// emp3.city = "Mangalore";
// let emp1 = new Employee();
// emp1.city = "New Delhi";
// emp1.name = "Mr. ABC";
// emp1.phone = "566778989";
// console.log(emp1);
// let data = emp1.displayData();
// let data3 = emp3.displayData();
// console.log(data);
// console.log(data3);

// class Employee {
//   //constructor() {} // constructor overloading
//   constructor(name, phone, city) {
//     this.name = name; // this keyword represents instance variable
//     this.phone = phone; // name, phone,city are the local variable with function scope
//     this.city = city;
//   }
//   injectName(name) {
//     // not recommanded
//     this.name = name;
//   }
//   set nameData(name) {
//     this.name = name;
//   } // setter method to inject value
//   displayData() {
//     console.log(
//       "Inside Method Name : " +
//         this.name +
//         "\n City : " +
//         this.city +
//         "\t phone : " +
//         this.phone
//     );
//     return (
//       "Name : " +
//       this.name +
//       "\n City : " +
//       this.city +
//       "\t phone : " +
//       this.phone
//     );
//   }
// }
// let emp4 = new Employee("Tarkeshwar", "4345435435", "Bangalore");
// console.log("Name of Employee : " + emp4.name);
// console.log("Phone Number : " + emp4.phone);
// console.log("Employee City  : " + emp4.city);
// let emp1 = new Employee();
// emp1.city = "New Delhi";
// emp1.name = "Mr. ABC"; // setting value directly to the instance variable
// emp1.phone = "566778989";
// console.log(emp1);
// let data1 = emp1.displayData();
// console.log(data1);
// emp1.nameData = "Mr xyz";
// console.log(emp1);

// let data2 = {
//   name: "Tarkesh",
//   paid: true,
// };
// class Student {
//   constructor(name, paid) {
//     this.name = name;
//     this.paid = paid;
//   }
//   set [data2.name](stdName) {
//     this.name = stdName;
//   }
//   set paid1(salaryPaid) {
//     this.paid = salaryPaid;
//   }
// }
// let std = new Student();
// std.paid1 = false;
// std.name = "Mr KBC";
// console.log(std);
// console.log(data2);

// const expr = "rollno";
// class Student {
//   constructor(rno, fname, lname) {
//     this.rno = rno;
//     this.fname = fname;
//     this.lname = lname;
//     console.log("inside constructor");
//   }
//   set [expr](newRollno) {
//     console.log("inside setter");
//     this.rno = newRollno;
//   }
// }
// let s1 = new Student(1, "Tarkeshwar", "Barua");
// console.log(s1);
// //setter is called
// s1.rollno = 201;
// console.log(s1);

// class Student {
//   constructor(rno, fname, lname) {
//     this.rno = rno;
//     this.fname = fname;
//     this.lname = lname;
//     console.log("inside constructor");
//   }
//   set rollno(newRollno) {
//     console.log("inside setter");
//     this.rno = newRollno;
//   }
//   get fullName() {
//     console.log("inside getter");
//     return this.rno + " - " + this.fname + " - " + this.lname;
//   }
// }
// let s1 = new Student(1, "Tarkeshwar", "Barua");
// console.log(s1);
// //getter is called
// console.log(s1.fullName);
// s1.rollno = 200;
// console.log(s1.fullName);

// class Car {
//   constructor(name) {
//     this.brand = name;
//   }
//   present() {
//     return "I have a " + this.brand;
//   }
//   show() {
//     return (
//       this.present() +
//       ", it is a super class by child class object " +
//       this.model
//     );
//   }
// }
// class Model extends Car {
//   constructor(name, mod) {
//     super(name);
//     this.model = mod;
//   }
//   show() {
//     return this.present() + ", it is a " + this.model;
//   }
// }
// const mycar = new Model("Ford", "Mustang");
// // console.log(yourParentClassNameyourParentClassName.prototype.yourMethodName.call(yourChildObjectName));
// console.log(Car.prototype.show.call(mycar));
// console.log(Model.prototype.show.call(mycar));
// let msg = mycar.show();
// console.log(msg);
// let msg1 = mycar.present();
// console.log(msg1);
// console.log("Property from Car class : " + mycar.brand);
// console.log("Property from Model class : " + mycar.model);

// hello1 = function () {
//   return "Hello World!";
// };
// hello2 = () => {
//   return "Hello World!";
// };
// hello3 = () => "Hello World!";
// hello4 = (val) => "Hello " + val;
// hello5 = (val) => "Hello " + val;
// let msg6 = hello1();
// console.log(msg6);
// let msg2 = hello2();
// console.log(msg2);
// let msg3 = hello3();
// console.log(msg3);
// let msg4 = hello4("Mr. ABC");
// console.log(msg4);
// let msg5 = hello5("Mr. XYZ");
// console.log(msg5);

// class Customer {}
// class Employee {}
// let cust = new Employee();
// let empl = new Employee();
// let instanceOfCustomer = cust instanceof Customer;
// let instanceOfEmployee = empl instanceof Employee;
// console.log("cust is the instance of Customer class " + instanceOfCustomer);
// console.log("empl is the instance of

// const person = {
//   name: "Jack",
//   age: 25,
//   // this inside method
//   // this refers to the object itself
//   greet() {
//     console.log(this);
//     console.log(this.name);
//   },
// };
// person.greet();
// console.log(person.name);
// console.log(person.age);

// const greet = {
//   name: "Jack",
//   // method
//   sayHi() {
//     let hi = () => console.log(this.name);
//     hi();
//   },
// };
// greet.sayHi(); // Jack

// "use strict";
// this.name = "Jack";
// function greet() {
//   console.log(this.name);
// }
// greet.call(this); // Jack
// greet(); // Can't Make A Call With Use Strict -> Error

// const person = {
//   name: "Jack",
//   age: 25,

//   // this inside method
//   // this refers to the object itself
//   greet() {
//     console.log(this); // {name: "Jack", age ...}
//     console.log(this.age); // 25

//     // inner function
//     function innerFunc() {
//       // this refers to the global object
//       console.log(this); // Window { ... }
//       console.log(this.age); // undefined
//     }

//     innerFunc();
//   },
// };

// person.greet();

// const myArray = ["🍌", "🍋", "🍊", "🍉"];
// myArray.map((i) => console.log(i));

// for (const key in myArray) {
//   document.write(`<h3> Fruit ${Number(key) + 1}: ${myArray[key]}</h1>`);
// }

// const [Banana, Mango, Orange, Tomato] = myArray;
// console.log(Banana);

// const vehicles = ["mustang", "f-150", "expedition"];
// // old way
// const car1 = vehicles[0];
// const truck1 = vehicles[1];
// const suv1 = vehicles[2];
// // ES6 Approach
// const [car2, truck2, suv2] = vehicles;
// const [car3, , suv3] = vehicles;
// console.log(car2);
// console.log(suv3);
// function calculate(a, b) {
//   const add = a + b;
//   const subtract = a - b;
//   const multiply = a * b;
//   const divide = a / b;
//   return [add, subtract, multiply, divide];
// }
// const [add, subtract, multiply, divide] = calculate(4, 7);
// console.log(add);
// console.log(subtract);
// console.log(multiply);
// console.log(divide);

// const vehicle = {
//   brand: "Ford",
//   model: "Mustang",
//   type: "Car",
//   year: 2021,
//   color: "Red",
//   steering: { automatic: "Manual", power: true },
// };

// function vehicleOne({ brand, model, type, year, color, steering }) {
//   console.log(
//     `My ${brand} is a ${model} ${type} of the year ${year} which is ${color} in color. The steering is ${steering.automatic} and ${steering.power} power!`
//   );
// }

// function vehicleTwo({
//   brand,
//   model,
//   type,
//   year,
//   color,
//   steering: { automatic, power },
// }) {
//   console.log(
//     `My ${brand} is a ${model} ${type} of the year ${year} which is ${color} in color. The steering is ${automatic} and ${power} power!`
//   );
// }

// vehicleOne(vehicle);
// vehicleTwo(vehicle);

// function getUsersNow() {
//   return [
//     { username: "Mayur Pai", email: "mayur5pai@gmail.com" },
//     { username: "ABCD", email: "abcd@yahoo.com" },
//   ];
// }

// function findUsersNow(username) {
//   const users = getUsersNow();
//   const user = users.find((i) => i.username === username);
//   return user;
// }
// console.log(findUsersNow("Mayur Pai"));

// function getUsers() {
//   let users = new Array();
//   setTimeout(() => {
//     users = [
//       { username: "Mayur Pai", email: "mayur5pai@gmail.com" },
//       { username: "ABCD", email: "abcd@yahoo.com" },
//     ];
//   }, 1000);
//   return users;
// }
// function findUser(username) {
//   const users = getUsers();
//   const user = users.find((i) => i.username === username);
//   return user;
// }
// console.log(findUser("Mayur Pai"));

// function getUsers(call) {
//   setTimeout(() => {
//     call([
//       { username: "Mayur Pai", email: "mayur5pai@gmail.com" },
//       { username: "ABCD", email: "abcd@yahoo.com" },
//     ]);
//   }, 1000);
// }
// function findUser(username, callback) {
//   getUsers((i) => {
//     const user = i.find((j) => j.username === username);
//     callback(user);
//   });
// }
// findUser("Mayur Pai", console.log);

// function getUsers() {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       resolve([
//         { username: "tbarua1", email: "tbarua1@gmail.com" },
//         { username: "tarkeshwar", email: "tarkeshwar.b@regexsoftware.com" },
//       ]);
//     }, 1000);
//   });
// }
// const promise = getUsers();
// promise.then((users) => {
//   console.log(users);
// });

// function getUsers() {
//   return new Promise((resolve, reject) => {
//     const randomGen = [true, false][Math.floor(Math.random() * 2)];
//     if (randomGen) {
//       // setTimeout(() => {
//       resolve([
//         { username: "Mayur Pai", email: "mayur5pai@gmail.com" },
//         { username: "ABCD", email: "abcd@yahoo.com" },
//       ]);
//       // }, 1000);
//     } else {
//       reject("User Not Found");
//     }
//   });
// }
// const promise = getUsers();
// promise.then((user) => console.log(user));
// promise.catch((error) => console.log(error));

// const promise = getUsers();
// promise.then((user) => console.log(user));
// promise.catch((error) => console.log(error));

// function getUsers() {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       resolve([
//         { username: "Mayur Pai", email: "mayur5pai@gmail.com" },
//         { username: "ABCD", email: "abcd@yahoo.com" },
//       ]);
//     }, 1000);
//     reject("User Not Found");
//   });
// }

// let mayur = { eName: "Mayur", age: 22 },
//   kavya = { eName: "Kavya", age: 21 },
//   raksha = { eName: "Sriraksha", age: 21 };
// let empJobs = new Map([
//   [mayur, ["Software Dev", "Techy"]],
//   [kavya, "Developer"],
//   [raksha, "Data Scientist"],
// ]);
// console.log(empJobs);

// let daysMap = new Map();
// daysMap.set("1", "Monday");
// daysMap.set("2", "Tuesday");
// daysMap.set("3", "Wednesday");
// daysMap.set("4", "Thursday");
// daysMap.set("5", "Friday");
// daysMap.set("6", "Saturday");
// daysMap.set("7", "Sunday");
// console.log(daysMap.size);

// let objectTwo = daysMap.get("5");
// console.log(objectTwo);
// daysMap.delete("3");
// console.log(daysMap.size);
// console.log(daysMap);
// console.log(daysMap.has("1"));
// console.log(daysMap.keys());
// console.log(daysMap.entries());
// daysMap.forEach((i) => console.log(i));

// const ages = [21, 18, 42, 40, 64, 63, 34];
// const maxAge = ages.reduce((max, age) => {
//   console.log(`${age} > ${max} = ${age > max}`);
//   if (age > max) {
//     return age;
//   } else {
//     return max;
//   }
// }, 0);
// console.log("max Age:", maxAge);
// const max = ages.reduce((max, value) => (value > max ? value : max));
// console.log(`Max Age: ${max}`);

// const sumArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// const sum = sumArray.reduce(
//   (previousValue, currentValue) => (previousValue += currentValue)
// );
// console.log(`Sum: ${sum}`);

// let emp = new WeakMap();

// let eOne = { eName: "Mayur" };
// let eTwo = { eName: "Kavya" };
// let eThree = { eName: "Sriraksha" };

// emp.set(eOne, 1001);
// emp.set(eTwo, 1002);
// emp.set(eThree, 1003);

// console.log(emp);
// console.log(emp.get(eOne));
// emp.delete(eThree);
// console.log(emp.has(eThree));
// console.log(emp.get(eThree));

// let names = new Set(["A", "B", "C", "D"]);
// console.log(names);

// names.add("E");
// console.log(names);
// console.log(names.entries());
// console.log(names.keys());
// console.log(names.size);
// names.add("B");
// for (const iterator of names) {
//   console.log(`${iterator}`);
// }
// console.log(names);
// names.delete("B");
// console.log(names.values());
// console.log(names);
// names.forEach((i) => console.log(i));
// names.clear();
// console.log(names);
// console.log(names.size);

// let emp = new WeakSet();

// let eOne = { eName: "Mayur" };
// let eTwo = { eName: "Kavya" };
// let eThree = { eName: "Sriraksha" };

// emp.add(eOne);
// emp.add(eTwo);
// emp.add(eThree);

// console.log(emp);
// emp.delete(eThree);
// console.log(emp.has(eThree));

// let itr = emp.entries();
// for (const iterator of itr) {
//   console.log(iterator);
// }

// var names = "Mayur";

// const message = () => {
//   var name = names;
//   var age = 22;
//   const messageSend = `${name} Is ${age} Years Old!`;
//   return messageSend
// };

// export { message };

// var peaks = ["Tallac", "Ralston", "Rose"];
// var canyons = ["Ward", "Blackwood"];
// var combine = [...peaks, ...canyons];
// var tahoe = [peaks.concat(canyons)];
// var tahoeOne = [peaks, canyons];

// console.log(combine);
// console.log(tahoe);
// console.log(tahoeOne);

// let propName = "c";

// const rank = {
//   a: 1,
//   b: 2,
//   [propName]: 3,
// };

// console.log(rank.c); // 3

// let properties = "c";
// let data = {
//   a: 1,
//   b: 2,
//   [properties]: 3,
// };
// console.log("Value of A " + data.a);
// console.log("Value of C " + data.c);

// function Person(name) {
//   if (!new.target) {
//     throw "must use new operator with Person";
//   }
//   this.name = name;
// }
// let tarkesh = new Person("Tarkeshwar"); // new object from the Person function by using the new operator
// console.log(tarkesh.name); // Tarkeshwar
// let tarkeshUsingFunction = Person("Dr. Tarkeshwar Barua");
// console.log(tarkeshUsingFunction.name);

// function Person(name) {
//   if (!new.target) {
//     // to ensure execution only as per construtor
//     throw "must use new operator with Person";
//   }
//   this.name = name;
// }
// // it will work fine
// let tarkesh = new Person("Tarkeshwar"); // new object from the Person function by using the new operator
// console.log(tarkesh.name);
// //Tarkeshwar
// let tarkeshUsingFunction = Person("Dr. Tarkeshwar Barua"); // not executable due to function call
// console.log(tarkeshUsingFunction.name);

var div,
 container = document.getElementById('container')
for (var i=0; i<5; i++) {
 div = document.createElement('div')
 div.onclick = function() {
 alert('This is box #' + i)
 }
 container.appendChild(div)
}
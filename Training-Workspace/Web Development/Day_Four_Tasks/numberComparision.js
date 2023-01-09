var number = prompt("Enter A Number: ");

if (number >= 1 && number <= 30) {
  alert(`You Entered ${number} Which Is Between 1-30`);
} else if (number >= 31 && number <= 60) {
  alert(`You Entered ${number} Which Is Between 31-60`);
} else if (number >= 61 && number <= 100) {
  alert(`You Entered ${number} Which Is Between 61-100`);
} else if (number < 1 || number > 100) {
  alert(`You Entered ${number} Which Is Either Less Than 1 Or Greater Than 100`);
} else {
    alert("You Didn`t Enter A Number!")
}

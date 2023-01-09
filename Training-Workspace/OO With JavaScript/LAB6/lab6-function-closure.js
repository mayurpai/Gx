//6. [Function Closure] Use closure property to increase or decrease the amount of Tip.

//Step-1: Use function closure property to hide the function of
//inrement and decrement and display the new value of tip amount.

var tipAmount = document.getElementById("tipAmount");

const add = () => Number(tipAmount.innerHTML) + 100;

const addTip = () => (tipAmount.innerHTML = add());

//Create subtract() closure function to decrement the tip amount
const subtract = () => Number(tipAmount.innerHTML) - 100;

const subtractTip = () => {
  if (Number(tipAmount.innerHTML) >= 100) tipAmount.innerHTML = subtract();
};

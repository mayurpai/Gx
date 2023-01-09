const prompt = require("prompt-sync")();

function linearSearch(arr, x) {
  let flag = true;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === x) {
      console.log("Element Found At : " + (i + 1));
      flag = 0;
      break;
    }
  }
  if (flag) {
    console.log("Element Not Found!");
  }
}

var N = prompt("Enter The Array Size: ");
var array = [N];

for (let index = 0; index < N; index++) {
  array[index] = prompt("Enter Array Element " + (index + 1) + ": ");
}

var key = prompt("Enter The Key: ");

linearSearch(array, key);

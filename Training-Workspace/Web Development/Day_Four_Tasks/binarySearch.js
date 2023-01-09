const prompt = require("prompt-sync")();

let recursiveFunction = function (arr, x, start, end) {
  if (start > end) return false;

  let mid = Math.floor((start + end) / 2);

  if (arr[mid] === x) return true;

  if (arr[mid] > x) return recursiveFunction(arr, x, start, mid - 1);
  else return recursiveFunction(arr, x, mid + 1, end);
};

var N = prompt("Enter The Array Size: ");
var array = [N];

for (let index = 0; index < N; index++) {
  array[index] = prompt("Enter Array Element " + (index + 1) + ": ");
}

var key = prompt("Enter The Key: ");

if (recursiveFunction(array, key, 0, N - 1)) console.log("Element Found!");
else console.log("Element Not Found!");

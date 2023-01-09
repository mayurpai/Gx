//8. [Promise] Use promise to show a warning message if item contain one or more Non-Veg Item

//Step1: Get all the items. (Note: Class name of li items is 'list-group-item').
var items = document.getElementsByClassName("list-group-item");

//Step2: Create the function displayItemMessage(someMsg) for displaying
//the warning message in div with id 'warning-mess'.
const displayItemMessage = (someMsg) => {
  document.getElementById("warning-mess").innerHTML = someMsg;
};

//Step3: Create a promise where declare a boolean variable 'checkVeg'. Iterate through the items and if any item doesn't have "Veg" in it then set 'checkVeg' as false.
let promises = new Promise((resolve, reject) => {
  let checkVeg;
  for (var i = 0; i < items.length; i++) {
    if (items[i].textContent.includes("Veg")) {
      checkVeg = true;
      items[i].style.color = "green";
    } else {
      checkVeg = false;
      items[i].style.color = "red";
    }
  }
  Boolean(checkVeg)
    ? resolve("It does not contain any Non-Veg Item")
    : reject("Warning! It contains one or more Non-Veg Item");
});

//Step4: If promise is fulfilled the pass "It doesnot contain any Non-Veg Item" to the function created in step2 otherwise pass error message "Warning! It contains one or more Non-Veg Item".
promises
  .then((message) => displayItemMessage(message))
  .catch((rejectMessage) => displayItemMessage(rejectMessage));

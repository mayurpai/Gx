//9. [Async/await] Use Async Programming for displaying a Thank You message if customer gives rating more than 3.

//Step1: Get the form whose id is 'ratingForm'.
var form = document.getElementById("ratingForm");
const rateFunction = async (e) => {
  e.preventDefault();
  let promise = new Promise((resolve, reject) => {
    Number(document.getElementById("ratingId").value) > 3
      ? resolve("Thank You!")
      : reject("Error!");
  });
  document.getElementById("rateMessage").innerHTML = await promise;
};

form.addEventListener("submit", rateFunction);
//Step2: Create a async function rateFunction.

//Step2.a: Get the rating value from select id 'ratingId'.
//Step2.b: Create a promise to get the succes message "Thank You!" if rating is greater then 3.
//Step2.c: Use 'await' to make sure async function is executed and diaplay the message of promise in 'p' id of 'rateMessage'.

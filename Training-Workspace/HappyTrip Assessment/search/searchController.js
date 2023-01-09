/*
1. Import, Include, Things That We Need
2. Init Function Or Onload Function To Load The Dataset From The Script (7 Datas)
3. 
*/
import { searchManager } from "./searchManager.js";
import { searchInfo } from "../models/searchInfo.js";
// import { searchResults } from "./searchResults.js";

// Search Configuration
var oneWayTravelDefaultDirection = true;
var numberOfAdults = 9;
var numberOfChilderens = 8;
var numberOfInfants = 5;
var numberOfFlightClass = 5;
var numberofPassengersMax = 9;
var searchmanager = new searchManager();
// var searchresults = new searchResults();

// Initializing Search
function init() {
  const splash = document.querySelector(".splash");
  document.addEventListener("DOMContentLoaded", (e) => {
    setTimeout(() => {
      splash.classList.add("display-none");
    }, 2000);
  });
  // 1. Have One Way Pre-selected (true [Can Be Passed From Configuration Files])
  setDefaultValueTravelDirection(oneWayTravelDefaultDirection);
  // 2. Get Cities
  loadCities();
  // 3. Get Number Of Adults
  document.getElementById("numberOfAdults").placeholder = "Max 9 Adults";
  // 4. Get Number Of Infants
  // 5. Get Number Of Childrens
  document.getElementById("numberOfChilderens").placeholder = "Max 8 Childrens";
  // 6. Get Flight Class
  // 7. Get Airlines For Preference
  // 8. Disable From Date And To Date Of Month And Also Enable For How Long
  // document.getElementById("numberOfAdults").onkeyup = function addUp() {
  //   document.getElementById("numberofPassengers").value =
  //     Number(document.getElementById("numberOfAdults").value) +
  //     Number(document.getElementById("numberOfChildrens").value);
  // };

}

init();

// Set Default Value For Travel Direction
function setDefaultValueTravelDirection(defaultValue) {
  // Access The Control And Make It Checked

  if (defaultValue) {
    document.getElementById("roundTrip").checked;
    document.getElementById("toDate").style.display = "block";
  } else document.getElementById("toDate").style.display = "none";
  return;
}

// To Load Cities From The Database In The Control
function loadCities() {
  // 1. Get Cities
  var data = getCities();

  // 2. Load Cities Inside The Control
  assignCities(data);
}

function getCities() {
  // Get Cities From The Manager (It Returns An Array)
  return searchmanager.getcities();
}

function assignCities(data) {
  // Take The Array And Construct the DropDown
  // console.log(data);
  for (let i in data) {
    var x = document.getElementById("fromCity");
    // var y = document.getElementById("toCity");
    var option = document.createElement("option");
    option.text = `${data[i].code} - ${data[i].name}, ${data[i].country}`;
    x.add(option);
  }
  for (let i in data) {
    var y = document.getElementById("toCity");
    var option = document.createElement("option");
    option.text = `${data[i].code} - ${data[i].name}, ${data[i].country}`;
    y.add(option);
  }
}

// 1. HardCoded Search
/*
function searchResults() {
    console.log("1")
}
*/

// 2. Attach The Function Dynamically To The Object
/* 
let Btn = document.getElementById("Btn");
Btn.onclick = function () {
    console.log("1");
};
*/

// 3. Event Listeners
/* let Btn = document.getElementById("Btn");

Btn.addEventListener(function () {
  console.log("1");
});
*/

// 1. Class Objects - default way
// class Person {
//     constructor(name, age) {
//         this.name = name;
//         this.age = age;
//     }
//     showName() {
//         console.log(`${this.name} - ${this.age}`)
//     }
// }
// console.log(mayur.name)
// var mayur = new Person("Mayur", 22)
// console.log(mayur.age)
// mayur.showName()

// 2. Function Objects - function obj() {}
// function person(name, age) {
//     this.name = name;
//     this.age = age;
//     this.showName = function () {
//         console.log(`${this.name} - ${this.age}`)
//     }
// }
// var nagendra = new person("Nagendra", 22)
// console.log(nagendra)
// nagendra.showName()

// 3. JavaScript Objects - const obj = {}
// const mayur = {
//     name: "Mayur",
//     age: 22
// }

/* Deliverables:
1. Solution Should Run
2. Proper High Quality Code With Comments
3. WorkFlow, Rules, Test Cases In Do  cument And Code
4. Three Solutions: Class, Function Object, JavaScript Object 
5. Professional UI
6. Beautiful Presentation, Agenda, Key Highlights, Best Practices
*/
// var searchInformation = [];

document.getElementById("Btn-submit").onclick = function () {
  var fromCity = document.getElementById("fromCity").value;
  var toCity = document.getElementById("toCity").value;
  var numberofPassengers = document.getElementById("numberofPassengers").value;
  var numberOfAdults = document.getElementById("numberOfAdults").value;
  var numberOfChilderens = document.getElementById("numberOfChilderens").value;
  var fromDate = document.getElementById("fromDate").value;
  var toDate = document.getElementById("toDate").value;
  // class searchInfo {
  //   constructor(
  //     fromCity,
  //     toCity,
  //     numberofPassengers,
  //     numberOfAdults,
  //     numberOfChilderens,
  //     fromDate,
  //     toDate
  //   ) {
  //     this.fromCity = fromCity;
  //     this.toCity = toCity;
  //     this.numberofPassengers = numberofPassengers;
  //     this.numberOfAdults = numberOfAdults;
  //     this.numberOfChilderens = numberOfChilderens;
  //     this.fromDate = fromDate;
  //     this.toDate = toDate;
  //   }
  // }
  var searching = new searchInfo(
    fromCity,
    toCity,
    numberofPassengers,
    numberOfAdults,
    numberOfChilderens,
    fromDate,
    toDate
  );
  // searchInformation.push(searching);
  console.log(searching);
  validateSearchInfo(searching);
  return false;

  /* 
        1. Validate Data Entered In The Form (From City, To City, Date To Be After Current But Not Way Far)
        2. Implement Rules In Separate Function
        3. Import Manager Class ✔️
        4. Create An Object For Search Info, And Fill Data Within It ✔️
        5. If It Is Valid, Redirect To 
        6. Call The Search Manager, Search Function And Make A Call To Service
        17. Upon Success, Redirect To Search Result Page
    */
};

// var fromCity = document.getElementById("fromCity").value;
// var toCity = document.getElementById("toCity").value;
// var numberofPassengers = document.getElementById("numberofPassengers");
// var numberOfAdults = document.getElementById("numberOfAdults").value;
// var numberOfChilderens = document.getElementById("numberOfChilderens").value;
// var fromDate = document.getElementById("fromDate").value;
// var toDate = document.getElementById("toDate").value;

function validateSearchInfo(searching) {
  if (
    formCheck(searching) &&
    validateLocation(searching) &&
    validateTravelDates(searching) &&
    validateNumberOfTickets(searching)
  ) {
    localStorage.setItem("searching", JSON.stringify(searching));
    // searchmanager.searchManager(searching);
    // searchresults.searchResults(searching);
    window.open("/search/searchResult.html");
    // window.location("/search/searchResult.html")
  }

  return false;
  // return true;
}

function formCheck(searching) {
  console.log("Form Check");
  if (!(searching.fromCity.length > 4) || !(searching.toCity.length > 2)) {
    // alert("Please Fill The Form");
    document.getElementById("alertMessage").innerText = "Please Fill The Form";
    return false;
  }
  return true;
}

function validateLocation(searching) {
  console.log("Validate Location");
  if (searching.fromCity == searching.toCity) {
    // alert("Two Locations Can't Be The Same");
    document.getElementById("alertMessage").innerText =
      "Two Locations Can't Be The Same";
    return false;
  }
  return true;
}

function validateTravelDates(searching) {
  console.log("Validate Travel Dates");
  document.getElementById("fromDate").min =
    new Date().getFullYear() +
    "-" +
    parseInt(new Date().getMonth() + 1) +
    "-" +
    new Date().getDate();
  document.getElementById("toDate").min =
    new Date().getFullYear() +
    "-" +
    parseInt(new Date().getMonth() + 1) +
    "-" +
    new Date().getDate();
  document.getElementById("fromDate").max =
    parseInt(new Date().getFullYear() + 1) +
    "-" +
    parseInt(new Date().getMonth() + 1) +
    "-" +
    new Date().getDate();
  document.getElementById("toDate").max =
    parseInt(new Date().getFullYear() + 1) +
    "-" +
    parseInt(new Date().getMonth() + 1) +
    "-" +
    new Date().getDate();
  let fromDateValidation = document.getElementById("fromDate").value;
  let toDateValidation = document.getElementById("toDate").value;
  let roundTrip = document.getElementById("roundTrip");
  let oneWay = document.getElementById("oneWay");
  if (roundTrip.checked && !(fromDateValidation.length > 0)) {
    // alert("Invalid Date Entered");
    document.getElementById("alertMessage").innerText = "Invalid Date Entered";
    return false;
  } else if (
    (!oneWay.checked &&
      roundTrip.checked &&
      fromDateValidation > toDateValidation) ||
    (!(fromDateValidation.length > 0) && !(toDateValidation.length > 0))
  ) {
    // alert("Dates Entered Incorrectly");
    document.getElementById("alertMessage").innerText =
      "Dates Entered Incorrectly";
    return false;
  }
  searching.fromDate = fromDateValidation;
  searching.toDate = toDateValidation;
  return true;
}

function validateNumberOfTickets(searching) {
  console.log("Validate Number Of Tickets");
  if (
    Number(searching.numberOfAdults) == 0 &&
    Number(searching.numberOfChilderens) == 0
  ) {
    // alert("Enter Count Correctly");
    document.getElementById("alertMessage").innerText =
      "Adults And Children Fields Empty";

    return false;
  }
  if (
    !(Number(searching.numberOfAdults) >= 1) &&
    Number(searching.numberOfChilderens) >= 1
  ) {
    // alert("Adult Is Mandatory On Taking Childrens");
    document.getElementById("alertMessage").innerText =
      "Adult Is Mandatory On Taking Childrens";
    return false;
  } else if (Number(searching.numberOfAdults) > numberOfAdults) {
    document.getElementById("alertMessage").innerText = "Exceeded Count Adult";
    // alert("Exceeded Count Adult");
    return false;
  } else if (Number(searching.numberOfChilderens) > numberOfChilderens) {
    document.getElementById("alertMessage").innerText =
      "Exceeded Count Children";
    // alert("Exceeded Count Children");
    return false;
  } else if (
    Number(searching.numberOfChilderens) + Number(searching.numberOfAdults) >
    numberofPassengersMax
  ) {
    // alert("Exceeded Ticket Booking Limit!");
    document.getElementById("alertMessage").innerText =
      "Exceeded Ticket Booking Limit!";
    return false;
  }
  searching.numberofPassengers =
    Number(searching.numberOfAdults) + Number(searching.numberOfChilderens);
  document.getElementById("numberofPassengers").value =
    searching.numberofPassengers;
  // searching.numberofPassengers = numberOfPass;
  // numberofPassengers.value = numberOfPass;

  return true;
}

// searchResults();

export { validateSearchInfo };

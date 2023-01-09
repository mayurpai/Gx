import { FlightSchedule } from "../models/travel.js";
// import { payment } from "../payment/payment.js";
import { Passenger } from "../models/travel.js";
let searching = JSON.parse(localStorage.getItem("searching"));
window.onload = function () {
  document.getElementById("submitBtn").disabled = true;
  let count = JSON.parse(localStorage.getItem("count"));
  var selectedFligthSchedule;
  switch (count) {
    case 1:
      selectedFligthSchedule = JSON.parse(
        localStorage.getItem("flightScheduleOne")
      );
      break;
    case 2:
      selectedFligthSchedule = JSON.parse(
        localStorage.getItem("flightScheduleTwo")
      );
      break;
    case 3:
      selectedFligthSchedule = JSON.parse(
        localStorage.getItem("flightScheduleThree")
      );
      break;
    case 4:
      selectedFligthSchedule = JSON.parse(
        localStorage.getItem("flightScheduleFour")
      );
      break;
    case 5:
      selectedFligthSchedule = JSON.parse(
        localStorage.getItem("flightScheduleFive")
      );
      break;
    case 6:
      selectedFligthSchedule = JSON.parse(
        localStorage.getItem("flightScheduleSix")
      );
      break;
    case 7:
      selectedFligthSchedule = JSON.parse(
        localStorage.getItem("flightScheduleSeven")
      );
      break;
    case 8:
      selectedFligthSchedule = JSON.parse(
        localStorage.getItem("flightScheduleEight")
      );
      break;
    case 9:
      selectedFligthSchedule = JSON.parse(
        localStorage.getItem("flightScheduleNine")
      );
      break;
    case 10:
      selectedFligthSchedule = JSON.parse(
        localStorage.getItem("flightScheduleTen")
      );
      break;

    default:
      break;
  }
  // let selectedFligthSchedule = JSON.parse(
  //   localStorage.getItem("flightScheduleOne")
  // );
  let slicedPrice = Number(selectedFligthSchedule.price.slice(2));
  var numberOfAdultsDisplay = Number(searching.numberOfAdults);
  var numberOfChildrenDisplay = Number(searching.numberOfChilderens);
  var numberOfPassengersDisplay =
    numberOfAdultsDisplay + numberOfChildrenDisplay;
  var overPrice =
    "₹ " +
    Number(slicedPrice) * (numberOfAdultsDisplay + numberOfChildrenDisplay);
  document.getElementById("flight").value = selectedFligthSchedule.flight;
  document.getElementById("date").value = selectedFligthSchedule.date;
  document.getElementById("departTime").value =
    selectedFligthSchedule.departTime;
  document.getElementById("duration").value = selectedFligthSchedule.duration;
  document.getElementById("fromCity").value = selectedFligthSchedule.fromCity;
  document.getElementById("toCity").value = selectedFligthSchedule.toCity;
  document.getElementById("price").value = overPrice;
  document.getElementById("routes").value = selectedFligthSchedule.routes;
  document.getElementById("numberOfPassengers").value =
    Number(searching.numberOfChilderens) + Number(searching.numberOfAdults);
  // for (let [key, value] of Object.entries(selectedFligthSchedule)) {
  // document.getElementById(key).value = value;
  // }
  var newPrice = Number(overPrice.slice(2)).toFixed(0);
  var flag = true;
  document.getElementById("applyCoupon").onclick = function () {
    if (document.getElementById("coupon").value == "#123") {
      newPrice = (Number(overPrice.slice(2)) * 0.9).toFixed(0);
      document.getElementById("price").value = `₹ ${newPrice}`;
      flag = false;
      document.getElementById("couponMessage").innerText = `Coupon Applied`;
      localStorage.setItem("newPriceStorage", JSON.stringify(newPrice));
      selectedFligthSchedule.price = newPrice;
    } else {
      document.getElementById("couponMessage").innerText = "Coupon Not Applied";
    }
  };
  localStorage.setItem("newPriceStorage", JSON.stringify(newPrice));
  selectedFligthSchedule.price = newPrice;
};
var passCount = 0;
var userInformation = new Array();
var numberCount =
  Number(searching.numberOfChilderens) + Number(searching.numberOfAdults);
document.getElementById("addBtn").onclick = function addPerson() {
  var name = document.getElementById("name").value;
  var gender = document.getElementById("gender").value;
  var dob = document.getElementById("dob").value;
  var mobileNumber = document.getElementById("mobileNumber").value;
  var user = new Passenger(name, gender, dob, mobileNumber);
  formValidation(user);
  passCount++;
  document.getElementById(
    "passMessage"
  ).innerText = `${passCount} Passenger Added!`;
  if (passCount == numberCount) {
    document.getElementById("addBtn").disabled = true;
    document.getElementById(
      "passMessage"
    ).innerText = `${passCount} Passenger Added!`;
    document.getElementById("submitBtn").disabled = false;
  }
  console.log(user);
  console.log(passCount);
  // localStorage.setItem("user", JSON.stringify(user));
  console.log(userInformation);
  return false;
};

function formValidation(user) {
  if (
    nameValidation(user) &&
    genderValidation(user) &&
    dobValidation(user) &&
    mobileNumberValidation(user)
  ) {
    // payment(user);
    userInformation.push(user);
  }

  return false;
}

document.getElementById("submitBtn").onclick = function makePayment() {
  localStorage.setItem("userInformation", JSON.stringify(userInformation));
  window.open("../payment/payment.html");
  // window.location.href = "../payment/payment.html";
};

function nameValidation(user) {
  if (!(user.name.length > 0) || !isNaN(user.name)) {
    // alert("Please Enter A Valid Name");
    document.getElementById("alertMessage").innerText =
      "Please Enter A Valid Name";
    --passCount;
    return false;
  }
  return true;
}

function genderValidation(user) {
  switch (user.gender) {
    case "Male":
      break;
    case "Female":
      break;
    case "Others":
      break;
    case "male":
      break;
    case "female":
      break;
    case "others":
      break;

    default: {
      // alert("Please Enter A Valid Gender");
      document.getElementById("alertMessage").innerText =
        "Please Enter A Valid Gender";
      --passCount;
      return false;
    }
  }

  return true;
}

function dobValidation(user) {
  let currentDate =
    parseInt(new Date().getFullYear()) +
    "-" +
    parseInt(new Date().getMonth() + 1) +
    "-" +
    new Date().getDate();
  console.log("Date");
  document.getElementById("dob").max = currentDate;
  console.log(currentDate);
  if (!(user.dob.length > 0)) {
    // alert("Enter Valid Date");
    document.getElementById("alertMessage").innerText =
      "Please Enter Valid Date";
    --passCount;
    return false;
  }
  //   console.log(currentDate - dateValidation);
  //   console.log(dateValidation.getTime());
  //   let dateChecker = currentDate.getTime() - dateValidation.getTime();
  //   console.log(dateChecker);
  //   let dateDifference = (dateChecker / 31536000000).toFixed(0);
  //   console.log(dateDifference);
  //   if (dateDifference < 5) {
  //     alert("Not A Safe Age To Travel");
  //     return false;
  //   }
  //   user.dob = dateValidation;
  return true;
}

function mobileNumberValidation(user) {
  if (user.mobileNumber.length != 10) {
    // alert("Mobile Number Not Valid");
    document.getElementById("alertMessage").innerText =
      "Mobile Number Not Valid";
    --passCount;
    return false;
  } else if (isNaN(user.mobileNumber)) {
    // alert("Mobile Number Not Valid");
    document.getElementById("alertMessage").innerText =
      "Mobile Number Not Valid";
    --passCount;
    return false;
  }

  return true;
}

export { formValidation };

// var userInformation = [];
// function createPerson(form) {
//   var name = document.getElementById("name").value;
//   var gender = document.getElementById("gender").value;
//   var dob = document.getElementById("dob").value;
//   var mobileNumber = document.getElementById("mobileNumber").value;
//   function Passenger(name, gender, dob, mobileNumber) {
//     this.name = name;
//     this.gender = gender;
//     this.dob = dob;
//     this.mobileNumber = mobileNumber;
//   }

//   var user = new Passenger(name, gender, dob, mobileNumber);
//   userInformation.push(user);
//   console.log(userInformation);
//   return false;
// }

// var btn = document.getElementById("btn");

// btn.onclick = function () {
//   let name = document.getElementById("name").value;
//   let gender = document.getElementById("gender").value;
//   let dob = document.getElementById("dob").value;
//   let mobileNumber = document.getElementById("mobileNumber").value;
//   var flag = 0;
//   var regName = /^[a-zA-Z]+$/;

//   if (!name.length > 0 || !regName.test(name)) {
//     alert("Please enter valid  name");
//     flag = 1;
//     return false;
//   }

//    else  if(!regName.test(name))
//    {
//         alert('Invalid name given.');
//     }

//  else if(!(gender.length)>0)
//  {
//     alert("Please enter the gender ")
//     flag=1;
//     return false;
//  }
//   else if (!(dob.length > 0)) {
//     alert("Please enter the DOB ");

//     flag = 1;
//     return false;
//   } else if (!(mobileNumber.length > 0) || isNaN(mobileNumber)) {
//     alert("Please enter the valid mobile number");
//     flag = 1;
//     return false;
//   }

//   if (flag == 0) {
//     alert("success");
//   }
// };

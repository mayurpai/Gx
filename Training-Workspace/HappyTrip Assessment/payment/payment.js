import { PaymentInfo } from "../models/travel.js";

function init() {
  // let user = JSON.parse(localStorage.getItem("user"));
  let userInformation = JSON.parse(localStorage.getItem("userInformation"));
  let newPriceStorage = JSON.parse(localStorage.getItem("newPriceStorage"));
  console.log(newPriceStorage);
  let searching = JSON.parse(localStorage.getItem("searching"));
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
  let slicedPrice = Number(newPriceStorage);
  var numberOfAdultsDisplay = Number(searching.numberOfAdults);
  var numberOfChildrenDisplay = Number(searching.numberOfChilderens);
  document.getElementById("youPay").innerText = `You pay: ₹ ${slicedPrice}`;
  document.getElementById("youPay").style.fontWeight = 700;
  let baseFare = (Number(slicedPrice) * 0.68).toFixed(0);
  let taxesAndFees = (Number(slicedPrice) * 0.24).toFixed(0);
  let convenienceFee = (Number(slicedPrice) * 0.08).toFixed(0);
  document.getElementById(
    "priceOverall"
  ).innerHTML = `Base Fare: ₹ ${baseFare} <br> Taxes and fees: ₹ ${taxesAndFees} <br> Convenience fee: ₹ ${convenienceFee}`;
  document.getElementById(
    "city"
  ).innerText = `${selectedFligthSchedule.fromCity} - ${selectedFligthSchedule.toCity}`;
  document.getElementById(
    "desc"
  ).innerText = `${selectedFligthSchedule.departTime}, ${selectedFligthSchedule.date}`;
  let userArray = userInformation.map(function (personInfo) {
    return `${personInfo.name}`;
  });
  if (searching.numberOfChilderens != "") {
    document.getElementById("passenger").innerText =
      "Passengers: " +
      (numberOfAdultsDisplay + numberOfChildrenDisplay) +
      ", Adult: " +
      numberOfAdultsDisplay +
      ", Children: " +
      numberOfChildrenDisplay;
  } else {
    console.log(numberOfChildrenDisplay);
    document.getElementById("passenger").innerText =
      "Passengers: " +
      (numberOfAdultsDisplay + numberOfChildrenDisplay) +
      ", Adult: " +
      numberOfAdultsDisplay +
      ", Children: 0";
    console.log(numberOfAdultsDisplay);
  }
  document.getElementById("passengerDesc").innerText = `${userArray}`;

  return false;
}

init();

document.getElementById("PayBtn").onclick = function () {
  var cardNumber = document.getElementById("cardNumber").value;
  var expiryDate = document.getElementById("expiryDate").value;
  var cardHolderName = document.getElementById("cardHolderName").value;
  var cvv = document.getElementById("cvv").value;
  var userBankInformation = new PaymentInfo(
    cardNumber,
    expiryDate,
    cardHolderName,
    cvv
  );
  paymentValidation(userBankInformation);
  console.log(userBankInformation);
  return false;
};

function paymentValidation(userBankInformation) {
  if (
    // paymentFormValidation(userBankInformation) &&
    cardNumberValidation(userBankInformation) &&
    expiryDateValidation(userBankInformation) &&
    cardHolderValidation(userBankInformation) &&
    cvvValidation(userBankInformation) &&
    termsAndCondition()
  ) {
    // alert("Payment Successful!");
    window.location.href = "../booking/bookingConfirmation.html";
  }

  return false;
}

// function paymentFormValidation(userBankInformation) {
//   if (!(userBankInformation.cardNumber.length > 0)) {
//     document.getElementById("alertMessage").innerText = "Please Fill The Form";
//     // alert("Please Fill The Form");
//     return false;
//   } else if (!(userBankInformation.expiryDate.length > 0)) {
//     // alert("Please Fill The Form");
//     document.getElementById("alertMessage").innerText = "Please Fill The Form";
//     return false;
//   } else if (!(userBankInformation.cardHolderName.length > 0)) {
//     // alert("Please Fill The Form");
//     document.getElementById("alertMessage").innerText = "Please Fill The Form";
//     return false;
//   } else if (!(userBankInformation.cvv.length > 0)) {
//     // alert("Please Fill The Form");
//     document.getElementById("alertMessage").innerText = "Please Fill The Form";
//     return false;
//   }
//   return true;
// }

function cardNumberValidation(userBankInformation) {
  console.log("cardNumberValidation");
  if (isNaN(userBankInformation.cardNumber)) {
    // alert("Invalid Card Number");
    document.getElementById("alertMessage").innerText = "Invalid Card Number";
    return false;
  } else if (userBankInformation.cardNumber.length != 16) {
    // alert("Invalid Card Digits");
    document.getElementById("alertMessage").innerText = "Invalid Card Digits";
    return false;
  }
  return true;
}

function expiryDateValidation(userBankInformation) {
  console.log("expiryDateValidation");
  let date = new Date();
  let month = date.getMonth() + 1;
  let year = date.getFullYear();
  const regexMonth = new RegExp(/^[0-1][0-9]$/);
  const regexYear = new RegExp(/^[0-9]{4}$/);
  let expiry = document.getElementById("expiryDate").value.split("/");
  console.log(expiry[0]);
  console.log(expiry[1]);
  let monthChecker = regexMonth.test(expiry[0]);
  let yearChecker = regexYear.test(expiry[1]);
  if (
    (monthChecker && expiry[0] >= 1 && expiry[0] <= 12) ||
    expiry[0].length == 0
  ) {
    if (expiry[0][0] != 1 && expiry[0][1] > month);
    else if (expiry[0] > month);
    else {
      // alert("Month Should Be Greater Than Current Month");
      document.getElementById("alertMessage").innerText = "Incorrect Month";
      return false;
    }
  } else {
    // alert("Invalid Month");
    document.getElementById("alertMessage").innerText = "Incorrect Month";
    return false;
  }
  if (yearChecker && expiry[1] >= year);
  else {
    // alert("Invalid Year");
    document.getElementById("alertMessage").innerText = "Incorrect Year";
    return false;
  }
  userBankInformation.expiryDate = document.getElementById("expiryDate").value;
  return true;
}

function cardHolderValidation(userBankInformation) {
  console.log("cardHolderValidation");
  if (!isNaN(userBankInformation.cardHolderName)) {
    // alert("Invalid Card Name");
    document.getElementById("alertMessage").innerText = "Invalid Card Name";
    return false;
  } else if (userBankInformation.cardHolderName.length > 16) {
    // alert("Invalid Card Name");
    document.getElementById("alertMessage").innerText = "Invalid Card Name";
    return false;
  }
  return true;
}

function cvvValidation(userBankInformation) {
  console.log("cvvValidation");
  console.log(userBankInformation.cvv);
  if (isNaN(userBankInformation.cvv)) {
    // alert("Invalid CVV Number");
    document.getElementById("alertMessage").innerText = "Invalid CVV Number";
    return false;
  } else if (userBankInformation.cvv.length != 3) {
    // alert("Invalid CVV Card Digits");
    document.getElementById("alertMessage").innerText =
      "Invalid CVV Card Digits";
    return false;
  }
  return true;
}

function termsAndCondition() {
  let tca = document.getElementById("tca");
  if (!tca.checked) {
    // alert("Please Check The Terms & Conditions!");
    document.getElementById("alertMessage").innerText =
      "Please Check The Terms & Conditions!";
    return false;
  }
  return true;
}

// import { formValidation } from "../booking/booking.js";

// function init() {
//   let user = JSON.parse(localStorage.getItem("user"));
//   console.log(user)
//   return false;
// }

// init();

// document.getElementById("PayBtn").onclick = function () {
//   var cardNumber = document.getElementById("cardNumber").value;
//   var expiryDate = document.getElementById("expiryDate").value;
//   var cardHolderName = document.getElementById("cardHolderName").value;
//   var cvv = document.getElementById("cvv").value;

//   var userBankInformation = new PaymentInfo(
//     cardNumber,
//     expiryDate,
//     cardHolderName,
//     cvv
//   );
//   paymentValidation(userBankInformation);
//   console.log(userBankInformation);
//   return false;
// };

// function paymentValidation(userBankInformation) {
//   if (
//     cardNumberValidation(userBankInformation) &&
//     expiryDateValidation(userBankInformation) &&
//     cardHolderValidation(userBankInformation) &&
//     cvvValidation(userBankInformation)
//   ) {
//     alert("Payment Successful!");
//     window.location.href = "../search/search.html";
//   }

//   return false;
// }

// function cardNumberValidation(userBankInformation) {
//   if (isNaN(userBankInformation.cardNumber)) {
//     alert("Invalid Card Number");
//     return false;
//   } else if (userBankInformation.cardNumber.length != 16) {
//     alert("Invalid Card Digits");
//     return false;
//   }
//   return true;
// }

// function expiryDateValidation(userBankInformation) {
//   let date = new Date();
//   let month = date.getMonth() + 1;
//   let year = date.getFullYear();
//   const regexMonth = new RegExp(/^[0-1][0-9]$/);
//   const regexYear = new RegExp(/^[0-9]{4}$/);
//   let expiry = document.getElementById("expiryDate").value.split("/");
//   console.log(expiry[0]);
//   console.log(expiry[1]);
//   let monthChecker = regexMonth.test(expiry[0]);
//   let yearChecker = regexYear.test(expiry[1]);
//   if (
//     (monthChecker && expiry[0] >= 1 && expiry[0] <= 12) ||
//     expiry[0].length == 0
//   ) {
//     if (expiry[0][0] != 1 && expiry[0][1] > month);
//     else if (expiry[0] > month);
//     else {
//       alert("Month Should Be Greater Than Current Month");
//       return false;
//     }
//   } else {
//     alert("Invalid Month");
//     return false;
//   }
//   if (yearChecker && expiry[1] >= year);
//   else {
//     alert("Invalid Year");
//     return false;
//   }
//   userBankInformation.expiryDate = document.getElementById("expiryDate").value;
//   return true;
// }

// function cardHolderValidation(userBankInformation) {
//   return false;
// }

// function cvvValidation(userBankInformation) {
//   return false;
// }

// export { payment };

/*

var PayBtn = document.getElementById("PayBtn");

PayBtn.onclick = function () {
  termsAndCondition(); //The check whether terms and conditions is checked

  fields(); //The check whether all fields are filled
};

function termsAndCondition() {
  let tca = document.getElementById("tca");

  if (!tca.checked) {
    alert("Please check the terms and conditions!");
    return false;
  }
}

function fields() {
  let card_number = document.getElementById("card_number").value;
  let month = document.getElementById("month").value;
  let year = document.getElementById("year").value;
  let name = document.getElementById("name").value;
  let cvv = document.getElementById("cvv").value;
  var flag = 0;

  if (card_number.length != 16 || isNaN(card_number)) {
    alert("Please enter the valid card number");
    flag = 1;
    return false;
  }

     else if (month) {
         alert("Not valid")
         flag = 1
         return false
     }

     else if (year = "") {
         alert("Not valid")
         flag = 1
         return false
    }
  else if (!(name.length > 0)) {
    alert("Please enter valid the name");
    flag = 1;
    return false;
  } else if (!(cvv.length > 0) || isNaN(cvv)) {
    alert("Please enter correct valid CVV");
    flag = 1;
    return false;
  }
}

*/

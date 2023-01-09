function Bookingconfirmation() {
  let userInformation = JSON.parse(localStorage.getItem("userInformation"));
  let newPriceStorage = JSON.parse(localStorage.getItem("newPriceStorage"));
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
  document.getElementById("From").innerHTML = selectedFligthSchedule.fromCity;
  document.getElementById("To").innerHTML = selectedFligthSchedule.toCity;
  document.getElementById("Flightname").innerHTML =
    selectedFligthSchedule.flight;
  document.getElementById("Boardingpoint").innerHTML =
    selectedFligthSchedule.fromCity;
  document.getElementById("Boardingdate").innerHTML = searching.fromDate;
  document.getElementById("Departdate").innerHTML = searching.fromDate;
  document.getElementById("Departtime").innerHTML =
    selectedFligthSchedule.departTime;
  document.getElementById("Duration").innerHTML =
    selectedFligthSchedule.duration;
  document.getElementById("FlightName").innerHTML =
    selectedFligthSchedule.flight;

  document.getElementById(
    "Travel"
  ).innerHTML = `${selectedFligthSchedule.fromCity}  to  ${selectedFligthSchedule.toCity}`;

  let slicedPrice = Number(newPriceStorage);
  let baseFare = (Number(slicedPrice) * 0.68).toFixed(0);
  let taxesAndFees = (Number(slicedPrice) * 0.24).toFixed(0);
  let convenienceFee = (Number(slicedPrice) * 0.08).toFixed(0);

  document.getElementById("Basefare").innerHTML = "₹ " + baseFare;
  document.getElementById("Taxfee").innerHTML = "₹ " + taxesAndFees;
  document.getElementById("Conveniencefee").innerHTML = "₹ " + convenienceFee;
  document.getElementById("Totalpaid").innerHTML = "₹ " + slicedPrice;
  const today = new Date();

  document.getElementById("transactionID").innerHTML = Math.ceil(
    Math.random() * 99999999999999
  );
  document.getElementById("tripId").innerHTML =
    "CNFM" + Math.ceil(Math.random() * 999999);
  var counter = 0;
  let userName = userInformation.map(function (personInfo) {
    counter++;
    return `${personInfo.name}`;
  });
  let userDOB = userInformation.map(function (personInfo) {
    let updateAge = new Date(personInfo.dob);
    let age = Math.floor((today - updateAge) / (365.25 * 24 * 60 * 60 * 1000));
    return `${age}`;
  });

  // let userMobileNumber = userInformation.map(function (personInfo) {
  //   return `${personInfo.mobileNumber}`;
  // });

  let userGender = userInformation.map(function (personInfo) {
    return `${personInfo.gender}`;
  });

  const alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  var userSeat = new Array();
  for (let index = 0; index < counter; index++) {
    const randomCharacter =
      alphabet[Math.floor(Math.random() * alphabet.length)];
    let randomSeat = `${Math.ceil(Math.random() * 10)} ${randomCharacter}`;
    userSeat.push(randomSeat);
  }

  var userConfirm = new Array();
  for (let index = 0; index < counter; index++) {
    userConfirm.push("Confirm");
  }

  for (let index = 0; index < 9; index++) {
    if (userName[index] === undefined) {
      userName[index] = "";
    }
    if (userGender[index] === undefined) {
      userGender[index] = "";
    }
    if (userDOB[index] === undefined) {
      userDOB[index] = "";
    }
    if (userSeat[index] === undefined) {
      userSeat[index] = "";
    }
    if (userConfirm[index] === undefined) {
      userConfirm[index] = "";
    }
  }

  document.getElementById("Passengername1").innerHTML = userName[0];
  document.getElementById("Passengername2").innerHTML = userName[1];
  document.getElementById("Passengername3").innerHTML = userName[2];
  document.getElementById("Passengername4").innerHTML = userName[3];
  document.getElementById("Passengername5").innerHTML = userName[4];
  document.getElementById("Passengername6").innerHTML = userName[5];
  document.getElementById("Passengername7").innerHTML = userName[6];
  document.getElementById("Passengername8").innerHTML = userName[7];
  document.getElementById("Passengername9").innerHTML = userName[8];

  document.getElementById("gender1").innerHTML = userGender[0];
  document.getElementById("gender2").innerHTML = userGender[1];
  document.getElementById("gender3").innerHTML = userGender[2];
  document.getElementById("gender4").innerHTML = userGender[3];
  document.getElementById("gender5").innerHTML = userGender[4];
  document.getElementById("gender6").innerHTML = userGender[5];
  document.getElementById("gender7").innerHTML = userGender[6];
  document.getElementById("gender8").innerHTML = userGender[7];
  document.getElementById("gender9").innerHTML = userGender[8];

  document.getElementById("age1").innerHTML = userDOB[0];
  document.getElementById("age2").innerHTML = userDOB[1];
  document.getElementById("age3").innerHTML = userDOB[2];
  document.getElementById("age4").innerHTML = userDOB[3];
  document.getElementById("age5").innerHTML = userDOB[4];
  document.getElementById("age6").innerHTML = userDOB[5];
  document.getElementById("age7").innerHTML = userDOB[6];
  document.getElementById("age8").innerHTML = userDOB[7];
  document.getElementById("age9").innerHTML = userDOB[8];

  document.getElementById("confirm1").innerHTML = userConfirm[0];
  document.getElementById("confirm2").innerHTML = userConfirm[1];
  document.getElementById("confirm3").innerHTML = userConfirm[2];
  document.getElementById("confirm4").innerHTML = userConfirm[3];
  document.getElementById("confirm5").innerHTML = userConfirm[4];
  document.getElementById("confirm6").innerHTML = userConfirm[5];
  document.getElementById("confirm7").innerHTML = userConfirm[6];
  document.getElementById("confirm8").innerHTML = userConfirm[7];
  document.getElementById("confirm9").innerHTML = userConfirm[8];

  document.getElementById("seat1").innerHTML = userSeat[0];
  document.getElementById("seat2").innerHTML = userSeat[1];
  document.getElementById("seat3").innerHTML = userSeat[2];
  document.getElementById("seat4").innerHTML = userSeat[3];
  document.getElementById("seat5").innerHTML = userSeat[4];
  document.getElementById("seat6").innerHTML = userSeat[5];
  document.getElementById("seat7").innerHTML = userSeat[6];
  document.getElementById("seat8").innerHTML = userSeat[7];
  document.getElementById("seat9").innerHTML = userSeat[8];

  document.getElementById("print").onclick = function () {
    window.print();
  };
  document.getElementById("home").onclick = function () {
    window.location.href = "../search/search.html";
  };
}
Bookingconfirmation();

// Configuration For Search
// Load From local Storage
import { FlightSchedule } from "../models/travel.js";
import { Flight } from "../models/travel.js";
// import { Airline } from "../models/travel.js";

function init() {
  let searching = JSON.parse(localStorage.getItem("searching"));
  // console.log(searching.numberOfPassengers);
  // console.log(searching.fromDate);
  var flightOne = new Flight(1, "66E3", "IndiGo");
  var flightTwo = new Flight(2, "6F4H", "Vistara");
  var flightThree = new Flight(3, "7YEY", "AirIndia");
  var flightFour = new Flight(4, "3J77", "SpiceJet");
  var flightFive = new Flight(5, "9NN3", "GoFirst");
  var flightSix = new Flight(6, "2HD4", "JetAirways");
  var flightSeven = new Flight(7, "4S6D", "AirCosta");
  var flightEight = new Flight(8, "5F8T", "AirPegasus");
  var flightNine = new Flight(9, "7DJ9", "Air Asia");
  var flightTen = new Flight(10, "6T2M", "StarAirways");

  var flightScheduleOne = new FlightSchedule(
    flightOne.flightName,
    searching.fromDate,
    "01:00",
    "3 Hours",
    "04:00",
    searching.numberOfPassengers,
    searching.fromCity,
    searching.toCity,
    "₹ 2546",
    "Non-Stop"
  );

  var flightScheduleTwo = new FlightSchedule(
    flightTwo.flightName,
    searching.fromDate,
    "07:10",
    "3 Hours",
    "10:10",
    searching.numberOfPassengers,
    searching.fromCity,
    searching.toCity,
    "₹ 2374",
    "Non-Stop"
  );

  var flightScheduleThree = new FlightSchedule(
    flightThree.flightName,
    searching.fromDate,
    "06:00",
    "3 Hours",
    "09:00",
    searching.numberOfPassengers,
    searching.fromCity,
    searching.toCity,
    "₹ 2122",
    "Non-Stop"
  );

  var flightScheduleFour = new FlightSchedule(
    flightFour.flightName,
    searching.fromDate,
    "04:00",
    "2 Hours",
    "06:00",
    searching.numberOfPassengers,
    searching.fromCity,
    searching.toCity,
    "₹ 2567",
    "Non-Stop"
  );
  var flightScheduleFive = new FlightSchedule(
    flightFive.flightName,
    searching.fromDate,
    "04:45",
    "3 Hours",
    "07:45",
    searching.numberOfPassengers,
    searching.fromCity,
    searching.toCity,
    "₹ 2280",
    "Non-Stop"
  );
  var flightScheduleSix = new FlightSchedule(
    flightSix.flightName,
    searching.fromDate,
    "05:30",
    "2 Hours",
    "07:30",
    searching.numberOfPassengers,
    searching.fromCity,
    searching.toCity,
    "₹ 2689",
    "Non-Stop"
  );
  var flightScheduleSeven = new FlightSchedule(
    flightSeven.flightName,
    searching.fromDate,
    "03:00",
    "2 Hours",
    "05:00",
    searching.numberOfPassengers,
    searching.fromCity,
    searching.toCity,
    "₹ 2122",
    "Non-Stop"
  );
  var flightScheduleEight = new FlightSchedule(
    flightEight.flightName,
    searching.fromDate,
    "08:40",
    "3 Hours",
    "11:40",
    searching.numberOfPassengers,
    searching.fromCity,
    searching.toCity,
    "₹ 2677",
    "Non-Stop"
  );
  var flightScheduleNine = new FlightSchedule(
    flightNine.flightName,
    searching.fromDate,
    "01:47",
    "2 Hours",
    "03:47",
    searching.numberOfPassengers,
    searching.fromCity,
    searching.toCity,
    "₹ 2489",
    "Non-Stop"
  );
  var flightScheduleTen = new FlightSchedule(
    flightTen.flightName,
    searching.fromDate,
    "12:20",
    "2 Hours",
    "02:20",
    searching.numberOfPassengers,
    searching.fromCity,
    searching.toCity,
    "₹ 2549",
    "Non-Stop"
  );

  //   console.log(localStorage.getItem("searching"));
  //   document.getElementById("test").innerHTML = localStorage.getItem("searching");
  //   console.log(searching);
  // console.log(flightScheduleOne);
  document.getElementById("flightName").innerHTML = flightScheduleOne.flight;
  document.getElementById("flightNumber").innerHTML = flightOne.flightNumber;
  document.getElementById("fromCity").innerHTML = flightScheduleOne.fromCity;
  document.getElementById("toCity").innerHTML = flightScheduleOne.toCity;
  document.getElementById("departTime").innerHTML =
    flightScheduleOne.departTime;
  document.getElementById("duration").innerHTML = flightScheduleOne.duration;
  document.getElementById("reachTime").innerHTML = flightScheduleOne.reachTime;
  document.getElementById("price").innerHTML = flightScheduleOne.price;
  document.getElementById("routes").innerHTML = flightScheduleOne.routes;

  document.getElementById("flightNameTwo").innerHTML = flightScheduleTwo.flight;
  document.getElementById("flightNumberTwo").innerHTML = flightTwo.flightNumber;
  document.getElementById("fromCityTwo").innerHTML = flightScheduleOne.fromCity;
  document.getElementById("toCityTwo").innerHTML = flightScheduleOne.toCity;
  document.getElementById("departTimeTwo").innerHTML =
    flightScheduleTwo.departTime;
  document.getElementById("durationTwo").innerHTML = flightScheduleTwo.duration;
  document.getElementById("reachTimeTwo").innerHTML =
    flightScheduleTwo.reachTime;
  document.getElementById("priceTwo").innerHTML = flightScheduleTwo.price;
  document.getElementById("routesTwo").innerHTML = flightScheduleTwo.routes;

  document.getElementById("flightNameThree").innerHTML =
    flightScheduleThree.flight;
  document.getElementById("flightNumberThree").innerHTML =
    flightThree.flightNumber;
  document.getElementById("fromCityThree").innerHTML =
    flightScheduleOne.fromCity;
  document.getElementById("toCityThree").innerHTML = flightScheduleOne.toCity;
  document.getElementById("departTimeThree").innerHTML =
    flightScheduleThree.departTime;
  document.getElementById("durationThree").innerHTML =
    flightScheduleThree.duration;
  document.getElementById("reachTimeThree").innerHTML =
    flightScheduleThree.reachTime;
  document.getElementById("priceThree").innerHTML = flightScheduleThree.price;
  document.getElementById("routesThree").innerHTML = flightScheduleThree.routes;

  document.getElementById("flightNameFour").innerHTML =
    flightScheduleFour.flight;
  document.getElementById("flightNumberFour").innerHTML =
    flightFour.flightNumber;
  document.getElementById("fromCityFour").innerHTML =
    flightScheduleOne.fromCity;
  document.getElementById("toCityFour").innerHTML = flightScheduleOne.toCity;
  document.getElementById("departTimeFour").innerHTML =
    flightScheduleFour.departTime;
  document.getElementById("durationFour").innerHTML =
    flightScheduleFour.duration;
  document.getElementById("reachTimeFour").innerHTML =
    flightScheduleFour.reachTime;
  document.getElementById("priceFour").innerHTML = flightScheduleFour.price;
  document.getElementById("routesFour").innerHTML = flightScheduleThree.routes;

  document.getElementById("flightNameFive").innerHTML =
    flightScheduleFive.flight;
  document.getElementById("flightNumberFive").innerHTML =
    flightFive.flightNumber;
  document.getElementById("fromCityFive").innerHTML =
    flightScheduleOne.fromCity;
  document.getElementById("toCityFive").innerHTML = flightScheduleOne.toCity;
  document.getElementById("departTimeFive").innerHTML =
    flightScheduleFive.departTime;
  document.getElementById("durationFive").innerHTML =
    flightScheduleFive.duration;
  document.getElementById("reachTimeFive").innerHTML =
    flightScheduleFive.reachTime;
  document.getElementById("priceFive").innerHTML = flightScheduleFive.price;
  document.getElementById("routesFive").innerHTML = flightScheduleFive.routes;

  document.getElementById("flightNameSix").innerHTML = flightScheduleSix.flight;
  document.getElementById("flightNumberSix").innerHTML = flightSix.flightNumber;
  document.getElementById("fromCitySix").innerHTML = flightScheduleOne.fromCity;
  document.getElementById("toCitySix").innerHTML = flightScheduleOne.toCity;
  document.getElementById("departTimeSix").innerHTML =
    flightScheduleSix.departTime;
  document.getElementById("durationSix").innerHTML = flightScheduleSix.duration;
  document.getElementById("reachTimeSix").innerHTML =
    flightScheduleSix.reachTime;
  document.getElementById("priceSix").innerHTML = flightScheduleSix.price;
  document.getElementById("routesSix").innerHTML = flightScheduleSix.routes;

  document.getElementById("flightNameSeven").innerHTML =
    flightScheduleSeven.flight;
  document.getElementById("flightNumberSeven").innerHTML =
    flightSeven.flightNumber;
  document.getElementById("fromCitySeven").innerHTML =
    flightScheduleOne.fromCity;
  document.getElementById("toCitySeven").innerHTML = flightScheduleOne.toCity;
  document.getElementById("departTimeSeven").innerHTML =
    flightScheduleSeven.departTime;
  document.getElementById("durationSeven").innerHTML =
    flightScheduleSeven.duration;
  document.getElementById("reachTimeSeven").innerHTML =
    flightScheduleSeven.reachTime;
  document.getElementById("priceSeven").innerHTML = flightScheduleSeven.price;
  document.getElementById("routesSeven").innerHTML = flightScheduleSeven.routes;

  document.getElementById("flightNameEight").innerHTML =
    flightScheduleEight.flight;
  document.getElementById("flightNumberEight").innerHTML =
    flightEight.flightNumber;
  document.getElementById("fromCityEight").innerHTML =
    flightScheduleOne.fromCity;
  document.getElementById("toCityEight").innerHTML = flightScheduleOne.toCity;
  document.getElementById("departTimeEight").innerHTML =
    flightScheduleEight.departTime;
  document.getElementById("durationEight").innerHTML =
    flightScheduleEight.duration;
  document.getElementById("reachTimeEight").innerHTML =
    flightScheduleEight.reachTime;
  document.getElementById("priceEight").innerHTML = flightScheduleEight.price;
  document.getElementById("routesEight").innerHTML = flightScheduleEight.routes;

  document.getElementById("flightNameNine").innerHTML =
    flightScheduleNine.flight;
  document.getElementById("flightNumberNine").innerHTML =
    flightNine.flightNumber;
  document.getElementById("fromCityNine").innerHTML =
    flightScheduleOne.fromCity;
  document.getElementById("toCityNine").innerHTML = flightScheduleOne.toCity;
  document.getElementById("departTimeNine").innerHTML =
    flightScheduleNine.departTime;
  document.getElementById("durationNine").innerHTML =
    flightScheduleNine.duration;
  document.getElementById("reachTimeNine").innerHTML =
    flightScheduleNine.reachTime;
  document.getElementById("priceNine").innerHTML = flightScheduleNine.price;
  document.getElementById("routesNine").innerHTML = flightScheduleNine.routes;

  document.getElementById("flightNameTen").innerHTML = flightScheduleTen.flight;
  document.getElementById("flightNumberTen").innerHTML = flightTen.flightNumber;
  document.getElementById("fromCityTen").innerHTML = flightScheduleOne.fromCity;
  document.getElementById("toCityTen").innerHTML = flightScheduleOne.toCity;
  document.getElementById("departTimeTen").innerHTML =
    flightScheduleTen.departTime;
  document.getElementById("durationTen").innerHTML = flightScheduleTen.duration;
  document.getElementById("reachTimeTen").innerHTML =
    flightScheduleTen.reachTime;
  document.getElementById("priceTen").innerHTML = flightScheduleTen.price;
  document.getElementById("routesTen").innerHTML = flightScheduleTen.routes;

  document.getElementById("bookOne").onclick = function () {
    let count = 1;
    localStorage.setItem("count", JSON.stringify(count));
    localStorage.setItem(
      "flightScheduleOne",
      JSON.stringify(flightScheduleOne)
    );
    window.open("../booking/booking.html");
  };

  document.getElementById("bookTwo").onclick = function () {
    let count = 2;
    localStorage.setItem("count", JSON.stringify(count));
    localStorage.setItem(
      "flightScheduleTwo",
      JSON.stringify(flightScheduleTwo)
    );
    window.open("../booking/booking.html");
  };

  document.getElementById("bookThree").onclick = function () {
    let count = 3;
    localStorage.setItem("count", JSON.stringify(count));
    localStorage.setItem(
      "flightScheduleThree",
      JSON.stringify(flightScheduleThree)
    );
    window.open("../booking/booking.html");
  };

  document.getElementById("bookFour").onclick = function () {
    let count = 4;
    localStorage.setItem("count", JSON.stringify(count));
    localStorage.setItem(
      "flightScheduleFour",
      JSON.stringify(flightScheduleFour)
    );
    window.open("../booking/booking.html");
  };

  document.getElementById("bookFive").onclick = function () {
    let count = 5;
    localStorage.setItem("count", JSON.stringify(count));
    localStorage.setItem(
      "flightScheduleFive",
      JSON.stringify(flightScheduleFive)
    );
    window.open("../booking/booking.html");
  };

  document.getElementById("bookSix").onclick = function () {
    let count = 6;
    localStorage.setItem("count", JSON.stringify(count));
    localStorage.setItem(
      "flightScheduleSix",
      JSON.stringify(flightScheduleSix)
    );
    window.open("../booking/booking.html");
  };

  document.getElementById("bookSeven").onclick = function () {
    let count = 7;
    localStorage.setItem("count", JSON.stringify(count));
    localStorage.setItem(
      "flightScheduleSeven",
      JSON.stringify(flightScheduleSeven)
    );
    window.open("../booking/booking.html");
  };

  document.getElementById("bookEight").onclick = function () {
    let count = 8;
    localStorage.setItem("count", JSON.stringify(count));
    localStorage.setItem(
      "flightScheduleEight",
      JSON.stringify(flightScheduleEight)
    );
    window.open("../booking/booking.html");
  };

  document.getElementById("bookNine").onclick = function () {
    let count = 9;
    localStorage.setItem("count", JSON.stringify(count));
    localStorage.setItem(
      "flightScheduleNine",
      JSON.stringify(flightScheduleNine)
    );
    window.open("../booking/booking.html");
  };

  document.getElementById("bookTen").onclick = function () {
    let count = 10;
    localStorage.setItem("count", JSON.stringify(count));
    localStorage.setItem(
      "flightScheduleTen",
      JSON.stringify(flightScheduleTen)
    );
    window.open("../booking/booking.html");
  };
  //   localStorage.clear();
  //   localStorage.removeItem("Pass Object")
}

init();

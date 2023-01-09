// 1. Fetch Schedule Onload
import { FlightSchedule } from "../models/travel.js";
import { PaymentInfo } from "../models/travel.js";
import { Passenger } from "../models/travel.js";
window.onload = function () {
  var indigoFlight = new FlightSchedule(
    "66E5",
    "2022-06-03",
    "15:30",
    "3:00",
    100,
    "Bangalore",
    "Delhi",
    "₹3200",
    ["Bangalore", "Delhi"]
  );
  for (let [i, j] of Object.entries(indigoFlight)) {
    document.getElementById(i).value = j;

  }
};

var userPayment = new PaymentInfo(
  "001",
  "UPI",
  "₹3200",
  "T001",
  "Successful",
  "2202-06-03"
);
for (let [key, value] of Object.entries(userPayment)) {
  console.log(key, value);
  //   document.getElementById(key).value = value;
}

// 2. Dynamically Attach The Data To The Control
// 3. Submit Booking Information
// 4. Validate Information (One Function - Rule Validation)

let flight = document.getElementById("flight");
let date = document.getElementById("date");
let time = document.getElementById("time");
let duration = document.getElementById("duration");
let seatsAvailability = document.getElementById("seatsAvailability");
let fromCity = document.getElementById("fromCity");
let toCity = document.getElementById("toCity");
let price = document.getElementById("price");
let routes = document.getElementById("routes");

// 5. Check If Terms And Conditions Is Checked

// 6. Navigate To Payment
// 7. Once The Tickets Booked, Redirect To Homepage

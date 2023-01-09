import { Booking } from "../models/travel.js";
import { PaymentInfo } from "../models/travel.js";
import { FlightSchedule } from "../models/travel.js";
import { indigoFlight } from "../booking/booking";

function bookingService() {
  function saveBooking(ticketBooking) {
    // Call API To Store In Database
  }
}

var flight = indigoFlight;
var ticketBooking = new Booking(
  "001",
  FlightSchedule,
  FlightSchedule.date,
  "checked",
  ["Mayur"],
  PaymentInfo
);

console.log(flight);
console.log(ticketBooking);

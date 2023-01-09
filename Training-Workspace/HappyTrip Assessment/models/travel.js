class Flight {
  constructor(
    flightID,
    flightNumber,
    flightName
    // airline,
    // flightCapacity = []
  ) {
    this.flightID = flightID;
    this.flightNumber = flightNumber;
    this.flightName = flightName;
    // this.airline = airline;
    // this.flightCapacity = flightCapacity;
  }
}

class FlightCapacity {
  constructor(flightName, numberOfSeats) {
    this.flightName = flightName;
    this.numberOfSeats = numberOfSeats;
  }
}

class Airline {
  constructor(id, name, logo, flights = []) {
    this.id = id;
    this.name = name;
    this.logo = logo;
    this.flights = flights;
  }
}

class FlightSchedule {
  constructor(
    flight,
    date,
    departTime,
    duration,
    reachTime,
    // seatsAvailability,
    numberOfPassengers,
    fromCity,
    toCity,
    price,
    routes = []
  ) {
    this.flight = flight;
    this.date = date;
    this.departTime = departTime;
    this.duration = duration;
    this.reachTime = reachTime;
    // this.seatsAvailability = seatsAvailability;
    this.numberOfPassengers = numberOfPassengers;
    this.fromCity = fromCity;
    this.toCity = toCity;
    this.routes = routes;
    this.price = price;
  }
}

class Passenger {
  constructor(name, gender, dob, mobileNumber) {
    this.name = name;
    this.gender = gender;
    this.dob = dob;
    this.mobileNumber = mobileNumber;
  }
}

class Booking {
  constructor(
    id,
    schedule,
    bookingDateTime,
    termsAndConditions,
    passengers = [],
    paymentInfo
  ) {
    this.id = id;
    this.schedule = schedule;
    this.passengers = passengers;
    this.bookingDateTime = bookingDateTime;
    this.termsAndConditions = termsAndConditions;
    this.paymentInfo = paymentInfo;
  }
}

class PaymentInfo {
  constructor(cardNumber, expiryDate, cardHolderName, cvv) {
    this.cardNumber = cardNumber;
    this.expiryDate = expiryDate;
    this.cardHolderName = cardHolderName;
    this.cvv = cvv;
  }
}

// let indigoFlightCapacity = new FlightCapacity("Indigo", 100);
// let indigo = new Flight(001, 1, "Indigo", indigoFlightCapacity);

// console.log(indigo)

export { Airline, FlightSchedule, PaymentInfo, Passenger, Flight };

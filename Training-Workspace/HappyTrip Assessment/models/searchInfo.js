class searchInfo {
  constructor(
    fromCity,
    toCity,
    numberofPassengers,
    numberOfAdults,
    numberOfChilderens,
    fromDate,
    toDate
  ) {
    this.fromCity = fromCity;
    this.toCity = toCity;
    this.numberofPassengers = numberofPassengers;
    this.numberOfAdults = numberOfAdults;
    this.numberOfChilderens = numberOfChilderens;
    this.fromDate = fromDate;
    this.toDate = toDate;
  }
}

export { searchInfo };

// var searchInfo = [];
// export function searchFlights(form) {
//   var fromCity = document.getElementById("fromCity").value;
//   var toCity = document.getElementById("toCity").value;
//   var numberofPassengers = document.getElementById("numberofPassengers").value;
//   var numberOfAdults = document.getElementById("numberOfAdults").value;
//   var numberOfChilderens = document.getElementById("numberOfChilderens").value;
//   var fromDate = document.getElementById("fromDate").value;
//   var toDate = document.getElementById("toDate").value;
//   function searchInfo(
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
// Recieve searchInfo And Return The Flight Schedule And Send To Search Manager
// import { searchManager } from "../search/searchManager.js";
// import { searchInfo } from "";
import { City } from "../models/master.js";

class searchService {
  constructor() {
    this.getcities = function () {
      // Get Data From API
      var cityFive = new City(5, "AMD", "Ahmedabad", "IN");
      var cityOne= new City(1, "BLR", "Bangalore", "IN");
      var citySix = new City(6, "BHO", "Bhopal", "IN");
      var cityNine = new City(9, "MAA", "Chennai", "IN");
      var cityTwo = new City(2, "DEL", "Delhi", "IN");
      var cityEight = new City(8, "GAU", "Guwahati", "IN");
      var cityTen = new City(10, "GOI", "Goa", "IN");
      var cityEleven= new City(11, "HBX", "Hubli", "IN");
      var cityTwelve = new City(12, "HYD", "Hyderabad", "IN");
      var citySeven = new City(7, "IDR", "Indore", "IN");
      var cityFour = new City(4, "KDP", "Kadapa", "IN");
      var cityThree = new City(3, "MUM", "Mumbai", "IN");
      var cityFifteen = new City(15, "TIR", "Tirupati", "IN");
      var cityThirteen = new City(13, "VGA", "Vijayawada", "IN");
      var cityFourteen = new City(14, "VTZ", "Visakhapatnam", "IN");
      var cities = new Array();
      cities.push(cityFive);
      cities.push(cityOne);
      cities.push(citySix);
      cities.push(cityNine);
      cities.push(cityTwo);
      cities.push(cityEight);
      cities.push(cityTen);
      cities.push(cityEleven);
      cities.push(cityTwelve);
      cities.push(citySeven);
      cities.push(cityFour);
      cities.push(cityThree);
      cities.push(cityFifteen);
      cities.push(cityThirteen);
      cities.push(cityFourteen);
      // console.log(cities);
      return cities;
    };

    /*
    10. Consturct The Object To Call The API
    11. Call The API
    12. Recieve Data From API
    13. Handle Any Exceptions If You Get Any
    14. Create Flight Schedule Object And Return Flight Schedule Object To Search Manager
    */
  }
}

export { searchService };

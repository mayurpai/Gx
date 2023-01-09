import { searchService } from "../service/searchService.js";
import { validateSearchInfo } from "./searchController.js";

var searchservice = new searchService();
class searchManager {
  constructor(validateSearchInfo) {
    this.searchManager = function () {
      console.log(validateSearchInfo);
    };
    this.getcities = function () {
      return searchservice.getcities();
    };
    // return false;
    /*
           7. Perform Validation Logic
           8. Import Search Service
           9. Call Search Service And Search For Flights
           15. Store The Flight Schedule With The Manager
           16. Send Success Response Back To Controller (Search)
        */
  }
}

// function resultSearchManager(flights) {
//   console.log(flights);
// }

// }

export { searchManager };

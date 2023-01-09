import { restaurantInfo } from "/Users/mbantwal/GitLab/hands-on_labs-and-case-studies/TypeScript Essentials/LAB12/app";

enum restaurantType {
  "FastFood",
  "Cafeteria",
  "CoffeHouse",
  "Bistros",
  "Cafe",
}

// interface restaurantInfo {
//   name: string;
//   address: string;
//   phoneNumber: number;
//   restaurantType: string;
// }

let subwayRestaurant: restaurantInfo = {
  name: "Subway",
  address: "#123/A Avenue",
  phoneNumber: 9878987878,
  restaurantType: restaurantType[restaurantType.Cafe],
};

let restaurantDetails = (restaurant: restaurantInfo) => {
  console.log(
    `Name: ${restaurant.name}  Address: ${restaurant.address}  Phone: ${restaurant.phoneNumber} Restaurant Type: ${restaurant.restaurantType}`
  );
};

restaurantDetails(subwayRestaurant);

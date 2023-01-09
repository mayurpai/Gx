enum restaurantType {
  "FastFood",
  "Cafeteria",
  "CoffeHouse",
  "Bistros",
  "Cafe",
}

interface restaurantInfo {
  name: string;
  address: string;
  phoneNumber: number;
  restaurantType: string;
}

var subwayRestaurant: restaurantInfo = {
  name: "Subway",
  address: "#123/A Avenue",
  phoneNumber: 9878987878,
  restaurantType: restaurantType[restaurantType.Cafe],
};

var restaurantDetails = (restaurant: restaurantInfo) => {
  console.log(
    `Name: ${restaurant.name}  Address: ${restaurant.address}  Phone: ${restaurant.phoneNumber} Restaurant Type: ${restaurant.restaurantType}`
  );
};
restaurantDetails(subwayRestaurant);

let restaurantList: restaurantInfo[] = {
    restaurantList.push(subwayRestaurant)
    {name: "MTR", address: "Bangalore", phoneNumber: 1231231230, restaurantType: restaurantType[restaurantType.FastFood]},
    {name: "Paradise", address: "Mangalore", phoneNumber: 3453453459, restaurantType: restaurantType[restaurantType.Bistros]}
};


let GetRestaurantList = (restaurantList: any[]) => {
    restaurantList.forEach((restaurant, index) => console.log(`${index + 1}. ${restaurant}`));
};

GetRestaurantList(restaurantList);

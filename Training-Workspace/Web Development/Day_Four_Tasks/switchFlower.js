var flowerName = prompt("Enter The Flower Name: ");

switch (flowerName) {
  case "Rose":
    alert(`${flowerName} Costs ₹10`);
    break;
  case "Daisy":
    alert(`${flowerName} Costs ₹20`);
    break;

  default:
    alert("There Is No Such Flower!");
    break;
}

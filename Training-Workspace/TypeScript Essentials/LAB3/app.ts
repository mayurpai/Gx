function totalPrice(itemPrice, deliveryCharge) {
  const total: number = itemPrice + deliveryCharge;
  return total;
}

const itemPrice: number = 50;
const deliveryCharge: number = 15.6;
console.log(totalPrice(itemPrice, deliveryCharge));

function totalPrice(
  itemPrice: number,
  deliveryCharge: number,
  showRes: boolean
) {
  if (showRes) {
    const total: number = itemPrice + deliveryCharge;
    console.log(total);
  } else return;
}
const showRes: boolean = true;
const itemPrice: number = 50;
const deliveryCharge: number = 15.6;
totalPrice(itemPrice, deliveryCharge, showRes);

function totalPrice(
  itemPrice: number,
  deliveryCharge: number,
  showRes: boolean,
  customString: string
) {
  if (showRes) {
    const total: number = itemPrice + deliveryCharge;
    console.log(`Item Price: ${itemPrice}`);
    console.log(`Delivery Charge: ${deliveryCharge}`);
    console.log(`Total: ${total}`);
  } else return;
}
let customString: string = "Chocolate Shake Price: ";
const showRes: boolean = true;
const itemPrice: number = 50;
const deliveryCharge: number = 15.6;
totalPrice(itemPrice, deliveryCharge, showRes, customString);

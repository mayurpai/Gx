namespace priceCalculator {
  export function orderPrice(orderAmount: number, discountAmount: number) {
    return orderAmount - discountAmount;
  }
}

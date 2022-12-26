import axios from "axios";
import React from "react";

function Cart() {
  const getProductFromCart = process.env.REACT_APP_GET_PRODUCT_FROM_CART;
  const userEmail = "mayur5pai@gmail.com";
  axios
    .get(`${getProductFromCart}/${userEmail}`)
    .then((response) => console.log(response.data));
  return <div>Cart</div>;
}

export default Cart;

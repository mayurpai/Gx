import React from "react";
import "../styles/EmptyCart.scss";
import EmptyCartImage from "../images/cart-empty.png";
import { Link } from "react-router-dom";

function EmptyCart() {
  return (
    <div className="empty-cart-main-container">
      <div className="empty-cart-main">
        <div className="empty-cart-help">
          <button>Help</button>
        </div>
        <div className="empty-cart-content">
          <div className="empty-cart-title">
            <h3>
              Your cart is empty <br />{" "}
              <span>Check out what we're featuring now!</span>
            </h3>
          </div>
          <Link to="/">
            <div className="empty-cart-sign-in-button">
              <button>Go to homepage</button>
            </div>
          </Link>
          <div className="empty-cart-image-div">
            <img src={EmptyCartImage} className="empty-cart-image"></img>
          </div>
        </div>
      </div>
    </div>
  );
}

export default EmptyCart;

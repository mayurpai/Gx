import React from "react";
import "../styles/ItemCard.scss";
import { BsHeart } from "react-icons/bs";

function ItemCard() {
  return (
    <div className="item-card">
      <div className="item-card-image-div">
        <img
          className="item-card-image"
          src="https://target.scene7.com/is/image/Target/GUEST_ae617068-9093-421c-b299-5470cc0fc9e7?qlt=85&fmt=webp&hei=325&wid=325"
        ></img>
      </div>
      <div className="item-card-flex">
        <div className="item-card-details">
          <div className="item-card-title">
            Vitamix OneTM 10-Speed Blender - Black
          </div>
          <div className="item-card-company">Vitamix</div>
          <div className="item-card-price">
            $149.99 <span>reg $249.99</span>
          </div>
          <div className="item-card-detail">
            Sale <br /> <span>When purchased online</span>
          </div>
        </div>
        <div className="item-card-like">
          <span>
            <BsHeart />
          </span>
        </div>
      </div>
      <div className="item-card-add-to-cart">
        <button
          className="item-card-add-to-cart-button"
          onClick={() => alert("Add To Cart")}
        >
          Add to cart
        </button>
      </div>
    </div>
  );
}

export default ItemCard;

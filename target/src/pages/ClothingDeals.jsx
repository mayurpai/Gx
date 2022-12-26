import React, { useState, useEffect } from "react";
import axios from "axios";
import { BsHeart } from "react-icons/bs";

import HomeDealsImage from "../images/home-deals.webp";
import ElectronicDeals from "../images/electronic-deals.webp";
import ClothingDealsImage from "../images/clothing-deals.webp";
import ToyDeals from "../images/toy-deals.webp";
import BeautyDeals from "../images/beauty-deals.webp";
import { Link } from "react-router-dom";
import Categories from "../components/Categories";
import Header from "../components/Header";
import TopHeader from "../components/TopHeader";
import BottomFooter from "../components/BottomFooter";
import Footer from "../components/Footer";

function ClothingDeals() {
  const [Product, setProduct] = useState([]);
  const [StatusCode, setStatusCode] = useState();

  useEffect(() => {
    const getAllClothingProducts =
      process.env.REACT_APP_GET_PRODUCT_BY_PRODUCT_TYPE_CLOTHING;
    axios
      .get(getAllClothingProducts)
      .then((response) => {
        setProduct(response.data);
        setStatusCode(response.status);
      })
      .catch((error) => {
        if (error.response) {
          setStatusCode(error.response.status);
          setProduct(error.response.data);
        } else if (error.request) {
          setStatusCode(error.request);
          setProduct(Object.values(error.request));
        } else {
          setProduct(Object.values(error.message));
        }
      });
  }, []);
  return (
    <>
      <TopHeader />
      <Header />
      <div className="categories-flex">
        <Link to="../Home-Deals">
          <Categories image={HomeDealsImage} description="Home Deals" />
        </Link>
        <Link to="../Electronic-Deals">
          <Categories image={ElectronicDeals} description="Electronic Deals" />
        </Link>
        <Link to="../Clothing-Deals">
          <Categories image={ClothingDealsImage} description="Clothing Deals" />
        </Link>
        <Link to="../Toy-Deals">
          <Categories image={ToyDeals} description="Toy Deals" />
        </Link>
        <Link to="../Beauty-Deals">
          <Categories
            image={BeautyDeals}
            description="Beauty & Personal Care Deals"
          />
        </Link>
      </div>
      {StatusCode === 200 ? (
        <div className="item-card-main-container">
          {Product.map((data) => {
            return (
              <div key={data.productId} className="item-card">
                <div className="item-card-image-div">
                  <img className="item-card-image" src={data.productURL}></img>
                </div>
                <div className="item-card-flex">
                  <div className="item-card-details">
                    <div className="item-card-title">{data.productName}</div>
                    <div className="item-card-company">{data.productBrand}</div>
                    <div className="item-card-price">
                      ${data.productPrice}{" "}
                      <span>reg ${data.productPrice + 100}</span>
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
          })}
        </div>
      ) : (
        <section className="page-four-zero-four">
          <div className="four-zero-four-bg">
            <img
              className="four-zero-four-gif"
              src="https://cdn.dribbble.com/users/285475/screenshots/2083086/dribbble_1.gif"
            ></img>
          </div>
          <div className="contant-box-four-zero-four">
            <h1>{StatusCode}</h1>
            <h3>{Product.message}</h3>
          </div>
        </section>
      )}
      <Footer />
      <BottomFooter />
    </>
  );
}

export default ClothingDeals;

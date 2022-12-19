import React, { useState, useEffect } from "react";
import "../styles/ItemCard.scss";
import axios from "axios";
import { BsHeart } from "react-icons/bs";

function ItemCard() {
  const [Product, setProduct] = useState([]);
  const [StatusCode, setStatusCode] = useState();
  const {
    REACT_APP_GET_PRODUCT_BELOW_TEN_DOLLARS,
    REACT_APP_GET_PRODUCT_BELOW_FIFTY_DOLLARS,
    REACT_APP_GET_PRODUCT_SORTED_ASCENDING,
    REACT_APP_GET_PRODUCT_SORTED_DESCENDING,
  } = process.env;
  const getHelper = async (URL) => {
    console.log(URL);
    const getAllProductsBelowTenDollars = URL;
    await axios
      .get(getAllProductsBelowTenDollars)
      .then((response) => {
        setProduct(response.data);
        console.log(response);
        setStatusCode(response.status);
      })
      .catch((error) => {
        if (error.response) {
          console.log(error.response.data);
          console.log(error.response.status);
          console.log(error.response.headers);
          setStatusCode(error.response.status);
          setProduct(error.response.data);
        } else if (error.request) {
          setStatusCode(error.request);
          setProduct(Object.values(error.request));
        } else {
          console.log("Error", error.message);
          setProduct(Object.values(error.message));
        }
        console.log(error.config);
      });
  };

  useEffect(() => {
    const getAllProducts = process.env.REACT_APP_GET_ALL_PRODUCTS_URL;
    axios
      .get(getAllProducts)
      .then((response) => {
        setProduct(response.data);
        console.log(response);
        setStatusCode(response.status);
      })
      .catch((error) => {
        if (error.response) {
          console.log(error.response.data);
          console.log(error.response.status);
          console.log(error.response.headers);
          //   setProduct(Object.values(error.response.data));
          setStatusCode(error.response.status);
          setProduct(error.response.data);
        } else if (error.request) {
          setStatusCode(error.request);
          setProduct(Object.values(error.request));
        } else {
          console.log("Error", error.message);
          setProduct(Object.values(error.message));
        }
        console.log(error.config);
      });
  }, []);

  return (
    <>
      <div className="filter-flex">
        <div className="filter-top">
          <button
            className="filter"
            onClick={() => {
              getHelper(
                Object.values({ REACT_APP_GET_PRODUCT_BELOW_TEN_DOLLARS })
              );
            }}
          >
            Under $10
          </button>
          <button
            className="filter"
            onClick={() => {
              getHelper(
                Object.values({ REACT_APP_GET_PRODUCT_BELOW_FIFTY_DOLLARS })
              );
            }}
          >
            Under $50
          </button>
        </div>
        <div className="filter-bottom">
          <button
            className="filter-button"
            onClick={() => {
              getHelper(
                Object.values({ REACT_APP_GET_PRODUCT_SORTED_ASCENDING })
              );
            }}
          >
            Price: Low To High
          </button>
          <button
            className="filter-button"
            onClick={() => {
              getHelper(
                Object.values({ REACT_APP_GET_PRODUCT_SORTED_DESCENDING })
              );
            }}
          >
            Price: High To Low
          </button>
        </div>
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
        <section class="page-four-zero-four">
          <div class="four-zero-four-bg">
            <img
              className="four-zero-four-gif"
              src="https://cdn.dribbble.com/users/285475/screenshots/2083086/dribbble_1.gif"
            ></img>
          </div>
          <div class="contant-box-four-zero-four">
            <h1>{StatusCode}</h1>
            <h3>{Product.message}</h3>
          </div>
        </section>
      )}
    </>
  );
}

export default ItemCard;

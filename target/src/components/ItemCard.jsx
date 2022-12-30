import React, { useState, useEffect } from "react";
import "../styles/ItemCard.scss";
import axios from "axios";
import { BsHeart } from "react-icons/bs";
import { useNavigate } from "react-router-dom";

function ItemCard() {
  const navigate = useNavigate();
  const [Product, setProduct] = useState([]);
  const [StatusCode, setStatusCode] = useState();
  const {
    REACT_APP_GET_PRODUCT_BELOW_TEN_DOLLARS,
    REACT_APP_GET_PRODUCT_BELOW_FIFTY_DOLLARS,
    REACT_APP_GET_PRODUCT_SORTED_ASCENDING,
    REACT_APP_GET_PRODUCT_SORTED_DESCENDING,
    REACT_APP_GET_PRODUCT_BY_ID,
  } = process.env;
  const getHelper = async (URL) => {
    console.log(URL);
    const sortedAPI = URL;
    await axios
      .get(sortedAPI)
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
  };

  useEffect(() => {
    const getAllProducts = process.env.REACT_APP_GET_ALL_PRODUCTS_URL;
    axios
      .get(getAllProducts)
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
          {Product.map((data) => (
            <div
              key={data.productId}
              className="item-card"
              onClick={() => {
                localStorage.setItem(
                  "productIdStore",
                  window.btoa(data.productId)
                );
                localStorage.setItem("productId", data.productId);
                navigate("/Product", {
                  state: {
                    getProductByIdUrl: Object.values({
                      REACT_APP_GET_PRODUCT_BY_ID,
                    }),
                    productId: data.productId,
                  },
                });
              }}
            >
              <div className="item-card-image-div">
                <img
                  className="item-card-image"
                  src={data.images[0].imageUrl}
                ></img>
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
          ))}
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
    </>
  );
}

export default ItemCard;

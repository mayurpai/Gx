import React, { useState, useEffect } from "react";
import "../styles/ItemCard.scss";
import axios from "axios";
import { BsHeart } from "react-icons/bs";
import { useNavigate } from "react-router-dom";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useGlobalContext } from "../Context";

function ItemCard() {
  const navigate = useNavigate();
  const { userEmailStorage, cartCount } = useGlobalContext();
  const [Product, setProduct] = useState([]);
  const [StatusCode, setStatusCode] = useState();
  const {
    REACT_APP_GET_PRODUCT_BELOW_TEN_DOLLARS,
    REACT_APP_GET_PRODUCT_BELOW_FIFTY_DOLLARS,
    REACT_APP_GET_PRODUCT_SORTED_ASCENDING,
    REACT_APP_GET_PRODUCT_SORTED_DESCENDING,
    REACT_APP_GET_PRODUCT_BY_ID,
  } = process.env;
  const adminUserEmail = "mayur5pai@gmail.com";
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

  const handleCartSubmit = async (productId) => {
    const postProductToCart = process.env.REACT_APP_POST_PRODUCT_TO_CART;
    const dataToPost = {
      userEmail: userEmailStorage,
      productId: productId,
      productQuantity: 1,
    };

    await axios
      .post(
        `${postProductToCart}/${dataToPost.userEmail}/${dataToPost.productId}/${dataToPost.productQuantity}`
      )
      .then((response) => {
        toast.success("Added to cart.");
        setStatusCode(response.status);
        {
          localStorage.setItem("cartStore", window.btoa(Number(cartCount) + 1));
        }
        setTimeout(() => {
          window.location.reload();
        }, 3000);
      })
      .catch((error) => {
        if (error.response) {
          toast.error("Sign in to add to cart.");
        } else if (error.request) {
          setStatusCode(error.request);
        }
      });
  };

  const deleteProduct = async (productId) => {
    const deleteProductByAdmin = process.env.REACT_APP_DELETE_PRODUCT;
    await axios
      .delete(`${deleteProductByAdmin}/${productId}`)
      .then((response) => {
        toast.success("Item deleted successfully.");
        setStatusCode(response.status);
        setTimeout(() => {
          window.location.reload();
        }, 3000);
      })
      .catch((error) => {
        if (error.response) {
          toast.error("Could not delete item.");
        } else if (error.request) {
          setStatusCode(error.request);
        }
      });
  };

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
        {userEmailStorage === adminUserEmail ? (
          <button
            style={{
              backgroundColor: "#cc0000",
              padding: "0.75rem",
              color: "#FFFFFF",
              borderRadius: "0.4rem",
              border: "none",
              fontSize: "0.85rem",
              fontWeight: "600",
              cursor: "pointer",
              transition: "all linear 0.1s",
            }}
            onClick={() => navigate("/Add-Product")}
          >
            Add Product
          </button>
        ) : (
          ""
        )}
      </div>
      {StatusCode === 200 ? (
        <div className="item-card-main-container">
          {Product.map((data) => (
            <div key={data.productId} className="item-card">
              <div className="item-card-image-div">
                <img
                  className="item-card-image"
                  src={data.images[0].imageUrl}
                  onMouseEnter={(e) =>
                    (e.currentTarget.src = data.images[1].imageUrl)
                  }
                  onMouseLeave={(e) =>
                    (e.currentTarget.src = data.images[0].imageUrl)
                  }
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
                  onClick={() => handleCartSubmit(data.productId)}
                >
                  Add to cart
                </button>
                {userEmailStorage === adminUserEmail ? (
                  <button
                    className="item-card-add-to-cart-button"
                    onClick={() => {
                      localStorage.setItem(
                        "productIdStore",
                        window.btoa(data.productId)
                      );
                      localStorage.setItem("productId", data.productId);
                      navigate("/Update-Product", {
                        state: {
                          getProductByIdUrl: Object.values({
                            REACT_APP_GET_PRODUCT_BY_ID,
                          }),
                          productId: data.productId,
                        },
                      });
                    }}
                  >
                    Edit
                  </button>
                ) : (
                  ""
                )}
                {userEmailStorage === adminUserEmail ? (
                  <button
                    className="item-card-add-to-cart-button"
                    onClick={() => deleteProduct(data.productId)}
                  >
                    Delete
                  </button>
                ) : (
                  ""
                )}
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
      <ToastContainer
        position="bottom-center"
        autoClose={1000}
        hideProgressBar={false}
        newestOnTop={false}
        closeOnClick
        rtl={false}
        pauseOnFocusLoss
        draggable
        pauseOnHover
        theme="light"
      />
    </>
  );
}

export default ItemCard;

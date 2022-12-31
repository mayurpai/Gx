import axios from "axios";
import React, { useState, useEffect, createContext, useContext } from "react";
import BottomFooter from "../components/BottomFooter";
import EmptyCart from "../components/EmptyCart";
import Footer from "../components/Footer";
import Header from "../components/Header";
import NewsLetter from "../components/NewsLetter";
import TopHeader from "../components/TopHeader";
import "../styles/Cart.scss";
import { FaShippingFast } from "react-icons/fa";
import { AiOutlineClose } from "react-icons/ai";
import { AiFillGift } from "react-icons/ai";
import { MdCardGiftcard } from "react-icons/md";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useGlobalContext } from "../Context";

function Cart() {
  document.title = "Cart : Target";
  const { userEmailStorage } = useGlobalContext();

  const [Product, setProduct] = useState([]);
  const [StatusCode, setStatusCode] = useState();
  const deleteAllProductsFromCart =
    process.env.REACT_APP_DELETE_ALL_PRODUCTS_FROM_CART;
  const deleteProductFromCart = process.env.REACT_APP_DELETE_PRODUCT_FROM_CART;
  useEffect(() => {
    const getProductFromCart = process.env.REACT_APP_GET_PRODUCT_FROM_CART;
    axios
      .get(`${getProductFromCart}/${userEmailStorage}`)
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

  //   const getInitialState = () => {
  //     const quantity = "1";
  //     return quantity;
  //   };

  const [quantity, setQuantity] = useState(Product.quantity);

  //   const handleChange = (e, productIdForDelete) => {
  //     setQuantity(e.target.value);
  //     console.log(productIdForDelete);
  //   };

  const deleteAllItems = async () => {
    await axios
      .delete(`${deleteAllProductsFromCart}/${userEmailStorage}`)
      .then((response) => {
        setProduct(response.data);
        setStatusCode(201);
        toast.success("All items removed from cart.");
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

  const deleteItems = async (productIdForDelete) => {
    return await axios
      .delete(
        `${deleteProductFromCart}/${userEmailStorage}/${productIdForDelete}`
      )
      .then((response) => {
        setProduct(response.data);
        setStatusCode(response.status);
        toast.success("Item removed from cart.");
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

  //   useEffect(() => {
  //     deleteItems();
  //   }, []);

  return (
    <>
      <TopHeader />
      <Header />
      {StatusCode === 200 && Product?.length !== 0 ? (
        <div className="cart-main-container">
          <div className="cart-main">
            <div className="cart-main-left">
              <div className="cart-left">
                <div className="cart-title">
                  <h2>Cart</h2>
                </div>
                <div className="cart-shipping">
                  <h3>
                    $
                    {Product?.map(
                      (data) => data.quantity * data.product.productPrice
                    )
                      .reduce((a, c) => a + c, 0)
                      .toFixed(2)}{" "}
                    subtotal
                  </h3>
                  <ul>
                    <li>
                      {Product?.map((data) => data.quantity).reduce(
                        (a, c) => a + c,
                        0
                      )}{" "}
                      items
                    </li>
                  </ul>
                </div>
              </div>
              <div className="cart-item">
                <div className="cart-shipping-items">
                  <div className="cart-shipping-items-flex">
                    <div className="cart-shipping-icon">
                      <FaShippingFast />
                    </div>
                    <div className="cart-shipping-title">
                      <h1>
                        Shipping <br />
                        <span>
                          {Product?.map((data) => data.quantity).reduce(
                            (a, c) => a + c,
                            0
                          )}{" "}
                          items
                        </span>
                      </h1>
                    </div>
                  </div>
                  <button onClick={deleteAllItems}>Delete all items</button>
                </div>
                <div className="cart-single-item-container">
                  {Product?.map((data) => (
                    <div className="cart-single-item" key={data.cartId}>
                      <div className="cart-single-image">
                        <img src={data.product.images[0].imageUrl}></img>
                      </div>
                      <div className="cart-single-title">
                        <h4>{data.product.productName}</h4>
                        <div className="product-page-quantity">
                          <label>
                            <select
                              className="product-page-select"
                                value={data.quantity}
                              onChange={(e) => {
                                const selectedChoice = e.target.value;
                                setQuantity(selectedChoice);
                                // handleChange(data.product.productId);
                              }}
                            >
                              <option value="1">Qty 1</option>
                              <option value="2">Qty 2</option>
                              <option value="3">Qty 3</option>
                            </select>
                          </label>
                        </div>
                      </div>
                      <div className="cart-single-radio">
                        <div className="cart-single-radio-flex">
                          <input
                            type="radio"
                            // name="Standard shipping"
                            value="Standard shipping Get it by Mon, Jan 2"
                            checked
                          />
                          <label for="Standard shipping">
                            Standard shipping Get it by Mon, Jan 2
                          </label>
                        </div>
                      </div>
                      <div className="cart-single-item-price">
                        <p>${data.quantity * data.product.productPrice}</p>
                      </div>
                      <div
                        className="cart-single-item-delete"
                        onClick={() => deleteItems(data.product.productId)}
                      >
                        <AiOutlineClose />
                      </div>
                    </div>
                  ))}
                </div>
              </div>
            </div>
            <div className="cart-main-right">
              <div className="cart-order-summary">
                <div className="cart-order-title">
                  <h2>Order summary</h2>
                </div>
                <div className="cart-order-gift">
                  <h3>
                    <AiFillGift style={{ fontSize: "2rem" }} />
                    Order includes a gift
                  </h3>
                </div>
                <div className="cart-promo">
                  <h3>
                    <MdCardGiftcard style={{ fontSize: "2rem" }} />
                    Promo code
                  </h3>
                </div>
                <div className="cart-details">
                  <div className="cart-price">
                    <h3>
                      Subtotal (
                      {Product?.map((data) => data.quantity).reduce(
                        (a, c) => a + c,
                        0
                      )}{" "}
                      items)
                    </h3>
                    <h3>
                      $
                      {Product?.map(
                        (data) => data.quantity * data.product.productPrice
                      )
                        .reduce((a, c) => a + c, 0)
                        .toFixed(2)}{" "}
                    </h3>
                  </div>
                  <div className="cart-delivery">
                    <h3>Delivery</h3>
                    <h3>Free</h3>
                  </div>
                  <div className="cart-estimated-tax">
                    <h3>Estimated tax</h3>
                    <h3>$0.00</h3>
                  </div>
                  <div className="cart-total">
                    <h3>Total</h3>
                    <h3>
                      $
                      {Product?.map(
                        (data) => data.quantity * data.product.productPrice
                      )
                        .reduce((a, c) => a + c, 0)
                        .toFixed(2)}{" "}
                    </h3>
                  </div>
                  <div className="cart-checkout-button">
                    <button>Check out</button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      ) : (
        <EmptyCart />
      )}
      <NewsLetter />
      <Footer />
      <BottomFooter />
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

export default Cart;

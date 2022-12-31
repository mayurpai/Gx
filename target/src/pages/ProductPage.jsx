import React, { useState, useEffect } from "react";
import { AiOutlineExclamationCircle } from "react-icons/ai";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import ReactImageMagnify from "react-image-magnify";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useGlobalContext } from "../Context";

function ProductPage(props) {
  const [StatusCode, setStatusCode] = useState();
  const [images, setImages] = useState();
  const [image, setImage] = useState("");
  const navigate = useNavigate();
  const ratingCount = Math.floor(Math.random() * (600 - 100 + 1)) + 1;
  const productIds = localStorage.getItem("productId");
  const { userEmailStorage, cartCount } = useGlobalContext();
  document.title = props.product.productName;

  const getInitialState = () => {
    const quantity = "1";
    return quantity;
  };

  const [quantity, setQuantity] = useState(getInitialState);

  const handleChange = (e) => {
    setQuantity(e.target.value);
  };

  useEffect(() => {
    const getImageListByProductId =
      process.env.REACT_APP_GET_IMAGE_LIST_BY_PRODUCT_ID;
    axios
      .get(`${getImageListByProductId}/${productIds}`)
      .then((response) => {
        setImage(response.data[0].imageUrl);
        setImages(response.data);
        setStatusCode(response.status);
      })
      .catch((error) => {
        if (error.response) {
          setStatusCode(error.response.status);
          setImages(error.response.data);
        } else if (error.request) {
          setStatusCode(error.request);
          setImages(Object.values(error.request));
        } else {
          setImages(Object.values(error.message));
        }
      });
  }, []);

  const handleCartSubmit = async (e) => {
    e.preventDefault();
    const postProductToCart = process.env.REACT_APP_POST_PRODUCT_TO_CART;
    const dataToPost = {
      userEmail: userEmailStorage,
      productId: props.product.productId,
      productQuantity: quantity,
    };

    await axios
      .post(
        `${postProductToCart}/${dataToPost.userEmail}/${dataToPost.productId}/${dataToPost.productQuantity}`
      )
      .then((response) => {
        setStatusCode(response.status);
        toast.success("Added to cart.");
        {
          localStorage.setItem("cartStore", window.btoa(Number(cartCount) + Number(quantity)));
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

  return (
    <div className="product-page-main-container">
      <form className="product-page-cart-form" onSubmit={handleCartSubmit}>
        <div className="product-page-title">{props.product.productName}</div>
        <div className="product-page-image-desc">
          <div className="product-page-list-images">
            {images?.map((data) => {
              return (
                <img
                  key={data.imageId}
                  src={data.imageUrl}
                  onClick={() => setImage(data.imageUrl)}
                ></img>
              );
            })}
          </div>
          <div className="product-page-image-div">
            <ReactImageMagnify
              style={{
                position: "absolute",
                zIndex: "9",
              }}
              {...{
                smallImage: {
                  alt: "Wristwatch by Ted Baker London",
                  src: image,
                  width: 500,
                  height: 500,
                },
                largeImage: {
                  src: image,
                  width: 1920,
                  height: 1080,
                },
                isHintEnabled: true,
                shouldHideHintAfterFirstActivation: false,
              }}
            />
          </div>
          <div className="product-page-desc">
            <div className="product-page-price">
              ${props.product.productPrice}
            </div>
            <div className="product-page-line">
              When purchased online
              <AiOutlineExclamationCircle
                style={{ transform: "rotate(180deg)", fontSize: "1.25rem" }}
              />
            </div>
            <div className="product-page-rating">
              <div className="product-page-rating-stars"></div>
              <div className="product-page-rating-stars"></div>
              <div className="product-page-rating-stars"></div>
              <div className="product-page-rating-stars"></div>
              <div className="product-page-rating-count">{ratingCount}</div>
            </div>
            <div className="product-page-cart-desc">
              Choose delivery method in cart
            </div>
            <div className="product-page-quantity-add-to-cart">
              <div className="product-page-quantity">
                <label>
                  Qty
                  <select
                    className="product-page-select"
                    value={quantity}
                    onChange={handleChange}
                  >
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                  </select>
                </label>
              </div>
              <div className="product-page-add-to-cart">
                <button type="submit" className="add-to-cart-button">
                  Add to cart
                </button>
              </div>
            </div>
          </div>
        </div>
      </form>
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
    </div>
  );
}

export default ProductPage;

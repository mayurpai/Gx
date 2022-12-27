import React, { useState } from "react";
import { AiOutlineExclamationCircle } from "react-icons/ai";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import ReactImageMagnify from "react-image-magnify";

function ProductPage(props) {
  const [StatusCode, setStatusCode] = useState();
  const navigate = useNavigate();
  const ratingCount = Math.floor(Math.random() * (600 - 100 + 1)) + 1;

  const getInitialState = () => {
    const quantity = "1";
    return quantity;
  };

  const [quantity, setQuantity] = useState(getInitialState);

  const handleChange = (e) => {
    setQuantity(e.target.value);
  };

  const handleCartSubmit = async (e) => {
    e.preventDefault();
    const postProductToCart = process.env.REACT_APP_POST_PRODUCT_TO_CART;
    const dataToPost = {
      userEmail: "mayur5pai@gmail.com",
      productId: props.product.productId,
      productQuantity: quantity,
    };

    await axios
      .post(
        `${postProductToCart}/${dataToPost.userEmail}/${dataToPost.productId}/${dataToPost.productQuantity}`
      )
      .then((response) => {
        setStatusCode(response.status);
        navigate("/Cart");
      })
      .catch((error) => {
        if (error.response) {
          alert(error.response.data.message);
        } else if (error.request) {
          setStatusCode(error.request);
        }
      });
  };

  const imgs = [
    {
      id: 1,
      value:
        "https://www.thehalogroup.com/wp-content/uploads/2016/04/google-search-engine-thumb-400x400.jpg",
    },
    {
      id: 2,
      value: "https://mcdn.wallpapersafari.com/374/51/21/E7xKjA.png",
    },
    {
      id: 3,
      value:
        "https://visualcomposer.com/wp-content/uploads/2020/08/sitekit-by-google-plugin-for-wordpress-600x218.png",
    },
    {
      id: 4,
      value:
        "https://www.androidsis.com/wp-content/uploads/2016/01/app-de-google.jpg",
    },
    {
      id: 5,
      value:
        "https://www.androidsis.com/wp-content/uploads/2016/01/app-de-google.jpg",
    },
  ];

  const [image, setImage] = useState(imgs[0]);

  return (
    <div className="product-page-main-container">
      <form className="product-page-cart-form" onSubmit={handleCartSubmit}>
        <div className="product-page-title">{props.product.productName}</div>
        <div className="product-page-image-desc">
          <div className="product-page-list-images">
            {/* <img className="product-page-image" src={image.value}></img> */}
            {imgs.map((data, index) => {
              return (
                <img
                  key={data.id}
                  src={data.value}
                  onClick={() => setImage(imgs[index])}
                ></img>
              );
            })}
            {/* <img
              className="product-page-image"
              src="https://th.bing.com/th/id/R.6edf02018b1372f6a33105025af73e06?rik=5ypBiYhVnNeQyQ&riu=http%3a%2f%2fwww.pixelstalk.net%2fwp-content%2fuploads%2f2016%2f04%2fGoogle-images-HD-wallpaper.png&ehk=9xlZ08okwdp95Cxw7to3eaQyl2rH9b2mxE9gT%2bNd8a8%3d&risl=&pid=ImgRaw&r=0"
              onClick={() =>
                setImage(
                  "https://th.bing.com/th/id/R.6edf02018b1372f6a33105025af73e06?rik=5ypBiYhVnNeQyQ&riu=http%3a%2f%2fwww.pixelstalk.net%2fwp-content%2fuploads%2f2016%2f04%2fGoogle-images-HD-wallpaper.png&ehk=9xlZ08okwdp95Cxw7to3eaQyl2rH9b2mxE9gT%2bNd8a8%3d&risl=&pid=ImgRaw&r=0"
                )
              }
            ></img>
            <img
              className="product-page-image"
              src={image}
              onClick={() => setImage(image)}
            ></img>
            <img
              className="product-page-image"
              src={image}
              onClick={() => setImage(image)}
            ></img>
            <img
              className="product-page-image"
              src={image}
              onClick={() => setImage(image)}
            ></img>
            <img
              className="product-page-image"
              src={image}
              onClick={() => setImage(image)}
            ></img> */}
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
                  src: image.value,
                  width: 500,
                  height: 500,
                },
                largeImage: {
                  src: image.value,
                  width: 1920,
                  height: 1080,
                },
                isHintEnabled: true,
                shouldHideHintAfterFirstActivation: false,
              }}
            />
            {/* <img className="product-page-image" src={image.value}></img> */}
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
            <div className=""></div>
          </div>
        </div>
      </form>
    </div>
  );
}

export default ProductPage;

//   {Object.values(props.product)}

import React, { useState, useEffect } from "react";
import axios from "axios";
import { BsHeart } from "react-icons/bs";
import HomeDealsImage from "../images/home-deals.webp";
import ElectronicDeals from "../images/electronic-deals.webp";
import ClothingDeals from "../images/clothing-deals.webp";
import ToyDeals from "../images/toy-deals.webp";
import BeautyDealsImage from "../images/beauty-deals.webp";
import { Link } from "react-router-dom";
import Categories from "../components/Categories";
import Header from "../components/Header";
import TopHeader from "../components/TopHeader";
import BottomFooter from "../components/BottomFooter";
import Footer from "../components/Footer";
import { useNavigate } from "react-router-dom";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useGlobalContext } from "../Context";

function BeautyDeals() {
  const { userEmailStorage, cartCount } = useGlobalContext();
  const navigate = useNavigate();
  const [Product, setProduct] = useState([]);
  const [StatusCode, setStatusCode] = useState();
  document.title = "Beauty & Personal Care Deals : Target";
  const { REACT_APP_GET_PRODUCT_BY_ID } = process.env;

  useEffect(() => {
    const getAllBeautyProducts =
      process.env.REACT_APP_GET_PRODUCT_BY_PRODUCT_TYPE_BEAUTY;
    axios
      .get(getAllBeautyProducts)
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
          <Categories image={ClothingDeals} description="Clothing Deals" />
        </Link>
        <Link to="../Toy-Deals">
          <Categories image={ToyDeals} description="Toy Deals" />
        </Link>
        <Link to="../Beauty-Deals">
          <Categories
            image={BeautyDealsImage}
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
                  <img
                    className="item-card-image"
                    src={data.images[0].imageUrl}
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
      <Footer />
      <BottomFooter />
    </>
  );
}

export default BeautyDeals;

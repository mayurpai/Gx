import React, { useState, useEffect } from "react";
import { Link, useNavigate } from "react-router-dom";
import AuthBottomFooter from "../components/AuthBottom";
import AuthFooter from "../components/AuthFooter";
import "../styles/SignIn.scss";
import axios from "axios";
import TargetLogo from "../images/target-logo.png";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useGlobalContext } from "../Context";
import { IoMdImages } from "react-icons/io";

function AddProduct() {
  const navigate = useNavigate();
  document.title = "Add Product : Target";
  const [StatusCode, setStatusCode] = useState();
  const [Product, setProduct] = useState([]);
  const [data, setData] = useState({
    productName: "",
    productBrand: "",
    productPrice: "",
    productType: "Home",
  });

  const imageList = [
    {
      imageUrl: "",
    },
  ];

  const [imageData, setImageData] = useState(imageList);

  const handleChange = (e) => {
    const value = e.target.value;
    setData({
      ...data,
      [e.target.name]: value,
    });
  };

  const handleImage = () => {
    setImageData((data) => {
      return [
        ...data,
        {
          imageUrl: "",
        },
      ];
    });
  };

  const handleImageChange = (e) => {
    const index = e.target.id;
    setImageData((data) => {
      const newImageList = data.slice();
      newImageList[index].imageUrl = e.target.value;
      return newImageList;
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    const postProduct = process.env.REACT_APP_POST_PRODUCT;
    const productImageData = {
      productName: data.productName,
      productBrand: data.productBrand,
      productPrice: data.productPrice,
      productType: data.productType,
      images: imageData,
    };

    await axios
      .post(postProduct, productImageData)
      .then((response) => {
        setStatusCode(response.status);
        toast.success("Item added successfully.");
        setTimeout(() => {
          navigate("/");
        }, 1500);
      })
      .catch((error) => {
        if (error.response) {
          toast.error(error.response.data.message);
        } else if (error.request) {
          setStatusCode(error.request);
          toast.error(error.request);
        }
      });
  };

  return (
    <>
      <div className="sign-in-main-container">
        <div className="sign-in-target-logo-div">
          <img className="sign-in-target-logo" src={TargetLogo}></img>
          <h1>Add products to Target</h1>
        </div>
        <div className="sign-in-form-container">
          <form className="sign-in-form" onSubmit={handleSubmit}>
            <input
              type="text"
              name="productName"
              value={data.productName}
              placeholder="Product Name"
              onChange={handleChange}
              required
            />

            <input
              type="text"
              name="productBrand"
              value={data.productBrand}
              placeholder="Product Brand"
              onChange={handleChange}
              required
            />

            <input
              type="number"
              name="productPrice"
              value={data.productPrice}
              placeholder="Product Price"
              onChange={handleChange}
              required
            />

            <div
              style={{
                display: "flex",
                fontSize: "1.25rem",
                cursor: "pointer",
                textAlign: "center",
              }}
            >
              <label>
                <select
                  style={{
                    margin: "0.25rem",
                    paddingLeft: "0.5rem",
                    border: "0.1rem solid rgb(136, 136, 136)",
                    borderRadius: ".1rem",
                    fontWeight: "100",
                    fontSize: "1rem",
                    width: "35.9rem",
                    height: "2.5rem",
                    color: "rgb(133, 133, 133)",
                    outline: "none",
                  }}
                  name="productType"
                  value={data.productType}
                  onChange={handleChange}
                  required
                >
                  <optgroup label="Product Type">
                    <option
                      name="Home"
                      value="Home"
                      style={{ color: "rgb(133, 133, 133)" }}
                    >
                      Home
                    </option>
                    <option
                      name="Electronics"
                      value="Electronics"
                      style={{ color: "rgb(133, 133, 133)" }}
                    >
                      Electronics
                    </option>
                    <option
                      name="Clothing"
                      value="Clothing"
                      style={{ color: "rgb(133, 133, 133)" }}
                    >
                      Clothing
                    </option>
                    <option
                      name="Toys"
                      value="Toys"
                      style={{ color: "rgb(133, 133, 133)" }}
                    >
                      Toys
                    </option>
                    <option
                      name="Beauty"
                      value="Beauty"
                      style={{ color: "rgb(133, 133, 133)" }}
                    >
                      Beauty
                    </option>
                  </optgroup>
                </select>
              </label>
            </div>

            {/* <input
              type="text"
              name="productType"
              value={data.productType}
              placeholder="Product Type"
              onChange={handleChange}
              required
            /> */}

            {imageData?.map((item, i) => {
              return (
                <input
                  key={i}
                  onChange={handleImageChange}
                  value={item.value}
                  id={i}
                  name="imageUrl"
                  type="text"
                  placeholder="Image URL"
                  required
                />
              );
            })}
            <div className="sign-in-terms-and-conditions">
              <button
                type="button"
                className="create-account-button"
                onClick={handleImage}
                style={{
                  display: "flex",
                  justifyContent: "center",
                  alignItems: "center",
                }}
              >
                <IoMdImages style={{ fontSize: "1.5rem" }} />
                &nbsp; More images
              </button>
            </div>

            <div className="sign-in-terms-and-conditions">
              <button type="submit" className="create-account-button">
                Add Product
              </button>
            </div>
          </form>
        </div>
        <div className="sign-in-star-message">
          <a href="#">
            <p>
              <span>*See offer details.</span> Restrictions apply. Pricing,
              promotions and availability may vary by location and at Target.com
            </p>
          </a>
        </div>
        <div className="sign-in-footer">
          <AuthFooter />
          <AuthBottomFooter />
        </div>
      </div>
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

export default AddProduct;

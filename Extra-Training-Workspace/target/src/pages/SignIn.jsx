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

function SignIn() {
  const navigate = useNavigate();
  document.title = "Login : Target";
  const { userEmailStorage, cartCount } = useGlobalContext();
  const [changeComponent, setChangeComponent] = useState(false);
  const [StatusCode, setStatusCode] = useState();
  const [Product, setProduct] = useState([]);
  const [data, setData] = useState({
    userId: "",
    userName: "",
    userEmail: "",
    userPassword: "",
    userPhone: "",
    userAddress: "",
    // userType: "",
  });

  const handleChange = (e) => {
    const value = e.target.value;
    setData({
      ...data,
      [e.target.name]: value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    const postUser = process.env.REACT_APP_POST_USER;
    const userData = {
      userId: data.userId,
      userName: data.userName,
      userEmail: data.userEmail,
      userPassword: data.userPassword,
      userPhone: data.userPhone,
      userAddress: data.userAddress,
      // userType: data.userType,
    };

    await axios
      .post(postUser, userData)
      .then((response) => {
        setStatusCode(response.status);
        toast.success("Successfully registered.");
        setChangeComponent(!changeComponent);
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

  const handleLogin = async (e) => {
    e.preventDefault();
    const getUser = process.env.REACT_APP_GET_USER;
    const getProductFromCart = process.env.REACT_APP_GET_PRODUCT_FROM_CART;
    const userLoginData = {
      userEmail: data.userEmail,
      userPassword: data.userPassword,
    };

    const userEmailStorage = userLoginData.userEmail;
    const userPasswordStorage = userLoginData.userPassword;

    await axios
      .get(
        `${getUser}/${userLoginData.userEmail}/${userLoginData.userPassword}`,
        userLoginData
      )
      .then((response) => {
        axios
          .get(`${getProductFromCart}/${userEmailStorage}`)
          .then((response) => {
            localStorage.setItem(
              "cartStore",
              window.btoa(
                response.data
                  .map((data) => data.quantity)
                  .reduce((a, c) => a + c, 0)
              )
            );
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
        setStatusCode(response.status);
        localStorage.setItem("token", window.btoa(userEmailStorage));
        navigate("/", {
          state: {
            userEmailStorage: userEmailStorage,
          },
        });
        window.location.reload();
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
      {changeComponent ? (
        <div className="sign-in-main-container">
          <div className="sign-in-target-logo-div">
            <img className="sign-in-target-logo" src={TargetLogo}></img>
            <h1>Create your Target account</h1>
          </div>
          <div className="sign-in-form-container">
            <form className="sign-in-form" onSubmit={handleSubmit}>
              <input
                type="text"
                name="userName"
                value={data.userName}
                placeholder="User Name"
                onChange={handleChange}
              />

              <input
                type="email"
                name="userEmail"
                placeholder="Email Address"
                value={data.userEmail}
                onChange={handleChange}
              />

              <input
                type="password"
                name="userPassword"
                placeholder="Create Password"
                value={data.userPassword}
                onChange={handleChange}
              />

              <input
                type="number"
                name="userPhone"
                placeholder="Mobile Phone Number"
                value={data.userPhone}
                onChange={handleChange}
              />

              <input
                type="text"
                name="userAddress"
                placeholder="User Address"
                value={data.userAddress}
                onChange={handleChange}
              />

              {/* <input
                type="text"
                name="userType"
                placeholder="User Type"
                value={data.userType}
                onChange={handleChange}
              /> */}

              <div className="sign-in-terms-and-conditions">
                <div className="sign-in-keep-me-signed-in">
                  <input type="checkbox" name="keep-me-signed-in" />
                  <h1>
                    <span>Keep me signed in</span> <br />
                    By checking this box you won't have to sign in as often on
                    this device. For your security, we recommend only checking
                    this box on your personal devices.
                  </h1>
                </div>
                <p>
                  By creating an account, you are agreeing to the Target terms &
                  conditions and Target privacy policy, including receipt of
                  Target exclusive email offers and promotions. To manage your
                  marketing choices please access the Choice section of the
                  Target Privacy Policy or call Target Guest Relations. Message
                  and data rates may apply when including a phone number.
                </p>
                <a href="#">
                  <h1 style={{ fontSize: "1.25rem" }}>Terms & Conditions</h1>
                </a>
                <a href="#">
                  <h1 style={{ fontSize: "1.25rem" }}>Privacy Policy</h1>
                </a>
                <button type="submit" className="create-account-button">
                  Create Account
                </button>
                <h1 onClick={() => setChangeComponent(!changeComponent)}>
                  <span style={{ fontSize: "1.25rem" }}>Or Sign in</span>
                </h1>
              </div>
            </form>
          </div>
          <div className="sign-in-star-message">
            <a href="#">
              <p>
                <span>*See offer details.</span> Restrictions apply. Pricing,
                promotions and availability may vary by location and at
                Target.com
              </p>
            </a>
          </div>
          <div className="sign-in-footer">
            <AuthFooter />
            <AuthBottomFooter />
          </div>
        </div>
      ) : (
        <div className="sign-in-main-container">
          <div className="sign-in-target-logo-div">
            <img className="sign-in-target-logo" src={TargetLogo}></img>
            <h1>Sign into your Target account</h1>
          </div>
          <div className="sign-in-form-container">
            <form className="sign-in-form" onSubmit={handleLogin}>
              <input
                type="email"
                name="userEmail"
                placeholder="Email Address"
                value={data.userEmail}
                onChange={handleChange}
              />

              <input
                type="password"
                name="userPassword"
                placeholder="Password"
                value={data.userPassword}
                onChange={handleChange}
              />

              <div className="sign-in-terms-and-conditions">
                <div className="sign-in-keep-me-signed-in">
                  <input type="checkbox" name="keep-me-signed-in" />
                  <h1>
                    <span>Keep me signed in</span> <br />
                    By checking this box you won't have to sign in as often on
                    this device. For your security, we recommend only checking
                    this box on your personal devices.
                  </h1>
                </div>
                <button type="submit" className="login-account-button">
                  Sign in
                </button>
                <a href="#">
                  <h1 style={{ fontSize: "1.25rem" }}>Forgot password?</h1>
                </a>
                <button
                  className="create-your-account-button-navigation"
                  onClick={() => setChangeComponent(!changeComponent)}
                >
                  Create your Target Account
                </button>
                <h2
                  style={{
                    fontSize: "0.85rem",
                    fontWeight: "100",
                  }}
                >
                  By signing in, you agree to the following:
                </h2>
                <a href="#">
                  <h1
                    style={{
                      fontSize: "0.85rem",
                      color: "blue",
                    }}
                  >
                    Target terms and conditions
                  </h1>
                </a>
                <a href="#">
                  <h1
                    style={{
                      fontSize: "0.85rem",
                      color: "blue",
                    }}
                  >
                    Target privacy policy
                  </h1>
                </a>
              </div>
            </form>
          </div>
          <div className="sign-in-star-message">
            <a href="#">
              <p>
                <span>*See offer details.</span> Restrictions apply. Pricing,
                promotions and availability may vary by location and at
                Target.com
              </p>
            </a>
          </div>
          <div className="sign-in-footer">
            <AuthFooter />
            <AuthBottomFooter />
          </div>
        </div>
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

export default SignIn;

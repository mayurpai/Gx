import React, { useState } from "react";
import "../styles/Header.scss";
import Logo from "../images/target-logo.png";
import { BsCart3 } from "react-icons/bs";
import { FaRegUserCircle } from "react-icons/fa";
import { AiOutlineSearch } from "react-icons/ai";
import { useNavigate } from "react-router";
import { Link } from "react-router-dom";
import { useGlobalContext } from "../Context";

function Header() {
  const [searchElement, setSearchElement] = useState("");
  const navigate = useNavigate();
  const { userEmailStorage, cartCount } = useGlobalContext();
  let flag;
  const [isAuthenticated, setIsAuthenticated] = useState(true);
  if (userEmailStorage.length !== 3) {
    flag = true;
  }
  if (cartCount.length !== 3) {
    flag = true;
  }
  const handleChange = (e) => {
    const value = e.target.value;
    setSearchElement(value);
  };

  return (
    <div className="header-main">
      <nav>
        <ul className="header-main-logo">
          <Link to="/">
            <li>
              <img className="header-main-logo-image" src={Logo}></img>
            </li>
          </Link>
        </ul>
        <ul className="header-main-menu">
          <li>Categories</li>
          <li>Deals</li>
          <li>What's New</li>
          <li>Pickup & Delivery</li>
        </ul>
        <ul className="header-main-search">
          <input
            type="text"
            name="search"
            value={searchElement}
            onChange={handleChange}
            placeholder="Search"
          ></input>
          <AiOutlineSearch
            className="header-main-search-icon"
            onClick={() => {
              if (searchElement.length === 0)
                alert("Please Enter The Product For Search");
              else {
                navigate("/Search-Results", {
                  state: { searchElement: searchElement },
                });
                {
                  setTimeout(() => {
                    window.location.reload();
                  }, 1000);
                }
              }
            }}
          />
        </ul>
        <ul className="header-main-sign-in">
          {isAuthenticated && flag ? (
            <>
              <li>
                <FaRegUserCircle
                  style={{ cursor: "pointer", fontSize: "1.75rem" }}
                />{" "}
                &nbsp; Hi, {userEmailStorage}
              </li>
              <li
                onClick={() => {
                  setIsAuthenticated(false);
                  localStorage.removeItem("token");
                  localStorage.removeItem("cartStore");
                  window.location.reload();
                  // flag = false;
                }}
              >
                Log Out
              </li>
            </>
          ) : (
            <Link to="/Sign-In">
              <li>
                <FaRegUserCircle
                  style={{ cursor: "pointer", fontSize: "1.75rem" }}
                />{" "}
                &nbsp; Sign in
              </li>
            </Link>
          )}
        </ul>
        <ul className="header-main-cart">
          <Link to="/Cart">
            <li>
              <BsCart3 style={{ cursor: "pointer", fontSize: "1.75rem" }} />
              <span>{flag ? cartCount : "0"}</span>
            </li>
          </Link>
        </ul>
      </nav>
    </div>
  );
}

export default Header;

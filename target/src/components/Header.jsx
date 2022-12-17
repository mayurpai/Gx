import React from "react";
import "../styles/Header.scss";
import Logo from "../images/target-logo.png";
import { BsCart3 } from "react-icons/bs";
import { FaRegUserCircle } from "react-icons/fa";
import { AiOutlineSearch } from "react-icons/ai";

function Header() {
  return (
    <div className="header-main">
      <nav>
        <ul className="header-main-logo">
          <li>
            <img className="header-main-logo-image" src={Logo}></img>
          </li>
        </ul>
        <ul className="header-main-menu">
          <li>Categories</li>
          <li>Deals</li>
          <li>What's New</li>
          <li>Pickup & Delivery</li>
        </ul>
        <ul className="header-main-search">
          <input type="text" placeholder="Search"></input>
          <AiOutlineSearch
            className="header-main-search-icon"
            onClick={() => alert("Searching...")}
          />
        </ul>
        <ul className="header-main-sign-in">
          <li>
            <FaRegUserCircle
              style={{ cursor: "pointer", fontSize: "1.75rem" }}
            />{" "}
            &nbsp; Sign in
          </li>
        </ul>
        <ul className="header-main-cart">
          <li>
            <BsCart3 style={{ cursor: "pointer", fontSize: "1.75rem" }} />
          </li>
        </ul>
      </nav>
    </div>
  );
}

export default Header;

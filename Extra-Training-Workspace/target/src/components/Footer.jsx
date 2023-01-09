import React from "react";
import "../styles/Footer.scss";
import { IoStorefrontSharp } from "react-icons/io5";
import { BsHeartFill } from "react-icons/bs";
import { FaEye } from "react-icons/fa";
import { FaShoppingCart } from "react-icons/fa";
import { AiFillCreditCard } from "react-icons/ai";
import { AiFillMobile } from "react-icons/ai";
import { HiGift } from "react-icons/hi";
import { AiTwotoneCar } from "react-icons/ai";
import { FaTruck } from "react-icons/fa";
import { TbTruckDelivery } from "react-icons/tb";
import { FaBuilding } from "react-icons/fa";
import { GiCardboardBoxClosed } from "react-icons/gi";
import FooterImage from "../images/footer-image.png";

function Footer() {
  return (
    <div className="footer-main">
      <div className="footer-main-flex">
        <div className="footer-main-one">
          <ul>
            <li>About Us</li>
            <li>About Target</li>
            <li>Careers</li>
            <li>News & Blogs</li>
            <li>Target Brands</li>
            <li>Bullseye Shop</li>
            <li>Coronavirus Response</li>
            <li>Sustainability & ESG</li>
            <li>Press Center</li>
            <li>Advertise With Us</li>
            <li>Investors</li>
            <li>Affiliates & Partners</li>
            <li>Suppliers</li>
            <li>TargetPlus</li>
          </ul>
        </div>
        <div className="footer-main-two">
          <ul>
            <li>Help</li>
            <li>Target Help</li>
            <li>Returns</li>
            <li>Track Orders</li>
            <li>Recalls</li>
            <li>Contact Us</li>
            <li>Feedback</li>
            <li>Accessibility</li>
            <li>Security & Fraud</li>
            <li>Team Member Services</li>
          </ul>
        </div>
        <div className="footer-main-three">
          <ul>
            <li>Stores</li>
            <li>
              <span>
                <IoStorefrontSharp />
              </span>
              &nbsp; Find a Store
            </li>
            <li>
              <span>
                <BsHeartFill />
              </span>
              &nbsp; Clinic
            </li>
            <li>
              <span>
                <BsHeartFill />
              </span>
              &nbsp; Pharmacy
            </li>
            <li>
              <span>
                <FaEye />
              </span>
              &nbsp; Optical
            </li>
            <li>More In-Store Services</li>
          </ul>
        </div>
        <div className="footer-main-four">
          <ul>
            <li>Services</li>
            <li>
              <span>
                <FaShoppingCart />
              </span>
              &nbsp; Target Circle
            </li>
            <li>
              <span>
                <AiFillCreditCard />
              </span>
              &nbsp;RedCard
            </li>
            <li>
              <span>
                <AiFillMobile />
              </span>
              &nbsp;Target App
            </li>
            <li>
              <span>
                <HiGift />
              </span>
              &nbsp;Registry
            </li>
            <li>
              <span>
                <TbTruckDelivery />
              </span>
              &nbsp; Same Day Delivery
            </li>
            <li>
              <span>
                <FaTruck />
              </span>
              &nbsp;Order Pickup
            </li>
            <li>
              <span>
                <AiTwotoneCar />
              </span>
              &nbsp;Drive Up
            </li>
            <li>
              <span>
                <FaBuilding />
              </span>
              &nbsp;Free 2-Day Shipping
            </li>
            <li>
              <span>
                <GiCardboardBoxClosed />
              </span>
              &nbsp; Shipping & Delivery
            </li>
            <li>More Services</li>
          </ul>
        </div>
      </div>
      <div className="footer-image-div">
        <img className="footer-image" src={FooterImage}></img>
      </div>
    </div>
  );
}

export default Footer;

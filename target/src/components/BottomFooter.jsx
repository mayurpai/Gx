import React from "react";
import "../styles/BottomFooter.scss";
import {
  FaPinterestP,
  FaFacebookF,
  FaInstagram,
  FaTwitter,
  FaTelegramPlane,
  FaYoutube,
} from "react-icons/fa";

function BottomFooter() {
  return (
    <div className="bottom-footer-main">
      <nav>
        <ul className="bottom-footer-main-left">
          <li>
            <span>
              <FaPinterestP />
            </span>
          </li>
          <li>
            <span>
              <FaFacebookF />
            </span>
          </li>
          <li>
            <span>
              <FaInstagram />
            </span>
          </li>
          <li>
            <span>
              <FaTwitter />
            </span>
          </li>
          <li>
            <span>
              <FaTelegramPlane />
            </span>
          </li>
          <li>
            <span>
              <FaYoutube />
            </span>
          </li>
        </ul>
        <ul className="bottom-footer-main-right">
          <li>Terms</li>
          <li>CA Supply Chain</li>
          <li>Privacy</li>
          <li>CA Privacy Rights</li>
          <li>Do Not Sell My Personal Information</li>
          <li>Interest Based Ads</li>
          <li>TM & © 2022 Target Brands, Inc.</li>
        </ul>
      </nav>
    </div>
  );
}

export default BottomFooter;

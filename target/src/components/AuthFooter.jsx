import React from "react";
import "../styles/Footer.scss";
import FooterImage from "../images/footer-image.png";

function AuthFooter() {
  return (
    <div className="footer-main">
      <div className="footer-image-div">
        <img className="footer-image" src={FooterImage}></img>
      </div>
    </div>
  );
}

export default AuthFooter;

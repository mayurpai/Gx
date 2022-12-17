import React from "react";
import DealsToCelebrateImage from "../images/deals-to-celebrate.webp";
import DealsToCelebrateImageHead from "../images/deals-to-celebrate-head.webp";
import DealsToCelebrateLeftImage from "../images/deals-to-celebrate-left-image.png";
import DealsToCelebrateRigthImage from "../images/deals-to-celebrate-right-image.png";
import "../styles/DealsToCelebrate.scss";
import { Link } from "react-router-dom";

function DealsToCelebrate() {
  return (
    <div className="deals-to-celebrate-main-conatiner">
      <img
        className="deals-to-celebrate-image-head"
        src={DealsToCelebrateImageHead}
      ></img>
      <img
        className="deals-to-celebrate-image"
        src={DealsToCelebrateImage}
      ></img>
      <div className="deals-to-celebrate-flex-div">
        <div className="deals-to-celebrate-left-div">
          <img
            className="deals-to-celebrate-left-div-image"
            src={DealsToCelebrateLeftImage}
          ></img>
        </div>
        <div className="deals-to-celebrate-right-div">
          <img
            className="deals-to-celebrate-right-div-image"
            src={DealsToCelebrateLeftImage}
          ></img>
        </div>
      </div>
      <div className="deals-tocelebrate-explore-more">
        <Link to="#">
          <p>
            Explore even more <span>Top Deals</span>
          </p>
        </Link>
      </div>
    </div>
  );
}

export default DealsToCelebrate;

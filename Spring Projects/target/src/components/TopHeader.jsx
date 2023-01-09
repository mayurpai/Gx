import React from "react";
import "../styles/TopHeader.scss";

function TopHeader() {
  return (
    <div className="top-header-main">
      <nav>
        <ul className="top-header-main-left">
          <li>My Store, Closes At 10pm</li>
          <li>Oakland Broadway & 27th</li>
        </ul>
        <ul className="top-header-main-right">
          <li>Registry</li>
          <li>Weekly Ad</li>
          <li>RedCard</li>
          <li>Target Circle</li>
          <li>Find Stores</li>
        </ul>
      </nav>
    </div>
  );
}

export default TopHeader;

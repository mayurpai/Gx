import React from "react";
import "../styles/Categories.scss";

function Categories({ image, description }) {
  return (
    <div className="categories-card-main-container">
      <div className="categories-card-view">
        <div className="categories-card-image-div">
          <img className="categories-card-image" src={image}></img>
        </div>
        <div className="categories-card-description">
          <h1>{description}</h1>
        </div>
      </div>
    </div>
  );
}

export default Categories;

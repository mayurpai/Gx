import React from "react";

function NewsLetter() {
  return (
    <>
      <div className="cart-news-letter">
        <h1>Get top deals, latest trends, and more.</h1>
        <div className="cart-news-letter-flex">
          <input
            type="email"
            name="Email address"
            placeholder="Email address"
          />
          <button>Sign up</button>
        </div>
        <h4>Privacy policy</h4>
      </div>
      <div className="sign-in-star-message">
        <a href="#">
          <p>
            <span>*See offer details.</span> Restrictions apply. Pricing,
            promotions and availability may vary by location and at Target.com
          </p>
        </a>
      </div>
    </>
  );
}

export default NewsLetter;

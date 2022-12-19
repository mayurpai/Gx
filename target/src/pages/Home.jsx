import React from "react";
import Categories from "../components/Categories";
import DealsToCelebrate from "../components/DealsToCelebrate";
import ItemCard from "../components/ItemCard";
import HomeDeals from "../images/home-deals.webp";
import ElectronicDeals from "../images/electronic-deals.webp";
import ClothingDeals from "../images/clothing-deals.webp";
import ToyDeals from "../images/toy-deals.webp";
import BeautyDeals from "../images/beauty-deals.webp";
import "../styles/Home.scss";
import { Link } from "react-router-dom";

function Home() {
  return (
    <div className="home-main-container">
      <DealsToCelebrate />
      <div className="categories-flex">
        <Link to="Home-Deals">
          <Categories image={HomeDeals} description="Home Deals" />
        </Link>
        <Link to="Electronic-Deals">
          <Categories image={ElectronicDeals} description="Electronic Deals" />
        </Link>
        <Link to="Clothing-Deals">
          <Categories image={ClothingDeals} description="Clothing Deals" />
        </Link>
        <Link to="Toy-Deals">
          <Categories image={ToyDeals} description="Toy Deals" />
        </Link>
        <Link to="Beauty-Deals">
          <Categories
            image={BeautyDeals}
            description="Beauty & Personal Care Deals"
          />
        </Link>
      </div>
      <ItemCard />
    </div>
  );
}

export default Home;

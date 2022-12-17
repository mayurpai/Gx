import React from "react";
import DealsToCelebrate from "../components/DealsToCelebrate";
import ItemCard from "../components/ItemCard";
import "../styles/Home.scss";

function Home() {
  return (
    <div className="home-main-container">
      <DealsToCelebrate />
      <ItemCard />
    </div>
  );
}

export default Home;

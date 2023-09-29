"use client";
// Client Side API Fetch
import { useEffect, useState } from "react";

function Product() {
  const [response, setResponse] = useState([]);
  useEffect(() => {
    apiCall();
  }, []);

  async function apiCall() {
    let data = await fetch("https://dummyjson.com/products");
    data = await data.json();
    setResponse(data.products);
  }

  return (
    <div>
      <h1>Product List</h1>
      {console.log(response)}
      {response.map((i) => (
        <h6>{i.title}</h6>
      ))}
    </div>
  );
}

export default Product;

"use client";

import { useRouter } from "next/navigation";
import { useState } from "react";

function AddProducts() {
  const router = useRouter();
  const [data, setData] = useState({
    name: "",
    price: "",
    color: "",
    category: "",
    company: "",
    image: "",
  });

  const addNewProduct = async () => {
    console.log(data);
    console.log("Product Added Succesfully!");
    let res = await fetch(process.env.NEXT_PUBLIC_PRODUCTS_URL, {
      method: "POST",
      body: JSON.stringify(data),
    });
    res = await res.json();
    console.log(res);
  };

  const getAllProducts = () => {
    router.push("http://localhost:3000/product");
    // console.log(process.env.NEXT_PUBLIC_PRODUCTS_URL);
    // let res = await fetch(process.env.NEXT_PUBLIC_PRODUCTS_URL);
    // res = await res.json();
    // console.log(res.result);
  };

  const onUpdateChange = (event) => {
    const { name, value } = event.target;
    setData((prevState) => ({
      ...prevState,
      [name]: value,
    }));
  };

  return (
    <div>
      <h1>Add Products</h1>
      <div style={{ display: "flex", flexDirection: "column", width: "200px" }}>
        <input
          style={{ margin: "10px" }}
          type="text"
          id="name"
          name="name"
          placeholder="Name"
          value={data.name}
          onChange={(e) => onUpdateChange(e)}
        ></input>
        <input
          style={{ margin: "10px" }}
          type="text"
          id="price"
          name="price"
          placeholder="Price"
          value={data.price}
          onChange={(e) => onUpdateChange(e)}
        ></input>
        <input
          style={{ margin: "10px" }}
          type="text"
          id="color"
          name="color"
          placeholder="Color"
          value={data.color}
          onChange={(e) => onUpdateChange(e)}
        ></input>
        <input
          style={{ margin: "10px" }}
          type="text"
          id="company"
          name="company"
          placeholder="Company"
          value={data.company}
          onChange={(e) => onUpdateChange(e)}
        ></input>
        <input
          style={{ margin: "10px" }}
          type="text"
          id="category"
          name="category"
          placeholder="Category"
          value={data.category}
          onChange={(e) => onUpdateChange(e)}
        ></input>
        <input
          style={{ margin: "10px" }}
          type="text"
          id="image"
          name="image"
          placeholder="Image"
          value={data.image}
          onChange={(e) => onUpdateChange(e)}
        ></input>
        <button onClick={addNewProduct}>Add New Product</button>
        <button onClick={getAllProducts}>Get All Products</button>
      </div>
    </div>
  );
}

export default AddProducts;

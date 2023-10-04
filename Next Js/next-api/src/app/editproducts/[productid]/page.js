"use client";

import { useRouter } from "next/navigation";
import { useState, useEffect } from "react";

function EditProducts({ params }) {
  const router = useRouter();
  let id = params.productid;
  const [data, setData] = useState({
    name: "",
    price: "",
    color: "",
    category: "",
    company: "",
    image: "",
  });

  useEffect(() => {
    getProductById();
  }, []);

  const updateProduct = async () => {
    console.log("Product Updated Succesfully!");
    let res = await fetch(process.env.NEXT_PUBLIC_PRODUCTS_URL + "/" + id, {
      method: "PUT",
      body: JSON.stringify(data),
    });
    res = await res.json();
    router.push(process.env.NEXT_PUBLIC_PRODUCTS_PAGE_URL)
    console.log(res);
  };

  const getProductById = async () => {
    let res = await fetch(process.env.NEXT_PUBLIC_PRODUCTS_URL + "/" + id);
    res = await res.json();
    setData(res);
    console.log(res);
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
      <h1>Edit Products</h1>
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
        <button onClick={updateProduct}>Update</button>
      </div>
    </div>
  );
}

export default EditProducts;

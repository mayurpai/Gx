"use client";

import Link from "next/link";
import { useState, useEffect } from "react";

export default function Update({ params }) {
  const [data, setData] = useState({
    name: "",
    age: "",
    email: "",
  });

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };


  useEffect(() => {
    getUserDetails();
  }, []);

  async function getUserDetails() {
    let response = await fetch("http://localhost:3000/api/users/" + params.id);
    response = await response.json();
    setData(response[0]);
  }

  const updateUser = async () => {
    console.log(data);
    let res = await fetch("http://localhost:3000/api/users/" + params.id, {
        body: JSON.stringify(data),
        method: "PUT"
    })
    res = await res.json()
    console.log(res);
  }
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        flexDirection: "column",
      }}
    >
      <h1>Add Users</h1>
      <label>
        Name:{" "}
        <input
          type="text"
          name="name"
          value={data.name}
          onChange={handleInputChange}
        ></input>
      </label>
      <br></br>
      <label>
        Age:{" "}
        <input
          type="text"
          name="age"
          value={data.age}
          onChange={handleInputChange}
        ></input>
      </label>
      <br></br>
      <label>
        Email:{" "}
        <input
          type="text"
          name="email"
          value={data.email}
          onChange={handleInputChange}
        ></input>
      </label>
      <br></br>
      <button type="button" onClick={updateUser}>
        Modify User
      </button>
      <Link href="/users">Go To Users</Link>
    </div>
  );
}

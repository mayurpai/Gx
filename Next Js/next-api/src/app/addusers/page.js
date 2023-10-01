"use client";

import Link from "next/link";
import { useState } from "react";

function addUser() {
  const [name, setName] = useState("");
  const [age, setAge] = useState("");
  const [email, setEmail] = useState("");
  async function addNewUser() {
    let response = await fetch("http://localhost:3000/api/users/", {
      method: "POST",
      body: JSON.stringify({ name, age, email }),
    });
    response = await response.json();
    if (response.status != 200) {
      alert(response.text);
    }
    console.log(response.status);
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
          value={name}
          onChange={(e) => setName(e.target.value)}
        ></input>
      </label>
      <br></br>
      <label>
        Age:{" "}
        <input
          type="text"
          name="age"
          value={age}
          onChange={(e) => setAge(e.target.value)}
        ></input>
      </label>
      <br></br>
      <label>
        Email:{" "}
        <input
          type="text"
          name="email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        ></input>
      </label>
      <br></br>
      <button type="button" onClick={addNewUser}>
        Add New User
      </button>
      <Link href="/users">Go To Users</Link>
    </div>
  );
}

export default addUser;

import React, { useState } from "react";
import axios from "axios";
export default function Create() {
  const [firstName, setFirstName] = useState(""); // setting default value
  const [lastName, setLastName] = useState("");
  const [checkbox, setCheckbox] = useState(false);
  const postData = () => {
    axios.post(`http://localhost:8080/names`, {
      firstName,
      lastName,
      checkbox,
    });
    console.log(firstName);
    console.log(lastName);
    console.log(checkbox);
    return false;
  };
  return (
    <>
      <h1> Header Component </h1>
      <form>
        <div>
          <label>First Name</label>
          <input
            placeholder="First Name "
            value={firstName}
            onChange={(e) => setFirstName(e.target.value)}
          />
        </div>
        <div>
          <label>Last Name</label>
          <input
            placeholder="Last Name "
            value={lastName}
            onChange={(e) => setLastName(e.target.value)}
          />
        </div>
        <div>
          <input type="checkbox" onChange={(e) => setCheckbox(!checkbox)} />
          <label>I agree to all terms and conditions</label>
        </div>
        <div>
          <button type="submit" onClick={postData()}>
            Submit Button
          </button>
        </div>
      </form>
    </>
  );
}

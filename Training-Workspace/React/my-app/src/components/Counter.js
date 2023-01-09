import React, { useState } from "react";
export default function Counter() {
  const [firstName, setFirstName] = useState(""); // setting default value
  const [lastName, setLastName] = useState("");
  const [checkbox, setCheckbox] = useState(false);
  const displayData = () => {
    console.log(checkbox + " " + firstName + " " + lastName);
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
          <button type="submit" onClick={displayData()}>
            Submit Button
          </button>
        </div>
      </form>
    </>
  );
}

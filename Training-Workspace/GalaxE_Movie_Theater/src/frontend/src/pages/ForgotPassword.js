import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";

function ForgotPassword() {
  const navigate = useNavigate();
  const [data, setData] = useState({
    id: "",
    username: "",
    newPassword: "",
    confirmPassword: "",
  });

  const handleChange = (e) => {
    const value = e.target.value;
    setData({
      ...data,
      [e.target.name]: value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const userData = {
      id: data.id,
      username: data.username,
      newPassword: data.newPassword,
      confirmPassword: data.confirmPassword,
    };
    try {
      axios
        .put(
          `http://localhost:9090/viewer/forgotPasswordCheck/${userData.username}And${userData.newPassword}And${userData.confirmPassword}`,
          userData
        )
        .then((response) => {
          console.log(response);
          if (response.data !== "Password reset successful!")
            alert(response.data);
          else {
            alert("Password reset successful!");
            navigate("/login");
          }
        });
    } catch (error) {
      if (error.response) {
        console.log(error.response);
        console.log("Server Responded");
      } else if (error.request) {
        console.log("Network Error");
      } else {
        console.log(error);
      }
    }
  };

  // const mapper = APIData.map((data) => {
  //   console.log(data);
  // });

  return (
    <>
      <div className="register-container">
        <form className="register-form" onSubmit={handleSubmit}>
          <br></br>
          <h1>Forgot Password</h1>
          <p>Fill in the Information Below</p>

          <input
            type="text"
            name="username"
            placeholder="Username"
            value={data.username}
            onChange={handleChange}
          />

          <input
            type="password"
            name="newPassword"
            placeholder="New Password"
            value={data.newPassword}
            onChange={handleChange}
            // pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$"
          />

          <input
            type="password"
            name="confirmPassword"
            placeholder="Confirm Password"
            value={data.confirmPassword}
            onChange={handleChange}
            // pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$"
          />

          <button type="submit">Submit</button>
        </form>
      </div>
    </>
  );
}

export default ForgotPassword;

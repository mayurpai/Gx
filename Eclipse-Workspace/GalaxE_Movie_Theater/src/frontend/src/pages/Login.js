import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";

function Login() {
  const navigate = useNavigate();
  const [data, setData] = useState({
    id: "",
    username: "",
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
      confirmPassword: data.confirmPassword,
    };
    try {
      axios
        .get(
          `http://localhost:9090/viewer/loginCheck/${userData.username}And${userData.confirmPassword}`,
          userData
        )
        .then((response) => {
          console.log(response.status);
          console.log(response);
          if (response.status !== 200)
            alert("Please signup or check the credentials you've typed");
          else {
            alert("Login Successful!");
            // navigate('/login');
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
          <h1>Login</h1>
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
            name="confirmPassword"
            placeholder="Confirm Password"
            value={data.confirmPassword}
            onChange={handleChange}
          />
          <Link to="../forgotpassword">Forgot Password?</Link>

          <button type="submit">Login</button>
        </form>
      </div>
    </>
  );
}

export default Login;

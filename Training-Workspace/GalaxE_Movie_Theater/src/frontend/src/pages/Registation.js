import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Registration.css";

function Register() {
  const navigate = useNavigate();
  const [data, setData] = useState({
    id: "",
    firstName: "",
    lastName: "",
    birthday: "",
    gender: "",
    homePhone: "",
    mobilePhone: "",
    username: "",
    emailAddress: "",
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
      firstName: data.firstName,
      lastName: data.lastName,
      birthday: data.birthday,
      gender: data.gender,
      homePhone: data.homePhone,
      mobilePhone: data.mobilePhone,
      username: data.username,
      emailAddress: data.emailAddress,
      newPassword: data.newPassword,
      confirmPassword: data.confirmPassword,
    };
    try {
      axios.post("http://localhost:9090/viewer", userData).then((response) => {
        console.log(response.status);
        console.log(response);
        if (response.data !== "Success") alert(response.data);
        else {
          alert("Successfully Registered!");
          navigate('/login');
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

  // const [id, setId] = useState("");
  // const [firstName, setFname] = useState("");
  // const [lastName, setLname] = useState("");
  // const [birthday, setBirthday] = useState("");
  // const [gender, setGender] = useState("");
  // const [homePhone, setHomePhone] = useState("");
  // const [mobilePhone, setMobilePhone] = useState("");
  // const [username, setUsername] = useState("");
  // const [emailAddress, setEmailAddress] = useState("");
  // const [newPassword, setNewPassword] = useState("");
  // const [confirmPassword, setConfirmPassword] = useState("");

  // async function handleSubmit(event) {
  //   event.preventDefault();
  //   try {
  //     await axios
  //       .post("http://localhost:9090/viewer", {
  //         id: id,
  //         firstName: firstName,
  //         lastName: lastName,
  //         birthday: birthday,
  //         gender: gender,
  //         homePhone: homePhone,
  //         mobilePhone: mobilePhone,
  //         username: username,
  //         emailAddress: emailAddress,
  //         newPassword: newPassword,
  //         confirmPassword: confirmPassword,
  //       })
  //       .then((response) => console.log(response));
  //     alert("User Registration Successful!");
  //     setId("");
  //     setFname("");
  //     setLname("");
  //     setBirthday("");
  //     setGender("");
  //     setHomePhone("");
  //     setMobilePhone("");
  //     setUsername("");
  //     setEmailAddress("");
  //     setNewPassword("");
  //     setConfirmPassword("");
  //   } catch (err) {
  //     alert("User Registation Failed!");
  //   }
  // }
  return (
    <>
      <div className="register-container">
        <form className="register-form" onSubmit={handleSubmit}>
          <br></br>
          <h1>Register</h1>
          <p>Fill in the Information Below</p>

          {/* <input
            type="text"
            name="id"
            placeholder="id"
            onChange={(event) => {
              setId(event.target.value);
            }}
          /> */}

          <input
            type="text"
            name="firstName"
            value={data.firstName}
            placeholder="Firstname"
            onChange={handleChange}
          />

          <input
            type="text"
            name="lastName"
            placeholder="Lastname"
            value={data.lastName}
            onChange={handleChange}
          />

          <input
            type="date"
            name="birthday"
            placeholder="Birthday"
            value={data.birthday}
            onChange={handleChange}
          />

          <input
            type="text"
            name="gender"
            placeholder="Gender"
            value={data.gender}
            onChange={handleChange}
          />

          <input
            type="number"
            name="homePhone"
            placeholder="Home Phone"
            value={data.homePhone}
            onChange={handleChange}
          />

          <input
            type="number"
            name="mobilePhone"
            placeholder="Mobile Phone"
            value={data.mobilePhone}
            onChange={handleChange}
          />

          <input
            type="text"
            name="username"
            placeholder="Username"
            value={data.username}
            onChange={handleChange}
          />

          <input
            type="text"
            name="emailAddress"
            placeholder="Email Address"
            value={data.emailAddress}
            onChange={handleChange}
          />

          <input
            type="password"
            name="newPassword"
            placeholder="New Password"
            value={data.newPassword}
            onChange={handleChange}
          />

          <input
            type="password"
            name="confirmPassword"
            placeholder="Confirm Password"
            value={data.confirmPassword}
            onChange={handleChange}
          />

          <button type="submit">Register</button>
        </form>
      </div>
    </>
  );
}

export default Register;

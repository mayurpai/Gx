import React from "react";
// import ReactDOM from "react-dom/client";
import Layout from "./components/Layout";
import Home from "./components/Home";
import Blogs from "./components/Blogs";
import Contact from "./components/Contact";
import Photos from "./components/Photos";
import PhotosFor from "./components/PhotosFor";
import NoPage from "./components/NoPage";
import Header from "./components/Header";
import Create from "./components/Create";
import Car from "./components/Car";
import ButtonColorChange from "./components/ButtonColorChange";

import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Counter from "./components/Counter";
import Demo from "./components/Demo";
import Demo2 from "./components/Demo2";
import Timer from "./components/Timer";
import Display from "./components/Display";
import Component1 from "./components/Component1";
import UseReducer from "./components/UseReducer";
import UseEffect from "./components/UseEffect";
import UseMemo from "./components/UseMemo";
import UseCallback from "./components/UseCallback";
import DogAPI from "./components/DogAPI";
import AxiosSample from "./components/AxiosSample";

function App() {
  var photos = [
    <img
      src="https://www.thewowstyle.com/wp-content/uploads/2015/01/nature-images..jpg"
      height={300}
      width={300}
    ></img>,
    <img
      src="https://th.bing.com/th/id/OIP.IEOqMXewgDtYh0Vyfvv2gwHaGn?pid=ImgDet&rs=1"
      height={300}
      width={300}
    ></img>,
    <img
      src="https://th.bing.com/th/id/OIP.aKivCSOYuzYL0U0Wz6vzqwHaEo?pid=ImgDet&rs=1"
      height={300}
      width={300}
    ></img>,
    <img
      src="https://th.bing.com/th/id/OIP.GayYQ8pEa558VOlWgpfppgHaFj?pid=ImgDet&w=720&h=540&rs=1"
      height={300}
      width={300}
    ></img>,
  ];
  var photosFor = [
    {
      src: "https://www.thewowstyle.com/wp-content/uploads/2015/01/nature-images..jpg",
    },
    {
      src: "https://th.bing.com/th/id/OIP.IEOqMXewgDtYh0Vyfvv2gwHaGn?pid=ImgDet&rs=1",
    },
    {
      src: "https://th.bing.com/th/id/OIP.aKivCSOYuzYL0U0Wz6vzqwHaEo?pid=ImgDet&rs=1",
    },
    {
      src: "https://th.bing.com/th/id/OIP.GayYQ8pEa558VOlWgpfppgHaFj?pid=ImgDet&w=720&h=540&rs=1",
    },
  ];
  return (
    <div
      className="App"
      style={{
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        height: "100vh",
        width: "100vw",
        backgroundColor: "#282c34",
        fontSize: "2rem",
        lineHeight: "2",
        color: "whitesmoke",
      }}
    >
      <header className="App-header">
        {/* <Router>
          <Routes>
            <Route path="/" element={<Layout />} />
            <Route path="home" element={<Home />} />
            <Route path="blogs" element={<Blogs />} />
            <Route path="photos" element={<Photos photos={photos} />} />
            <Route
              path="photosFor"
              element={<PhotosFor photosFor={photosFor} />}
            />
            <Route
              path="contact"
              element={<Contact fName="Mayur" lName="Pai" />}
            />
            <Route path="*" element={<NoPage />} />
          </Routes>
        </Router> */}
        {/* <Header title="Task Tracker" className="headers"></Header> */}
        {/* <Counter></Counter> */}
        {/* <Demo></Demo> */}
        {/* <Create></Create> */}
        {/* <ButtonColorChange></ButtonColorChange> */}
        {/* <Car></Car> */}
        {/* <Demo2></Demo2> */}
        {/* <Timer></Timer> */}
        {/* <Display></Display> */}
        {/* <Component1></Component1> */}
        {/* <UseReducer></UseReducer> */}
        {/* <UseEffect></UseEffect> */}
        {/* <UseMemo></UseMemo> */}
        {/* <UseCallback></UseCallback> */}
        {/* <DogAPI></DogAPI> */}
        {/* <AxiosSample></AxiosSample> */}
      </header>
    </div>
  );
}

export default App;

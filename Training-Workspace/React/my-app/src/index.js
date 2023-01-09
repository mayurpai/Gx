import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
// import Component1 from "./components/Component1";
// import Display from "./components/Display";
// import UseFetchIndex from "./components/UseFetchIndex";
import reportWebVitals from "./reportWebVitals";
// import UseRef from "./components/UseRef";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <App />;
    {/* <Component1 />; */}
    {/* <Display /> */}
    {/* <UseRef></UseRef> */}
    {/* <UseFetchIndex /> */}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

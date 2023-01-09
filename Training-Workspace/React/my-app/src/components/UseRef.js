import { useState, useRef } from "react";
import ReactDOM from "react-dom/client";

export default function UseRef() {
  const [inputValue, setInputValue] = useState("");
  const name = useRef("");

  function onClick() {
    name.current.focus();
    name.current.value = "";
  }

  return (
    <>
      <input
        type="text"
        ref={name}
        value={inputValue}
        onChange={(e) => setInputValue(name.current.value)}
      ></input>
      <button type="button" onClick={onClick}>
        Update Name
      </button>
      <h1>Render Name: {name.current.value}</h1>
    </>
  );
}

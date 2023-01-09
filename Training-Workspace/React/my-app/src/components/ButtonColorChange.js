import { useState } from "react";
import ReactDOM from "react-dom/client";

export default function ButtonColorChange() {
  const [color, setColor] = useState("");

  return (
    <>
      <h1>My favorite color is {color}!</h1>
      <button
        type="button"
        onClick={() => setColor("blue")}
        style={{ backgroundColor: color }}
      >
        Boom!
      </button>
    </>
  );
}

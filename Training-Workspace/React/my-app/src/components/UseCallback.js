import { useCallback, useState } from "react";
import Child from "./Child";

export default function UseCallback() {
  // const [toggle, setToggle] = useState(false);
  const [data, setData] = useState("Yo! 😍");

  const returnComment = useCallback(
    (name) => {
      return data + name;
    },
    [data]
  );

  return (
    <div className="App">
      <Child returnComment={returnComment} />

      {/* <button
        onClick={() => {
          setToggle(!toggle);
        }}
      >
        {" "}
        Toggle
      </button>
      {toggle && <h1> toggle </h1>} */}
    </div>
  );
}

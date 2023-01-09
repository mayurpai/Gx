import React, { useState, useEffect } from "react";
import axios from "axios";

function UseEffect() {
  const [data, setData] = useState(null);
  const [count, setCount] = useState(0);
  useEffect(() => {
    axios
      .get("https://jsonplaceholder.typicode.com/comments")
      .then((response) => setData(response.data[count].email));
    console.log("API Was Called " + count + " Times!");
  }, [count]);

  return (
    <div
      style={{
        display: "flex",
        justtifyContent: "center",
        alignItems: "center",
        flexDirection: "column",
      }}
    >
      {data}
      <button type="button" onClick={() => setCount(count + 1)}>
        API Call {count}
      </button>
    </div>
  );
}

export default UseEffect;

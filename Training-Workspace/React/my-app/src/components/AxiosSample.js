import React, { useState, useEffect } from "react";
import axios from "axios";

export default function AxiosSample() {
  const [random, setRandom] = useState(0);

  function onClick() {
    setRandom(Math.floor(Math.random() * 48));
    axios
      .get("https://finalspaceapi.com/api/v0/character/")
      .then((response) => {
        console.log(response.data[random].img_url);
        document.getElementById(
          "resultscharacter"
        ).innerHTML = `<img src="${response.data[random].img_url}" height="300" width="300">`;
      });
  }
  return (
    <div
      style={{
        display: "flex",
        justtifyContent: "center",
        alignItems: "center",
        flexDirection: "column",
      }}
    >
      <button onClick={onClick} type="button">
        Random Human
      </button>{" "}
      <br />
      <div id="resultscharacter"></div>
    </div>
  );
}

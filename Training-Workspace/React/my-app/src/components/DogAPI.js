import React from "react";

export default function DogAPI() {
  function dog() {
    fetch("https://dog.ceo/api/breeds/image/random")
      .then((response) => {
        response.json();
      })

      .then((data) => {
        document.getElementById(
          "resultsDog"
        ).innerHTML = `<img src="${data.message}" height="300" width="300">`;
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
      <button onClick={dog} type="button" id="dog">
        Random Dog
      </button>{" "}
      <br />
      <div id="resultsDog"></div>
    </div>
  );
}

import React from "react";

function Photos({ photos }) {
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "space-between",
        alignItems: "center",
        height: "100vh",
        width: "100vw",
        backgroundColor: "#282c34",
        color: "whitesmoke"
      }}
    >
      {photos}
    </div>
  );
}
export default Photos;

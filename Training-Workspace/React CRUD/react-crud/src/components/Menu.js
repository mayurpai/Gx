import React from "react";
import { Link } from "react-router-dom";

function Menu() {
  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        color: "white",
        fontSize: "2rem",
        lineHeight: "4rem",
      }}
    >
      <Link to="create" style={{ color: "white" }}>
        <b>Create</b>
      </Link>
      <Link to="read" style={{ color: "white" }}>
        <b>Read</b>
      </Link>
      {/* <Link to="update" style={{ color: "white" }}>
        <b>Update</b>
      </Link> */}
    </div>
  );
}

export default Menu;

import PropTypes from "prop-types";
import React from "react";
export const Button = ({ color, text }) => {
  const onClick = (e) => {
    console.log(e);
    console.log(color + "Button has been clicked" + text);
  };
  return (
    <button
      onClick={onClick}
      style={{
        backgroundColor: color,
        padding: "1rem",
        marginLeft: "1rem",
        borderRadius: "10rem",
      }}
    >
      {text}
    </button>
  );
};
Button.defaultProps = {
  color: "yellow",
  text: "No Title",
};
Button.protoType = {
  text: PropTypes.string,
  color: PropTypes.string,
};

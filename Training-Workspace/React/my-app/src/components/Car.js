import { useState } from "react";
import ReactDOM from "react-dom/client";

export default function Car() {
  const [car, setCar] = useState({
    brand: "Ford",
    model: "Mustang",
    year: "2000",
    color: "red",
  });

  const updateColor = () => {
    setCar((previousState) => {
      return { ...previousState, color: "green" };
    });
  };

  return (
    <>
      <h1>My {car.brand}</h1>
      <p>
        It is a {car.color} {car.model} from {car.year}.
      </p>
      <button type="button" onClick={updateColor}>
        Blue
      </button>
    </>
  );
}

import React from "react";
import { Button } from "./Button";
const Header = ({ title }) => {
  return (
    <div className="headers">
      <h1>{title}</h1>
      <Button text="Hello" color="blue" />
      <Button text="Hello1" color="red" />
      <Button text="Hello2" color="green" />
      <Button text="Hello3" />
      <Button></Button>
    </div>
  );
};
export default Header;

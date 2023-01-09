import React from "react";
import { useSelector, useDispatch } from "react-redux";
import { buyCake } from "../redux";

function HooksCakeContainer() {
  const numberOfCakes = useSelector((state) => state.cakes.numberOfCakes);
  const dispatch = useDispatch();
  return (
    <div>
      <h1>Hooks Cake Container</h1>
      <h2>Number Of Cakes: {numberOfCakes}</h2>
      <button onClick={() => dispatch(buyCake())}>Buy Cake</button>
    </div>
  );
}

export default HooksCakeContainer;

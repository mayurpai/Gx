import React from "react";
import { buyCake } from "../redux/cakes/cakeActions";
import { connect } from "react-redux";
import { useState } from "react";

function NewCakeContainer(props) {
  const [cake, setCake] = useState(1);
  return (
    <div>
      <h1>Cake Container</h1>
      <h2>Number Of Cakes: {props.numberOfCakes}</h2>
      <input
        type="text"
        value={cake}
        onChange={(e) => {
          setCake(e.target.value);
        }}
      />
      <button
        onClick={() => {
          props.buyCake(cake);
        }}
      >
        Buy Cake
      </button>
    </div>
  );
}

const mapStateToProps = (state) => {
  return {
    numberOfCakes: state.cakes.numberOfCakes,
  };
};

const mapDispatchToProps = (dispath) => {
  return {
    buyCake: (cake) => dispath(buyCake(cake)),
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(NewCakeContainer);

import React from "react";
import { buyCake } from "../redux/cakes/cakeActions";
import { connect } from "react-redux";

function CakeContainer(props) {
  return (
    <div>
      <h1>Cake Container</h1>
      <h2>Number Of Cakes: {props.numberOfCakes}</h2>
      <button onClick={props.buyCake}>Buy Cake</button>
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
    buyCake: () => dispath(buyCake()),
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(CakeContainer);

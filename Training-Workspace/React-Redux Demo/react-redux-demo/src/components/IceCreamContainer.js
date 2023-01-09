import React from "react";
import { buyIceCream } from "../redux/icecreams/icecreamActions";
import { connect } from "react-redux";

function IceCreamContainer(props) {
  return (
    <div>
      <h1>IceCream Container</h1>
      <h2>Number Of IceCreams: {props.numberOfIceCreams}</h2>
      <button onClick={props.buyIceCream}>Buy Cake</button>
    </div>
  );
}

const mapStateToProps = (state) => {
  return {
    numberOfIceCreams: state.icecreams.numberOfIceCreams,
  };
};

const mapDispatchToProps = (dispath) => {
  return {
    buyIceCream: () => dispath(buyIceCream()),
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(IceCreamContainer);

import { BUY_ICECREAM } from "./icecreamTypes";

const initialState = {
  numberOfIceCreams: 20,
};

function iceCreamReducer(state = initialState, action) {
  switch (action.type) {
    case BUY_ICECREAM:
      return {
        ...state,
        numberOfIceCreams: state.numberOfIceCreams - 1,
      };
    default:
      return state;
  }
}

export default iceCreamReducer;
